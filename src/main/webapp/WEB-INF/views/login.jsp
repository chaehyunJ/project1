<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<h2>로그인</h2>
<hr>

<form method="post" class="ffc aice">
	<p><input type="text" name="userid" placeholder="ID" value="${ cookie.save.value }" required autofocus></p>
	<p><input type="password" name="userpw" placeholder="pw" required></p>
	<p>
		<label><input type="checkbox" name="saveid" value="${ empty cookie.save ? '' : 'checked' }">ID저장</label>
		<label><input type="checkbox" name="auto">자동로그인</label>
	</p>
	<p><input type="submit" value="로그인"></p>
</form>

<div style="text-align: center">
	<a href="${ cpath }/join">아직 회원이 아니십니까?</a> &nbsp;&nbsp;
	<a href="${ cpath }/newPass">너의 비밀번호는?</a>
</div>
</body>
</html>