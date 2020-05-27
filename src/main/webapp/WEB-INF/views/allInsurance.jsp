<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	function showInsuranceDetail() {
		// location.href = "insuranceDetail"
		alert("show!");
		var theForm = document.getElementById("theForm");
		var check_count = document.getElementsByName("insuranceID").length;
		var insuranceID = null;
		for (var i = 0; i < check_count; i++) {
			if (document.getElementsByName("insuranceID")[i].checked == true) {
				insuranceID = document.getElementsByName("insuranceID")[i].value
			}
		}
		console.log(insuranceID);
		theForm.action = "insuranceDetail";
		
	}
	function requestCounsel() {
		//location.href = "proposalInsuranceType"
		alert("request!");
	}
</script>

<title>보험사 시스템</title>
</head>
<body>
	<form id="theForm" method = "get">
		<div class="page-wrapper">
			<div class="container-fluid">
				<div class="col-lg-8">
					<!--게시판 넓이 -->
					<div class="col-lg-12">
						<h1 class="page-header">보험 상품</h1>
					</div>
					<div class="row">
						<div class="col-lg-12"></div>
					</div>
					<div class="panel panel-default">
						<div class="panel-heading">보험 상품 목록</div>
						<div class="panel-body">
							<table class="table table-hover">
								<thead>
									<tr>
										<th></th>
										<th>보험 종류</th>
										<th>보험상품명</th>
										<th>내용</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${insuranceList}" var="insuranceVO">
										<tr>
											<td><input type="radio" name="insuranceID"
												value="${ insuranceVO.insuranceID }"/></td>
											<td>${insuranceVO.insuranceType}</td>
											<td>${insuranceVO.insuranceName}</td>
											<td>${insuranceVO.explanation}</td>
										</tr>
									</c:forEach>


								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>

		<!-- 제안요청 버튼 -->
		<div class="row">
			<div class="col-lg-12">
				<button class="btn btn-outline btn-primary"
					onclick="showInsuranceDetail()">
					<i class="fa fa-edit fa-fw"></i> 보험상품 상세보기
				</button>
				<button class="btn btn-outline btn-primary"
					onclick="requestCounsel()">
					<i class="fa fa-edit fa-fw"></i> 상담 요청하기
				</button>
			</div>
		</div>
	</form>
</body>
</html>