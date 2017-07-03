function Emailcheck(){
	var email=document.getElementById("uemail");
	if(email.value==""){
		document.getElementById("errorcode3").innerHTML="Please Enter your Email";
		email.style.borderColor="red";
		return false;
	}else{
		document.getElementById("errorcode3").innerHTML=" ";
		email.style.borderColor="#ccc";
		return true;
	}
		
}
function checkGender(){
	var gender=document.getElementById("gender").value;
	var sal=document.getElementById("salutation").value;
	if(gender==""){
		document.getElementById("errorcode19").style.marginLeft="29px";
		document.getElementById("errorcode19").innerHTML="Please Select your Gender";
		document.getElementById("errorcode19").style.color="red";
		document.getElementById("gender").style.borderColor="red";	
	}
	/*else if((gender=="Female"&&sal=="Mr.")||(gender=="Male"&&(sal=="Mrs."||sal=="Ms."))){
		document.getElementById("errorcode19").style.marginLeft="29px";
		document.getElementById("errorcode19").innerHTML="Please Select proper Gender";
		document.getElementById("errorcode19").style.color="red";
		document.getElementById("gender").style.borderColor="red";	
	}*/
	else{
		document.getElementById("errorcode19").innerHTML="";
		document.getElementById("gender").style.borderColor="#ccc";	
	}
}
function vCaptcha(){
    var str1 = removeSpaces(document.getElementById('txtCaptcha').value);
    var str2 = removeSpaces(document.getElementById('txtInput').value);
    if (str1 != str2){
		document.getElementById("captcha_err").innerHTML="*Captcha Not Matched !!";
    return false;
    }
	else{
		document.getElementById("captcha_err").innerHTML="";
	return true;
	}
}
function removeSpaces(string)
{
    return string.split(' ').join('');
}
function validation(){
	var nameid=document.getElementById("user");
	var passid=document.getElementById("pass");
	var name=document.getElementById("user").value;
	var pass=document.getElementById("pass").value;
	var cap=document.getElementById("txtInput").value;
	var error1=document.getElementById("errorcode1");
	var error2=document.getElementById("errorcode2");
	if(name==""||pass==""||nameid.style.borderColor=="red"||passid.style.borderColor=="red"||cap==""||vCaptcha()==false){
		if(name==""){
			document.getElementById("errorcode1").innerHTML="Please Enter your Email/Mobile No";
			document.getElementById("errorcode1").style.marginLeft="2px";
			document.getElementById("errorcode1").style.color="red";
			nameid.style.borderColor="red";
			
		}else{
			document.getElementById("errorcode1").innerHTML=" ";
			nameid.style.borderColor="#ccc";
		}if(pass==""){
			document.getElementById("errorcode2").innerHTML="Please Enter Your Password";
			document.getElementById("errorcode2").style.marginLeft="2px";
			document.getElementById("errorcode2").style.color="red";
			passid.style.borderColor="red";
			
		}else{
			document.getElementById("errorcode2").innerHTML=" ";
			passid.style.borderColor="#ccc";
		}
		if(cap==""){
			document.getElementById("captcha_err").innerHTML="Please Enter Captcha";
			document.getElementById("captcha_err").style.marginLeft="2px";
			document.getElementById("captcha_err").style.color="red";
		}else if(vCaptcha()==false){
			document.getElementById("captcha_err").innerHTML="Please Enter valid Captcha";
			document.getElementById("captcha_err").style.marginLeft="2px";
			document.getElementById("captcha_err").style.color="red";
			DrawCaptcha();
		}
		else{
			document.getElementById("captcha_err").innerHTML=" ";
		}
		return false;
	}else{
		return true;
	}
}
function checkSalutation(){
	if(document.getElementById("salutation").value==""){
		document.getElementById("errorcodesal").style.marginLeft="29px";
		document.getElementById("errorcodesal").innerHTML="Please Select the salutation";
		document.getElementById("errorcodesal").style.color="red";
		document.getElementById("salutation").style.borderColor="red";
	}
	else{
		document.getElementById("errorcodesal").innerHTML="";
		document.getElementById("salutation").style.borderColor="#ccc";
		//checkGender();
	}
}
function registrationCheck(){
	var fname=document.getElementById("firstname").value;
	var lname=document.getElementById("lastname").value;
	//var father=document.getElementById("fathername").value;
	var mobile=document.getElementById("mobile").value;
	var email=document.getElementById("email").value;
	/*var dobday=document.getElementById("dobDay").value;
	var dobmonth=document.getElementById("dobMonth").value;
	var dobyear=document.getElementById("dobYear").value;*/
	var dob=document.getElementById("dob").value;
	var salutation=document.getElementById("salutation").value;
	var pass=document.getElementById("password1").value;
	var aadhar=document.getElementById("aadhar").value;
	var confirm=document.getElementById("password2").value;
	var pin=document.getElementById("pincode").value;
	var addr=document.getElementById("address").value;
	var area=document.getElementById("area").value;
	var street=document.getElementById("street").value;
	var temppin=document.getElementById("temppincode").value;
	var tempaddr=document.getElementById("tempaddress").value;
	var temparea=document.getElementById("temparea").value;
	var tempstreet=document.getElementById("tempstreet").value;
	//var ropCheck=document.getElementById("checkrop").checked;
	var gender=document.getElementById("gender").value;
	/*if(ropCheck==false){
		var vale=fname==""||lname==""||mobile==""||email==""||dob==""||salutation==""||pass==""||confirm==""||pin==""||gender==""||
		document.getElementById("aadhar").style.borderColor=="red"||document.getElementById("email").style.borderColor=="red"||document.getElementById("password1").style.borderColor=="red"
			||document.getElementById("password2").style.borderColor=="red"||document.getElementById("mobile").style.borderColor=="red"||addr==""||street==""||area==""||tempaddr==""||tempstreet==""||temparea==""||temppin=="";
	}
	else{*/
		var vale=fname==""||lname==""||mobile==""||email==""||dob==""||salutation==""||pass==""||confirm==""||pin==""||gender==""||
		document.getElementById("aadhar").style.borderColor=="red"||document.getElementById("email").style.borderColor=="red"||document.getElementById("password1").style.borderColor=="red"
			||document.getElementById("password2").style.borderColor=="red"||document.getElementById("mobile").style.borderColor=="red"||addr==""||street==""||area=="";
	//}
	if(vale){
		
		if(salutation==""){
			document.getElementById("errorcodesal").style.marginLeft="29px";
			document.getElementById("errorcodesal").innerHTML="Please Select the salutation";
			document.getElementById("errorcodesal").style.color="red";
			document.getElementById("salutation").style.borderColor="red";
		}
		if(fname==""){
			document.getElementById("errorcode1").style.marginLeft="29px";
			document.getElementById("errorcode1").innerHTML="Please Enter Your First Name";
			document.getElementById("errorcode1").style.color="red";
			document.getElementById("firstname").style.borderColor="red";	
		}
		if(lname==""){
			document.getElementById("errorcode12").style.marginLeft="29px";
			document.getElementById("errorcode12").innerHTML="Please Enter Your Last Name";
			document.getElementById("errorcode12").style.color="red";
			document.getElementById("lastname").style.borderColor="red";	
		}
		/*if(father==""){
			document.getElementById("errorcode13").style.marginLeft="29px";
			document.getElementById("errorcode13").innerHTML="Please Enter Your Father Name";
			document.getElementById("errorcode13").style.color="red";
			document.getElementById("fathername").style.borderColor="red";	
		}*/
		if(email==""){
			document.getElementById("errorcode3").style.marginLeft="29px";
			document.getElementById("errorcode3").innerHTML="Please Enter Your Email ID";
			document.getElementById("errorcode3").style.color="red";
			document.getElementById("email").style.borderColor="red";	
		}
		if(mobile==""){
			document.getElementById("errorcode2").style.marginLeft="29px";
			document.getElementById("errorcode2").innerHTML="Please Enter your Mobile Number";
			document.getElementById("errorcode2").style.color="red";
			document.getElementById("mobile").style.borderColor="red";	
		}	
		if(pass==""){
			document.getElementById("errorcodepass").style.marginLeft="29px";
			document.getElementById("errorcodepass").innerHTML="Please Enter the Password";
			document.getElementById("errorcodepass").style.color="red";
			document.getElementById("password1").style.borderColor="red";	
		}
		if(confirm==""){
			document.getElementById("errorcode18").style.marginLeft="29px";
			document.getElementById("errorcode18").innerHTML="Please Enter Confirm Password";
			document.getElementById("errorcode18").style.color="red";
			document.getElementById("password2").style.borderColor="red";
		}
		if(pin==""){
			document.getElementById("errorcode17").style.marginLeft="29px";
			document.getElementById("errorcode17").innerHTML="Please Enter your Pincode";
			document.getElementById("errorcode17").style.color="red";
			document.getElementById("pincode").style.borderColor="red";
		}
		if(gender==""){
			document.getElementById("errorcode19").style.marginLeft="29px";
			document.getElementById("errorcode19").innerHTML="Please Select your Gender";
			document.getElementById("errorcode19").style.color="red";
			document.getElementById("gender").style.borderColor="red";	
		}
		/*if(dobday==""){
			document.getElementById("errorcode5").style.marginLeft="29px";
			document.getElementById("errorcode5").innerHTML="Please Select your DOB";
			document.getElementById("errorcode5").style.color="red";
			document.getElementById("dobDay").style.borderColor="red";
		}
		if(dobmonth==""){
			document.getElementById("errorcode5").style.marginLeft="29px";
			document.getElementById("errorcode5").innerHTML="Please Select your DOB";
			document.getElementById("errorcode5").style.color="red";
			document.getElementById("dobMonth").style.borderColor="red";
		}
		if(dobyear==""){
			document.getElementById("errorcode5").style.marginLeft="29px";
			document.getElementById("errorcode5").innerHTML="Please Select your DOB";
			document.getElementById("errorcode5").style.color="red";
			document.getElementById("dobYear").style.borderColor="red";
		}*/
		if(dob==""){
			document.getElementById("errorcode5").style.marginLeft="29px";
			document.getElementById("errorcode5").innerHTML="Please Select your DOB";
			document.getElementById("errorcode5").style.color="red";
			document.getElementById("dob").style.borderColor="red";
		}
		if(addr==""){
			document.getElementById("errorcode_a1").style.marginLeft="29px";
			document.getElementById("errorcode_a1").innerHTML="Please Enter your Address";
			document.getElementById("errorcode_a1").style.color="red";
			document.getElementById("address").style.borderColor="red";	
		}
		if(area==""){
			document.getElementById("errorcode_a3").style.marginLeft="29px";
			document.getElementById("errorcode_a3").innerHTML="Please Enter your Area";
			document.getElementById("errorcode_a3").style.color="red";
			document.getElementById("area").style.borderColor="red";	
		}
		if(street==""){
			document.getElementById("errorcode_a2").style.marginLeft="29px";
			document.getElementById("errorcode_a2").innerHTML="Please Enter your Street";
			document.getElementById("errorcode_a2").style.color="red";
			document.getElementById("street").style.borderColor="red";	
		}
		//alert( document.getElementById("ropCheckValue").value)
	//	if(ropCheck==false){
			if(tempaddr==""){
				document.getElementById("errorcode_at1").style.marginLeft="29px";
				document.getElementById("errorcode_at1").innerHTML="Please Enter your Address";
				document.getElementById("errorcode_at1").style.color="red";
				document.getElementById("tempaddress").style.borderColor="red";	
			}
			if(temparea==""){
				document.getElementById("errorcode_at3").style.marginLeft="29px";
				document.getElementById("errorcode_at3").innerHTML="Please Enter your Area";
				document.getElementById("errorcode_at3").style.color="red";
				document.getElementById("temparea").style.borderColor="red";	
			}
			if(tempstreet==""){
				document.getElementById("errorcode_at2").style.marginLeft="29px";
				document.getElementById("errorcode_at2").innerHTML="Please Enter your Street";
				document.getElementById("errorcode_at2").style.color="red";
				document.getElementById("tempstreet").style.borderColor="red";	
			}
			if(temppin==""){
				document.getElementById("errorcode_at4").style.marginLeft="29px";
				document.getElementById("errorcode_at4").innerHTML="Please Enter your Pincode";
				document.getElementById("errorcode_at4").style.color="red";
				document.getElementById("temppincode").style.borderColor="red";
			}
		//}
		
		if(aadhar==""){
			document.getElementById("errorcode4").style.marginLeft="29px";
			document.getElementById("errorcode4").innerHTML="Please Enter your aadhar number";
			document.getElementById("errorcode4").style.color="red";
			document.getElementById("aadhar").style.borderColor="red";	
		}
		
		alert("Please Complete Form");
		return false;
	}else{/*
		if(document.getElementById("ddlPassport").value=="N"){
			var schname=document.getElementById("institutionname").value;
			var schaddr=document.getElementById("schaddr").value;
			var timing=document.getElementById("timing").value;
			var acyear=document.getElementById("academic_year").value;
			var schstatus=document.getElementById("institutionstatus").value;
			var regno=document.getElementById("reg_no").value;
			var student_reg_no=document.getElementById("student_reg_no").value;
			var schphone=document.getElementById("schphone").value;
			var boarding=document.getElementById("boarding").value;
			var leaving=document.getElementById("leaving").value;
			var division=document.getElementById("division").value;
			if(schname==""||schaddr==""||schphone==""||regno==""||student_reg_no==""||timing==""||boarding==""||leaving==""||division==""||schstatus==""){
				if(schstatus==""){
					document.getElementById("errorcode25").innerHTML="Select your Institution Status";
					//return false;
				}
				if(schname==""){
				document.getElementById("errorcode26").innerHTML="Enter your Institution name";
				//return false;
			}
			 if(schaddr==""){
				document.getElementById("errorcode27").innerHTML="Enter your Institution address";
				//return false;
			}
			 if(schphone==""){
				document.getElementById("errorcode28").innerHTML="Enter your Institution Phone Number";
				//return false;
			}
			 if(regno==""){
				document.getElementById("errorcode29").innerHTML="Enter your Institution Registration Number";
				//return false;
			}
			 if(student_reg_no==""){
				document.getElementById("errorcode34").innerHTML="Enter your  Registration Number";
				//return false;
			}
			 if(timing==""){
				document.getElementById("errorcode30").innerHTML="Enter your  Institution Timing";
				//return false;
			}
			 
			 if(boarding==""){
				document.getElementById("errorcode32").innerHTML="Enter your  Boarding Place";
				//return false;
			}
			 if(leaving==""){
				document.getElementById("errorcode33").innerHTML="Enter your  Leaving Place";
				//return false;
			}
			 if(division==""){
					document.getElementById("errorcode36").innerHTML="Select Your Division";
					//return false;
				}
			 return false;
			}
			 else{
				return true;
			}
		}
		else{
		return true;
	}*/
		return true;}
}
function passwordCheck(){
	if(!(document.getElementById("password1").value==document.getElementById("password2").value)){
		document.getElementById("errorcode18").style.marginLeft="29px";
		document.getElementById("errorcode18").innerHTML="Password mismatch – please try again";
		document.getElementById("errorcode18").style.color="red";
		document.getElementById("password1").style.borderColor="red";
		document.getElementById("password2").style.borderColor="red";
	}else{
		document.getElementById("errorcode18").innerHTML=" ";
		document.getElementById("password1").style.borderColor="#ccc";
		document.getElementById("password2").style.borderColor="#ccc";
	}
}
function namevalid(name){
	name.value = name.value.replace(/^\s+/, '');
    name.value = name.value.replace(/\s\s+/g, ' ');	
	if(name.value==""){
		document.getElementById("errorcode1").innerHTML="Enter User Name";
		name.style.borderColor="red";
		return false;
	}else{
		document.getElementById("errorcode1").innerHTML=" ";
		name.style.borderColor="#ccc";
	}
	
}
function mailvalid(mail){
	mail.value = mail.value.replace(/^\s+/, '');
	mail.value = mail.value.replace(/\s\s+/g, ' ');	
	if(mail.value==""){
		document.getElementById("errorcode1").innerHTML="Please Enter your Email/Mobile No";
		document.getElementById("errorcode1").style.marginLeft="29px";
		document.getElementById("errorcode1").style.color="red";
		mail.style.borderColor="red";
		return false;v
	}else{
		document.getElementById("errorcode1").innerHTML=" ";
		mail.style.borderColor="#ccc";
	}
	
}
function validatePassword(obj,id) {
    var p = obj.value;errors = [];perror=document.getElementById(id);
    if (p.length <8) {
        errors.push("Your password must be at least 8 characters"); 
    }
    if (p.search(/[a-z]/i) < 0) {
        errors.push("Your password must contain at least one letter.");
    }
    if (p.search(/[0-9]/) < 0) {
        errors.push("Your password must contain at least one digit."); 
    }
    if (errors.length > 0) {
       // alert(errors.join("\n"));
        perror.innerHTML=""+errors.join("<br>&emsp;");
        perror.style.marginLeft="29px";
        perror.style.color="red";
    	obj.style.borderColor="red";
        return false;
    }
    perror.innerHTML="";
    obj.style.borderColor="#ccc";
    return true;
}
function passvalid(pass){
	pass.value = pass.value.replace(/^\s+/, '');
	pass.value = pass.value.replace(/\s\s+/g, ' ');	
	if(pass.value==""){
		document.getElementById("errorcode2").innerHTML="Please Enter Your Password";
		document.getElementById("errorcode2").style.marginLeft="29px";
		document.getElementById("errorcode2").style.color="red";
		pass.style.borderColor="red";
		return false;
	}else{
		document.getElementById("errorcode2").innerHTML=" ";
		pass.style.borderColor="#ccc";
	}
}
function vhCheck(obj)
{
var strVal = obj.value;
obj.value = obj.value.replace(/^\s+/, '');
obj.value = obj.value.replace(/\s\s+/g, ' ');	
if(strVal!=""){
if (strVal.length!=12){ // Minimum length.
	document.getElementById("errorcode4").innerHTML="Invalid Aadhar number";
	document.getElementById("errorcode4").style.marginLeft="29px";
	document.getElementById("errorcode4").style.color="red";
	obj.style.borderColor="red";

}else{
var flag=strVal.verhoeffCheck();
if(!flag){
	document.getElementById("errorcode4").innerHTML="Invalid Aadhar number";
	document.getElementById("errorcode4").style.marginLeft="29px";
	document.getElementById("errorcode4").style.color="red";
	obj.style.borderColor="red";
}else{
	aadharCheck(obj);
}
}}else{
	document.getElementById("errorcode4").innerHTML="Please Enter your aadhar number";
	document.getElementById("errorcode4").style.marginLeft="29px";
	document.getElementById("errorcode4").style.color="red";
	obj.style.borderColor="red";

}
};
//Verhoeff algorithm validator, by Avraham Plotnitzky. (aviplot at gmail)
String.prototype.verhoeffCheck = (function()
{
var d = [[0,1,2,3,4,5,6,7,8,9],
        [1,2,3,4,0,6,7,8,9,5],
        [2,3,4,0,1,7,8,9,5,6],
        [3,4,0,1,2,8,9,5,6,7],
        [4,0,1,2,3,9,5,6,7,8],
        [5,9,8,7,6,0,4,3,2,1],
        [6,5,9,8,7,1,0,4,3,2],
        [7,6,5,9,8,2,1,0,4,3],
        [8,7,6,5,9,3,2,1,0,4],
        [9,8,7,6,5,4,3,2,1,0]];
var p = [[0,1,2,3,4,5,6,7,8,9],
        [1,5,7,6,2,8,3,0,9,4],
        [5,8,0,3,7,9,6,1,4,2],
        [8,9,1,6,0,4,3,5,2,7],
        [9,4,5,3,1,2,6,8,7,0],
        [4,2,8,6,5,7,3,9,0,1],
        [2,7,9,3,8,0,6,4,1,5],
        [7,0,4,6,9,1,3,2,5,8]];
var j = [0,4,3,2,1,5,6,7,8,9];

return function()
{
    var c = 0;
    this.replace(/\D+/g,"").split("").reverse().join("").replace(/[\d]/g, function(u, i, o){
        c = d[c][p[i&7][parseInt(u,10)]];
    });
    return (c === 0);
};
})();
function getXMLHTTP() { //fuction to return the xml http object
	
	var xmlhttp=false;
	try{
		xmlhttp=new XMLHttpRequest();
	}
	catch(e)	{
		try{
			xmlhttp= new ActiveXObject("Microsoft.XMLHTTP");
		}
		catch(e){
			try{
			xmlhttp = new ActiveXObject("Msxml2.XMLHTTP");
			}
			catch(e1){
				xmlhttp=false;
			}
		}
	}

	return xmlhttp;
}
function mobileCheck(mobile){
	var strURL="Controller?Action=AlreadyEixst&mobile="+mobile.value;
	var req = getXMLHTTP();
	if (req) {
	req.onreadystatechange = function() {
	if (req.readyState == 4) {
	// only if "OK"
	if (req.status == 200) {
	if(req.responseText==1){
		document.getElementById("checkmobile").value="1";
		mobile.style.borderColor="red";
		document.getElementById("errorcode2").innerHTML="Mobile number already exist";
		document.getElementById("errorcode2").style.marginLeft="29px";
		document.getElementById("errorcode2").style.color="red";
	return false;
	}else{
		document.getElementById("checkmobile").value="0";
		error.innerHTML=" ";
		mobile.style.borderColor="#ccc";
	}
	} else {
	alert("There was a problem while using XMLHTTP:\n" + req.statusText);
	}
	}
	}
	req.open("GET", strURL, true);
	req.send(null);
	}

	}
function loadXMLDoc(email)
{
	var strURL="Controller?Action=AlreadyEixst&email="+email.value;
	var req = getXMLHTTP();
	if (req) {
	req.onreadystatechange = function() {
	if (req.readyState == 4) {
	// only if "OK"
	if (req.status == 200) {
	if(req.responseText==1){
		document.getElementById("checkemail").value="1";
		email.style.borderColor="red";
		document.getElementById("errorcode3").innerHTML="Email ID already exist";
		document.getElementById("errorcode3").style.marginLeft="29px";
		document.getElementById("errorcode3").style.color="red";
	return false;
	}else{
		document.getElementById("checkemail").value="0";
		document.getElementById("errorcode3").innerHTML=" ";
		email.style.borderColor="#ccc";
	}
	} else {
	alert("There was a problem while using XMLHTTP:\n" + req.statusText);
	}
	}
	}
	req.open("GET", strURL, true);
	req.send(null);
	}
}
function aadharCheck(aadhar){
	//alert("aadhar")
	var strURL="Controller?Action=AlreadyEixst&aadhar="+aadhar.value;
	var req = getXMLHTTP();
	if (req) {

	req.onreadystatechange = function() {
	if (req.readyState == 4) {
	// only if "OK"
	if (req.status == 200) {
	if(req.responseText==1){
		document.getElementById("checkaadhar").value="1";
		aadhar.style.borderColor="red";
		document.getElementById("errorcode4").innerHTML="Aadhar number already exist";
		document.getElementById("errorcode4").style.marginLeft="29px";
		document.getElementById("errorcode4").style.color="red";

		return false;
	}else{
		document.getElementById("checkaadhar").value="0";
		aadhar.style.borderColor="#ccc";
		document.getElementById("errorcode4").innerHTML=" ";
	}
	} else {
	alert("There was a problem while using XMLHTTP:\n" + req.statusText);
	}
	}
	}
	req.open("GET", strURL, true);
	req.send(null);
	}

	}
function nonemptymoblie(mobile){
	mobile.value = mobile.value.replace(/^\s+/, '');
	mobile.value = mobile.value.replace(/\s\s+/g, ' ');
	var error=document.getElementById("errorcode2");
	if(mobile.value==""){
		error.innerHTML=" Please Enter your Mobile Number";
		error.style.marginLeft="29px";
		error.style.color="red";
		return false;
	}else{
		error.innerHTML=" ";
		mobilevalid(mobile)
	}
}
function mobilevalid(mobile){
	var error=document.getElementById("errorcode2");
	if(!(mobile.value.match(/^([7-9][0-9]{9})*$/))){
		error.style.marginLeft="29px";
		error.style.color="red";
		error.innerHTML=" Please Enter a valid 10 digit mobile number";
		mobile.style.borderColor="red";
		return false;
	}else{
		error.innerHTML=" ";
		mobile.style.borderColor="#ccc";
		mobileCheck(mobile);
}}
function phonevalid(mobile,id){
	var error=document.getElementById(id);
	if(!(mobile.value.match(/^([7-9][0-9]{9})*$/))){
		error.style.marginLeft="29px";
		error.style.color="red";
		error.innerHTML=" Please Enter a valid 10 digit mobile number";
		mobile.style.borderColor="red";
		return false;
	}else{
		error.innerHTML=" ";
		mobile.style.borderColor="#ccc";
		
}}
function pinvalid(mobile,id){
	var error=document.getElementById(id);
	if(!(mobile.value.match(/^([0-9]{6})*$/))){
		error.style.marginLeft="29px";
		error.style.color="red";
		error.innerHTML="Invalid  Pincode";
		mobile.style.borderColor="red";
		return false;
	}else if(mobile.value==""){
		error.style.marginLeft="29px";
		error.style.color="red";
		error.innerHTML="Please Enter your  Pincode";
		mobile.style.borderColor="red";
		return false;
	}
	else{
		error.innerHTML=" ";
		mobile.style.borderColor="#ccc";
		
}}
function emailvalid()
{	var id=document.getElementById("email");
	var errorcode=document.getElementById("errorcode3");
	if(id.value==""){
		errorcode.style.marginLeft="29px";
		errorcode.style.color="red";
		errorcode.innerHTML="Please Enter your Email";
		id.style.borderColor="red";
		return false;
	}else{
		errorcode.innerHTML=" ";
		if(!(id.value.match(/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/))){
			errorcode.style.marginLeft="29px";
			errorcode.style.color="red";
		errorcode.innerHTML="Please Enter Valid Email";
		id.style.borderColor="red";
		return false;	
			}else{
			errorcode.innerHTML=" ";
			id.style.borderColor="#ccc";
		loadXMLDoc(id);
	}}
}
function namevalid(name,id,content){
	name.value =name.value.replace(/^\s+/, '');
	name.value = name.value.replace(/\s\s+/g, ' ');
	username=name.value;
	if(username==""){
		document.getElementById(id).innerHTML="";
		document.getElementById(id).style.color="#ccc";
	}else{
if(!(username.match(/^[A-Za-z, ]*$/))){
	name.style.borderColor="red";
	document.getElementById(id).innerHTML=""+content;
	document.getElementById(id).style.marginLeft="29px";
	document.getElementById(id).style.color="red";
	error.style.color="red";
	/* document.getElementById("firstname").focus(); */
	
	return false;
} 
else{
	/*var fname=document.getElementById("firstname").value;
	var lname=document.getElementById("lastname").value;

	if(!(fname=="")&&!(lname=="")){*/
		document.getElementById(id).innerHTML=" ";//}
		name.style.borderColor="#ccc";
		fullnameCheck();
}
	
}	
	}
function dobdayCheck(dobday){
	if(!(dobday.value=="")){
		document.getElementById("errorcode5").innerHTML=" ";
		dobday.style.borderColor="#ccc";
		var tdobmonth=document.getElementById("dobMonth");
		dobmonthCheck(tdobmonth);
	}else{
		document.getElementById("errorcode5").innerHTML="Please Select your DOB";
		document.getElementById("errorcode5").style.marginLeft="29px";
		document.getElementById("errorcode5").style.color="red";
		dobday.style.borderColor="red";
	}
}
function dobmonthCheck(dobmonth){
	if(!(dobmonth.value=="")){
		document.getElementById("errorcode5").innerHTML=" ";
		dobmonth.style.borderColor="#ccc";
		var tdobyear=document.getElementById("dobYear");
		dobyearCheck(tdobyear);
		
	}else{
		document.getElementById("errorcode5").innerHTML="Please Select your DOB";
		document.getElementById("errorcode5").style.marginLeft="29px";
		document.getElementById("errorcode5").style.color="red";
		dobmonth.style.borderColor="red";
	}
}
function dobyearCheck(dobyear){
	if(!(dobyear.value=="")){
		document.getElementById("errorcode5").innerHTML=" ";
		dobyear.style.borderColor="#ccc";
		var tdobday=document.getElementById("dobDay");
		dobdayCheck(tdobday);
	}else{
		document.getElementById("errorcode5").innerHTML="Please Select your DOB";
		document.getElementById("errorcode5").style.marginLeft="29px";
		document.getElementById("errorcode5").style.color="red";
		dobyear.style.borderColor="red";
	}
}
function nonempty(name,id,content){
	name.value =name.value.replace(/^\s+/, '');
	name.value = name.value.replace(/\s\s+/g, ' ');
	var ferror=document.getElementById(id);
		if (name.value==""){
		ferror.innerHTML=""+content;
		ferror.style.marginLeft="29px";
		ferror.style.color="red";
		name.style.borderColor="red";
		document.getElementById("fullname").value="";
		return false;	
	}else{
		ferror.innerHTML="";
		name.style.borderColor="#ccc";
		namevalid(name,id,content);
		
	}
}
function emptyfather(name,id,content){
	name.value =name.value.replace(/^\s+/, '');
	name.value = name.value.replace(/\s\s+/g, ' ');
	var ferror=document.getElementById(id);
		if (name.value==""){
		ferror.innerHTML=""+content;
		ferror.style.marginLeft="29px";
		ferror.style.color="red";
		name.style.borderColor="red";
		return false;	
	}else{
		ferror.innerHTML="";
		name.style.borderColor="#ccc";
	}
}
function nonemptyemail(name){
	name.value = name.value.replace(/^\s+/, '');
	name.value = name.value.replace(/\s\s+/g, ' ');
	var ferror=document.getElementById("errorcode3");
		if (name.value==""){
		ferror.innerHTML="Please Enter Your Email ID";
		ferror.style.marginLeft="29px";
		ferror.style.color="red";
		name.style.borderColor="red";	
		return false;	
	}else{
		emailvalid();
		
	}
}
function validation1(){
	var oldpassword=document.getElementById("oldpassword").value;
	var password1=document.getElementById("password1").value;
	var password2=document.getElementById("password2").value;
	var old=document.getElementById("oldpassword");
	var pass1=document.getElementById("password1");
	var pass2=document.getElementById("password2");
	var error=document.getElementById("errorcode");
	var error1=document.getElementById("errorcode1");
	var error2=document.getElementById("errorcode2");
	
	//alert(error1.value)
	if(oldpassword==""||password1==""||password2==""||old.style.borderColor=="red"||pass1.style.borderColor=="red"||pass2.style.borderColor=="red"){
		if(!(oldpassword=="")){    	 
			checkpass(old);
	    		}else{
	    			error.innerHTML="Please Enter your Current Password ";
	    			old.style.borderColor="red"
	    		}
		if(!(password1=="")){    	 
	    	nonemptypassword();
	    		}else{
	    			error1.innerHTML="Please Enter your new Password ";
	    			pass1.style.borderColor="red"
	    		}if(!(password2=="")){
	    			neconfirmpassword();
	    		}else{
	    			error2.innerHTML="Please Enter Confirm Password ";
	    			pass2.style.borderColor="red"
	    		}
	    		return false;
	}
	else{
		//alert()
		
			return true;}
			
		
	}
function nonemptypassword(){
	var password1=document.getElementById("password1").value;
	password1 =password1.replace(/^\s+/, '');
	password1 = password1.replace(/\s\s+/g, ' ');
	var pass1=document.getElementById("password1");
	var error1=document.getElementById("errorcodepass");
	var pat1=/0-9/;
	var pat2=/A-Z/;
	var pat3=/a-z/;
	if(password1==""){
		error1.innerHTML="Please Enter the Password";
		error1.style.marginLeft="29px";
		error1.style.color="red";
		pass1.style.borderColor="red"
		//document.getElementById("password1").focus();
		return false;
		
	}else if(!(password1.match(/^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[$@#^()_+$!%*?&])[A-Za-z\d$@#^()_+$!%*?&]{8,15}$/))){
		error1.innerHTML="Password should be in the combination of Uppercase, Lowercase, Numbers and Special character";
		error1.style.marginLeft="29px";
		error1.style.color="red";
		pass1.style.borderColor="red"
		return false;
	}
	else{
		error1.innerHTML=" ";
		pass1.style.borderColor="#ccc"
			passwordvalid();
	}
}
function neconfirmpassword(){
	var password1=document.getElementById("password1").value;
	var password2=document.getElementById("password2").value;
	var pass1=document.getElementById("password1");
	var pass2=document.getElementById("password2");
	var error2=document.getElementById("errorcode18");
	if(password2==""){
		error2.innerHTML="Please Enter Confirm Password";
		error2.style.color="red";
		error2.style.marginLeft="29px";
		pass2.style.borderColor="red"
		//document.getElementById("password2").focus();
		return false;
		}else{
			if(!(password1==password2)){
			error2.innerHTML="Password And Confirm Password Must Be Same";
			error2.style.marginLeft="29px";
			error2.style.color="red";
			pass2.style.borderColor="red"
			return false;
		}else{
		error2.innerHTML=" ";
		pass2.style.borderColor="#ccc"
		}
	}
	
}
function fullnameCheck(){//alert(fullname==""||fullname==undefined);
if(document.getElementById("middlename").value==""){
		document.getElementById("fullname").value=document.getElementById("firstname").value+" "+document.getElementById("lastname").value;

}else{
		document.getElementById("fullname").value=document.getElementById("firstname").value+" "+document.getElementById("middlename").value+" "+document.getElementById("lastname").value;

}
}
function calculate_age()
{
    today_date = new Date();
    today_year = today_date.getFullYear();
    today_month = today_date.getMonth();
    today_day = today_date.getDate();
   // alert("calculate_age")
    var dob=document.getElementById("dob").value.split("-");
    //alert("dob"+dob)
    var birth_year=dob[2];
    var birth_month=dob[1];
    var birth_day=dob[0];

    age = today_year - birth_year;

    if ( today_month < (birth_month - 1))
    {
        age--;
    }
    if (((birth_month - 1) == today_month) && (today_day < birth_day))
    {
        age--;
    }
    return age;
}
function nonemptyaddress(name,id,msg){
	name.value = name.value.replace(/^\s+/, '');
	name.value = name.value.replace(/\s\s+/g, ' ');
	if(name.value==""){
		document.getElementById(id).style.marginLeft="29px";
		document.getElementById(id).innerHTML=""+msg;
		document.getElementById(id).style.color="red";
		name.style.borderColor="red";	
	}
	else{
		document.getElementById(id).innerHTML="";
		name.style.borderColor="#ccc";
	}
}
function nonemptytempaddress(name,id,msg){
	name.value = name.value.replace(/^\s+/, '');
	name.value = name.value.replace(/\s\s+/g, ' ');
	if(name.value==""){
		document.getElementById(id).style.marginLeft="29px";
		document.getElementById(id).innerHTML=""+msg;
		document.getElementById(id).style.color="red";
		name.style.borderColor="red";	
	}
	else{
		document.getElementById(id).innerHTML="";
		name.style.borderColor="#ccc";
	}
}
function academicYear() {
    var d = new Date();
    var year=d.getFullYear();
    var mon = d.getMonth()+1;
    if(mon<=5){
    	document.getElementById("academic_year").value=(year-1)+"-"+year;
    }
    else{
    	 document.getElementById("academic_year").value=year+"-"+(year+1);
    }
}
function noemptyregno(name){
	name.value =name.value.replace(/^\s+/, '');
	name.value = name.value.replace(/\s\s+/g, ' ');
	var ferror=document.getElementById("errorcode29");
					if (name.value==""){
					ferror.innerHTML="Please Enter Intitution Registration Number";
					name.style.borderColor="red";	
					return false;	
				}else{
					ferror.innerHTML="";
					name.style.borderColor="#ccc";
					regnoValid(name);
	  }
}function institutionnamevalid(name){
	username=name.value;
	if(username==""){
		name.style.borderColor="red";
		document.getElementById("errorcode26").innerHTML="Please Select Your Institution Name";
		return false;
	}else{
		document.getElementById("errorcode26").innerHTML="";
		name.style.borderColor="#ccc";}
	}
function schooladdr(address){
	//var address=document.getElementById("address")value;
	address.value =address.value.replace(/^\s+/, '');
	address.value = address.value.replace(/\s\s+/g, ' ');
	var errorcode=document.getElementById("errorcode27");
	if(address.value==""){
		errorcode.innerHTML="Please Enter Your Institution Address";
		   address.style.borderColor="red";
		   return false;
	}
	if((!address.value.match(/^([a-zA-Z0-9,\n /#-.()])*$/))){
	   errorcode.innerHTML="Please Enter valid Institution Address";
	   //document.getElementById("address").focus();
	   address.style.borderColor="red";
	   return false;
	}else{
		errorcode.innerHTML=" ";
		address.style.borderColor="#ccc";
		
	}
}
function noemptystudentregno(name){
	name.value =name.value.replace(/^\s+/, '');
	name.value = name.value.replace(/\s\s+/g, ' ');
	var ferror=document.getElementById("errorcode34");
					if (name.value==""){
					ferror.innerHTML="Please Enter Student Registration Number";
					name.style.borderColor="red";	
					return false;	
				}else{
					ferror.innerHTML="";
					name.style.borderColor="#ccc";
					studentregnoValid(name);
	  }			
}
function noemptystandard(name){
	var ferror=document.getElementById("errorcode35");
	if (name.value==""){
	ferror.innerHTML="Please Select Your Standard";
	name.style.borderColor="red";	
	return false;	
}else{
	ferror.innerHTML="";
	name.style.borderColor="#ccc";
}			
}
function noemptycollege(name){
	var ferror=document.getElementById("errorcode35");
	if (name.value==""){
	ferror.innerHTML="Please Select Your Degree";
	name.style.borderColor="red";	
	return false;	
}else{
	ferror.innerHTML="";
	name.style.borderColor="#ccc";
}			
}
function noemptydivision(name){
	var ferror=document.getElementById("errorcode36");
	if (name.value==""){
	ferror.innerHTML="Please Select Your Division";
	name.style.borderColor="red";	
	return false;	
}else{
	ferror.innerHTML="";
	name.style.borderColor="#ccc";
}			
}

function numvalidate(e) {
	var key;
	var keychar;
	if (window.event)
	key = window.event.keyCode;
	else if (e)
	key = e.which;
	else
	return true;
	keychar = String.fromCharCode(key);
	keychar = keychar.toLowerCase();
	// control keys
	if ((key == null) || (key == 0) || (key == 8) || (key == 9)
	|| (key == 13) || (key == 27))
	return true;
	else if (!(("1234567890").indexOf(keychar) > -1)) {
	return false;
	}
	}
  /*function testing() {
	var ajaxid = document.getElementById("ajaxid").value;
	if (ajaxid == 1) {
		alert("Your account has an active pass subscription. Please try to purchase upon expiry of the current pass.");
		window.location = 'History.jsp';
		return false;
	} else
		return true;
}   	
*/