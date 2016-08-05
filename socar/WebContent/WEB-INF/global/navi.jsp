<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="${css }/global.css" />
<style>
.button {
    background-color: #008CBA;;
    border: none;
    color: white;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
	padding: 12px 28px;
}
.button:hover {
    background-color: #4CAF50;
    color: white;  
}
</style>
<div id="nav"> 
		<ul>
	        <li><a href="${context }/home.do"><img src="${img }/navi.png" alt="navi" /></a><li>	
			<li><a href="${context }/customer.do?page=rule">서비스안내</a></li>
			<li><a href="${context }/customer.do?page=money">요금안내</a></li>
			<li><a href="${context }/customer.do?page=bub">법인/단체안내</a></li>
			<li><a href="${context }/customer.do?page=customermain">고객센터</a></li>
			<li><a href="${context }/member.do?page=update&chk=id">마이페이지</a></li>
			<li><a href="${context}/booking.do?action=resv&page=booking">소카찾기예약</a></li>
			<c:choose>
				<c:when test="${user==null }">
				<li><a href="${context }/member.do?page=login"><input type="submit" value="로그인" /></a></li>
				<li><a href="${context }/member.do?page=regist"><input type="submit" value="회원가입" /></a></li>
				
					</c:when>
				<c:otherwise>
					<li><a href="${context }/member.do?action=logout"><input type="submit" value="로그아웃" /></a></li>
					<h2><li>${user.name } 님 </li></h2>
				</c:otherwise>
			</c:choose>
			<%-- <h2><li>${user.id }</li></h2> --%>
			
		</ul>
	</div>