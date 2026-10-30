<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="seller-header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container-fluid contact py-5">
		<div class="container py-5">
			<div class="p-5 bg-light rounded">
				<div class="row g-4">

					<div class="col-lg-12">
						<form action="SellerController" method="post">
							<div class="row g-4 wow fadeInUp" data-wow-delay="0.1s">
							<input type="hidden" name="id" class="form-control" id="name"
											value="<%=s.getId()%>"> 
								<div class="col-lg-12 col-xl-12">
									<div class="form-floating">
										<input type="text" name="name" class="form-control" id="name"
											value="<%=s.getName()%>"> <label for="name">Your
											name</label>
									</div>
								</div>

								<div class="col-lg-12 col-xl-12">
									<div class="form-floating">
										<input type="text" name="contact" class="form-control"
											id="name" value="<%=s.getContact()%>"> <label for="name">Your
											Contact</label>
									</div>
								</div>
								<div class="col-lg-12 col-xl-12">
									<div class="form-floating">
										<input type="text" name="address" class="form-control"
											id="name" value="<%=s.getAddress()%>"> <label for="name">Your
											Address</label>
									</div>
								</div>
								<div class="col-lg-12 col-xl-12">
									<div class="form-floating">
										<input type="email" name="email" class="form-control"
											id="name" value="<%=s.getEmail()%>"> <label for="name">Your
											Email</label>
									</div>
								</div>
								<div class="col-12">
									<button name="action" value="update"
										class="btn btn-primary w-100 py-3">Update</button>
								</div>
							</div>
						</form>
					</div>

				</div>
			</div>
		</div>
	</div>
</body>
</html>