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
  	var contractID;
  	function setContractID(button) {
  		contractID = button.value;
  	}
  
  	function showContractDetail() {
  		var theForm = document.getElementById("contractDetailID");
  		if( !contractID ){
  			alert("상세보기할 계약을 선택해주십시오!");
  			return false;
  		}
		theForm.action = "contractDetailID?contractID=" + contractID;
		theForm.submit()
  	}
  </script>

<title>계약 확인하기</title>
</head>
<body>

   <div class="page-wrapper"> 
      <div class="container-fluid">
         <div class="col-lg-8">
            <!--게시판 넓이 -->
            <div class="col-lg-12">
               <h1 class="page-header">계약 확인하기</h1>
            </div>
            <div class="row">
               <div class="col-lg-12"></div>
            </div>
            <div class="panel panel-default">
               <div class="panel-heading">계약 목록</div>
               <div class="panel-body">
               
            <form action="contractDetailID" id="contractDetailID" method="post">
               
                  <table class="table table-hover">
                     <thead>
					 <tr><th>${customerName}님의 계약</th></tr>
                        <tr>
                           <th></th>
                           <th>보험이름</th>
                           <th>매니저</th>
                           <th>수령인</th>
                        </tr>
                     </thead>
                     <tbody>
                        <c:forEach items="${contract}" var="contract" varStatus="status">
                           <tr>
                             <td><input type="radio" name="insurance" value="${contract.contractID}"
                             		onclick ="setContractID(this)"/>
							  </td>
                           	  <td>${insuranceName[status.index]}</td>
                              <td>${contractManager[status.index]}</td>
                              <td>${recipientName[status.index]}</td>
                           </tr>
                        </c:forEach>
                     </tbody>
                  </table>
                  <input type = "hidden" name = "customerID" value = "${customerID}"/>
                </form>
               </div>
            </div>
         </div>
      </div>
   </div>

	<div class="row">
		<div class="col-lg-12">
			<button class="btn btn-outline btn-primary"
				onclick="showContractDetail()">
				<i class="fa fa-edit fa-fw"></i> 계약 상세보기
			</button>
			<button type="button" class="btn btn-outline btn-primary" onclick="location.href='index'">
            <i class="fa fa-edit fa-fw"></i> 처음으로
         </button>
		</div>
	</div>

</body>
</html>