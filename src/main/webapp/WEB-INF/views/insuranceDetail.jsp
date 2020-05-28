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
	<table>
		<tr>
			<td>
				<table width="100%" cellpadding="0" cellspacing="0" border="0">
					<tr
						style="background: url('img/table_mid.gif') repeat-x; text-align: center;">
						<td width="5"><img src="img/table_left.gif" width="5"
							height="30" /></td>
						<td>가입하기</td>
						<td width="5"><img src="img/table_right.gif" width="5"
							height="30" /></td>
					</tr>
				</table>
				<table>
					<tr>
						<td>&nbsp;</td>
						<td align="center">보험 상품명</td>
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
						<td align="center">가입업종</td>
						<td><input name="facilityBusinessType" size="50"
							maxlength="50"></td>
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
			</td>
		</tr>
	</table>

</body>
</html>
