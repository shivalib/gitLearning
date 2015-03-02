function checkPalli()
{
var check=prompt("Enter a string to check if it is Pallindrome : ");
var len=check.length;
var rev="";
for( var i = len-1 ; i >=0 ; i-- )
	{
	rev = rev + check.charAt(i);	
	}
alert("Reverse : " + rev);
alert("Check : " +check);

if(rev==check)
	alert("It is a Pallindrome");
else
	alert("It is not a Pallindrome");

}
