function verifyText()
{
var name=document.getElementById("tname").value;
var age=document.getElementById("tage").value;
if(name == "")
	{
	alert("Name cannot be empty");
	}
if(age<18)
	{
	alert("Age should be greater than or equal to 18")
	}
if(name!="" && age>=18)
	{
	document.location="ques6Submit.html";
	}
}
