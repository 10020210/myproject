<!DOCTYPE html>
<html lang="en">
<%@page import="java.util.*"%>
<%@page import="java.io.PrintWriter"%>
<head>
<link rel="shortcut icon" href="img/pmpmllogo.png">
  <title>New User Registration</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script src="//code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
<link rel="stylesheet" 
  href="//code.jquery.com/ui/1.10.4/themes/smoothness/jquery-ui.css">
  <link rel="stylesheet" href="gl/style.css">
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
    <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" />
<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
     <script src="js/validation.js"></script>
      <script src="js/custom.js"></script>
          <link href="assets/css/bootstrap-datetimepicker.min.css" rel="stylesheet" media="screen">
         
<style>
#topheader{

    background-color: white;
    height: 92px;
    /* border: 1px solid red; */
    width: 68%;
}.leftlogo{

float:left;
}
.input-group-addon {
    min-width: 158px !important;}
.rightlogo{
float:right;
}
.heading{
 
  
    width: 100%;
    /* float: left; */
    margin-top: 24px;
    font-size: 20px;
}
.error_show1{
margin-left:2px !important;
color: red
}
.error_show{
margin-left:14px !important;
color: red
}
.radio-inline {
    padding-top: 12px;
    margin-top: 0;
    margin-bottom: 0;
}
.inner{

height: 450px;
    background-color: white;
    margin-left: 12%;
    align: center;
    width: 71%;

}
.title{
font-size: 26px;
    margin-left: 26px;
    padding-top: 20px;

}
.formtitle{
   
}
.subtitle{
font: 17px/1.5 "../fonts/BentonSans-Regular", Arial, sans-serif;
    text-overflow: ellipsis;
    white-space: nowrap;
    overflow: hidden;
    margin-left: 26px;
    /* font-size: 16px; */
    margin-top: -20px;
}
.btn1-primary {
    color: #fff;
    background-color: #25A669;
    border-color: #eee;
}
.btn2-primary {
    color: #fff;
    background-color: #777;
    border-color: #eee;
}
#forgot{
float:right;
color:red;
}
.footer{
    background: #e6e6e6;
    text-align: center;
    position: fixed;
    bottom: 0px;
    left: 0px;
    width: 100%;
    z-index: 9999999999;
    height: 30px;
    padding-top: 8px;
}
.main-header {
    height: auto;
    position: relative;
    width: 100%;
    background-color: #ffffff;
    padding-top: 5px;
}
.texlg {
    font-size: 18px;
    font-weight: bolder;
    padding: 27px 0px;
    color: #404040;
}
#container{
}
.empty{
height:70px;
width:100%;


}
#info{
margin-left: 26px;
}
#left{margin-left: 13px;
}
#radi{
border-bottom-right-radius: 9px;
    /* border-radius: 5px; */
    height: 48px;
    border: 1px solid #cccccc;
    border-top-right-radius: 10px;
}
#ddlPassport{

}
#smicon{
float: left;
    margin-left: -3px;
}

</style>
</head>
<body onload="academicYear()">
<div id="head">
    <a class="menu" href="#">Contact</a>
  <a class="menu" href="#">Help</a>
  <script type="text/javascript">
  $(document).ready(function(){
	    $("#checkrop").click(function(){
	    	 if($(this).is(':checked')){
	    		 $("#viewtempaddr").hide();
	    		 document.getElementById("ropCheckValue").value="1";
	    	    } else {
	    	    	$("#viewtempaddr").show();
	    	    	 document.getElementById("ropCheckValue").value="0";
	    	    }
	    	
	    });
	   
	});
      /*  function ropValidation(){
    	   var rop=document.getElementById("checkrop");
    	   if( rop.checked){
    		   document.getElementById("temprop").display='block';
    	   }else{
    		   
    	   }
    	  
       } */
    </script>
<script>
function mobvalidatefun(e) {
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
	else if (!(("0123456789abcdefghijklmnopqrstuvwxyz- ").indexOf(keychar) > -1)) {
	return false;
	}
	}
function addressvalidate(e) {
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
	else if (!(("0123456789abcdefghijklmnopqrstuvwxyz#'.,-/ ").indexOf(keychar) > -1)) {
	return false;
	}
	}
function namevalidate(e) {
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
	else if (!(("abcdefghijklmnopqrstuvwxyz ").indexOf(keychar) > -1)) {
	return false;
	}
	}
</script>

</div>



<div class="container">
<div class="main-header">
<center><a href="#" >
			<img src="gl/img/pmpmllogo.png">
		</a><span id="lbltit" class="texlg title="PUNE MAHANAGAR PARIVAHAN MAHAMANDAL LTD">PUNE MAHANAGAR PARIVAHAN MAHAMANDAL LTD</span><img src="img/rainbowlogo.png" alt="rainbowlogo" style="width:138px;" ></center>
</div><hr>



<div id="container" class="row">

<div class="title" style="color: #008fcd;">
Register an Account

</div><br>
<div class="subtitle">
If You Already Have An Account, Please <a href="SignIn.jsp">Login</a>

</div>
 <form class="form-horizontal" name="login_form"  action="Controller?Action=registerProcess" method="post"> 
<div class="row">
<div id="info" class="col-md-12" style="color: #00599b;">
<h3>PERSONAL INFORMATION</h3>

</div></div><br><div class="row">
<div class="col-md-6">
 <div id="left" class="input-group input-group-lg">
                <span class="input-group-addon"><div id="smicon"><img  src="gl/img/1.svg" style="height:25px;width:25px;">  Salutation*</div></span>
<select name="salutation" id="salutation" class="form-control" style="
    width: 100%;
" onblur="checkSalutation()" onchange="checkSalutation()">		
<option value="">Select Salutation</option>
		<option value="Mr.">Mr.</option>
		<option value="Ms.">Ms.</option>
		<option value="Mrs.">Mrs.</option>
		<option value="Dr.">Dr.</option>
		<option value="Prof.">Prof.</option>
		<option value="Rev.">Rev.</option>

	</select>

            </div>
            	<span class="error_show" id="errorcodesal"></span>
            <div class="clearfix"></div>
            </div>
			
			<div class="col-md-6">
			 <div class="input-group input-group-lg">
               <span class="input-group-addon"><div id="smicon"><img  src="gl/img/2.png" style="height:25px;width:25px;">  Firstname*</div></span>
                <input type="text" class="form-control" placeholder="Your First Name" name="firstname" id="firstname" onkeypress="return namevalidate(event)" onkeyup="namevalid(this,'errorcode1','Please enter valid first name')" onBlur="nonempty(this,'errorcode1','Please Enter Your First Name')" maxlength="18"  value="" style="width:100%"  >
            </div>
			<span class="error_show1" id="errorcode1" style="margin-left: 4px; color: red;"></span>
            <div class="clearfix"></div>
			</div>
			
			</div>
			
		
			
			
			<div class="row">
			<div class="col-md-6">
			 <div id="left" class="input-group input-group-lg">
               <span class="input-group-addon"><div id="smicon"><img  src="gl/img/2.png" style="height:25px;width:25px;">  Middlename</div></span>
                <input type="text" class="form-control" placeholder="Your Middle Name" name="middlename" id="middlename"onkeypress="return namevalidate(event)" onkeyup="namevalid(this,'errorcode11','Please enter valid middle name')" onBlur="fullnameCheck()" value="" style="width:100%" maxlength="14"  >
            </div>
			<span class="error_show" id="errorcode11"></span>
            <div class="clearfix"></div>
			
			</div>
			<div class="col-md-6">
			 <div  class="input-group input-group-lg">
               <span class="input-group-addon"><div id="smicon"><img src="gl/img/2.png" style="height:25px;width:25px;">   Lastname*</div></span>
                <input type="text" class="form-control" placeholder="Your Last Name" name="lastname" id="lastname" value="" onkeypress="return namevalidate(event)" onkeyup="namevalid(this,'errorcode12','Please enter valid last name')"  onBlur="nonempty(this,'errorcode12','Please Enter Your Last Name')"style="width:100%" maxlength="18" >
            </div>
			<span class="error_show1" id="errorcode12"></span>
            <div class="clearfix"></div>
			</div>
			
			</div>
			
			
			<div class="row">
			<div class="col-md-6">
			 <div id="left" class="input-group input-group-lg">
               <span class="input-group-addon"><div id="smicon"><img src="gl/img/2.png" style="height:25px;width:25px;" > Full Name on Card</div></span>
                <input type="text" class="form-control" placeholder="Full Name on Card" name="fullname" id="fullname"   value="" maxlength="50" style="width:100%" readonly tabindex="-1">
            </div>
            <span  class="error_show1" id="errorc"></span>
            <div class="clearfix"></div>
			</div>
<!-- <div class="col-md-6">
			 <div  class="input-group input-group-lg">
               <span class="input-group-addon"><div id="smicon"><img src="gl/img/2.png" style="height:25px;width:25px;"> Father's Name*</div></span>
                <input type="text" class="form-control" placeholder="Father Name" name="fathername" id="fathername" onkeypress="return namevalidate(event)"  onBlur="emptyfather(this,'errorcode13','Please Enter Your Father Name')"  value="" maxlength="50" style="width:100%">
            </div>
			<span  class="error_show1" id="errorcode13"></span>
            <div class="clearfix"></div>
			
			</div> -->
				<div class="col-md-6">
			 <div  class="input-group input-group-lg">
               <span class="input-group-addon"><div id="smicon"><img src="gl/img/aadhar.png" style="height:25px;width:25px;">   Aadhar No*</div></span>
                <input type="text" class="form-control" placeholder="Your Aadhar No" name="aadhar" id="aadhar" onblur="vhCheck(this)" maxlength="12" value="" style="width:100%" >
            </div>
            <input type="hidden" hidden=true  class="form-control"  id="checkaadhar">  
			<span  class="error_show1" id="errorcode4"></span>
            <div class="clearfix"></div>
			
			</div>
			</div>
			
			
			<div class="row">
			<div class="col-md-6">
 <div id="left" class="input-group input-group-lg">
                <span class="input-group-addon"><div id="smicon"><img src="gl/img/2.png" style="height:25px;width:25px;">   Gender*</div></span>
<select name="gender" id="gender" class="form-control" style="width: 100%;"onchange="checkGender()" >	
    	<option value="">Select</option>
		<option value="Male">Male</option>
		<option value="Female">Female</option>
		<option value="Other">Other</option>
		

	</select>
            </div>
            <span  class="error_show" id="errorcode19"></span>
            <div class="clearfix"></div>
            </div>
			<div class="col-md-6">
 <div class="input-group input-group-lg">
                <span  class="input-group-addon"><div id="smicon"><img src="gl/img/calendar.png" style="height:25px;width:25px;">   DOB*</div></span>

	
			
                
               <div class="input-group date form_date col-md-5" data-date="" data-date-format="dd-mm-yyyy" data-link-field="dtp_input1" style="height: 46px;
    float: left;
    width: 100%;" >
                    <input class="form-control" type="text" value="" id="dob" name="dob" readonly style="width: 132px;height: 48px; border-radius: 0px; text-align: center;" onchange="passCheck()" onblur="nonemptydob()">
                    
					<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
                </div>
				<input type="hidden" id="dtp_input1" value="" /><br/>
            
	
            </div><span  class="error_show1" id="errorcode5"></span>
            <div class="clearfix"></div></div>
			</div>
			
			
			<div class="row">
			<div class="col-md-6">
			 <div id="left" class="input-group input-group-lg">
               <span class="input-group-addon"><div id="smicon"><img src="gl/img/newmail.png" style="height:25px;width:25px;">   Email*</div></span>
                <input type="text" class="form-control" placeholder="Email Address" id="email" name="email" maxlength="35" onblur='nonemptyemail(this)' value="" style="width:100%" >
            </div>
            <span id="email_err" class="bar"></span>
               <input type="hidden" hidden=true  class="form-control"  id="checkemail">
			<span class="error_show" id="errorcode3"></span>
            <div class="clearfix"></div>
			
			</div>
			<div class="col-md-6">
			 <div  class="input-group input-group-lg">
               <span class="input-group-addon"><div id="smicon"><img src="gl/img/smartphone.png" style="height:25px;width:25px;">   Mobile No*</div></span>
                <input type="text" class="form-control" placeholder="Your Mobile No" name="mobilenumber" id="mobile" maxlength="10" onBlur="nonemptymoblie(this);" maxlength="12" value="" style="width:100%" >
            </div>
            <input type="hidden" hidden=true  class="form-control"  id="checkmobile"> 
			<span  class="error_show1" id="errorcode2"></span>
            <div class="clearfix"></div>
			
			</div>
			</div>
			
			
			
			<div class="row">
			<div class="col-md-6">
			 <div  id="left" class="input-group input-group-lg">
               <span class="input-group-addon"><div id="smicon"><img src="gl/img/newphone1.png" style="height:25px;width:25px;">   Emergency Contact No</div></span>
                <input type="text" class="form-control" placeholder="Mobile No" name="emergency" maxlength="10" onBlur="phonevalid(this,'errorcode15');"value="" style="width:100%">
            </div>
			<span  class="error_show" id="errorcode15"></span>
            <div class="clearfix"></div>
			
			</div>
			<div class="col-md-6">
			 <div class="input-group input-group-lg">
               <span class="input-group-addon"><div id="smicon"><img src="gl/img/chair.png" style="height:25px;width:25px;">   Are You Differently Abled ?</div></span>
             <div id="radi">
			<label class="radio-inline" style="padding-top: 12px;">
      <input type="radio" name="optradio" value="Yes" onclick="removeReadonly(this)" >Yes
    </label>
   <label class="radio-inline" style="padding-top: 12px;">
      <input type="radio" value="no" name="optradio" onclick="removeReadonly(this)" checked>No
    </label>
            </div></div>
			
			
			</div>
			</div><br>
			
			
			<div class="row">
			<div class="col-md-6">
			 <div id="left" class="input-group input-group-lg">
               <span class="input-group-addon"><div id="smicon"><img src="gl/img/chair.png" style="height:25px;width:25px;">   Type of Handicaped</div></span>
             <select name="disabletype" id="disable" class="form-control editable" style=" width: 100%;" disabled="true">		
<option value="select">Select </option>
		<option value="Handicapped">Handicapped</option>
		<option value="Blind & Handicapped">Blind & Handicapped</option>
		<option value="Blind">Blind</option>
		<option value="Mentally ill">Mentally ill</option>

	</select>
            </div>
			
			
			</div>
			<div class="col-md-6">
			 <div class="input-group input-group-lg">
               <span class="input-group-addon"><div id="smicon"><img src="gl/img/locked.png" style="height:25px;width:25px;">   Password*</div></span>
                <input type="password" class="form-control" placeholder="Password" name="password" id="password1" value="" onkeyup="nonemptypassword()" onblur="nonemptypassword()" maxlength="15" style="width:100%" oncopy="return false" onpaste="return false" >
            </div>
			<span  class="error_show1" id="errorcodepass"></span>
            <div class="clearfix"></div>
			
			</div>			
			</div>
			
			<div class="row">
			<div class="col-md-6">
			 <div  id="left" class="input-group input-group-lg">
               <span class="input-group-addon"><div id="smicon"><img src="gl/img/locked.png" style="height:25px;width:25px;">   Confirm Password*</div></span>
                <input type="password" class="form-control" placeholder="Confirm Password" name="confirm" value="" id="password2" maxlength="15" onblur="neconfirmpassword()" onkeyup="neconfirmpassword()" style="width:100%" oncopy="return false" onpaste="return false" >
            </div>
			<span  class="error_show" id="errorcode18"></span>
            <div class="clearfix"></div>
			
			</div>
		<%-- 	<% Dao dao=new Dao();
			ArrayList<Model> list1=dao.getCategoryList();
			Iterator iter2 = list1.iterator();
			int i = 1;
			%> --%>
			<%-- <div class="col-md-6">
			 <div  class="input-group input-group-lg">
               <span class="input-group-addon"><div id="smicon"><img src="gl/img/newpass.png" style="height:25px;width:25px;">   Select Pass*</div></span>
 <select name="eligible" id="ddlPassport" class="form-control"  style="width: 100%;" ><!--onchange="checkEligible(this)"  -->
 <!-- <option value="">Select Pass Type</option> -->
	<%while (iter2.hasNext()) {
		System.out.println("size" + list1.size());
		Model reg = (Model) iter2.next(); %>
        <option value="<%=reg.getPasstypeID()%>"><%=reg.getPasstype() %></option>
       <!--  <option value="Y">General Pass</option>
		<option value="z">Senior Citizen Pass</option> -->
		<%
					i++;
					}
				%>
    </select>                
            </div>
            
			</div> --%>
			</div>
		<br> 
					<div class="row">
<div id="info" class="col-md-12" style="color: #00599b;">
<h3>PERMANENT ADDRESS INFORMATION</h3>

</div></div>
			
			
	<div class="row">
			<div class="col-md-6">
			 <div id="left" class="input-group input-group-lg">
               <span class="input-group-addon"><div id="smicon"><img src="gl/img/home123.png" style="height:25px;width:25px;">   Address*</div></span>
                <input type="text" class="form-control" placeholder="Your Address" name="address" id="address" maxlength="45" value="" onblur="nonemptyaddress(this,'errorcode_a1','Please Enter your Address')" onkeypress="return addressvalidate(event)" style="width:100%">
            </div>
			<span  class="error_show" id="errorcode_a1"></span>
            <div class="clearfix"></div>
			
			</div>
			<div class="col-md-6">
			 <div  class="input-group input-group-lg">
               <span class="input-group-addon"><div id="smicon"><img src="gl/img/address.png" style="height:25px;width:25px;">   Street*</div></span>
                <input type="text" class="form-control" placeholder="Your Street" name="street" id="street" maxlength="25"value="" onblur="nonemptyaddress(this,'errorcode_a2',' Please Enter your Street')"onkeypress="return mobvalidatefun(event)"style="width:100%">
            </div>
			<span  class="error_show1" id="errorcode_a2"></span>
            <div class="clearfix"></div>
			
			</div>
			
			</div>	
			
			<div class="row">
			<div class="col-md-6">
			 <div id="left" class="input-group input-group-lg">
               <span class="input-group-addon"><div id="smicon"><img src="gl/img/address.png" style="height:25px;width:25px;">   Area*</div></span>
                <input type="text" class="form-control" placeholder="Your Area" name="area" id="area" value="" maxlength="25" onblur="nonemptyaddress(this,'errorcode_a3',' Please Enter your Area ')" onkeypress="return mobvalidatefun(event)" style="width:100%">
            </div>
			<span  class="error_show" id="errorcode_a3"></span>
            <div class="clearfix"></div>
			
			</div>
			<div class="col-md-6">
			 <div  class="input-group input-group-lg">
               <span class="input-group-addon"><div id="smicon"><img src="gl/img/zip.png" style="height:25px;width:25px;">   Pincode*</div></span>
                <input type="text" class="form-control" placeholder="Enter Pincode" name="pincode" id="pincode" maxlength="6" value="" onkeypress="return numvalidate(event)" 
                onblur="nonemptyaddress(this,'errorcode17','Please Enter Your Pincode')" style="width:100%">
            </div>
			<span class="error_show1" id="errorcode17"></span>
            <div class="clearfix"></div>
			
			</div>
			
			</div>
			<!-- <div class="row">
			<div id="info" class="col-md-12" style="color: #00599b;">
			<input type="hidden" name="ropCheckValue" value="0" id="ropCheckValue">
			<input type="checkbox" id="checkrop" ><span><font size="3">Are you a resident of Pune</font></span>
			</div></div> -->
  <div id="viewtempaddr"  class="hidetempaddr"> 		
 <div class="row">
<div id="info" class="col-md-12" style="color: #00599b;">
<h3>TEMPORARY ADDRESS INFORMATION</h3>
<!-- <h5 style="color:red">*If You Are Visitor/Traveller	To Pune, Please Enter Your Communication Address In Pune</h5> -->
</div></div> 
			
			
	<div class="row" >
			<div class="col-md-6">
			 <div id="left" class="input-group input-group-lg">
               <span class="input-group-addon"><div id="smicon"><img src="gl/img/home123.png" style="height:25px;width:25px;">   Address*</div></span>
                <input type="text" class="form-control" placeholder="Your Address" name="tempaddress" id="tempaddress" maxlength="45" value="" onblur="nonemptytempaddress(this,'errorcode_at1','Please Enter your Address')" onkeypress="return addressvalidate(event)" style="width:100%">
            </div>
			<span  class="error_show" id="errorcode_at1"></span>
            <div class="clearfix"></div>
			
			</div>
			<div class="col-md-6">
			 <div  class="input-group input-group-lg">
               <span class="input-group-addon"><div id="smicon"><img src="gl/img/address.png" style="height:25px;width:25px;">   Street*</div></span>
                <input type="text" class="form-control" placeholder="Your Street" name="tempstreet" id="tempstreet" maxlength="25"value="" onblur="nonemptytempaddress(this,'errorcode_at2',' Please Enter your Street')"onkeypress="return mobvalidatefun(event)"style="width:100%">
            </div>
			<span  class="error_show1" id="errorcode_at2"></span>
            <div class="clearfix"></div>
			
			</div>
			
			</div>	
			
			<div class="row">
			<div class="col-md-6">
			 <div id="left" class="input-group input-group-lg">
               <span class="input-group-addon"><div id="smicon"><img src="gl/img/address.png" style="height:25px;width:25px;">   Area*</div></span>
                <input type="text" class="form-control" placeholder="Your Area" name="temparea" id="temparea" value="" maxlength="25" onblur="nonemptytempaddress(this,'errorcode_at3',' Please Enter your Area ')" onkeypress="return mobvalidatefun(event)" style="width:100%">
            </div>
			<span  class="error_show" id="errorcode_at3"></span>
            <div class="clearfix"></div>
			
			</div>
			<div class="col-md-6">
			 <div  class="input-group input-group-lg">
               <span class="input-group-addon"><div id="smicon"><img src="gl/img/zip.png" style="height:25px;width:25px;">   Pincode*</div></span>
                <input type="text" class="form-control" placeholder="Enter Pincode" name="temppincode" id="temppincode" maxlength="6" value="" onkeypress="return numvalidate(event)" 
                onblur="nonemptytempaddress(this,'errorcode_at4','Please Enter Your Pincode')" style="width:100%">
            </div>
			<span class="error_show1" id="errorcode_at4"></span>
            <div class="clearfix"></div>
			
			</div>
			
			  
			
			</div>
			
			
			</div>

    <script type="text/javascript">
        $(function () {
            $("#ddlPassport").change(function () {
                 if ($(this).val() == 2) {
                    $("#dv2").show();
                } 

				else {
                    $(".hideandseek").hide();
                }
            });
        });
    </script>
    <script type="text/javascript">
        $(function () {
            $("#school_status").change(function () {
                 if ($(this).val() == "Primary"||$(this).val() == "Secondary") {
                    $("#std").show();
                } 

				else {
                    $("#std").hide();
                }
            });
        });
    </script>
			<br>
			
			
   <br>
	 <div id="dv2" style="display: none;" class="hide">
	 <div class="row">
<div id="info" class="col-md-12" style="color: #00599b;">
<h3>INSTITUTION INFORMATION</h3>
</div></div><br>
<%-- <%	ArrayList<Model> list=Dao.getInstStatus();
				Iterator<Model> iter=list.iterator();%> --%>

					<div class="row">
						<div class="col-md-6">
							<div id="left" class="input-group input-group-lg">
								<span class="input-group-addon"><div id="smicon">
										<img src="gl/img/school.png"
											style="height: 25px; width: 25px;">Institution Status*
									</div></span> <select id="institutionstatus" name="school_status"
									class="form-control"
									onblur="nonemptyaddress(this,'errorcode25','Select Your Institution')"
									onChange='ComboChanged("instype",document.getElementById("institutionstatus").value,"institutionstatus")'
									style="width:100%">
									<option value="">Please select</option>
									<%-- <%
										while (iter.hasNext()) {
											Model dto = iter.next();
									%>
									<option value="<%=dto.getApplicationNo()%>"><%=dto.getStatus()%></option>
									<%
										}
									%> --%>
								</select>

							</div>
							<span class="error_show" id="errorcode25"></span>
								<div class="clearfix"></div>
						</div>
						<div class="col-md-6">
							<div class="input-group input-group-lg">
								<span class="input-group-addon"><div id="smicon">
										<img src="gl/img/school.png"
											style="height: 25px; width: 25px;">Institution Name*
									</div></span> <select name="school_name" id="institutionname"
									class="form-control" style="width: 100%;"
									onblur="institutionnamevalid(this)">
									<option value="">Select Institution name</option>
								</select>
							</div>
									<span class="error_show1" id="errorcode26"></span>
								<div class="clearfix"></div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-6">
							<div id="left" class="input-group input-group-lg">
								<span class="input-group-addon"><div id="smicon">
										<img src="gl/img/edit.png"
											style="height: 25px; width: 25px;">
										Registration Number*
									</div></span> <input class="form-control"
									placeholder=" Registration Number" name="reg_no" onkeypress="return numvalidate(event)"
									maxlength="20" id="reg_no" onblur="noemptyregno(this)" size=30
									style="width: 100%">
							</div>
									<span class="error_show" id="errorcode29"></span>
								<div class="clearfix"></div>
						</div>
						<div class="col-md-6">
							<div class="input-group input-group-lg">
								<span class="input-group-addon"><div id="smicon">
										<img src="gl/img/address.png"
											style="height: 25px; width: 25px;">Institution Address*
									</div></span>
								<textarea class="form-control" placeholder="Institution Address"
									name="school_address" maxlength="180"
									style="overflow: auto; resize: none;width:100%" rows="2" cols="21"
								 onkeyup="schooladdr(this)"
									onblur="schooladdr(this)" id="schaddr"></textarea>
								</div>
									<span class="error_show1" id="errorcode27"></span>
								<div class="clearfix"></div>
						</div>
					</div> 
					<div class="row">
						<div class="col-md-6">
							<div id="left" class="input-group input-group-lg">
								<span class="input-group-addon"><div id="smicon">
										<img src="gl/img/newphone1.png"
											style="height: 25px; width: 25px;">Institution phone*
									</div></span> <input class="form-control"
									placeholder="Institution phone(e.g:02020464378)"
									onblur="nonemptyaddress(this,'errorcode28','Enter Your Institution Phone')"
									onkeypress="return numvalidate(event)" name="school_phone"
									maxlength="11" id="schphone" style="width: 100%">
								</div>
									<span class="error_show" id="errorcode28"></span>
								<div class="clearfix"></div>
							
						</div>
						<div class="col-md-6">
							<div class="input-group input-group-lg">
								<span class="input-group-addon"><div id="smicon">
										<img src="gl/img/clock.png"
											style="height: 25px; width: 25px;">Institution Timing*
									</div></span> <select id="timing" name="timing" class="form-control"
									onblur="nonemptyaddress(this,'errorcode30','Please Select Your Institution Timing')" style="width: 100%">
									<option value="">Select</option>
									<option value="1">09.30AM-04.30PM</option>
									<option value="2">08.30AM-03.00PM</option>
									<option value="3">10.00AM-05.00PM</option>
									<option value="4">08.00AM-02.30PM</option>
									<option value="5">09.00AM-04.00PM</option>
									<option value="6">09.00AM-01.00PM</option>
									<option value="7">07.30AM-02.30PM</option>
								</select>
							</div>
									<span class="error_show1" id="errorcode30"></span>
								<div class="clearfix"></div>
						</div>
					</div>
					<div id="info" class="col-md-12" style="color: #00599b;">
<h3>STUDENT INFORMATION</h3>
</div><br>
					<div class="row">
						<div class="col-md-6">
							<div id="left" class="input-group input-group-lg">
								<span class="input-group-addon"><div id="smicon">
										<img src="gl/img/edit.png"
											style="height: 25px; width: 25px;">Registration
										Number*
									</div></span> <input class="form-control"
									placeholder="Registration Number" name="student_reg_no"
									maxlength="20" id="student_reg_no"onkeypress="return numvalidate(event)"
									onblur="noemptystudentregno(this)" size=30 style="width: 100%">
								</div>
									<span class="error_show" id="errorcode34"></span>
								<div class="clearfix"></div>
							
						</div>
						<div class="col-md-6">
							<div class="input-group input-group-lg" >
								<span class="input-group-addon"><div id="smicon1">
										<img src="gl/img/school.png"id="imagest"
											style="height: 25px; width: 25px;">Standard*
									</div></span> <select id="standard" name="standard" class="form-control"
									onblur="noemptystandard(this)" style="width: 100%">
									<option value="">Please select</option>
									<option value="1">1</option>
									<option value="2">2</option>
									<option value="3">3</option>
									<option value="4">4</option>
									<option value="5">5</option>
									<option value="6">6</option>
									<option value="7">7</option>
									<option value="8">8</option>
									<option value="9">9</option>
									<option value="10">10</option>
									<option value="11">11</option>
									<option value="12">12</option>
								</select> <select id="college" disabled style="display: none;"
									name="standard" class="btn btn-default"
									onblur="noemptycollege(this)" style="width:100%">
									<option value="">Please select</option>
									<option value="13">Engineering</option>
									<option value="14">Arts and Science</option>
								</select>
								</div>
									<span class="error_show1" id="errorcode35"></span>
							<div class="clearfix"></div>
							
						</div>
					</div> 
					<div class="row">
						<div class="col-md-6">
							<div id="left" class="input-group input-group-lg">
								<span class="input-group-addon"><div id="smicon">
										<img src="gl/img/school.png"
											style="height: 25px; width: 25px;">Division*
									</div></span> <select id="division" name="division" class="form-control"
									onblur="noemptydivision(this)" style="width: 100%">
									<option value="">Select Division</option>
									<option value="A">A</option>
									<option value="B">B</option>
									<option value="C">C</option>
									<option value="D">D</option>
									<option value="E">E</option>
								</select>
									</div>
									<span class="error_show" id="errorcode36"></span>
								<div class="clearfix"></div>
						
						</div>
						<div class="col-md-6">
							<div class="input-group input-group-lg">
								<span class="input-group-addon"><div id="smicon">
										<img src="gl/img/cal.png"
											style="height: 25px; width: 25px;">Academic Year*
									</div></span> <input class="form-control" readonly
									placeholder="Academic Year(YYYY-YYYY)" name="academic_year"
									id="academic_year" value="" style="width: 100%">
							</div>
									<span class="error_show" id="errorcode31"></span>
								<div class="clearfix"></div>
							
						</div>
					</div><br>
					<div id="info" class="col-md-12" style="color: #00599b;">
<h3>ROUTE INFORMATION</h3>
</div><br> 
					<div class="row">
						<div class="col-md-6">
							<div id="left" class="input-group input-group-lg">
								<span class="input-group-addon"><div id="smicon">
										<img src="gl/img/start.png"
											style="height: 25px; width: 25px;">Boarding Place*
									</div></span> <input id="boarding" class="form-control boarding12" placeholder="Boarding Place"
									name="boarding" maxlength="35"
									onblur="nonemptyaddress(this,'errorcode32','Enter Your Boarding Place')"
									onkeypress="return mobvalidatefun(event)" 
									style="width: 100%"><input type="hidden" name="boardingid" id="boardingid">
								</div>
									<span class="error_show" id="errorcode32"></span>
								<div class="clearfix"></div>
							
						</div>
						<div class="col-md-6">
							<div class="input-group input-group-lg">
								<span class="input-group-addon"><div id="smicon">
										<img src="gl/img/start.png"
											style="height: 25px; width: 25px;">Leaving Place*
									</div></span> <input class="form-control" placeholder="Leaving Place"
									name="leaving" maxlength="35"
									onblur="nonemptyaddress(this,'errorcode33','Enter Your Leaving Place')"
									onkeypress="return mobvalidatefun(event)" id="leaving"
									style="width: 100%"><input type="hidden" name="leavingid" id="leavingid">
								</div>
									<span class="error_show1" id="errorcode33"></span>
								<div class="clearfix"></div>
							
						</div>
					</div> 
    </div>
 <center><input type="submit"   class="btn btn1-primary" value="REGISTER" onclick="return registrationCheck()"></center><br>
</form>
<div class="empty"></div>
</div>
    


</div>

</div>
<script type="text/javascript">
var currentYear = (new Date).getFullYear();
for (var i = 1930; i <=currentYear; i++) {
    $('<option>').attr('value', i).text(i).appendTo('.year');
}
function monthChanged() {
    var days = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
    var month = $('.month').val() - 1,
        year = +$('.year').val();

    // Check for leap year if Feb
    if (month == 1 && new Date(year, month, 29).getMonth() == 1) days[1]++;

    // Add/Remove options
    if ($('.day option').length > days[month] + 1) {
        // Remove
        $('.day option').slice(days[month] + 1).remove();
    } else if ($('.day option').length < days[month] + 1) {
        // Add
        for (var i = $('.day option').length; i <= days[month]; i++) {
            $('<option>').attr('value', i).text(i).appendTo('.day');
        }
    }
}
$(function () {
    monthChanged(); // On document ready
    $('.month').change(monthChanged); // On month change
    $('.year').change(monthChanged); // On year change (for leap years)
});
function nonemptydob(){
	if(document.getElementById("dob").value=="")
		{
		document.getElementById("dob").style.borderColor="red";	
		document.getElementById("errorcode5").innerHTML="Please select your DOB";
		}else{
			passCheck();	
		}
}
function passCheck(){
	
	/* if(calculate_age()>=3&&calculate_age()<=25){
		document.getElementById("ddlPassport").value="N";
		 $("#dv2").show();
	} */
	 if((calculate_age()<3)||calculate_age()>100){
		//alert("Please select valid Date of Birth");
		document.getElementById("dob").value="";
		document.getElementById("dob").style.borderColor="red";	
		document.getElementById("errorcode5").innerHTML="Please select valid DOB";
	}else{
		document.getElementById("dob").style.borderColor="#ccc";	
		document.getElementById("errorcode5").innerHTML="";
	}
	/* else if(calculate_age()>100){
		alert("Please select valid Date of Birth");
		document.getElementById("dobYear").value="";
	} */
	
	/* else{
		document.getElementById("ddlPassport").value="Y";
		 $("#dv2").hide();
	} */
}
function removeReadonly(obj){
	if(obj.value=="Yes"){
	$(".editable").prop("disabled",false);
return false;}
	else{
		$(".editable").prop("disabled",true);	
	}
}
function checkEligible(obj){
	var a=calculate_age();
	if(a>=3&&a<=25){
			obj.value="N";
	}
	 if(a>=58){
		obj.value="z";
	}
	if(a>25&&a<58){
		obj.value="Y";
	}
	
}

</script>
<script>
   function clearCombo(param){
    
    document.getElementById(param).options[0]=new Option("Select Institution name","")
    
}
 function ComboChanged(cboName,cboid,cboval)
{   //alert(cboName+""+cboid+""+cboval);
	 oncollegeselction(document.getElementById("institutionstatus"));
    if(cboName=="instype")
    {
        clearCombo("institutionname");
    	
    }
    if(!cboval==""){
    	
          var url = "AjaxController?action=passapply&cmb="+cboName+"&id="+cboid+"&val="+cboval;
        var req = getXMLHTTP();
        req.onreadystatechange = function() 
        {
            if (req.readyState == 4) 
            {
                if (req.status == 200) 
                {
                    parseMessages(req.responseXML,cboName);
                } else if (req.status == 204)
                {
                    alert("Here");
                }
            }
          
        };
        req.open("GET", url, true);
        req.send(null);
    }
}
function parseMessages(responseXML,cboName) 
{
    if(cboName=="instype")
    {
        var latlongs=responseXML.getElementsByTagName("instypes")[0];
            for (loop = 0; loop < latlongs.childNodes.length; loop++)
            {
            var latlong = latlongs.childNodes[loop];
          
            var samnt = latlong.getElementsByTagName("id")[0].childNodes[0].nodeValue;
            var sval = latlong.getElementsByTagName("type")[0].childNodes[0].nodeValue;
            document.getElementById("institutionname").options[loop+1]=new Option(sval,samnt);
            
         	
            
          
    }
    }
} 	ComboChanged("instype",document.getElementById("institutionstatus").value,"institutionstatus");
    </script>
<script>
					function oncollegeselction(obj){
						var error=document.getElementById("errorcode35");
						error.innerHTML="";
						
						var skool=document.getElementById("standard");
						var college=document.getElementById("college");
						var h5=document.getElementById("smicon1");
						if(obj.value==2){
							
							h5.innerHTML="Degree*";
							skool.style.display="none";
							skool.setAttribute("disabled",true);
							college.className="form-control";
							skool.style.borderColor="#ccc";
							college.style.width="100%";
							college.removeAttribute("disabled");
							college.style.display="block";
						}else{
							h5.innerHTML="Standard*";
							skool.style.display="block";
							skool.removeAttribute("disabled");
							college.style.borderColor="#ccc";
							college.setAttribute("disabled",true);
							college.style.display="none";
						}
					}
					var d = new Date();
				    var n = d.getFullYear();
				    document.getElementById("academic_year").value = n+"-"+(n+1);
					</script>
					



<div class="footer">Copyright &copy; 2017 Powered by PMPML.</div>

<script src="js/auto.js"></script> 

 <script type="text/javascript" src="datepicker/jquery/jquery-1.8.3.min.js" charset="UTF-8"></script>
<script type="text/javascript" src="datepicker/bootstrap/js/bootstrap.min.js"></script>
          <script type="text/javascript" src="assets/js/bootstrap-datetimepicker.js" charset="UTF-8"></script>
<script type="text/javascript" src="assets/js/locales/bootstrap-datetimepicker.fr.js" charset="UTF-8"></script>

<script type="text/javascript">
    $('.form_date').datetimepicker({
        //language:  'fr',
        weekStart: 1,
        todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 2,
		minView: 2,
		forceParse: 0
    });

</script>


<!--</div>-->

</body>
</html>