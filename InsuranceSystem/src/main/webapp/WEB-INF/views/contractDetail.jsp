<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

  <script type="text/javascript">
  
  	function payInsurancePayment() {
  		var theForm = document.getElementById("checkInsuranceMoney");
//   		var contractID = document.getElementById("contractID");
  		var contractID = document.getElementById('contractID').childNodes[0].nodeValue;
		theForm.action = "checkInsuranceMoney?contractID=" + contractID;
		theForm.submit()
  	}
  	function destroyContract() {
  		var theForm = document.getElementById("checkInsuranceMoney");
  		var contractID = document.getElementById("contractID").childNodes[0].nodeValue;
  		if( confirm("이 계약을 파기하시겠습니까?") ){
  			theForm.action = "destroyContract?contractID=" + contractID;
  			theForm.submit()
  		}
  		return false;
  	}
  </script>

  <style>
	table {
   		width: 30%;
    	border: 1px solid #444444;
    	border-collapse: collapse;
    	text-align: center;
  	}
  	th, td {
    	border: 1px solid #444444;
    	padding: 3px;
  	}
  </style>

<title>계약 상세보기</title>
</head>
<body>

	<form action="checkInsuranceMoney" id="checkInsuranceMoney"
		method="post">

		<table width="100%" cellpadding="0" cellspacing="0" border="0">
		
		
		<tr style="text-align: center;">
		<td style="text-align: center;">
			<thead>
				<tr>
					<th>${customerName}님의계약</th>
					<th>계약 상세보기 : ${insuranceName}</th>
				</tr>
			</thead>

			<tbody>
					<tr><td>계약ID</td>
					<td id="contractID">${contract.contractID}</td></tr>
					<tr><td>보장한도</td>
					<td>${contract.insuranceMoneyLimit}</td></tr>
					<tr><td>손해율</td>
					<td>${contract.lossRate}</td></tr>
					<tr><td>수익성등급</td>
					<td>${contract.profitabilityRating}</td></tr>
					<tr><td>잔여제지급금</td>
					<td>${contract.remainingExpectedMoney}</td></tr>
					<tr><td>지급받은보험금</td>
					<td>${contract.compensationHistory}</td></tr>
					<tr><td>보험료</td>
					<td>${contract.insurancePayment}</td></tr>
					<tr><td>위험률</td>
					<td>${contract.extraChargeRate}</td></tr>
					<tr><td>납부방식</td>
					<td>${contract.paymentType}</td></tr>
					<tr><td>보험금지급방식</td>
					<td>${contract.compensationType}</td></tr>
					<tr><td>은행</td>
					<td>${contract.bank}</td></tr>
					<tr><td>시작일</td>
					<td>${startDate}</td></tr>
					<tr><td>만기일</td>
					<td>${endDate}</td></tr>
					<tr><td>보험종류</td>
					<td>${contract.insuranceType}</td></tr>
					<tr><td>매니저</td>
					<td>${contractManagerName}</td></tr>
					<tr><td>수령인</td>
					<td>${recipientName}</td></tr>
			</tbody>
		</table>
		<input type = "hidden" name = "customerID" value = "${customerID}"/>
	</form>

	<div class="row">
		<div class="col-lg-12">
			<button class="btn btn-outline btn-primary"
				onclick="payInsurancePayment()">
				<i class="fa fa-edit fa-fw"></i> 보험료 납부하기
			</button>
			<button class="btn btn-outline btn-primary"
				onclick="destroyContract()">
				<i class="fa fa-edit fa-fw"></i> 계약 파기하기
			</button>
			<button type="button" class="btn btn-outline btn-primary" onclick="history.back(-1);">
            <i class="fa fa-edit fa-fw"></i> 뒤로가기
         </button>
		</div>
	</div>

</body>
</html>