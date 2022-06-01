<%@page import="ru.appline.logic.Model" %>

<%@ page contentType="text/html; charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<h1>Домашняя страница по работе с пользователями
</h1>
Введите ID пользователя (0 - для вывода всего списка пользователей)
<br/>
Доступно: <%
    Model model = Model.getInstance();
    out.print(model.getFromList().size());
%>
<form method="get" action="get">
    <label>
        ID:
        <input type="text" name="id"> <br/>
    </label>
    <button type="submit">
        Поиск
    </button>
</form>
<form method="post" action="delete">
    <label>
        ID:
        <input type="text" name="id"> <br/>
    </label>
    <button type="submit">
        Удалить
    </button>
</form>
<a href="add.jsp">Создать нового пользователя</a><br/>
<a href="put.jsp">Редактировать пользователя</a>
</body>
</html>