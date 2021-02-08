import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { BuyProductsComponent } from './buy-products/buy-products.component';

const routes: Routes = [
  { path: 'cart', component: BuyProductsComponent }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
