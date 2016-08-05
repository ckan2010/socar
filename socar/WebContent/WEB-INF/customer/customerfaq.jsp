<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<% String ctx = application.getContextPath(); %>
<!doctype html>
<html lang="en">
<style>
ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: #333333;
}

li {
	float: left;
}

li a {
	display: block;
	color: white;
	text-align: center;
	padding: 16px;
	text-decoration: none;
}

li a:hover {
	background-color: #111111;
}
</style>
<jsp:include page="../global/navi.jsp"/>
<body>
	<h1>고  객  센  터 </h1>

	<ul>
		<li><a href="${context }/customer.do?page=customerfaq">자주묻는질문</a></li>
		<li><a href="${context }/customer.do?page=customer">1:1문의</a></li>
		<li><a href="${context }/customer.do?page=customer1">가입문의</a></li>
		<li><a href="${context }/customer.do?page=customer2">차량이용/사고</a></li>
        <li><a href="${context }/customer.do?page=customer0">예약/결제문의</a></li>
	</ul>
	
	
	<table>
		<tr>
		
		</tr>
		
		<tr>
			<p><b>세차질문</b></p>
		</tr>
		<tr>
			<p>이용 중 세차가 하고 싶으신가요? 자비부담으로 세차 진행 시 1만 크레딧으로 리워드 해드립니다. 이용 중인
				차량의 스마트키 > 추가 기능 사용하기 > '세차 인증' 메뉴에서 세차 전후 사진을 촬영하여 남겨주세요! ※ 담당자 확인
				후 크레딧 지급까지 3~4일이 소요됩니다.</p>
		</tr>
		<br />
		<tr>
			<p><b>이용 요금 지불</b></p>
		</tr>
		<br />
		<tr>
			<p>쏘카 서비스 가입 시 등록한 결제카드를 통해 이용금액이 지불됩니다. 예약하신 시간 수 분 전에 자동으로
				결제되며 사용 반납 후 km당 주행요금이 결제 됩니다.</p>
		</tr>
		<br />
		<tr>
			<p><b>신용카드?체크카드?</b></p>
			<br />
			<tr><p>신용카드, 체크카드 둘다 등록 가능합니다. 단, 체크카드 등록 후 이용금액이 충분하지 않아 결제가 정상적으로
				되지 않을 시에는 차량 이용이 제한됩니다.</p>
		</tr>
			<br />
	</table>






</body>
<jsp:include page="../global/footer.jsp"/>
</html>