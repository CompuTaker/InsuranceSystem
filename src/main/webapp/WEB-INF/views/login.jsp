<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>보험사 시스템로그인</title>
	<script type="text/javascript">
		function loginFunction(){
			var loginForm = document.getElementById("loginForm");
			var id = document.getElementById("userid");
			var pw = document.getElementById("password");
			if( !id.value ){
				alert("id를 입력하세요!");
				return false;
			}
			if( !pw.value ){
				alert("pw를 입력하세요!");
				return false;
			}
			loginForm.submit();
		}
		
		function homeFunction(){
			location.href = "index"
		}
	</script>
</head>
<body>
	<form action="loginDo" name="loginform" method="post" id="loginForm">
		<input type="radio" name="whoLogin" value="고객" checked/>고객 /
		<input type="radio" name="whoLogin" value="영업사원"/>영업사원 /
		<input type="radio" name="whoLogin" value="내부승인자"/>내부승인자/
		<input type="radio" name="whoLogin" value="보험개발자"/>보험개발자
		<div class="logindiv">
			<input type="text" class="form-control" name="id" id="userid"
				placeholder="ID">
		</div>
		<div class="logindiv">
			<input type="password" class="form-control" name="pw" id="password"
				placeholder="PASSWORD">
		</div>
		<div class="logindiv">
			<input type="button" onclick="loginFunction()" value="로그인" id="btn-login" name="login">
		</div>
		<div class="homediv">
			<input type="button" onclick="homeFunction()" value="처음으로" id="btn-home" name="home">
		</div>
	</form>
</body>
</html>
