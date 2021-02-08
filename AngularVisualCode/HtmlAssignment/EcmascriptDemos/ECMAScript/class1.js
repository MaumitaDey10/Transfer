class Rectangle{
    constructor(lenght,breadth){
        this.lenght=lenght;
        this.width=breadth;
        this.area=lenght*breadth;
    }
    displaySquare(){
        console.log("lenght and width are:"+this.area);
    }
}
var c1=new Rectangle('4',"6");
c1.displaySquare();