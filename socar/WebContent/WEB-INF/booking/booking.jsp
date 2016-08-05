<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>소카예약</title>
</head>
<jsp:include page="../global/navi.jsp"/>
<body>
<div class="text">
	<br />
	<h3> 실시간예약 </h3>
	
	
	
	<form action="${context}/booking.do?" method="post">
	<span>몇시간빌릴꺼에요</span><input type="text" name="renttime"/><br />
	<span>차시퀀스</span><input type="text" name="carseq"/><br />
	<input type="hidden" name="action" value="reserve" />
	<input type="submit" value ="예약"/>
	<br /><br />
	</form>
	
	</div>
	
</body>
<jsp:include page="../global/footer.jsp"/>
</html>