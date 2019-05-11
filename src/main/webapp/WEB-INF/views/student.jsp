<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019-05-03
  Time: 21:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form demo</title>
</head>
<body>
    <h2>Student Information</h2>
    <form:form method="post" action="/addStudent">
        <table>
            <tr>
                <td><form:label path="name">名字：</form:label></td>
                <td><form:input path="name" /></td>
            </tr>
            <tr>
                <td><form:label path="age">年龄：</form:label></td>
                <td><form:input path="age" /></td>
            </tr>
            <tr>
                <td><form:label path="id">编号：</form:label></td>
                <td><form:input path="id" /></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="提交表单"/>
                </td>
            </tr>
        </table>
    </form:form>

</body>
</html>
