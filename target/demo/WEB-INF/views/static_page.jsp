<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019-05-03
  Time: 21:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>static_page</title>
</head>
<body>
<h2>Spring Landing Page</h2>
<p>点击下面的按钮获得一个简单的HTML页面</p>
<form:form method="GET" action="/staticPage">
    <table>
        <tr>
            <td>
                <input type="submit" value="获取HTML页面"/>
            </td>
        </tr>
    </table>
</form:form>

<p>点击下面的按钮将结果重定向到新页面</p>
<form:form method="GET" action="/redirectPage">
    <table>
        <tr>
            <td><input type="submit" value="页面重定向" /></td>
        </tr>
    </table>
</form:form>

</body>
</html>
