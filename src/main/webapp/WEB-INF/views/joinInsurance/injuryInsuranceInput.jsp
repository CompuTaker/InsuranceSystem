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
	<button id="ajaxButton" type="button" onclick="makeRequest()">Make a request</button>
	<script>
		var httpRequest;
		
		function makeRequest() {
			httpRequest = new XMLHttpRequest();
			
			if(!httpRequest) {
				alert('XMLHTTP 인스턴스를 만들 수가 없어요 ㅠㅠ');
				return false;
			}
			httpRequest.onreadystatechange = alertContents;
			httpRequest.open('GET', 'test.html');
			httpRequest.send();
		}
		
		function alertContents() {
			if (httpRequest.readyState === XMLHttpRequest.DONE) {
				if (httpRequest.status === 200) {
					alert(httpRequest.responseText);
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
					<tr style="background: url('img/table_mid.gif') repeat-x; text-align: center;">
						<td width="5"><img src="img/table_left.gif" width="5" height="30" /></td>
						<td>가입하기</td>
						<td width="5"><img src="img/table_right.gif" width="5" height="30" /></td>
					</tr>
				</table>
				<form>
					<table>
						<tr>
							<td>&nbsp;</td>
							<td align="center">고객 성명</td>
							<td><input name="customerName" size="50" maxlength="100">
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
							<td><input name="socialSecurityNumber" size="50" maxlength="100"></td>
							<td>&nbsp;</td>
						</tr>
	
						<tr height="1" bgcolor="#dddddd">
							<td colspan="4"></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td align="center">매매가</td>
							<td><input name="bargainPrice" size="50" maxlength="50"></td>
							<td>&nbsp;</td>
						</tr>
	
						<tr height="1" bgcolor="#dddddd">
							<td colspan="4"></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td align="center">가입업종</td>
							<td><input name="facilityBusinessType" size="50" maxlength="50"></td>
							<td>&nbsp;</td>
						</tr>
						<tr height="1" bgcolor="#dddddd">
							<td colspan="4"></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td align="center">화재설비</td>
							<td><textarea name="facilityMaterialType" cols="50" rows="13"></textarea></td>
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
