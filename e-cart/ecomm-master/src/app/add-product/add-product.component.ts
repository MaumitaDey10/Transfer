import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit {

  constructor() { }
  @Input() productSelected:boolean=false;
  counter = 0;
  @Input() selectedProduct:string;
  @Output() addedProduct= new EventEmitter<any>();
  @Output() emmiter= new EventEmitter<number>();
  
  ngOnInit(): void {
  }

  onAddProduct(){
    this.addedProduct.emit(this.selectedProduct)
    this.counter++;
    console.log(this.counter)
this.emmiter.emit(this.counter);
  }

}
