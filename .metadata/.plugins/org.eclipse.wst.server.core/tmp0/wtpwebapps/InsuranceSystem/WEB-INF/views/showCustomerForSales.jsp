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

<script type="text/javascript">
	function search() {
		var searchForm = document.getElementById("searchForm");

		var typ = document.getElementById("opt");
		var tpo = typ.options[typ.selectedIndex].value;

		var ter = document.getElementById("term").value;
		console.log(tpo);
		searchForm.action = "customerForSalesSearchResult?opt=" + tpo + "&term=" + ter;
		searchForm.submit();
	}
</script>

</head>
<body>

	<div id="wrap">
		<br> <br>
		<div>
			<form id="searchForm" method="post">
				<select id="opt">
					<option value="0">영업 고객명</option>
					<option value="1">주민번호</option>
				</select> <input type="text" size="20" id="term" />&nbsp; <input
					type="submit" onclick="search()" value="검색" />
			</form>
			<input type="button" value="처음으로" onclick="history.back(-1);">
		</div>
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



