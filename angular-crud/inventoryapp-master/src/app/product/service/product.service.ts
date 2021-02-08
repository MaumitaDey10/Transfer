import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { IProduct, Product } from '../models/product';
import { max } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  private products:Array<Product> =  [
    {  id:1, name: 'Womens Kurti', code: '1#123', category: { name: 'Womens', code: '1', category: 1 }, unit: { name: 'One', code: '1', category: 0 }, purchaseRate: 1000.00, salesRate: 2 },
    {  id:2, name: 'Kids School Bag', code: '89@1', category: { name: 'Kids', code: '1', category: 1 }, unit: { name: 'Two', code: '1', category: 0 }, purchaseRate: 1880.00, salesRate: 3 },
    {  id:3, name: 'Headphones', code: '500*23', category: { name: 'Electronics', code: '1', category: 1 }, unit: { name: 'One', code: '1', category: 0 }, purchaseRate: 1700.00, salesRate: 1 },
    {  id:4, name: 'Mens Jeans', code: '1223$', category: { name: 'Mens', code: '1', category: 1 }, unit: { name: 'Two', code: 'Four', category: 0 }, purchaseRate: 3890.00, salesRate: 4 },
    {  id:5, name: 'JBL Speaker', code: '9*689', category: { name: 'Electronics', code: '1', category: 1 }, unit: { name: 'One', code: '1', category: 0 }, purchaseRate: 5600.00, salesRate: 2 },
    
];

  constructor() { }

  getAllProducts():Observable<IProduct[]>{
    return of(this.products)
  }

  getProductById(id:number):Observable<IProduct>{
    var product = this.products.find(item => item.id === id);
    return of(product);
  }

  addNewProduct(product:IProduct):void{
    this.products.sort(item => item.id)
    product.id = this.products.length + 1
    this.products.push(product);
  }

  deleteProduct(product:IProduct):IProduct[]{
    const index = this.products.findIndex(item => item.id === product.id);
    const deletedItem = this.products.splice(index,1);

    return deletedItem;
  }

  updateProduct(product:IProduct):void{

    const index = this.products.findIndex(item => item.id === product.id);
    this.products[index] = product;
  }

}
