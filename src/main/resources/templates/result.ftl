<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Getting Started: Handling Form Submission</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<h1>Result</h1>
<p th:text="'id: ' + ${customer.id}" ></p>
<p th:text="'First name: ' + ${customer.firstName}" ></p>
<a href="/index">Submit another message</a>
</body>
</html>