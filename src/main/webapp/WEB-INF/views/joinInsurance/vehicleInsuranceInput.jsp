<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>보험상품 개발</title>
<script type="text/javascript">
	function submit() {
		alert('정보가 저장되었습니다.');
	}
</script>
</head>
<body>
	<button id="ajaxButton" type="button" onclick="makeRequest()">위험률 계산하기 (언더라이팅)</button>
	<span id="calculatedRate"></span>
	<script>
		var httpRequest;
		
		function makeRequest() {
			httpRequest = new XMLHttpRequest();
			if (!httpRequest) {
				alert('XMLHTTP 인스턴스를 만들 수가 없어요 ㅠㅠ');
				return false;
			}
			httpRequest.onreadystatechange = alertContents;
			
			var toBeCalculated = document.getElementsByClassName("toBeCalculated");
			var params = "";
			for(var i=0; i < toBeCalculated.length; i++){
				var target = toBeCalculated[i];
				if(target.checked){
					params = params + target.getAttribute("name") + "=" + target.getAttribute("value") + "&";
				}
			}
			var whichInsurance = document.getElementById("whichInsurance").value;
			var proposalID = document.getElementById("proposalID").value;
			params = "whichInsurance=" + whichInsurance + "&proposalID=" + proposalID + "&" + params;
			params = params.slice(0,-1);
			
			httpRequest.open('GET', 'calculateRate?' + params); // calculateRate // 언더라이팅 대용
			httpRequest.send();
		}

		function alertContents() {
			if (httpRequest.readyState === XMLHttpRequest.DONE) {
				if (httpRequest.status === 200) {
					var res = httpRequest.responseText;
					alert(res);
					var calculatedRateTag = document.getElementById("calculatedRate");
					var extraChargeRateTag = document.getElementById("extraChargeRate");
					calculatedRateTag.innerHTML = "계산된 위험률 => " + res;
					extraChargeRateTag.value = res;
				} else {
					alert('request에 뭔가 문제가 있어요.');
				}
			}
		}
	</script>
	<table>
		<tr>
			<td>
				<table width="100%" cellpadding="0" cellspacing="0" border="0">
					<tr style="text-align: center;">
						<td>자동차보험 가입하기</td>
					</tr>
				</table>
				<form action="saveCustomerForSales" method="post">
					<table>
						<tr>
							<td>&nbsp;</td>
							<td align="center">고객 성명</td>
							<td>
								<input name="customerForSalesName" size="50" maxlength="100">
								<input type="hidden" id="whichInsurance" name="whichInsurance" value="vehicle">
								<input type="hidden" id="insuranceID" name="insuranceID" value="${insurance.insuranceID}">
								<input type="hidden" id="proposalID" name="proposalID" value="${proposal.vehicleProposalID}">
								<input type="hidden" id="extraChargeRate" name="extraChargeRate" value="-3">
							</td>
							<td>&nbsp;</td>
						</tr>
						<tr>
						<tr height="1" bgcolor="#dddddd">
							<td colspan="4"></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td align="center">주민번호</td>
							<td><input name="customerForSalesSocialSecurityNumber" size="50" maxlength="100"></td>
							<td>&nbsp;</td>
						</tr>
						<tr height="1" bgcolor="#dddddd">
							<td colspan="4"></td>
						</tr>
						
						<tr>
							<td>&nbsp;</td>
							<td align="center">은행</td>
							<td>
								<c:forEach items="${banks}" var="oneBank" varStatus = "status">
									<input type="radio" name="bank" checked="checked" value="${oneBank.name()}">${oneBank.name()} /
								</c:forEach>
							</td>
							<td>&nbsp;</td>
						</tr>
						<tr height="1" bgcolor="#dddddd">
							<td colspan="4"></td>
						</tr>
						
						<tr>
							<td>&nbsp;</td>
							<td align="center">직업</td>
							<td>
								<c:forEach items="${jobs}" var="oneJob" varStatus = "status">
									<input type="radio" class="toBeCalculated" checked="checked"
									name="job" value="${oneJob.name()}">${oneJob.name()} /
								</c:forEach>
							</td>
							<td>&nbsp;</td>
						</tr>
						<tr height="1" bgcolor="#dddddd">
							<td colspan="4"></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td align="center">보험료납부방식</td>
							<td>
								<c:forEach items="${paymentTypes}" var="onePaymentType" varStatus = "status">
									<input type="radio" class="toBeCalculated" checked="checked"
									 name="paymentType" value="${onePaymentType.name()}">${onePaymentType.name()} /
								</c:forEach>
							</td>
							<td>&nbsp;</td>
						</tr>
						<tr height="1" bgcolor="#dddddd">
							<td colspan="4"></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td align="center">보험금지급방식</td>
							<td>
								<c:forEach items="${compensationTypes}" var="oneCompensationType" varStatus = "status">
									<input type="radio" class="toBeCalculated" checked="checked"
									name="compensationType" value="${oneCompensationType.name()}">${oneCompensationType.name()} /
								</c:forEach>
							</td>
							<td>&nbsp;</td>
						</tr>
						<tr height="1" bgcolor="#dddddd">
							<td colspan="4"></td>
						</tr>
						
						<tr>
							<td>&nbsp;</td>
							<td align="center">차량용도</td>
							<td>
								<c:forEach items="${vehiclePurposes}" var="oneVehiclePurpose" varStatus = "status">
									<input type="radio" class="toBeCalculated" checked="checked"
									name="oneVehiclePurpose" value="${oneVehiclePurpose.name()}">${oneVehiclePurpose.name()} /
								</c:forEach>
							</td>
							<td>&nbsp;</td>
						</tr>
						<tr height="1" bgcolor="#dddddd">
							<td colspan="4"></td>
						</tr>
						
						<tr>
							<td>&nbsp;</td>
							<td align="center">차량종류</td>
							<td>
								<c:forEach items="${vehicleTypes}" var="oneVehicleType" varStatus = "status">
									<input type="radio" class="toBeCalculated" checked="checked"
									name="oneVehicleType" value="${oneVehicleType.name()}">${oneVehicleType.name()} /
								</c:forEach>
							</td>
							<td>&nbsp;</td>
						</tr>
						<tr height="1" bgcolor="#dddddd">
							<td colspan="4"></td>
						</tr>
						
						<tr height="1" bgcolor="#dddddd">
							<td colspan="4"></td>
						</tr>
						
						<tr height="1" bgcolor="#dddddd">
							<td colspan="4"></td>
						</tr>
						<tr height="1" bgcolor="#82B5DF">
							<td colspan="4"></td>
						</tr>
						<tr align="center">
							<td>&nbsp;</td>
							<td colspan="2">
								<button onclick="javascript:submit()">저장 및 조회하기</button>
							<td>&nbsp;</td>
						</tr>
					</table>
				</form>
			</td>
		</tr>
	</table>

</body>
</html>
