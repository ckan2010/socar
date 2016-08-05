<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<jsp:include page="../global/navi.jsp"/>
<head>
	<meta charset="UTF-8" />
	<title>회 원 탈 퇴</title>
</head>
<body>
<div class="text">
<br /><br /><br />
	<b><p>* 탈퇴 신청시, 미결제 및 환불금액 확인 후 탈퇴처리해 드립니다 *</p></b>
   <b><p>* 탈퇴 후 3개월간 재가입이 불가능하며, 쿠폰/크레딧도 소멸됩니다 *</p></b><br /><br />
   <form action="${context }/member.do" method="post">
  	 	<span>ID</span><input type="text" name="id" /><br /> 
   		<span>비밀번호</span><input type="text" name="pw" /><br /> <br />
   		<input type="hidden" name="action" value="delete"/>
   		<input type="submit" value="탈퇴"/>
		<input type="reset" value="취소"/></a><br /><br /><br /><br />
		</form>
</body>
<jsp:include page="../global/footer.jsp"/>
</html>