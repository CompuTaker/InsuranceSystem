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
      	var propForm = document.getElementById('fireProposal')
		propForm.action = "duplicationProposalName"
		propForm.submit()
   }
   function tempSave() {
      alert('임시저장되었습니다.');
      var propForm = document.getElementById('fireProposal') // .submit();
      propForm.action = "tempSave"
      propForm.submit()
   }
   function submitProposal() {
      alert('제안서 작성이 완료되었습니다.');
      var propForm = document.getElementById('fireProposal') // .submit();
      propForm.action = "writeProposal"
      propForm.submit()
   }
</script>
</head>
<body>
   <!--       보험상품 이름입력, 가입업종, 화재시설, 보험가입금액, 예정위험률, 화재설비 할인율, 보험료 란  -->
   <form action="writeFireProposal" id="fireProposal" method="post">
      <table>
         <tr>
            <td>
               <table width="100%" cellpadding="0" cellspacing="0" border="0">
                  <tr style="background: url('img/table_mid.gif') repeat-x; text-align: center;">
                     <td width="5">
                        <img src="img/table_left.gif" width="5" height="30" />
                     </td>
                     <td>화재보험 제안서</td>
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
                        <input name="proposalName" size="50" maxlength="100"> 
                        <!-- <input type="button" value="중복확인" onclick="duplicationInsuranceName()"> <input type="hidden" name="insuranceNameDuplication" value="nameUncheck"> -->
                     </td>

                     <td>&nbsp;</td>
                  </tr>
                  
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">주택설비에 대한 위험률</td>
                     <td>
                        <input name="housingRate" size="50" maxlength="50">
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  
                   <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">주류설비에 대한 위험률</td>
                     <td>
                        <input name="pubRate" size="50" maxlength="50">
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  
                   <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">레스토랑 설비에 대한 위험률</td>
                     <td>
                        <input name="restaurantRate" size="50" maxlength="50">
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  
                   <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">스포츠시설에 대한 위험률</td>
                     <td>
                        <input name="sportFacilityRate" size="50" maxlength="50">
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  
                   <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">PC시설에 대한 위험률</td>
                     <td>
                        <input name="PCRoomRate" size="50" maxlength="50">
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  
                   <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">수영장 시설에 대한 위험률</td>
                     <td>
                        <input name="swimmingPoolRate" size="50" maxlength="50">
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  
                   <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">조사시설에 대한 위험률</td>
                     <td>
                        <input name="researchFacilityRate" size="50" maxlength="50">
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  
                   <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">산업시설에 대한 위험률</td>
                     <td>
                        <input name="industryFacilityRate" size="50" maxlength="50">
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  
                   <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">농업시설에 대한 위험률</td>
                     <td>
                        <input name="agriculturalFacilityRate" size="50" maxlength="50">
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  
                   <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">화학시설에 대한 위험률</td>
                     <td>
                        <input name="chemistryFacilityRate" size="50" maxlength="50">
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  
                   <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">나무재질에 대한 위험률</td>
                     <td>
                        <input name="woodenHouseRate" size="50" maxlength="50">
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  
                   <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">한옥재질에 대한 위험률</td>
                     <td>
                        <input name="koreanHouseRate" size="50" maxlength="50">
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">서양가옥재질에 대한 위험률</td>
                     <td>
                        <input name="westernHouseRate" size="50" maxlength="50">
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  
                  
                  
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">화재방지시설에 대한 할인율</td>
                     <td>
                        <input name="firePreventionFacilityRate" size="50" maxlength="50">
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">비닐 재질에 대한 위험률</td>
                     <td>
                        <input name=vinylHouseRate size="50" maxlength="50">
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
                        <input type = "hidden" name ="whichProposal" value="fire">
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