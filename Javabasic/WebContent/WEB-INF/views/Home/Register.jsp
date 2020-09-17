
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>SB Admin 2 - Register</title>

<!-- Custom fonts for this template-->
<link href="Admin-Assets/vendor/fontawesome-free/css/all.min.css"
	rel="stylesheet" type="text/css">
<link href="Admin-Assets/js/jquery-ui.css" rel="stylesheet" type="text/css">	
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template-->
<link href="Admin-Assets/css/sb-admin-2.min.css" rel="stylesheet">

</head>

<body class="bg-gradient-primary"style="background: #5a5c69">

	<div class="container">

		<div class="card o-hidden border-0 shadow-lg my-5" >
			<div class="card-body p-0">
				<!-- Nested Row within Card Body -->
				<div class="row">
					<div class="col-lg-5">
					<img src="assets/images/4.png" style="height: 100%; width: 100%">
					</div>
					<div class="col-lg-7">
						<div class="p-5">
							<div class="text-center">
								<h1>Hello My Friend!</h1>
							</div>
							
							<form class="needs-validation" action="Register" method="post" novalidate>
								<div class="form-group row">
									<div class="col-sm-6 mb-3 mb-sm-0">
										<input name="userName" type="text" value="${userName }"
											class="form-control form-control-user" placeholder="UserName" required="required">
									</div>

									<div class="col-sm-6">
										<input name="password" type="password"
											class="form-control form-control-user" placeholder="Password" required="required">
									</div>
								</div>

								<div class="form-group row">
									<div class="col-sm-6 mb-3 mb-sm-0">
										<input name="firstName" type="text" value="${firstName }"
											class="form-control form-control-user"
											placeholder="First Name" required="required">
									</div>
									<div class="col-sm-6">
										<input name="lastName" type="text" value="${lastName }"
											class="form-control form-control-user"
											placeholder="Last Name" required="required">
									</div>
								</div>

								<div class="form-group row">
									<div class="col-sm-6 mb-3 mb-sm-0">
										<input name="phoneNumber" type="text" value="${phoneNumber }"
											class="form-control form-control-user"
											placeholder="PhoneNumber" required="required">
									</div>
									<div class="col-sm-6">
										<input name="dateOfBirth" type="text" value="${dateOfBirth }"
											class="form-control form-control-user datepicker" autocomplete="off"
											placeholder="Your Birthday">
									</div>
								</div>

								<div class="form-group row">
									<div class="col-sm-6  col-lg-offset-2">
										<p style="color: red;"><%=request.getAttribute("Notification")%></p>
									</div>
								</div>
								<button class="btn btn-primary btn-user btn-block" type="submit"
									value="submit" name="submit">Register Account</button>
									<hr>
							</form>
							<div class="text-center">
										<a class="small" href="/SampleWeb/Login">Login
											Account!</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

	</div>

	<!-- Bootstrap core JavaScript-->
	<script src="Admin-Assets/vendor/jquery/jquery.min.js"></script>
	<script src="Admin-Assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Core plugin JavaScript-->
	<script src="Admin-Assets/vendor/jquery-easing/jquery.easing.min.js"></script>

	<!-- Custom scripts for all pages-->
	
	<link 
		href="Admin-Assets/js/bootstrap.min.css">
	<script
		src="Admin-Assets/js/jquery.min.js"></script>
	<script
		src="Admin-Assets/js/popper.min.js"></script>
	<script
		src="Admin-Assets/js/bootstrap.min.js"></script>
	<script src="Admin-Assets/js/sb-admin-2.min.js"></script>
	<script src="Admin-Assets/js/jquery-1.12.4.js"></script>
	<script src="Admin-Assets/js/jquery-ui.js"></script>
	<script>
		// Disable form submissions if there are invalid fields
		(function() {
			'use strict';
			window.addEventListener('load',
					function() {
						// Get the forms we want to add validation styles to
						var forms = document
								.getElementsByClassName('needs-validation');
						// Loop over them and prevent submission
						var validation = Array.prototype.filter.call(forms,
								function(form) {
									form.addEventListener('submit', function(
											event) {
										if (form.checkValidity() === false) {
											event.preventDefault();
											event.stopPropagation();
										}
										form.classList.add('was-validated');
									}, false);
								});
					}, false);
		})();
		
		 $( function() {
			    $( ".datepicker" ).datepicker({
			    minDate: "-50Y", 
			    maxDate: "+12 +15D +20Y",
			    changeMonth: true,
			    changeYear: true, 
			    });
			  } );
	</script>
	
</body>

</html>
