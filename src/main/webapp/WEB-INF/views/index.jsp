<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>보험사 시스템</title>
<script type="text/javascript">
	
<%
	String currentLogin = "";
	if(session.getAttribute("customer") != null){
		currentLogin = "customer";
	}else if(session.getAttribute("salesman") != null){
		currentLogin = "salesman";
	}else if(session.getAttribute("insuranceInteralApprover") != null){
		currentLogin = "insuranceInteralApprover";
	}else if(session.getAttribute("insuranceDeveloper") != null){
		currentLogin = "insuranceDeveloper";
	}
	System.out.println("현재 로그인 : " + currentLogin);
%>
	
	function pageChange() {
		if(<%= currentLogin.equals("insuranceDeveloper") %>){
			location.href = "proposalRequest";
		}else{
			alert("보험 개발자로 로그인하세요!");
		}
	}
	
	function requestInternalApprover() {
		if(<%= currentLogin.equals("insuranceDeveloper") %>){
			location.href = "beforeInternalApproved";
		}else{
			alert("보험 개발자로 로그인하세요!");
		}
	}
	
	function approveInternal() {
		if(<%= currentLogin.equals("insuranceInteralApprover") %>){
			location.href = "afterInternalApproved";
		}else{
			alert("보험 내부 승인자로 로그인하세요!");
		}
	}	
	
	function approveExternal() {
		if(<%= currentLogin.equals("insuranceInteralApprover") %>){
			location.href = "afterExternalApproved";
		}else{
			alert("보험 내부 승인자로 로그인하세요!");
		}
	}	
	
	function makeInsurancePublicFromProposal() {
		if(<%= currentLogin.equals("insuranceInteralApprover") %>){
			location.href = "makeInsurancePublicFromProposal";
		}else{
			alert("보험 내부 승인자로 로그인하세요!");
		}
	}
	
	function showAllInsurance() {
		location.href = "allInsurance";
	}
	
	function joinInsurance(){
		if(<%= currentLogin.equals("salesman") %>){
			location.href = "insuranceList";
		}else{
			alert("영업사원으로 로그인하세요!");
		}
	}
	
	function showCustomerForSales(){
		if(<%= currentLogin.equals("salesman") %>){
			location.href = "showCustomerForSales";
		}else{
			alert("영업사원으로 로그인하세요!");
		}
	}
	
	function allContract(){
		if(<%= currentLogin.equals("customer") %>){
			location.href = "allContract";
		}else{
			alert("고객으로 로그인하세요!");
		}
	}
	
	function login(){
		location.href = "login";
	}
	
	function logout(){
		location.href = "logout";
	}
	
	function signUp(){
		location.href = "signUp";
	}
</script>
</head>
<body>
	<h1>MJU 보험사</h1>

		<div>
			<button onclick="pageChange()">제안서 개발하기</button>
		</div>
		<div>
			<button onclick="requestInternalApprover()">제안서 내부승인 요청하기</button>
		</div>
<br>
	<div>
		<button onclick="approveInternal()">제안서 내부승인하기(외부승인요청하기)</button>
	</div>
	<div>
		<button onclick="approveExternal()">제안서 외부승인하기</button>
	</div>
	<div>
		<button onclick="makeInsurancePublicFromProposal()">제안서 공시하기</button>
	</div>
<br>
	<div>
		<button onclick="joinInsurance()">보험상품 영업하기 (가입시키기)</button>
	</div>
	<div>
		<button onclick="showCustomerForSales()">영업고객 조회하기</button>
	</div>
<br>
	<div>
		<button onclick="showAllInsurance()">보험상품 조회하기</button>
	</div>
	<div>
		<button onclick="allContract()">계약확인하기</button>
	</div>
	<br><br>
	<div>
		<c:choose>
			<c:when test="${who == 'anon'}">
				<button onclick="login()">로그인</button>
				<button onclick="signUp()">회원가입</button>
			</c:when>
			<c:otherwise>
				<button onclick="logout()">로그아웃</button>
			</c:otherwise>
		</c:choose>
	</div>
</body>
</html>
