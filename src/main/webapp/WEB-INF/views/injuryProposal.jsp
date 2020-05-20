<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>보험상품 개발</title>
<script type="text/javascript">
	function duplicationInsuranceName() {
		//보험상품 이름의 중복확인	
	}
	function tempSave() {
		alert('임시저장되었습니다.');
		var propForm = document.getElementById('injuryProposal')
		propForm.action = "tempSave"
		propForm.submit()
	}
	function submitProposal() {
		alert('제안서 작성이 완료되었습니다.');
		var propForm = document.getElementById('injuryProposal')
		propForm.action = "witeProposal"
		propForm.submit()
	}
</script>
</head>
<body>
	<!-- 		보험상품 이름 입력하기, 보장상해범위 입력하기, 성별에 따른 위험률 입력하기, 자신의 병력에 따른 상수 입력하기, 직업에 따른 위험률 입력하기, 나이에 따른 위험률 입력하기-->
	<form action="writeInjuryProposal" id="injuryProposal" method="post">
		<table>
			<tr>
				<td>
					<table width="100%" cellpadding="0" cellspacing="0" border="0">
						<tr style="background: url('img/table_mid.gif') repeat-x; text-align: center;">
							<td width="5">
								<img src="img/table_left.gif" width="5" height="30" />
							</td>
							<td>글쓰기</td>
							<td width="5">
								<img src="img/table_right.gif" width="5" height="30" />
							</td>
						</tr>
					</table>

					<table>
						<tr>
							<td>&nbsp;</td>
							<td align="center">보험상품 이름</td>
							<td>
								<input name="insuranceName" size="50" maxlength="100"> <input type="button" value="중복확인" onclick="duplicationInsuranceName()"> <input type="hidden" name="insuranceNameDuplication" value="nameUncheck">
							</td>

							<td>&nbsp;</td>
						</tr>
						<tr height="1" bgcolor="#dddddd">
							<td colspan="4"></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td align="center">보장상해범위</td>
							<td>
								<textarea name="injuryCoverage" cols="50" rows="13"></textarea>
							</td>
							<td>&nbsp;</td>
						</tr>
						<tr height="1" bgcolor="#dddddd">
							<td colspan="4"></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td align="center">성별에 따른 위험률</td>
							<td>
								<input name="RiskRateByGender" size="50" maxlength="50">
							</td>
							<td>&nbsp;</td>
						</tr>
						<tr height="1" bgcolor="#dddddd">
							<td colspan="4"></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td align="center">병력에 따른 위험률</td>
							<td>
								<input name="RiskRateByIllHistory" size="50" maxlength="50">
							</td>
							<td>&nbsp;</td>
						</tr>
						<tr height="1" bgcolor="#dddddd">
							<td colspan="4"></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td align="center">직업에 따른 위험률</td>
							<td>
								<input name="RiskRateByJob" size="50" maxlength="50">
							</td>
							<td>&nbsp;</td>
						</tr>
						<tr height="1" bgcolor="#dddddd">
							<td colspan="4"></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td align="center">나이에 따른 위험률</td>
							<td>
								<input name="RiskRateByAge" size="50" maxlength="50">
							</td>
							<td>&nbsp;</td>
						</tr>
						<tr height="1" bgcolor="#dddddd">
							<td colspan="4"></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td align="center">가족력에 따른 위험률</td>
							<td>
								<input name="RiskRateByAge" size="50" maxlength="50">
							</td>
							<td>&nbsp;</td>
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
								<input type="hidden" name="injury" value="injury">
								<button onclick="javascript:tempSave()">임시저장</button>
								<button onclick="javascript:submitProposal()">제안서 제출</button>
							<td>&nbsp;</td>
						</tr>
					</table>

				</td>
			</tr>
		</table>
	</form>
</body>
</html>
