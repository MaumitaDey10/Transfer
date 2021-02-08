var elements=['Halogen','Hydrogen','Oxygen']//arrow function program
console.log("Length of each element:"+elements.map(ele=>ele.length))

function person(){
    this.age=0;
    //var that=this;
    setInterval(()=>{
        //that.age++;
        console.log(this.age++);
    },1000);
}
var p1=new person();