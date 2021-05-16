<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
  <!-- Theme Made By www.w3schools.com -->
  <title>MJU Insurance</title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <style>
  body {
    font: 400 15px Lato, sans-serif;
    line-height: 1.8;
    color: #818181;
  }
  h2 {
    font-size: 24px;
    text-transform: uppercase;
    color: #303030;
    font-weight: 600;
    margin-bottom: 30px;
  }
  h4 {
    font-size: 19px;
    line-height: 1.375em;
    color: #303030;
    font-weight: 400;
    margin-bottom: 30px;
  }  
  .jumbotron {
    background-color: #119154;
    color: #fff;
    padding: 100px 25px;
    font-family: Montserrat, sans-serif;
  }
  .container-fluid {
    padding: 60px 50px;
  }
  .bg-grey {
    background-color: #f6f6f6;
  }
  .logo-small {
    color: #119154;
    font-size: 50px;
  }
  .logo {
    color: #119154;
    font-size: 200px;
  }
  .thumbnail {
    padding: 0 0 15px 0;
    border: none;
    border-radius: 0;
  }
  .thumbnail img {
    width: 100%;
    height: 100%;
    margin-bottom: 10px;
  }
  .carousel-control.right, .carousel-control.left {
    background-image: none;
    color: #119154;
  }
  .carousel-indicators li {
    border-color: #119154;
  }
  .carousel-indicators li.active {
    background-color: #119154;
  }
  .item h4 {
    font-size: 19px;
    line-height: 1.375em;
    font-weight: 400;
    font-style: italic;
    margin: 70px 0;
  }
  .item span {
    font-style: normal;
  }
  .panel {
    border: 1px solid #119154; 
    border-radius:0 !important;
    transition: box-shadow 0.5s;
  }
  .panel:hover {
    box-shadow: 5px 0px 40px rgba(0,0,0, .2);
  }
  .panel-footer .btn:hover {
    border: 1px solid #119154;
    background-color: #fff !important;
    color: #119154;
  }
  .panel-heading {
    color: #fff !important;
    background-color: #119154 !important;
    padding: 25px;
    border-bottom: 1px solid transparent;
    border-top-left-radius: 0px;
    border-top-right-radius: 0px;
    border-bottom-left-radius: 0px;
    border-bottom-right-radius: 0px;
  }
  .panel-footer {
    background-color: white !important;
  }
  .panel-footer h3 {
    font-size: 32px;
  }
  .panel-footer h4 {
    color: #aaa;
    font-size: 14px;
  }
  .panel-footer .btn {
    margin: 15px 0;
    background-color: #119154;
    color: #fff;
  }
  .navbar {
    margin-bottom: 0;
    background-color: #119154;
    z-index: 9999;
    border: 0;
    font-size: 12px !important;
    line-height: 1.42857143 !important;
    letter-spacing: 4px;
    border-radius: 0;
    font-family: Montserrat, sans-serif;
  }
  .navbar li a, .navbar .navbar-brand {
    color: #fff !important;
  }
  .navbar-nav li a:hover, .navbar-nav li.active a {
    color: #119154 !important;
    background-color: #fff !important;
  }
  .navbar-default .navbar-toggle {
    border-color: transparent;
    color: #fff !important;
  }
  footer .glyphicon {
    font-size: 20px;
    margin-bottom: 20px;
    color: #119154;
  }
  .slideanim {visibility:hidden;}
  .slide {
    animation-name: slide;
    -webkit-animation-name: slide;
    animation-duration: 1s;
    -webkit-animation-duration: 1s;
    visibility: visible;
  }
  @keyframes slide {
    0% {
      opacity: 0;
      transform: translateY(70%);
    } 
    100% {
      opacity: 1;
      transform: translateY(0%);
    }
  }
  @-webkit-keyframes slide {
    0% {
      opacity: 0;
      -webkit-transform: translateY(70%);
    } 
    100% {
      opacity: 1;
      -webkit-transform: translateY(0%);
    }
  }
  @media screen and (max-width: 768px) {
    .col-sm-4 {
      text-align: center;
      margin: 25px 0;
    }
    .btn-lg {
      width: 100%;
      margin-bottom: 35px;
    }
  }
  @media screen and (max-width: 480px) {
    .logo {
      font-size: 150px;
    }
  }
  </style>
</head>
<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="60">

<nav class="navbar navbar-default navbar-fixed-top">
  <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#myPage">MJU</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#about">ABOUT</a></li>
        <li><a href="#customer">CUSTOMER</a></li>
        <li><a href="#salesman">SALESMAN</a></li>
        <li><a href="#insuranceInteralApprover">InternalApprover</a></li>
        <li><a href="#developer">DEVELOPER</a></li>
        
        <c:choose>
			<c:when test="${who == 'anon'}">
				
				<li><a href="#" onclick="login()">LOGIN</a></li>
				<li><a href="#" onclick="signUp()">SIGNUP</a></li>
				
			</c:when>
			<c:otherwise>
			<li><a href="#" onclick="logout()">LOGOUT</a></li>
				
			</c:otherwise>
		</c:choose>
      </ul>
    </div>
  </div>
</nav>

<div class="jumbotron text-center">
  <h1>MJU Insurance Company</h1> 
  <p>언제나 당신의 뒤에서 당신을 지켜드립니다</p> 
  <form class="form-inline">
    <div class="input-group">
      <input type="email" class="form-control" size="50" placeholder="Email Address" required>
      <div class="input-group-btn">
        <button type="button" class="btn btn-success">Subscribe</button>
      </div>
    </div>
  </form>
</div>

<!-- Container (About Section) -->
<div id="about" class="container-fluid">
  <div class="row">
			<div class="col-sm-8">
				<h2>MJU 보험사</h2>
				<br>
				<h4>
					다이렉트 운전자보험 가입 고객 25만 누적은 20년 4월 기준입니다.<br> 저렴한 보험료, 보험료 할인은
					자동차보험 가입/유지 고객님께만 드리는 혜택입니다. <br>
				</h4>
				<br>
				<p>
					암보험은 15년/20년 만기 자동갱신형, 유병력자 건강보험은 80세/90세/100세 만기 비갱신형, 실손보험은 1년 단위
					갱신(전 보험사 공통) 15년 만기 재가입형이며, 유병력자 실손보험은 1년 단위 갱신 3년 만기 재가입형이며, 갱신 시
					보험료가 인상될 수 있습니다. 모든 담보는 해당 특약 가입 시 보상됩니다.<br> - 보험가입금액 1억원 이상
					~ 2억원 미만(다만, 1억 9,700만원 초과 2억원 미만은 가입대상에서 제외) : 주계약 영업보험료의 3.0% -
					보험가입금액 2억원 : 주계약 영업보험료의 4.0% - 주계약 영업보험료는 해당 상품 보험료 중 특약 외 주계약으로만
					납입되는 보험료를 의미합니다
				</p>
				<br>
				<button class="btn btn-default btn-lg">Get in Touch</button>
			</div>
			<div class="col-sm-4">
      <span class="glyphicon glyphicon-signal logo"></span>
    </div>
  </div>
</div>

	<div class="container-fluid bg-grey">
		<div class="row">
			<div class="col-sm-4">
				<span class="glyphicon glyphicon-globe logo slideanim"></span>
			</div>
			<div class="col-sm-8">
				<h2>MJU's Values</h2>
				<br>
				<h4>
					<strong>MISSION</strong> <br>2001년 대한민국 최초로 다이렉트 자동차보험을 선보인 이래로, 대한민국
					보험시장의 혁신을 선도하는 최고의 다이렉트 보험사로 자리 매김하고 있습니다.
				</h4>
				<br>
				<p>
					<strong>VISION</strong> <br>고객중심의 생각과 혁신을 바탕으로 업계 최초 1:1 보상상담서비스를
					도입하였고, 국내 최초로 마일리지 자동차보험, 모바일을 통한 차별화된 보상서비스를 출시하는 등 고객의 요구에 맞는 다양한
					상품과 서비스를 지속적으로 제공하고 있습니다. 더불어 운전자보험, 치아보험, 입원비보험 등 상해, 장기보험으로까지
					사업영역을 성공적으로 확장하여 종합손해보험사로서 도약해나가고 있습니다.
				</p>
			</div>
		</div>
	</div>

	<!-- Container (customer Section) -->
<div id="customer" class="container-fluid text-center">
  <h2>CUSTOMER</h2>
  <h4>고객 서비스</h4>
  <br>
  <div class="row slideanim">
    <div class="col-sm-4"><a href="#" onclick="showAllInsurance()">
      <span class="glyphicon glyphicon-search logo-small"></span>
      <h4>SEARCH</h4>
      <p>보험상품 조회하기</p>
      </a>
    </div>
    <div class="col-sm-4"><a href="#" onclick="allContract()">
      <span class="glyphicon glyphicon-check logo-small"></span>
      <h4>CONTRACT</h4>
      <p>계약확인하기</p>
      </a>
    </div>
    <div class="col-sm-4">
      <span class="glyphicon glyphicon-lock logo-small"></span>
      <h4>JOB DONE</h4>
      <p>Lorem ipsum dolor sit amet..</p>
    </div>
  </div>
  <br><br>
  <div class="row slideanim">
    <div class="col-sm-4">
      <span class="glyphicon glyphicon-leaf logo-small"></span>
      <h4>GREEN</h4>
      <p>Lorem ipsum dolor sit amet..</p>
    </div>
    <div class="col-sm-4">
      <span class="glyphicon glyphicon-certificate logo-small"></span>
      <h4>CERTIFIED</h4>
      <p>Lorem ipsum dolor sit amet..</p>
    </div>
    <div class="col-sm-4">
      <span class="glyphicon glyphicon-wrench logo-small"></span>
      <h4 style="color:#303030;">HARD WORK</h4>
      <p>Lorem ipsum dolor sit amet..</p>
    </div>
  </div>
</div>

<!-- Container (salesman Section) -->
<div id="salesman" class="container-fluid text-center bg-grey">
  <h2>SALESMAN</h2><br>
  <h4>영업사원 메뉴</h4>
  <br>
  <div class="row slideanim">
    <div class="col-sm-4"><a href="#" onclick="joinInsurance()">
      <span class="glyphicon glyphicon-log-in logo-small"></span>
      <h4>SALES</h4>
      <p>보험상품 영업하기 (가입시키기)</p>
      </a>
    </div>
    <div class="col-sm-4"><a href="#" onclick="showCustomerForSales()">
      <span class="glyphicon glyphicon-list logo-small"></span>
      <h4>showCustomerForSales</h4>
      <p>영업고객 조회하기</p>
      </a>
    </div>
    <div class="col-sm-4">
      <span class="glyphicon glyphicon-lock logo-small"></span>
      <h4>JOB DONE</h4>
      <p>Lorem ipsum dolor sit amet..</p>
    </div>
  </div>
  <br><br>
  <div class="row slideanim">
    <div class="col-sm-4">
      <span class="glyphicon glyphicon-leaf logo-small"></span>
      <h4>GREEN</h4>
      <p>Lorem ipsum dolor sit amet..</p>
    </div>
    <div class="col-sm-4">
      <span class="glyphicon glyphicon-certificate logo-small"></span>
      <h4>CERTIFIED</h4>
      <p>Lorem ipsum dolor sit amet..</p>
    </div>
    <div class="col-sm-4">
      <span class="glyphicon glyphicon-wrench logo-small"></span>
      <h4 style="color:#303030;">HARD WORK</h4>
      <p>Lorem ipsum dolor sit amet..</p>
    </div>
  </div>
  </div>

   

<!-- Container (insuranceInteralApprover Section) -->
<div id="insuranceInteralApprover" class="container-fluid text-center">
    <h2>InternalApprover</h2>
    <h4>내부승인자</h4>
  <br>
  <div class="row slideanim">
    <div class="col-sm-4"><a href="#" onclick="approveInternal()">
      <span class="glyphicon glyphicon-export logo-small"></span>
      <h4>approveInternal</h4>
      <p>제안서 내부승인하기(외부승인요청하기)</p>
      </a>
    </div>
    <div class="col-sm-4"><a href="#" onclick="approveExternal()">
      <span class="glyphicon glyphicon-thumbs-up logo-small"></span>
      <h4>approveExternal</h4>
      <p>제안서 외부승인하기</p>
      </a>
    </div>
    <div class="col-sm-4"><a href="#" onclick="makeInsurancePublicFromProposal()">
      <span class="glyphicon glyphicon-saved logo-small"></span>
      <h4>PublicFromProposal</h4>
      <p>제안서 공시하기</p>
      </a>
    </div>
  </div>
  <br><br>
  <div class="row slideanim">
    <div class="col-sm-4">
      <span class="glyphicon glyphicon-leaf logo-small"></span>
      <h4>GREEN</h4>
      <p>Lorem ipsum dolor sit amet..</p>
    </div>
    <div class="col-sm-4">
      <span class="glyphicon glyphicon-certificate logo-small"></span>
      <h4>CERTIFIED</h4>
      <p>Lorem ipsum dolor sit amet..</p>
    </div>
    <div class="col-sm-4">
      <span class="glyphicon glyphicon-wrench logo-small"></span>
      <h4 style="color:#303030;">HARD WORK</h4>
      <p>Lorem ipsum dolor sit amet..</p>
    </div>
  </div>
</div>

<!-- Container (developer Section) -->
<div id="developer" class="container-fluid text-center bg-grey">
  <h2 class="text-center">DEVELOPER</h2>
  <h4>보험 개발자</h4>
  <br>
  <div class="row slideanim">
    <div class="col-sm-4"><a href="#" onclick="pageChange()">
      <span class="glyphicon glyphicon-pencil logo-small"></span>
      <h4>DevelopProposal</h4>
      <p>제안서 개발하기</p>
      </a>
    </div>
    <div class="col-sm-4"><a href="#" onclick="requestInternalApprover()">
      <span class="glyphicon glyphicon-export logo-small"></span>
      <h4>RequestInternalApprover</h4>
      <p>제안서 내부승인 요청하기</p>
      </a>
    </div>
    <div class="col-sm-4">
      <span class="glyphicon glyphicon-lock logo-small"></span>
      <h4>JOB DONE</h4>
      <p>Lorem ipsum dolor sit amet..</p>
    </div>
  </div>
  <br><br>
  <div class="row slideanim">
    <div class="col-sm-4">
      <span class="glyphicon glyphicon-leaf logo-small"></span>
      <h4>GREEN</h4>
      <p>Lorem ipsum dolor sit amet..</p>
    </div>
    <div class="col-sm-4">
      <span class="glyphicon glyphicon-certificate logo-small"></span>
      <h4>CERTIFIED</h4>
      <p>Lorem ipsum dolor sit amet..</p>
    </div>
    <div class="col-sm-4">
      <span class="glyphicon glyphicon-wrench logo-small"></span>
      <h4 style="color:#303030;">HARD WORK</h4>
      <p>Lorem ipsum dolor sit amet..</p>
    </div>
  </div>
</div>

<footer class="container-fluid text-center">
  <a href="#myPage" title="To Top">
    <span class="glyphicon glyphicon-chevron-up"></span>
  </a>
  <p>Made By MJU Insurance Company</p>
</footer>
<script type="text/javascript">
	
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
	
	function pageChange() {
		if(<%= currentLogin.equals("insuranceDeveloper") %>){
			location.href = "proposalRequest";
		}else{
			alert("보험 개발자로 로그인하세요!");
		}
	}
	
	function requestInternalApprover() {
		if(<%= currentLogin.equals("insuranceDeveloper") %>){
			location.href = "beforeInternalApproved";
		}else{
			alert("보험 개발자로 로그인하세요!");
		}
	}
	
	function approveInternal() {
		if(<%= currentLogin.equals("insuranceInteralApprover") %>){
			location.href = "afterInternalApproved";
		}else{
			alert("보험 내부 승인자로 로그인하세요!");
		}
	}	
	
	function approveExternal() {
		if(<%= currentLogin.equals("insuranceInteralApprover") %>){
			location.href = "afterExternalApproved";
		}else{
			alert("보험 내부 승인자로 로그인하세요!");
		}
	}	
	
	function makeInsurancePublicFromProposal() {
		if(<%= currentLogin.equals("insuranceInteralApprover") %>){
			location.href = "makeInsurancePublicFromProposal";
		}else{
			alert("보험 내부 승인자로 로그인하세요!");
		}
	}
	
	function showAllInsurance() {
		location.href = "allInsurance";
	}
	
	function joinInsurance(){
		if(<%= currentLogin.equals("salesman") %>){
			location.href = "insuranceList";
		}else{
			alert("영업사원으로 로그인하세요!");
		}
	}
	
	function showCustomerForSales(){
		if(<%= currentLogin.equals("salesman") %>){
			location.href = "showCustomerForSales";
		}else{
			alert("영업사원으로 로그인하세요!");
		}
	}
	
	function allContract(){
		if(<%= currentLogin.equals("customer") %>){
			location.href = "allContract";
		}else{
			alert("고객으로 로그인하세요!");
		}
	}
	
	function login(){
		location.href = "login";
	}
	
	function logout(){
		location.href = "logout";
	}
	
	function signUp(){
		location.href = "signUp";
	}
</script>
<script>
$(document).ready(function(){
  // Add smooth scrolling to all links in navbar + footer link
  $(".navbar a, footer a[href='#myPage']").on('click', function(event) {
    // Make sure this.hash has a value before overriding default behavior
    if (this.hash !== "") {
      // Prevent default anchor click behavior
      event.preventDefault();

      // Store hash
      var hash = this.hash;

      // Using jQuery's animate() method to add smooth page scroll
      // The optional number (900) specifies the number of milliseconds it takes to scroll to the specified area
      $('html, body').animate({
        scrollTop: $(hash).offset().top
      }, 900, function(){
   
        // Add hash (#) to URL when done scrolling (default click behavior)
        window.location.hash = hash;
      });
    } // End if
  });
  
  $(window).scroll(function() {
    $(".slideanim").each(function(){
      var pos = $(this).offset().top;

      var winTop = $(window).scrollTop();
        if (pos < winTop + 600) {
          $(this).addClass("slide");
        }
    });
  });
})
</script>

</body>
</html>
