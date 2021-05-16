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
  <script src="https://cdn.bootpay.co.kr/js/bootpay-3.2.3.min.js" type="application/javascript"></script>

  <script type="text/javascript">
  
  	function payCard() {
		alert('납부 완료되었습니다.');
  		var theForm = document.getElementById("payCard");
  		var paymentAmount = document.getElementById("paymentAmount").value;
  		var paymentListID = document.getElementById("paymentListID").value;
		theForm.action = "payCard?paymentAmount=" + paymentAmount + "&paymentListID=" + paymentListID;
		theForm.submit()
  	}
  	function tempAccount(){
  		alert('가상계좌 : 1004-486-777-0922');
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

<title>보험금 납부하기</title>
</head>
<body>

	<form action="payCard" id="payCard"
		method="post">

		<table>
		<tr style="background: url('img/table_mid.gif') repeat-x; text-align: center;">
		<td style="text-align: center;">
			<thead>
				<tr>
					<th>${customerName}님의계약</th>
					<th>납부할 보험 : ${insuranceName}</th>
				</tr>
				<tr>
					<th>총 납부한 보험료</th>
					<th>${paymentList.completedPayment}</th>
				</tr>
				<tr>
					<th>총 미납 보험료</th>
					<th>${paymentList.uncompletedPayment}</th>
				</tr>
			</thead>

			<tbody>
				<tr><td colspan="2" style="text-align: left;" >납부내역</td></tr>
				<c:forEach items="${payment}" var="payment" varStatus="status">
					<tr>
						<td>${date[status.index]}</td>
						<td>${payment.oneTimeInsurancePayment}</td>
					</tr>
				</c:forEach>
				<tr><td colspan="2" style="text-align: left;" >보험료 납부하기</td></tr>
				<tr>
					<td>납부할 금액을 입력하세요</td>
					<td><input type="text" id ="paymentAmount">
						<input type="hidden" id = "paymentListID" value = "${paymentList.insurancePaymentListID}">
					</td>
					
				</tr>
				<tr>
				<td colspan="2">은행을 선택하세요</td>
				</tr>
				<tr><td colspan="2">
					<c:forEach items="${banks}" var="bank">
					<input type="radio" name="banks" checked="checked"
							value="${bank.name()}"> ${bank.name()} &nbsp;&nbsp;&nbsp;
					</c:forEach>
				</td></tr>
			</tbody>
		</table>
	</form>

	<div class="row">
		<div class="col-lg-12">
			<button class="btn btn-outline btn-primary"
				onclick="payCard()">
				<i class="fa fa-edit fa-fw"></i> 카드결제
			</button>
			<button class="btn btn-outline btn-primary"
				onclick="tempAccount()">
				<i class="fa fa-edit fa-fw"></i> 계좌이체
			</button>
			<button type="button" class="btn btn-outline btn-primary" onclick="history.go(-2);">
            <i class="fa fa-edit fa-fw"></i> 목록으로 돌아가기
         </button>
		</div>
	</div>

</body>
</html>