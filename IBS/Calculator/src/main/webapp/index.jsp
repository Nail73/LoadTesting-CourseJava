<%@page import="ru.appline.calculator.Calculator" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>

<html>
<head>
    <title>Калькулятор простых чисел</title>
</head>
<body>
<form action="Calculator" method="post" onsubmit="return calc(this);">
    <table align="center" border="0">
        <tr>
            <th>Калькулятор простых чисел</th>
        </tr>
        <tr>
            <td>
                <input type="text" name="a">
                <select name="operator">
                    <option value="-1">Оператор</option>
                    <option value="+">+</option>
                    <option value="-">-</option>
                    <option value="*">*</option>
                    <option value="/">/</option>
                </select>
                <input type="text" name="b">
                <input type="submit" value="Рассчитать">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
