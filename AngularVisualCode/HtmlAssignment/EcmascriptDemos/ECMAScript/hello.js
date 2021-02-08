console.log("hello world")
var messages=["Meow","I am a talking cat!","Callbacks are fun"];
var cat={
    say:function(str){
        console.log(str);
    }
}
//for(var i=0;i<messages.length;i++){//using var keyword//
    //cat.say(messages[i]);
   // setTimeout(function(){cat.say(messages[i])},i*500)
//}
for(let i=0;i<messages.length;i++){//using let keyword
    //cat.say(messages[i]);
    setTimeout(function(){cat.say(messages[i])},i*500)
}