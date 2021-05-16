<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>보험 문의하기</title>
<script type="text/javascript">
   function submitCounsel() {
      alert('상담을 요청합니다.');
      var propForm = document.getElementById('requestCounsel') // .submit();
      propForm.action = "requestCounsel_ok"
      propForm.submit()
   }
   function back() {
	   var isBack = document.getElementsByName("come").value;
	   if(isBack == "allInsurance") {
		   location.href = "allInsurance";
	   } else if(isBack == "detail") {
// 		   location.href = "allInsurance"; // 이제 여기서 디테일로 가자
			var whichInsuranceDetail = getElementsByName("whichProposal").value;
			var insuranceID = getElementsByName("insuranceID").value;
			var propForm = document.getElementById('requestCounsel') // .submit();
			propForm.action = "insuranceDetail?whichInsuranceDetail=" + whichInsuranceDetail + "&insuranceID=" + insuranceID;
			propForm.submit()
	   }
   }
</script>
</head>
<body>
   <form id="requestCounsel" method="post">
      <table>
         <tr>
            <td>
               <table width="100%" cellpadding="0" cellspacing="0" border="0">
                  <tr style="background: url('img/table_mid.gif') repeat-x; text-align: center;">
                     <td width="5">
                        <img src="img/table_left.gif" width="5" height="30" />
                     </td>
                     <td>상담신청하기</td>
                     <td width="5">
                        <img src="img/table_right.gif" width="5" height="30" />
                     </td>
                  </tr>
               </table>
               
               
               
               <table>
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">고객 아이디</td>
                     <td>
                        ${ loginID } 
                     </td>

                     <td>&nbsp;</td>
                  </tr>
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  
                  
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">보험 아이디</td>
                     <td>
                        ${ insuranceID }
                     </td>

                     <td>&nbsp;</td>
                  </tr>
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  <tr>
                  
                  
                     <td>&nbsp;</td>
                     <td align="center">상담 종류(제목)</td>
                     <td>
                        <input name="counselTopic" size="50" maxlength="50">
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                   <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  
                  
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">상담내용</td>
                     <td>
                     	<textarea name="counselContent" rows="20" cols="50"></textarea>
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
                        <input type = "hidden" name ="whichProposal" value="${insuranceType}">
                        <input type = "hidden" name ="come" value = "${isBack}">
                        <input type = "hidden" name ="insuranceID" value = "${insuranceID}">
                        <input type="button" value="뒤로가기" onclick="history.back(-1);">
                        <button onclick="javascript:submitCounsel()">상담요청</button>
                     <td>&nbsp;</td>
                  </tr>
               </table>
            </td>
         </tr>
      </table>
   </form>

</body>
</html>