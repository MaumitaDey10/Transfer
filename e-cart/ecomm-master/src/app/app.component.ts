import { Component, ViewChild } from '@angular/core';
import { ProductsComponent } from './products/products.component';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'ecomm';
  latestPage=1;
  parentValue: string;
// count=0;


  onChangePage(page: number){
this.latestPage = page;

  }

  getData(value){
    this.parentValue = value;
  }
}
