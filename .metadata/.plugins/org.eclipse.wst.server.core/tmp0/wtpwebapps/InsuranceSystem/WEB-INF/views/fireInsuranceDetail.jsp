<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>보험상품 개발</title>
<%
	String currentLogin = "";
	if(session.getAttribute("customer") != null){
		currentLogin = "customer";
	}else if(session.getAttribute("salesman") != null){
		currentLogin = "salesman";
	}else if(session.getAttribute("insuranceInteralApprover") != null){
		currentLogin = "insuranceInteralApprover";
	}else if(session.getAttribute("insuranceDeveloper") != null){
		currentLogin = "insuranceDeveloper";
	}
	System.out.println("현재 로그인 : " + currentLogin);
%>
<script type="text/javascript">
	function requestCounsel() {
		if(<%= currentLogin.equals("customer") %>){
			alert('상담요청합니다.');
			var propForm = document.getElementById('requestCounsel')
			var isBack = "detail";
			propForm.action = "requestCounsel?isBack=" + isBack;
			propForm.submit()
	   	}else{
		   alert("고객으로 로그인해주세요!");
	   	}
	}
	function back() {
		location.href = "allInsurance";
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
                       
                     </td>
                     <td>보험상세 보기</td>
                     <td width="5">
                        <img src="img/table_right.gif" width="5" height="30" />
                     </td>
                  </tr>
               </table>

               <table>
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">보험상품명</td>
                     <td>
                        ${ Proposal.proposalName }
                     </td>

                     <td>&nbsp;</td>
                  </tr>
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  
                    <tr>
                     <td>&nbsp;</td>
                     <td align="center">보험소개</td>
                     <td>
                        ${ Proposal.proposalContent }
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">주택 위험률</td>
                     <td>
                        ${ Proposal.housingRate }
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  
                  
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">주점 위험률</td>
                     <td>
                        ${ Proposal.pubRate }
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  
                  
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">식당 위험률</td>
                     <td>
                        ${ Proposal.restaurantRate }
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  
                  
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">스포츠시설 위험률</td>
                     <td>
                        ${ Proposal.sportFacilityRate }
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  
                  
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">PC방 시설 위험률</td>
                     <td>
                        ${ Proposal.PCRoomRate }
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  
                  
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">수영장 위험률</td>
                     <td>
                        ${ Proposal.swimmingPoolRate }
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  
                  
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">연구 시설 위험률</td>
                     <td>
                        ${ Proposal.researchFacilityRate }
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  
                  
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">공업 시설 위험률</td>
                     <td>
                        ${ Proposal.industryFacilityRate }
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  
                  
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">농업 시설 위험률</td>
                     <td>
                        ${ Proposal.agriculturalFacilityRate }
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  
                  
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">화학 시설 위험률</td>
                     <td>
                        ${ Proposal.chemistryFacilityRate }
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  
                  
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">목조 시설 위험률</td>
                     <td>
                        ${ Proposal.woodenHouseRate }
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  
                  
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">양옥 시설 위험률</td>
                     <td>
                        ${ Proposal.westernHouseRate }
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  
                  
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">한옥 시설 위험률</td>
                     <td>
                        ${ Proposal.koreanHouseRate }
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  
                  
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">진화시설 위험률</td>
                     <td>
                        ${ Proposal.firePreventionFacilityRate }
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  
                  
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">비닐 시설 위험률</td>
                     <td>
                        ${ Proposal.vinylHouseRate }
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  
                  
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">공시 서류 아이디</td>
                     <td>
                         ${ Insurance.officialDocumentsID }
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
                        	추가 사항이 있을 시, 추가 공시하겠습니다.
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
                      	<input type="hidden" name="insuranceID" value=${ Insurance.insuranceID }>
                        <input type="hidden" name="whichInsuranceDetail" value="fire">
                        <input type="button" value="뒤로가기" onclick="javascript:back()">
                        <button onclick="javascript:requestCounsel()">상담요청하기</button>
                     <td>&nbsp;</td>
                  </tr>
               </table>

            </td>
         </tr>
      </table>
   </form>
</body>
</html>