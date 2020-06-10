<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>보험사 시스템</title>
<script type="text/javascript">
	function pageChange() {
		location.href = "proposalRequest";
	}
	
	function requestInternalApprover() {
		location.href = "beforeInternalApproved";
	}
	
	function approveInternal() {
		location.href = "afterInternalApproved"
	}	
	
	function approveExternal() {
		location.href = "afterExternalApproved"
	}	
	
	function makeInsurancePublicFromProposal() {
		location.href = "makeInsurancePublicFromProposal"
	}
	
	function showAllInsurance() {
		location.href = "allInsurance";
	}
	
	function joinInsurance(){
		location.href = "insuranceList";
	}
	function showCustomerForSales(){
		location.href = "showCustomerForSales";
	}
	
	function login(){
		location.href = "login";
	}
	
	function logout(){
		location.href = "logout";
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
	<div>
		<button onclick="approveInternal()">제안서 내부승인하기(외부승인요청하기)</button>
	</div>
	<div>
		<button onclick="approveExternal()">제안서 외부승인하기</button>
	</div>
	<div>
		<button onclick="makeInsurancePublicFromProposal()">제안서 공시하기</button>
	</div>
	<div>
		<button onclick="showAllInsurance()">보험상품 조회하기</button>
	</div>
	<div>
		<button onclick="joinInsurance()">보험상품 영업하기 (가입시키기)</button>
	</div>
	<div>
		<button onclick="showCustomerForSales()">영업고객 조회하기</button>
	</div>
	<div>
		<c:choose>
			<c:when test="${who == 'anon'}">
				<button onclick="login()">로그인</button>
			</c:when>
			<c:otherwise>
				<button onclick="logout()">로그아웃</button>
			</c:otherwise>
		</c:choose>
	</div>
</body>
</html>
