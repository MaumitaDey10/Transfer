class Car{

constructor(model,color,price){
    this.model=model;
    this.color=color;
    this.price=price;
}
displayCar(){
    console.log("Car details are:"+this.color+","+this.model+","+this.price);
}
}
var c1= new Car('Mercury','Red','140000');
c1.displayCar();