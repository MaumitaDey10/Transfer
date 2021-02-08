import { Component, EventEmitter, Input, OnInit, Output, ViewChild } from '@angular/core';
import { HeaderComponent } from '../header/header.component';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {

  
  constructor() { }

  ngOnInit(): void {
  }
 
  selProduct:string;
  addedProduct: any;
  proSelected:boolean=false;
  counter: number;
  @Output() emmiter = new EventEmitter<number>();


  onSelectProduct(product){
    this.proSelected = true;
    this.selProduct = product;
  
  }
  onAddedProduct(proData){
    this.addedProduct =proData;
  }
 
  count(cart){
    this.counter = cart;
    this.emmiter.emit(this.counter);
  }
  


 
}
