<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>보험사 시스템로그인</title>
</head>
<body>
	<form action="loginDo" name="loginform" method="post">
		<input type="radio" name="whoLogin" value="고객" checked/>고객 /
		<input type="radio" name="whoLogin" value="영업사원"/>영업사원 /
		<input type="radio" name="whoLogin" value="내부승인자"/>내부승인자
		<div class="logindiv">
			<input type="text" class="form-control" name="id" id="userid"
				placeholder="ID">
		</div>
		<div class="logindiv">
			<input type="password" class="form-control" name="pw" id="password"
				placeholder="PASSWORD">
		</div>
		<div class="logindiv">
			<button type="submit" id="btn-login" name="login">로그인</button>
		</div>
	</form>
</body>
</html>
