<html>
<body>

<h2>Thank You!</h2>

<table border="1">
<tr><th>Name</th><td><%= request.getAttribute("name") %></td></tr>
<tr><th>Email</th><td><%= request.getAttribute("email") %></td></tr>
<tr><th>Course</th><td><%= request.getAttribute("course") %></td></tr>
<tr><th>Rating</th><td><%= request.getAttribute("rating") %></td></tr>
</table>

</body>
</html>
