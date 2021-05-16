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
  		var theForm = document.getElementById("payInsuranceMoney");
  		var contractID = document.getElementById("contractID");
		theForm.action = "payInsuranceMoney?contractID=" + contractID;
		theForm.submit()
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

	<form action="payInsuranceMoney" id="payInsuranceMoney"
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
			</tbody>
		</table>
	</form>

	<div class="row">
		<div class="col-lg-12">
			<button class="btn btn-outline btn-primary"
				onclick="payInsurancePayment()">
				<i class="fa fa-edit fa-fw"></i> 보험료 납부하기
			</button>
			<button type="button" class="btn btn-outline btn-primary" onclick="history.back(-2);">
            <i class="fa fa-edit fa-fw"></i> 목록으로 돌아가기
         </button>
		</div>
	</div>

</body>
</html>