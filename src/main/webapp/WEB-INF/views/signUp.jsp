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
	function signUp() {
		var theForm = document.getElementById("signUp");
		theForm.action = "signUpComplete";
		theForm.submit()
	}
	
	var httpRequestID;
	var httpRequestSSN;
	
	function idCheck() {
		httpRequestID = new XMLHttpRequest();
		if (!httpRequestID) {
			alert('ID중복확인 XMLHTTP 인스턴스를 만들 수가 없어요 ㅠㅠ');
			return false;
		}
		httpRequestID.onreadystatechange = idCheckCallBack;

		var toBeCalculated = document.getElementsByClassName("toBeCalculated");
		
		httpRequestID.open('GET', 'calculateRate?' + params); // calculateRate // 언더라이팅 대용
		httpRequestID.send();
	}
	
	function ssnCheck() {
		httpRequestSSN = new XMLHttpRequest();
		if (!httpRequestSSN) {
			alert('주민등록번호중복확인 XMLHTTP 인스턴스를 만들 수가 없어요 ㅠㅠ');
			return false;
		}
		httpRequestSSN.onreadystatechange = ssnCheckCallBack;

		var toBeCalculated = document.getElementsByClassName("toBeCalculated");
		
		httpRequestSSN.open('GET', 'calculateRate?' + params); // calculateRate // 언더라이팅 대용
		httpRequestSSN.send();
	}
	
	function idCheckCallBack() {
		if (httpRequestID.readyState === XMLHttpRequest.DONE) {
			if (httpRequestID.status === 200) {
				var res = httpRequestID.responseText;
				alert(res);
				var idCheckedTag = document.getElementById("idChecked");
				idCheckedTag.innerHTML = "계산된 위험률 => " + res;
			} else {
				alert('request에 뭔가 문제가 있어요. ID중복확인 콜백');
			}
		}
	}
	
	function ssnCheckCallBack() {
		if (httpRequestSSN.readyState === XMLHttpRequest.DONE) {
			if (httpRequestSSN.status === 200) {
				var res = httpRequestSSN.responseText;
				alert(res);
				var socialSecurityNumberCheckedTag = document.getElementById("socialSecurityNumberChecked");
				socialSecurityNumberChecked.innerHTML = res;
			} else {
				alert('request에 뭔가 문제가 있어요. SSN중복확인 콜백');
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
					<td>
						<button onclick="idCheck()">ID 중복 확인</button>
						<span id="idChecked"></span>
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
					<td>
						<button onclick="ssnCheck()">주민등록번호 중복 확인</button>
						<span id="socialSecurityNumberChecked"></span>
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
			<button type="button" class="btn btn-outline btn-primary" onclick="history.back(-1);">
            <i class="fa fa-edit fa-fw"></i> 뒤로가기
         </button>
		</div>
	</div>

</body>
</html>