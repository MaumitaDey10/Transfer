import { Component, EventEmitter, Input, OnInit, Output, ViewChild } from '@angular/core';
import { Router } from '@angular/router';
import { ProductsComponent } from '../products/products.component';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor( private router: Router) { }
  pageRequest =1;
  @Output() pageChange = new EventEmitter<any>();
@Input() myInput2 : string;


  ngOnInit() {
  }
  

  
 onChangePage(page: number){
   this.pageRequest = page;
   console.log(this.pageRequest);
   this.pageChange.emit(page);

   
 }

}
