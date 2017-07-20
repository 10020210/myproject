<!DOCTYPE html>
<html lang="en">
<head>
<link rel="shortcut icon" href="img/pmpmllogo.png">
<title>Login</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="gl/style.css">
   <script src="js/validation.js"></script>
    <script src="js/custom.js"></script>
<style>
#topheader {
	background-color: white;
	height: 92px;
	/* border: 1px solid red; */
	width: 68%;
}

.leftlogo {
	float: left;
}

.rightlogo {
	float: right;
}
.container {
box-shadow: 0 6px 5px rgba(0, 0, 0, 0.26);
    padding-right: 0px !important;
    padding-left: 0px !important;
}
.heading {
	width: 100%;
	/* float: left; */
	margin-top: 24px;
	font-size: 20px;
}
.formtitle {
    margin-top: -40px;
}

.inner {
	height: 450px;
	background-color: white;
	margin-left: 12%;
	align: center;
	width: 71%;
}
.input-group-addon {
    min-width: 184px !important;
    }
.title {
	font-size: 26px;
	margin-left: 26px;
	padding-top: 20px;
}

.formtitle {

}

.suctitle {

}

.btn1-primary {
	color: #fff;
	background-color: #33AB73;
	border-color: #eee;
}

.btn2-primary {
	color: #fff;
	background-color: #008ECD;
	border-color: #eee;
}

#forgot {
    float: right;
    color: red;
    margin-left: -9px;

    margin-top: 9px;
}

.footer {
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
	text-align: center;
    font-size: 18px;
    font-weight: bolder;
    padding: 27px 0px;
    color: #404040;
}

#container {

}

.empty {
	height: 40px;
	width: 100%;
}
.error_show{
margin-left: 2px !important;
color: red;
}
</style>
</head>
<body onload="DrawCaptcha();">
	<div id="head">

		<a class="menu" href="#">Contact</a> <a class="menu" href="#">Help</a>


	</div>
	<div class="container">
		<div class="main-header">
			<div class="row">
				<div class="col-lg-2 col-md-2 col-xs-1">
					<a href="SignIn.jsp" title="iNetwork"> <img
						src="gl/img/pmpmllogo.png" alt="iNetwork">
					</a>

				</div>
				<div class="col-lg-7 col-md-7 col-xs-8">
					<div class="texlg">
						<span id="lbltit" title="PUNE MAHANAGAR PARIVAHAN MAHAMANDAL LTD">PUNE
							MAHANAGAR PARIVAHAN MAHAMANDAL LTD</span>

							<span id="lbltit1" title="PUNE MAHANAGAR PARIVAHAN MAHAMANDAL LTD" style="margin-left: 0%;">PMPML</span>
					</div>
				</div>
				<div class="col-lg-3 col-md-3 col-xs-2">
					<img id="plpl" src="gl/img/rainbowlogo.png" alt="rainbowlogo"
						class="pull-right">
				</div>
			</div>
		</div>
		<hr>



		<div id="container" class="row">

			<div class="title">Login or Create An Account</div>
			<br>

			<div class="col-md-6 col-sm-12 col-xs-12">
				<img class="img-responsive" src="gl/img/busby.jpg">


			</div>

			<div class="col-md-6 col-sm-12 col-xs-12" id="form">
				<div class="formtitle">
					<h3>Registered Users</h3>

				</div>
				<br>
				<div class="suctitle">If you have an account with us,Please
					login.</div>
				<br>
				<form class="form-horizontal" name="login_form"
					action="Controller?Action=signIn" method="post">
					<div class="input-group input-group-lg">
						<span class="input-group-addon" ><img src="gl/img/envelope.png" style="height: 25px; width: 25px;margin-left: 13px;"> Email/Mobile*</span> <input
							type="text" class="form-control" placeholder="Email ID" id="user"
							name="user" value="" onblur="mailvalid(this)" style="width: 100%">
					</div>  <span class="error_show" id="errorcode1"></span>
            <div class="clearfix"></div>


					<div class="input-group input-group-lg">
						<span class="input-group-addon">
							<img src="gl/img/k.png" style="height: 25px; width: 25px;">
							Password*
						</span> <input type="password" class="form-control" placeholder="Password"
							name="pass" value=""onblur="passvalid(this)" id="pass" style="width: 100%">
					</div><span class="error_show" id="errorcode2"></span>
            <div class="clearfix"></div>

            <div class="input-group input-group-lg">
						<span class="input-group-addon">
							<input type="text" id="txtCaptcha"
            style="background-image:url(img/cap1.png);height:25px; text-align:center; border:none;width:90%;
            font-weight:bold; font-family:Modern" readonly oncopy="return false" tabindex="-1">
       <!-- <input type="button" id="btnrefresh" onclick="DrawCaptcha();" value='refresh' style="width:25px;background-image:url(img/ref.png);height:25px;"> -->
      <!--   <button onclick="DrawCaptcha();"><img src="img/ref.png" style="width:25px; height:25px;"></button> -->
            <a href="#" onClick="DrawCaptcha()" tabindex="-1"><img src="img/ref.png" style="width:25px; height:25px;" ></a>

						</span><input type="text" id="txtInput" class="form-control" onpaste="return false" placeholder="Enter Captcha here"  style="width: 100%" >
					</div><span class="error_show" id="captcha_err"></span>
            <div class="clearfix"></div>


			 <input type="button"
				class="btn btn2-primary" value="Register"  onclick="location.href='newregister.jsp'" style="width:50%;"><input type="submit" class="btn btn1-primary"
				value="SIGN IN" onClick="return validation();" style="width:50%;">
				<br>
				<div id="forgot"><a href="#"  data-toggle="modal" data-target="#myModal1" style="color: #31708F;">Forgot Your Password?</a></div>
			</form>

<div class="empty"></div>
			<div class="modal fade" id="myModal1" role="dialog">
				<div class="modal-dialog">
					<form method="post" action="ForgotPassword"
						class="form-horizontal">
						<!-- Modal content-->
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal">&times;</button>
								<h4 class="modal-title">Forgot Your Password?</h4>
							</div>
							<div class="modal-body">

								<div class="col-md-8">
									<input type="text" class="form-control"
										 placeholder="Enter Your Email" name="forgotemail" id="uemail" value=""
										style="width: 100%" onblur="Emailcheck();">
								</div>
							</div>
							<div class="modal-footer">
							<input type="submit" class="btn btn1-primary" value="Send" onClick="return emptyForgot()">
							</div>

					</form>
				</div>

			</div>


		</div>



	</div>


	</div>
<script>
function emptyForgot(){
	if(document.getElementById("uemail").value==""){
		return false;
	}
	else{
		return true;
	}
}
function DrawCaptcha(){
    var alpha = new Array('A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');
    var i;
    for (i=0;i<6;i++){
      var a = alpha[Math.floor(Math.random() * alpha.length)];
      var b = alpha[Math.floor(Math.random() * alpha.length)];
      var c = alpha[Math.floor(Math.random() * alpha.length)];
      var d = alpha[Math.floor(Math.random() * alpha.length)];
      var e = alpha[Math.floor(Math.random() * alpha.length)];
      var f = alpha[Math.floor(Math.random() * alpha.length)];
      var g = alpha[Math.floor(Math.random() * alpha.length)];
     }
   var code = a + ' ' + b + ' ' + ' ' + c + ' ' + d + ' ' + e + ' '+ f + ' ' + g;
   document.getElementById("txtCaptcha").value = code
   document.getElementById("txtInput").value="";
 }
 function removeSpaces(string){
   return string.split(' ').join('');
 }
</script>

<noscript>
 For full functionality of this site it is necessary to enable JavaScript.
 Here are the <a href="http://www.enable-javascript.com/" target="_blank">
 instructions how to enable JavaScript in your web browser</a>.
</noscript>

<div th:insert="fragment/footer :: footer"></div>

<script src="assets/js/jquery-1.10.2.js"></script>
    <!-- Bootstrap Js -->
    <script src="assets/js/bootstrap.min.js"></script>
    <!-- Metis Menu Js -->
    <script src="assets/js/jquery.metisMenu.js"></script>
    <!-- Morris Chart Js -->
    <script src="assets/js/morris/raphael-2.1.0.min.js"></script>
    <script src="assets/js/morris/morris.js"></script>
    <!-- Custom Js -->
    <script src="assets/js/custom-scripts.js"></script>


      <!-- Custom Js -->
      <script src="assets/js/custom-scripts.js"></script>


      <!-- Chart Js -->

      <script type="text/javascript" src="assets/js/chartjs.js"></script>


	<!--</div>-->

</body>
</html>
