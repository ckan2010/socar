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
			<th>회원카드 구매?</th>
		</tr>
		<tr>
			<td>회원카드는 가입완료 후 '모바일앱 마이페이지 > 내 정보 > 차량제어수단 > 추가 카드키 > 회원카드 신청' 을 통해 구매하실 수 있습니다. 



※ 회원카드 수령과 관계없이 가입승인 후 모바일앱/웹 스마트키로 쏘카를 이용하실 수 있습니다.</td>
		</tr>
		<br />
		<tr>
			<th>연회비 제도가 있나요?</th>
		</tr>
		<br />
		<tr>
			<td>쏘카에서는 별도 연회비가 없이 모든 서비스를 이용하실 수 있습니다.



※ 쏘카 SO회원에 한해 적용되던 연회비가 2014년 1월 9일 부로 무료화되었습니다. 대여요금 최대 70% 할인 등, SO회원 혜택은 그대로 유지됩니다. 회원제에 대해 궁금하신 사항은 고객센터(1661-3315)로 문의 부탁드립니다.</td>
		</tr>
		<br />
		<tr>
			<th>가입절차가 어떻게 되나요?</th>
			<br />
			<tr><td>회원가입은 쏘카 홈페이지 및 모바일웹/앱에서 가능합니다. 회원가입 시 실명인증 및 연락처, 이메일, 주소 등의 개인정보와 결제카드정보 및 운전면허 정보를 모두 입력해 주셔야 합니다. 회원가입을 완료하시면 입력하신 정보가 사실과 맞는지 검토하는 과정을 거쳐, 심사가 정상적으로 완료된 후부터 쏘카 예약 및 이용이 가능합니다.</td>
		</tr>
			<br />
	</table>






</body>
<jsp:include page="../global/footer.jsp"/>
</html>