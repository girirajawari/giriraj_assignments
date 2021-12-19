var string = prompt("enter the string :");
let pattern = /[^a-b]/gi;
document.write(string.match(pattern));