var num = window.prompt("Enter No.: ");
document.write("Number is: " + num);
for(var a=1; a<=num; a++){
    if(a%3==0 || a%5==0){
        document.write(a);
    }    
}