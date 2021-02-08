import { Injectable } from '@angular/core';
import { Lookup } from '../product/models/lookup';
import { Observable, of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LookupService {

  private units: Array<Lookup> =[
    {name:'One', code:"1", category:1},
    {name:'Two', code:"2", category:1},
    {name:'Three', code:"3", category:1},
    {name:'Four', code:"4", category:1}
  ];


  private productCategories:Array<Lookup> = [
    {name:'Womens', code:"1", category:1},
    {name:'Mens', code:"2", category:1},
    {name:'Kids', code:"3", category:1},
    {name:'Electronics', code:"4", category:1}
  ];


  constructor() { }

  getProductCategories(): Observable<Lookup[]>{
    return of(this.productCategories);
  }

  getUnits():Observable<Lookup[]>{
    return of(this.units);
  }
}
