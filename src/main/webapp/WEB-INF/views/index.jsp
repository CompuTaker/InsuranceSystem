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
		location.href = "proposalRequest"
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
		location.href = "allInsurance"
	}
</script>
</head>
<body>
	<h1>MJU 보험사</h1>
	<div>
		<button onclick="pageChange()">보험상품 개발하기</button>
	</div>
	<div>
		<button onclick="approveInternal()">보험상품 내부승인하기</button>
	</div>
	<div>
		<button onclick="approveExternal()">보험상품 외부승인하기</button>
	</div>
	<div>
		<button onclick="makeInsurancePublicFromProposal()">보험상품 공시하기</button>
	</div>
	<div>
		<button onclick="showAllInsurance()">보험상품 조회하기</button>
	</div>

</body>
</html>
