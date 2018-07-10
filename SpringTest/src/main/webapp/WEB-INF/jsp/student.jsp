<%--
  Created by IntelliJ IDEA.
  User: raoxi
  Date: 2018/6/22
  Time: 9:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Student</title>
</head>
<body>
<h2>Student Information</h2>
<form:form method="POST" action="/addStudent">
    <table>
        <tr>
            <td><form:label path="sname">Name</form:label></td>
            <td><form:input path="sname" /></td>
        </tr>
        <tr>
            <td><form:label path="sage">Age</form:label></td>
            <td><form:input path="sage" /></td>
        </tr>
        <tr>
            <td><form:label path="sno">sno</form:label></td>
            <td><form:input path="sno" /></td>
        </tr>
        <tr>
            <td><form:label path="sex">sex</form:label></td>
            <td><form:input path="sex" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Submit"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
