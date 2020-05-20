<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>보험사 시스템</title>
		<script type="text/javascript">
		function pageChange(){
			location.href = "proposalRequest"
		}
		</script>
	</head>
	<body>
	<h1> MJU 보험사  </h1>
		<button onclick ="pageChange()">보험상품 개발하기</button>
	</body>
</html>
