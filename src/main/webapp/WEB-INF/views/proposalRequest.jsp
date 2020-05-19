<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>보험상품 개발</title>
		<script type="text/javascript">
		function pageChange(){
			location.href = "proposalInsuranceType"
		}
		</script>
	</head>
	<body>
		<button onclick ="pageChange()">보험상품 제안서 작성하기</button>
	</body>
</html>
