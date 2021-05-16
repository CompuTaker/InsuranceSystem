<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<script type="text/javascript">
	function insertContract(){
		var theForm = document.getElementById("theForm");
		var aggreeTag = document.getElementById("aggree");
		if(aggreeTag.checked){
			alert("해당 고객을 가입시킵니다!");
			theForm.action = "insertContract";
			theForm.submit();
		}else{
			alert("약관에 동의하지 않아서 가입시킬 수 없습니다!");
		}
	}
</script>

<title>보험사 시스템</title>
</head>
<body>
	<div class="page-wrapper">
		<div class="container-fluid">
			<div class="col-lg-8">
				<!--게시판 넓이 -->
				<div class="col-lg-12">
					<h1 class="page-header">보험 가입 약관</h1>
				</div>
				<hr/>
				<p>약관 내용에 동의하십니까?</p>
				<form id="theForm">
					<c:forEach items="${rmap}" var="one" varStatus="status">
						<input type="hidden" name="${one.key}" value="${one.value}">
					</c:forEach>
					계약 만료일 지정하기<input type="date" name="contractExpirationDate"/>
					<br/>
					동의합니다!<input type="radio" id="aggree" name="agreeOrNot" value="agree" checked="checked"/>
					<br/>
					동의하지않습니다!<input type="radio" id="no" name="agreeOrNot" value="not"/>
					<button onclick="insertContract()">보험 가입시키기</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>