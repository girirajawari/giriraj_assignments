var year = window.prompt("Enter year: ");
year = parseInt(year);
var noOfYears = window.prompt("Enter no. of years to count");
function isLeapYear(year, noOfYears) {
    for(var count=0; count<=noOfYears; count++){
        year = year + count;
        if((year%4==0 && year%100!=0)||year%400==0){
            document.write(year + " is a leap year!");
        }
        document.write(year + " is not leap year!");
    }
}
document.write(isLeapYear(year, noOfYears));
