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
       }
      function submit(){ 
          alert('제안서 작성이 완료되었습니다.');
       }
      </script>
   </head>
   <body>
      
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
      <td align="center">대물배상 가입금액 입력</td>
      <td><input name="objectCompansationMoney" size="50" maxlength="50"></td>
      <td>&nbsp;</td>
     </tr>
      <tr height="1" bgcolor="#dddddd"><td colspan="4"></td></tr>
    <tr>
      <td>&nbsp;</td>
      <td align="center">자동차 용도</td>
      <td><input name="vehiclePurpose" size="50" maxlength="50"></td>
      <td>&nbsp;</td>
     </tr>
     <tr height="1" bgcolor="#dddddd"><td colspan="4"></td></tr>
     <tr>
      <td>&nbsp;</td>
      <td align="center">벌점에 따른 할증율</td>
      <td><input name="extraChargeRate" size="50" maxlength="50"></td>
      <td>&nbsp;</td>
     </tr>
     <tr height="1" bgcolor="#dddddd"><td colspan="4"></td></tr>
     <tr>
      <td>&nbsp;</td>
      <td align="center">무사고 정도에 따른 할인율</td>
      <td><input name="noAccidentDiscountRate" size="50" maxlength="50"></td>
      <td>&nbsp;</td>
     </tr>
     <tr height="1" bgcolor="#dddddd"><td colspan="4"></td></tr>
     <tr>
      <td>&nbsp;</td>
      <td align="center">차종에 따른 상수</td>
      <td><textarea name="vehicleTypeConstant" cols="50" rows="13"></textarea></td>
      <td>&nbsp;</td>
     </tr>
     <tr height="1" bgcolor="#dddddd"><td colspan="4"></td></tr>
     <tr height="1" bgcolor="#82B5DF"><td colspan="4"></td></tr>
     <tr align="center">
      <td>&nbsp;</td>
      <td colspan="2">
       <button onclick="javascript:tempSave()"> 임시저장 </button>
       <button onclick="javascript:submit()"> 제안서 제출 </button>
      <td>&nbsp;</td>
     </tr>
    </table>
   </td>
  </tr>
 </table>
      
      
   </body>
</html>