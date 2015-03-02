function currentDate()
	{
	document.getElementById("result").innerHTML="Date = "+ new Date();
	}

function dateInFormat()
	{
	var date=new Date();
	var day=date.getDay();
	var month=date.getMonth();
	var year=date.getFullYear();
	var hrs=date.getHours();
	var mins=date.getMinutes();
	var secs=date.getSeconds();
	document.getElementById("timeDisp").innerHTML="Date = "+ day + " , " + month +" , " + year + " Time :" + hrs + " : " + mins + " : " +secs; 
	}

function exc2()
	{
	var txt=document.getElementById("replace").value;
	alert(txt);	
	document.getElementById("ID").value= txt; 
	}

