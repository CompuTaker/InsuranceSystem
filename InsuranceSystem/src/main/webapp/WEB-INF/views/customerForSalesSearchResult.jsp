<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>영업 고객 조회하기</title>

<style type="text/css">
#wrap {
	width: 800px;
	margin: 0 auto 0 auto;
}

#topForm {
	text-align: right;
}

#board, #pageForm, #searchForm {
	text-align: center;
}

#bList {
	text-align: center;
}
</style>



</head>
<body>

	<div id="wrap">
		<br> 
		<input type="button" value="뒤로가기" onclick="history.back(-1);">

		<!-- 게시글 목록 부분 -->
		<br> <br> <br>
		<div id="board">
			<table id="bList" width="800" border="3" bordercolor="lightgray">
				<tr heigh="30">
					<td>영업고객 아이디</td>
					<td>영업 고객명</td>
					<td>주민번호</td>
				</tr>
				<c:forEach var="customerForSales" items="${customerForSalesList}">
					<tr>
						<td>${customerForSales.customerForSalesID}</td>
						<td>${customerForSales.customerForSalesName}</td>
						<td>${customerForSales.customerForSalesSocialSecurityNumber}</td>
					</tr>
				</c:forEach>
			</table>
		</div>



		<br>

	</div>

</body>
</html>