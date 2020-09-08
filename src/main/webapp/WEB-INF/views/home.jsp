<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="/style.css" rel="stylesheet" />
<title>Insert title here</title>
</head>
<body>
<a href="https://grandcircusco.github.io/demo-apis/index.html">Back | </a>
<a href="https://grandcircusco.github.io/demo-apis/blog-posts.json">JSON</a>
<br>

<h1>${blog.title}</h1>
<br>
<c:forEach var="post" items="${posts}">
<h2>${post.title}</h2>
<p>by ${post.author} ${post.date}</p>
<p>${post.content}</p>
<p>
<c:forEach var="tag" items="${post.tags}">
| ${tag} 
 </c:forEach>
 </p>
 </c:forEach>
</body>
</html>