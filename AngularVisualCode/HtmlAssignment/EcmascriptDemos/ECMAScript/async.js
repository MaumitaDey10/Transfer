async function f1(){
    return 1;
}
f1().then((val)=>console.log('resolve'+val)).catch(()=>console.log('reject'));

//setTimeout(f1,2000);
//f1().then((val)=>console.log('resolve'+val)).catch(()=>console.log('reject'));
//console.log("hi");