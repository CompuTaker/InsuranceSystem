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
		var propForm = document.getElementById('vehicleProposal')
		propForm.action = "duplicationProposalName"
		propForm.submit()
// 		if(duplication) {alert('이미 존재하는 이름입니다.');}
// 		else {alert('사용 가능한 이름입니다.');}
   }
   function tempSave() {
      alert('임시저장되었습니다.');
      var propForm = document.getElementById('vehicleProposal')
      propForm.action = "tempSave"
      propForm.submit()
   }
   function submitProposal() {
      alert('제안서 작성이 완료되었습니다.');
      var propForm = document.getElementById('vehicleProposal')
      propForm.action = "writeProposal"
      propForm.submit()
   }
</script>
</head>
<body>
   <form action="writeVehicleProposal" id="vehicleProposal" method="post">
      <table>
         <tr>
            <td>
               <table width="100%" cellpadding="0" cellspacing="0" border="0">
                  <tr style="background: url('img/table_mid.gif') repeat-x; text-align: center;">
                     <td width="5">
                        <img src="img/table_left.gif" width="5" height="30" />
                     </td>
                     <td>자동차보험 제안서</td>
                     <td width="5">
                        <img src="img/table_right.gif" width="5" height="30" />
                     </td>
                  </tr>
               </table>



               <table>
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">제안서 이름</td>
                     <td>
                        <input name="proposalName" id = "insuranceName" size="50" maxlength="100"> 
                        <!-- <input type="button" value="중복확인" onclick="duplicationInsuranceName()"> <input type="hidden" name="insuranceNameDuplication" value="nameUncheck">  -->
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">업무용 차량에 대한 위험률</td>
                     <td>
                        <input name="forBusinessRate" size="50" maxlength="50">
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  
                  
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">자가용 차량에 대한 위험률</td>
                     <td>
                        <input name="ownVehicleRate" size="50" maxlength="50">
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  
                  
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">렌탈 차량에 대한 위험률</td>
                     <td>
                        <input name="rentalRate" size="50" maxlength="50">
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">SUV차량에 대한 위험률</td>
                     <td>
                        <input name="suvRate" size="50" maxlength="50">
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">세단 차량에 대한 위험률</td>
                     <td>
                        <input name="sedanRate" size="50" maxlength="50">
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">트럭 차량에 대한 위험률</td>
                     <td>
                        <input name="truckRate" size="50" maxlength="50">
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">픽업차량에 대한 위험률</td>
                     <td>
                        <input name="pickupTruckRate" size="50" maxlength="50">
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">버스차량에 대한 위험률</td>
                     <td>
                        <input name="busRate" size="50" maxlength="50">
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">서류</td>
                     <td>
                        <input type=file name="verificationDocuments" size="50" maxlength="50">
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  
                  
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">기타사항</td>
                     <td>
                     	<input name="proposalContent" size="50" maxlength="50">
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
                        <input type="hidden" name="whichProposal" value="vehicle">
                       <!-- <button onclick="javascript:tempSave()">임시저장</button> --> 
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