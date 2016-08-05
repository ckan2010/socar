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
			<th>영수증 발급</th>
		</tr>
		<tr>
			<th>영수증 출력은 [PC홈] 마이페이지 > 예약내역에서 이용내역서 클릭 후 출력해 주시면 됩니다.</th>
		</tr>
		<br />
		<tr>
			<th>대기예약이 뭔가요?</th>
		</tr>
		<br />
		<tr>
			<td>대기예약은 먼저 예약한 이용자가 예약 취소 또는 조기 반납을 하여 예약이 가능해진 경우 푸시알림을 통해 예약 가능 상태를 알려주는 제도입니다. 푸시 알림을 받은 경우, 쏘카에 접속해 예약을 진행해 주셔야 고객님의 예약이 확정됩니다.

단, 푸시를 받아도 실제 고객님께서 원하는 시간에 다른 대기예약자가 먼저 예약을 할 수 있으며, 선택한 존의 다른 차량이 예약 가능할 경우에도 푸시가 발송됩니다.

※ 즉시 차량이 필요한 경우에는 '대기예약'이 아닌 '예약하기'로 표기된 차량을 예약해주세요.</td>
		</tr>
		<br />
		<tr>
			<th>주유비용은 어떻게 계산하나요?</th>
			<br />
			<tr><td>차량 이용 중 주유가 필요한 경우, 차량내부에 비치된 주유카드를 이용해 주유해 주세요. 이 후 고객님의 운행거리 만큼 km당 주행요금이 계산되어 등록하신 결제카드로 자동 결제됩니다.



※ 쏘카 차량 주유시 개인카드 및 현금으로 결제하시면 환불되지 않습니다.</td>
		</tr>
			<br />
	</table>






</body>
<jsp:include page="../global/footer.jsp"/>
</html>l>