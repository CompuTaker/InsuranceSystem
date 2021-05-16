<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
   
	<script type="text/javascript">
		var httpRequest;
		var isAvailable = false;
		
		function isDuplicateCheck() {
			httpRequest = new XMLHttpRequest();
			if (!httpRequest) {
				alert('중복확인 XMLHTTP 인스턴스를 만들 수가 없어요 ㅠㅠ');
				return false;
			}
			httpRequest.onreadystatechange = duplicateCheckCallBack;
	
			var loginIDtag = document.getElementById("loginID");
			var socialSecurityNumberTag = document.getElementById("socialSecurityNumber");
			var loginPasswordTag = document.getElementById("loginPassword");
			
			if( !loginIDtag.value ){
				alert("id를 입력해주세요!");
				return false;
			}
			if( !loginPasswordTag.value ){
				alert("비밀번호를 입력해주세요!");
				return false;
			}
			if( !socialSecurityNumberTag.value ){
				alert("주민등록번호를 입력해주세요!");
				return false;
			}
			
			console.log(loginIDtag.value);
			console.log(socialSecurityNumberTag.value);
			
			httpRequest.open('GET', 'checkDuplicate?id=' + loginIDtag.value + "&ssn=" + socialSecurityNumberTag.value);
			httpRequest.send();
		}
		
		function duplicateCheckCallBack() {
			if (httpRequest.readyState === XMLHttpRequest.DONE) {
				if (httpRequest.status === 200) {
					var res = httpRequest.responseText;
					var strs = res.split(" ");
					if(res == ""){
						alert("사용가능합니다!");
						isAvailable = true;
					}else{
						alert(res + "중복!");
					}
				} else {
					alert('request에 뭔가 문제가 있어요. ID/주민등록번호 중복확인 콜백');
				}
			}
		}
		
		function signUp() {
			
			var loginID = document.getElementById("loginID").value;
			var loginPassword = document.getElementById("loginPassword").value;
			var customerName = document.getElementById("customerName").value;
			var gender = document.getElementsByName("gender").value;
			var socialSecurityNumber = document.getElementById("socialSecurityNumber").value;
			var age = document.getElementById("age").value;
			var job = document.getElementsByName("job").value;
			var email = document.getElementById("email").value;
			var address = document.getElementById("address").value;
			
			if(loginID == "") {
				alert('아이디를 입력해주세요');
			} else if(loginPassword ==  "") {
				alert('패스워드를 입력해주세요');
			} else if(customerName ==  "") {
				alert('이름을 입력해주세요');
			} else if(gender ==  "") {
				alert('성별을 선택해주세요');
			} else if(socialSecurityNumber ==  "") {
				alert('주민번호를 입력해주세요');
			} else if(age ==  "") {
				alert('나이를 입력해주세요');
			} else if(job ==  "") {
				alert('직업을 선택해주세요');
			} else if(email ==  "") {
				alert('이메일을 입력해주세요');
			} else if(address ==  "") {
				alert('주소를 입력해주세요');
			} else {
				var theForm = document.getElementById("signUp");
				if(isAvailable){
					theForm.action = "signUpComplete";
					theForm.submit();
				}else{
					alert("중복확인을 하지 않았습니다! 중복확인을 해주세요!");
				}
			}
		}
	
	</script>
  
	<style>
		table {
		  	width: 30%;
		   	border: 1px solid #444444;
		   	border-collapse: collapse;
		   	text-align: center;
		 }
		 th, td {
		 	border: 1px solid #444444;
		 	padding: 3px;
		 }
	</style>

<title>회원가입</title>
</head>
<body>

	<form action="signUpComplete" id="signUp"
		method="post">

		<table width="100%" cellpadding="0" cellspacing="0" border="0">
			<thead>
				<tr>
					<th>회원가입</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>ID</td>
					<td>
						<input type="text" class="form-control" name="loginID" id="loginID" placeholder="ID">
					</td>
				</tr>
				<tr>
					<td>password</td>
					<td>
					<input type="password" class="form-control" name="loginPassword" id="loginPassword" placeholder="password">
					</td>	
				</tr>
				<tr>
					<td>이름</td>
					<td>
					<input type="text" class="form-control" name="customerName" id="customerName" placeholder="이름">
					</td>	
				</tr>
				<tr>
					<td>성별</td>
					<td>
						<input type="radio" name="gender" id="gender" value="0"> 남자 &nbsp;&nbsp;
						<input type="radio" name="gender" id="gender" value="1"> 여자
					</td>	
				</tr>
				<tr>
					<td>주민번호</td>
					<td>
						<input type="text" class="form-control" name="socialSecurityNumber" id="socialSecurityNumber" placeholder="주민번호">
					</td>
				</tr>
				<tr>
					<td>나이</td>
					<td>
					<input type="text" class="form-control" name="age" id="age" placeholder="나이">
					</td>	
				</tr>
				<tr>
					<td>직업</td>
					<td>
					<c:forEach items="${jobs}" var="jobs">
					<input type="radio" name="job" checked="checked"
							 value="${jobs.name()}"> ${jobs.name()} &nbsp;
					</c:forEach>
					</td>	
				</tr>
				<tr>
					<td>이메일</td>
					<td>
					<input type="text" class="form-control" name="email" id="email" placeholder="이메일">
					</td>	
				</tr>
				<tr>
					<td>주소</td>
					<td>
					<input type="text" class="form-control" name="address" id="address" placeholder="주소">
					</td>
				</tr>
			</tbody>
		</table>
	</form>

	<div class="row">
		<div class="col-lg-12">
			<button class="btn btn-outline btn-primary"
				onclick="signUp()">
				<i class="fa fa-edit fa-fw"></i> 회원가입
			</button>
			<button onclick="isDuplicateCheck()">중복 확인 (ID, 주민등록번호)</button>
			<button type="button" class="btn btn-outline btn-primary" onclick="history.back(-1);">
            <i class="fa fa-edit fa-fw"></i> 뒤로가기
         </button>
		</div>
	</div>

</body>
</html>