<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

  <script type="text/javascript">
  function InternalApprove(){ 
	    var propForm = null;
// 		propForm.action = "checkedProposal"
// 		propForm.submit()
// 		var chekcedOne = document.get
		var theForm = document.getElementById("checkedAfterInternalApproved");
		var whichProposal = null;
		
	        var check_count = document.getElementsByName("fireProposalRequest").length;
	 
	        for (var i=0; i<check_count; i++) {
	            if (document.getElementsByName("fireProposalRequest")[i].checked == true) {
// 	                alert(document.getElementsByName("fireProposalRequest")[i].value);
			        whichProposal = "fire";
					propForm = document.getElementsByName("fireProposalRequest")[i].value
	            }
	        }
	        
	        check_count = document.getElementsByName("injuryProposalRequest").length;
	   	 
	        for (var i=0; i<check_count; i++) {
	            if (document.getElementsByName("injuryProposalRequest")[i].checked == true) {
// 	                alert(document.getElementsByName("injuryProposalRequest")[i].value);
					whichProposal = "injury";
					propForm = document.getElementsByName("injuryProposalRequest")[i].value
	            }
	        }
	        
	        check_count = document.getElementsByName("vehicleProposalRequest").length;
	   	 
	        for (var i=0; i<check_count; i++) {
	            if (document.getElementsByName("vehicleProposalRequest")[i].checked == true) {
// 	                alert(document.getElementsByName("vehicleProposalRequest")[i].value);
					whichProposal = "vehicle";
					propForm = document.getElementsByName("vehicleProposalRequest")[i].value
	            }
	        }
	        
	        //이러면 여러개 선택되는데 하나만 보내질듯
	        theForm.action = "checkedAfterInternalApproved?whichProposal="+whichProposal+"&proposalID="+propForm;
	    	theForm.submit()
  }
  
  function InternalReject() {
	    var propForm = null;
// 		propForm.action = "checkedProposal"
// 		propForm.submit()
// 		var chekcedOne = document.get
		var theForm = document.getElementById("checkedAfterInternalApproved");
		var whichProposal = null;
		
	        var check_count = document.getElementsByName("fireProposalRequest").length;
	 
	        for (var i=0; i<check_count; i++) {
	            if (document.getElementsByName("fireProposalRequest")[i].checked == true) {
// 	                alert(document.getElementsByName("fireProposalRequest")[i].value);
			        whichProposal = "fire";
					propForm = document.getElementsByName("fireProposalRequest")[i].value
	            }
	        }
	        
	        check_count = document.getElementsByName("injuryProposalRequest").length;
	   	 
	        for (var i=0; i<check_count; i++) {
	            if (document.getElementsByName("injuryProposalRequest")[i].checked == true) {
// 	                alert(document.getElementsByName("injuryProposalRequest")[i].value);
					whichProposal = "injury";
					propForm = document.getElementsByName("injuryProposalRequest")[i].value
	            }
	        }
	        
	        check_count = document.getElementsByName("vehicleProposalRequest").length;
	   	 
	        for (var i=0; i<check_count; i++) {
	            if (document.getElementsByName("vehicleProposalRequest")[i].checked == true) {
// 	                alert(document.getElementsByName("vehicleProposalRequest")[i].value);
					whichProposal = "vehicle";
					propForm = document.getElementsByName("vehicleProposalRequest")[i].value
	            }
	        }
	        
	        //이러면 여러개 선택되는데 하나만 보내질듯
	        theForm.action = "checkedAfterInternalRejected?whichProposal="+whichProposal+"&proposalID="+propForm;
	    	theForm.submit()
  }
  </script>

<title>보험상품 내부승인요청하기</title>
</head>
<body>

   <div class="page-wrapper"> 
      <div class="container-fluid">
         <div class="col-lg-8">
            <!--게시판 넓이 -->
            <div class="col-lg-12">
               <h1 class="page-header">보험상품 내부승인하기</h1>
            </div>
            <div class="row">
               <div class="col-lg-12"></div>
            </div>
            <div class="panel panel-default">
               <div class="panel-heading">제안서 목록</div>
               <div class="panel-body">
               
            <form action="checkedProposal" id="checkedAfterInternalApproved" method="post">
               
                  <table class="table table-hover">
                     <thead>
                        <tr>
                           <th></th>
                           <th>제안서ID</th>
                           <th>제안서이름</th>
                           <th>보험종류</th>
                           <th>개발팀ID</th>
                           <th>제안서내용</th>
                        </tr>
                     </thead>
                     <tbody>
                        <c:forEach items="${fireList}" var="proposalVO">
                           <tr>
                           
<!--                            https://fors.tistory.com/233 : 라디오 버튼 -->
                              <td><input type = "radio" name = "fireProposalRequest" value="${proposalVO.fireProposalID}"></td>
                              <td>${proposalVO.fireProposalID}</td>
                              <td>${proposalVO.proposalName}</td>
                              <td>${proposalVO.insuranceType}</td>
                              <td>${proposalVO.insuranceDeveloperTeamID}</td>
                              <td>${proposalVO.proposalContent}</td>
                           </tr>
                        </c:forEach>
                     </tbody>
                  </table>
                        
				<table class="table table-hover">
                     <thead>
                        <tr>
                           <th></th>
                           <th>제안서ID</th>
                           <th>제안서이름</th>
                           <th>보험종류</th>
                           <th>개발팀ID</th>
                           <th>제안서내용</th>
                        </tr>
                     </thead>
                     <tbody>
                        <c:forEach items="${injuryList}" var="proposalVO">
                           <tr>
<!--                            https://fors.tistory.com/233 : 라디오 버튼 -->
                              <td><input type="radio" name="injuryProposalRequest" value="${proposalVO.injuryProposalID}"></td>
                              <td>${proposalVO.injuryProposalID}</td>
                              <td>${proposalVO.proposalName}</td>
                              <td>${proposalVO.insuranceType}</td>
                              <td>${proposalVO.insuranceDeveloperTeamID}</td>
                              <td>${proposalVO.proposalContent}</td>
                           </tr>
                        </c:forEach>
                     </tbody>
                  </table>
                        
				<table class="table table-hover">
                     <thead>
                        <tr>
                           <th></th>
                           <th>제안서ID</th>
                           <th>제안서이름</th>
                           <th>보험종류</th>
                           <th>개발팀ID</th>
                           <th>제안서내용</th>
                        </tr>
                     </thead>
                     <tbody>
                        <c:forEach items="${vehicleList}" var="proposalVO">
                           <tr>
<!--                            https://fors.tistory.com/233 : 라디오 버튼 -->
                              <td><input type = "radio" name = "vehicleProposalRequest" value="${ proposalVO.vehicleProposalID }"></td>
                              <td>${proposalVO.vehicleProposalID}</td>
                              <td>${proposalVO.proposalName}</td>
                              <td>${proposalVO.insuranceType}</td>
                              <td>${proposalVO.insuranceDeveloperTeamID}</td>
                              <td>${proposalVO.proposalContent}</td>
                           </tr>
                        </c:forEach>
                     </tbody>
                  </table>
                  
                </form>
                
               </div>
            </div>
         </div>
      </div>
   </div>

      <!-- 제안요청 버튼 -->
   <div class="row">
      <div class="col-lg-12">
         <button type="button" class="btn btn-outline btn-primary" onclick="InternalApprove()">
            <i class="fa fa-edit fa-fw"></i> 내부승인하기
         </button>
		<button type="button" class="btn btn-outline btn-primary" onclick="InternalReject()">
            <i class="fa fa-edit fa-fw"></i> 내부승인 거절하기
         </button>
         <button type="button" class="btn btn-outline btn-primary" onclick="location.href='beforeExternalApproved'">
            <i class="fa fa-edit fa-fw"></i> 외부승인 요청하기
         </button>
         <button type="button" class="btn btn-outline btn-primary" onclick="location.href='index'">
            <i class="fa fa-edit fa-fw"></i> 처음으로
         </button>
      </div>
   </div>
</body>
</html>