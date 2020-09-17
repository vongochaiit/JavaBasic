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

<title>SB Admin 2 - Login</title>

<!-- Custom fonts for this template-->
<link href="Admin-Assets/vendor/fontawesome-free/css/all.min.css"
	rel="stylesheet" type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template-->
<link href="Admin-Assets/css/sb-admin-2.min.css" rel="stylesheet">

</head>

<body class="bg-gradient-primary" style="background: #5a5c69">

	<div class="container">

		<!-- Outer Row -->
		<div class="row justify-content-center">

			<div class="col-xl-10 col-lg-12 col-md-9">

				<div class="card o-hidden border-0 shadow-lg my-5">
					<div class="card-body p-0">
						<!-- Nested Row within Card Body -->
						<div class="row">
							<div class="col-lg-6">
								<img src="assets/images/4.png"
									style="height: 100%; width: 100%">
							</div>
							<div class="col-lg-6">
								<div class="p-5">
									<div class="text-center">
										<h1 class="h4 text-gray-900 mb-4">Hello My Friend!</h1>
									</div>
									<%-- <form class="needs-validation" novalidate>
										<div class="form-group">
											<label for="uname">Username:</label> <input name="userName" type="text" value="${userName }"
												class="form-control form-control-user" placeholder="Enter username" required>
											<div class="valid-feedback">Valid.</div>
											<div class="invalid-feedback">Please fill out this
												field.</div>
										</div>
										<div class="form-group">
											<label for="pwd">Password:</label> <input name="password" type="password" value="${password }"
												class="form-control form-control-user"  placeholder="Enter password" required>
											<div class="valid-feedback">Valid.</div>
											<div class="invalid-feedback">Please fill out this
												field.</div>
										</div>
										<div class="row form-group">
											<div class="col-lg-12 col-lg-offset-2">
												<p style="color: red;"><%=request.getAttribute("Notification")%></p>
											</div>
										</div>

										<button  type="submit" class="btn btn-primary">Submit</button>
									</form> --%>
									<form class="needs-validation" action="Login" method="post"
										novalidate>
										<div class="form-group">
											<input name="userName" type="text" value="${userName }"
												class="form-control form-control-user"
												placeholder="Username" required>
											<!-- <div class="valid-feedback">Valid.</div>
											<div class="invalid-feedback">Please fill out this
												field.</div> -->
										</div>
										<div class="form-group">

											<input name="password" type="password" value="${password }"
												class="form-control form-control-user"
												placeholder="Password" required>
											<!-- <div class="valid-feedback">Valid.</div>
											<div class="invalid-feedback">Please fill out this
												field.</div> -->
										</div>

										<div class="row form-group">
											<div class="col-lg-12 col-lg-offset-2">
												<p style="color: red;"><%=request.getAttribute("Notification")%></p>
											</div>
										</div>
										<button class="btn btn-primary btn-user btn-block"
											type="submit" value="submit" name="submit">Login</button>

										<hr>
									</form>
									<div class="text-center">
										<a class="small" href="/SampleWeb/Register">Create
											Account!</a>
									</div>
								</div>
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
	<script src="Admin-Assets/js/sb-admin-2.min.js"></script>
	<link 
		href="Admin-Assets/js/bootstrap.min.css">
	<script
		src="Admin-Assets/js/jquery.min.js"></script>
	<script
		src="Admin-Assets/js/popper.min.js"></script>
	<script
		src="Admin-Assets/js/bootstrap.min.js"></script>
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
	</script>

</body>

</html>
