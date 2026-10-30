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
					<%
					String msg = (String) request.getAttribute("msg");
					if (msg != null) {
					%>
					<h4
						class="text-primary border-primary border-2 d-inline-block pb-2">
						<%
						out.print(msg);
						%>
					</h4>
					<%
					}
					%>

					<div class="col-lg-12">
						<form action="SellerController" method="post">
							<div class="row g-4 wow fadeInUp" data-wow-delay="0.1s">
								<input type="hidden" name="id" class="form-control" id="name"
									value="<%=s.getId()%>">

								<div class="col-lg-12 col-xl-12">
									<div class="form-floating">
										<input type="password" name="op" class="form-control"
											id="name" placeholder="Old Password"> <label
											for="name">Old Password</label>
									</div>
								</div>
								<div class="col-lg-12 col-xl-12">
									<div class="form-floating">
										<input type="password" name="np" class="form-control"
											id="name" placeholder="New Password"> <label
											for="name">New Password</label>
									</div>
								</div>
								<div class="col-lg-12 col-xl-12">
									<div class="form-floating">
										<input type="password" name="cnp" class="form-control"
											id="name" placeholder="Confirm New Password"> <label
											for="name">Confirm New Password</label>
									</div>
								</div>
								<div class="col-12">
									<button name="action" value="changepass"
										class="btn btn-primary w-100 py-3">Update Password</button>
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