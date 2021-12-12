<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>


<h2>추가하기!</h2>
<form method="POST">
	<p><input name="name" placeholder="Name" required autofocus></p>
	<p><input name="author" placeholder="Author" required></p>
	<p><input name="publisher" placeholder="Publisher"></p>
	<p><input type="date" name="publishDate" required></p>
	<p><input type="number" name="price" step="100" required></p>
	<textarea style="width : 300px; height : 400px; resize : none;" name="description" placeholder="설명"></textarea>
	<p><input type="submit" value="추가"></p>
</form>
</body>
</html>