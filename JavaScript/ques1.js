function simpleInterest()
{
var amt=prompt("Enter the principal");
var rate=prompt("Enter the rate");
var time=prompt("Enter the time");
var res=(amt*rate*time)/100;
alert("Simple Interest = "+res);
//document.getElementById("result").innerHTML="Simple Interest = " + (amt*yrs*rate)/100; 
}
