<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% String ctx = application.getContextPath(); %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<jsp:include page="../global/navi.jsp"/>
<body>
	
	차종(원/km)    ???<br />
	거리       	???<br />
	
	
차종과 거리를 선택해주세요 <br />

<br />



주행요금은 차량 이용 후 실제 이동거리에 따라 부과되므로, <br />예상 주행요금과 차이가 있을 수 있습니다. 


계산기이용하기<br />
1. 지도서비스에서 출발, 도착지를 설정후 자동차 길찾기를 하세요.<br />
2. 길찾기 결과의 총거리를 확인하세요.<br />
3. 차종과 총거리를 입력하고 주행요금을 미리 예상해보세요.<br />
<br />
	<a href="<%= ctx%>/index.jsp">메인으로</a>
	<br /><br />
</body>
<jsp:include page="../global/footer.jsp"/>
</html>