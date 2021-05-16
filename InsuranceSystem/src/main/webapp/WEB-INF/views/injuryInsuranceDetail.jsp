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
			propForm.action = "requestCounsel"
			propForm.submit()
		}else{
			alert("고객으로 로그인해주세요!");
		}
	}
</script>
</head>
<body>
   <!--       보험상품 이름 입력하기, 보장상해범위 입력하기, 성별에 따른 위험률 입력하기, 자신의 병력에 따른 상수 입력하기, 직업에 따른 위험률 입력하기, 나이에 따른 위험률 입력하기-->
   <form  id="requestCounsel" method="post">
      <table>
         <tr>
            <td>
               <table width="100%" cellpadding="0" cellspacing="0" border="0">
                  <tr style="background: url('img/table_mid.gif') repeat-x; text-align: center;">
                     <td width="5">
                        <img src="img/table_left.gif" width="5" height="30" />
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
                     <td align="center">보장상해범위</td>
                     <td>
                         ${ Proposal.injuryCoverage }
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">보장질병범위</td>
                     <td>
                        ${ Proposal.illCoverage }
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">뇌질병 가족력에 대한 위험률</td>
                     <td>
                   		   ${ Proposal.familyBrainRate }
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">심장질병 가족력에 대한 위험률</td>
                     <td> 
                   		  ${ Proposal.familyHeartRate }
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">암질병 가족력에 대한 위험률</td>
                     <td>
                     		${ Proposal.familyCancerRate }
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">뇌질병 병력에 대한 위험률</td>
                     <td>
                    		${ Proposal.brainRate }
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">심장질병 병력에 대한 위험률</td>
                     <td>
                     		${ Proposal.heartRate }
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">암질병 병력에 대한 위험률</td>
                     <td>
                   			 ${ Proposal.cancerRate }
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">남성인 경우에 대한 위험률</td>
                     <td>
                     		${ Proposal.manRate }
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">여성인 경우에 대한 위험률</td>
                     <td>
                     		${ Proposal.womanRate }
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">산업직을 가진 경우의 위험률</td>
                     <td>
                     		${ Proposal.fieldJobRate }
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">사무직을 가진 경우의 위험률</td>
                     <td>
                     		${ Proposal.officeJobRate }
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">무직인 경우의 위험률</td>
                     <td>
                     		${ Proposal.noJobRate }
                     </td>
                     <td>&nbsp;</td>
                  </tr>
                  <tr height="1" bgcolor="#dddddd">
                     <td colspan="4"></td>
                  </tr>
                  
                  
                  <tr>
                     <td>&nbsp;</td>
                     <td align="center">위험직인 경우의 위험률</td>
                     <td>
                      		 ${ Proposal.dangerousJobRate }
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
                        <input type="hidden" name="whichInsuranceDetail" value="injury">
                        <input type="button" value="뒤로가기" onclick="history.back(-1);">
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