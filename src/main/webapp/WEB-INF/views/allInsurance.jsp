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
	var whichInsurance;
	var insuranceID = -1;
	function setWhichInsurance( insuranceButton, setVal ){
		insuranceID = insuranceButton.value;
		// alert(insuranceID);
		whichInsurance = setVal;
	}
	function showInsuranceDetail() {
		// alert("show! => " + whichInsurance + " / " + insuranceID);
		var theForm = document.getElementById("theForm");
		theForm.action = "insuranceDetail?whichInsurance=" + whichInsurance + "&insuranceID=" + insuranceID;
		theForm.submit();
	}
	function requestCounsel(){
		alert("Not Yet!");
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
					<h1 class="page-header">보험 상품</h1>
				</div>
				<div class="row">
					<div class="col-lg-12"></div>
				</div>
				<div class="panel panel-default">
					<div class="panel-heading">보험 상품 목록</div>
					<div class="panel-body">
						<form id="theForm" action="insuranceDetail" method = "post">
							<!-- post로 해놔야 action 변경이 잘 된다! -->
							<table class="table table-hover">
								<thead>
									<tr>
										<th>보험 종류</th>
										<th>보험상품명</th>
										<th>내용</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${fireInsuranceList}" var="fireInsurance">
										<tr>
											<td><input type="radio" name="insurance"
												onclick="setWhichInsurance(this, 'fireInsurance')"
												value="${ fireInsurance.insuranceID }"/>
											</td>
											<td>${fireInsurance.fireProposalID}</td>
											<td>${fireInsurance.officialDocumentsID}</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
							<table class="table table-hover">
								<thead>
									<tr>
										<th>보험 종류</th>
										<th>보험상품명</th>
										<th>내용</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${injuryInsuranceList}" var="injuryInsurance">
										<tr>
											<td><input type="radio" name="insurance"
												onclick="setWhichInsurance(this, 'injuryInsurance')"
												value="${ injuryInsurance.insuranceID }"/>
											</td>
											<td>${injuryInsurance.injuryProposalID}</td>
											<td>${injuryInsurance.officialDocumentsID}</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
							<table class="table table-hover">
								<thead>
									<tr>
										<th>보험 종류</th>
										<th>보험상품명</th>
										<th>내용</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${vehicleInsuranceList}" var="vehicleInsurance">
										<tr>
											<td><input type="radio" name="insurance"
												onclick="setWhichInsurance(this, 'vehicleInsurance')"
												value="${ vehicleInsurance.insuranceID }"/>
											</td>
											<td>${vehicleInsurance.vehicleProposalID}</td>
											<td>${vehicleInsurance.officialDocumentsID}</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</form>
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
</body>
</html>