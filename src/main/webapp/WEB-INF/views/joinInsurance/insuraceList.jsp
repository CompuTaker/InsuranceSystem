<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>insuranceList</title>
</head>
<body>
<div class="page-wrapper">
    <div class="container-fluid">
        <div class="col-lg-8"><!--게시판 넓이 -->
            <div class="col-lg-12">
                <h1 class="page-header">보험상품 영업</h1>
            </div>
            <div class="row">
                  <div class="col-lg-12">
                  </div>
              </div>
            <div class="panel panel-default">
                <div class="panel-heading">보험 목록 </div>
                <div class="panel-body">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>보험ID</th>
                                <th>보험종류</th>
                                <th>보험상품명</th>
                                <th>보험상품 설명</th>
                            </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${list}" var="insuranceVO">
                            <tr>
                                <td>${insuranceVO.insuranceID}</td>
                                <td>${insuranceVO.insuranceType}</td>
                                <td>${insuranceVO.name}</td>
                                <td>${insuranceVO.explanation}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>

