<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>보험상품 개발</title>
		<script type="text/javascript">
		
		function duplicationInsuranceName(){
			//보험상품 이름의 중복확인
			
		}
		function tempSave(){ 
			alert('임시저장되었습니다.');
			var propForm = document.getElementById('fireProposal') // .submit();
			propForm.action = "tempSave"
			propForm.submit()
		}
		function submitProposal(){ 
			alert('제안서 작성이 완료되었습니다.');
			var propForm = document.getElementById('fireProposal') // .submit();
			propForm.action = "writeProposal"
			propForm.submit()
		}
		</script>
	</head>
	<body>
<!-- 		보험상품 이름입력,ㄴ, 가입업종, 화재시설, 보험가입금액, 예정위험률, 화재설비 할인율, 보험료 란  -->

<form action="writeFireProposal" id="fireProposal">
	<table>
	  <tr>
	   <td>
	    <table width="100%" cellpadding="0" cellspacing="0" border="0">
	     <tr style="background:url('img/table_mid.gif') repeat-x; text-align:center;">
	      <td width="5"><img src="img/table_left.gif" width="5" height="30" /></td>
	      <td>글쓰기</td>
	      <td width="5"><img src="img/table_right.gif" width="5" height="30" /></td>
	     </tr>
	    </table>
	   <table>
	     <tr>
	      <td>&nbsp;</td>
	      <td align="center">보험상품 이름</td>
	      <td><input name="insuranceName" size="50" maxlength="100">
	      <input type="button" value="중복확인" onclick="duplicationInsuranceName()">
	      <input type="hidden" name="insuranceNameDuplication" value="nameUncheck"> 
	      </td>
	      
	      <td>&nbsp;</td>
	     </tr>
	     <tr height="1" bgcolor="#dddddd"><td colspan="4"></td></tr>
	    <tr>
	      <td>&nbsp;</td>
	      <td align="center">매매가</td>
	      <td><input name="bargainPrice" size="50" maxlength="50"></td>
	      <td>&nbsp;</td>
	     </tr>
	      <tr height="1" bgcolor="#dddddd"><td colspan="4"></td></tr>
	    <tr>
	      <td>&nbsp;</td>
	      <td align="center">가입업종</td>
	      <td><input name="facilityBusinessType" size="50" maxlength="50"></td>
	      <td>&nbsp;</td>
	     </tr>
	     <tr height="1" bgcolor="#dddddd"><td colspan="4"></td></tr>
	     <tr>
	      <td>&nbsp;</td>
	      <td align="center">화재시설</td>
	      <td><textarea name="facilityMaterialType" cols="50" rows="13"></textarea></td>
	      <td>&nbsp;</td>
	     </tr>
	     <tr height="1" bgcolor="#dddddd"><td colspan="4"></td></tr>
	     <tr>
	      <td>&nbsp;</td>
	      <td align="center">보험가입금액</td>
	      <td><input name="amountOfBusiness" size="50" maxlength="50"></td>
	      <td>&nbsp;</td>
	     </tr>
	     <tr height="1" bgcolor="#dddddd"><td colspan="4"></td></tr>
	     <tr>
	      <td>&nbsp;</td>
	      <td align="center">예정위험률</td>
	      <td><textarea name="memo" cols="50" rows="13"></textarea></td>
	      <td>&nbsp;</td>
	     </tr>
	     <tr height="1" bgcolor="#dddddd"><td colspan="4"></td></tr>
	     <tr>
	      <td>&nbsp;</td>
	      <td align="center">화재설비 할인율</td>
	      <td><input name="fireFacilityDiscountRate" size="50" maxlength="50"></td>
	      <td>&nbsp;</td>
	     </tr>
	     <tr height="1" bgcolor="#dddddd"><td colspan="4"></td></tr>
	     <tr>
	      <td>&nbsp;</td>
	      <td align="center">보험료</td>
	      <td><input name="insurancePayment" size="50" maxlength="50"></td>
	      <td>&nbsp;</td>
	     </tr>
	     <tr height="1" bgcolor="#dddddd"><td colspan="4"></td></tr>
	     <tr height="1" bgcolor="#82B5DF"><td colspan="4"></td></tr>
	     <tr align="center">
	      <td>&nbsp;</td>
	      <td colspan="2">
	       <button onclick="javascript:tempSave()"> 임시저장 </button>
	       <button onclick="javascript:submitProposal()"> 제안서 제출 </button>
	      <td>&nbsp;</td>
	     </tr>
	    </table>
	   </td>
	  </tr>
	 </table>
 </form>

	</body>
</html>
