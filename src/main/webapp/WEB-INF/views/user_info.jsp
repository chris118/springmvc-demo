<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019-05-11
  Time: 20:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring MVC表单处理之-密码</title>
</head>
    <body>

    <h2>提交的用户信息</h2>
    <table>
        <tr>
            <td>用户名：</td>
            <td>${username}</td>
        </tr>
        <tr>
            <td>密码：</td>
            <td>${password}</td>
        </tr>
        <tr>
            <td>地址：</td>
            <td>${address}</td>
        </tr>
        <tr>
            <td>是否订阅新闻：</td>
            <td>${isReceivePaper}</td>
        </tr>
    </table>
    </body>
</html>
