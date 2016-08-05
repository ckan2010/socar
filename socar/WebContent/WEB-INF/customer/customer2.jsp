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
			<th>D2D이용가능지역은 어디인가요?</th>
		</tr>
		<tr>
			<td>16년 7월 현재 서울 강남구, 광진구, 마포구, 서초구, 영등포구, 서대문구, 송파구, 성동구 일부 지역에 한하여 서비스를 제공중이며, 점진적으로 서비스 지역을 확대할 예정입니다.</td>
		</tr>
		<br />
		<tr>
			<th>D2D이용은 언제 가능하나요?</th>
		</tr>
		<br />
		<tr>
<td>차량 대여 시작 시간이 오전 10시부터 오후 10시인 경우 차량을 원하는 위치로 배차가 가능합니다.
차량 이용 후 반납은 언제든 가능합니다.</td>
		</tr>
		<br />
		<tr>
			<th>배차 시간을 변경하고 싶어요</th>
			<br />
			<tr><td>차량 배차지 변경은 시스템상 불가능 합니다. 기존 예약 취소 후 재예약을 진행해 주세요.
단, 대여 시작 3시간 이내 취소하는 겨우 취소수수료(대여요금의 10%)가 발생됩니다.</td>
		</tr>
			<br />
	</table>






</body>
<jsp:include page="../global/footer.jsp"/>
</html>