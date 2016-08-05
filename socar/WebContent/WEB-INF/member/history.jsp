<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>

<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 50%;
   margin: auto;
}

td, th {
    border: 1px solid #dddddd;
    text-align: center;
    padding: 20 20 20 20; word-break:break-all;
    
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>
</head>
<jsp:include page="../global/navi.jsp"/>
<body>
<div class="text">
<b><h1>예 약 내 역</h1></b>
<br /><br />
<table>
  <tr>
    <th><img src="${img}/car1.png" alt="car" width="60" height="60" /></th>
    <b><th>대여날짜</th></b>
    <b><th>대여존</th></b>
    <b><th>차량명</th></b>
    <b><th>대여요금</th></b>
       </tr>
    <c:forEach var="history" items="${list}">

       <tr>
       <td>${history.img}</td>
       <td>${history.rentDate}</td>
       <td>${history.rentZone}</td>
       <td>${history.carModel}</td>
       <td>${history.payKm}</td>
            
       </tr>
	</c:forEach>
      
  
</table><br /><br /><br /><br /><br /><br /><br />
<a href="${context}/home.do"><input type="submit" value="홈으로" /></a>

 <br /><br /><br /><br /><br /><br />
</body>
<jsp:include page="../global/footer.jsp"/>
</html>