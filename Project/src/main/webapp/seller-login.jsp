<%@ include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- Contucts Start -->
	<div class="container-fluid contact py-5">
		<div class="container py-5">
			<div class="p-5 bg-light rounded">
				<div class="row g-4">

					<div class="col-lg-12">
						<form action="SellerController" method="post">
							<div class="row g-4 wow fadeInUp" data-wow-delay="0.1s">
								<div class="col-lg-12 col-xl-12">
									<div class="form-floating">
										<input type="email" name="email" class="form-control" id="name"
											placeholder="Your Name"> <label for="name">Your
											Email</label>
									</div>
								</div>
								<div class="col-lg-12 col-xl-12">
									<div class="form-floating">
										<input type="password" name="password" class="form-control" id="name"
											placeholder="Your Name"> <label for="name">Your
											Password</label>
									</div>
								</div>


								<div class="col-12">
									<button name="action" value="login"
										class="btn btn-primary w-100 py-3">Login</button>
								</div>
							</div>
						</form>
					</div>
					  <h4 class="text-primary border-primary border-2 d-inline-block pb-2"><a href="#">Forgot Password ?</a></h4>
				</div>
			</div>
		</div>
	</div>
	<!-- Contuct End -->
</body>
</html>