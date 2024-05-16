<%@ page import="java.io.IOException" %>
<%@ page import="com.example.demo7.LoginBean" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 5/10/2024
  Time: 11:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LoginController</title>
    <%
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        LoginBean loginBean = new LoginBean();
        boolean status = false;
        status = loginBean.checkLogin(username, password);

        if (status) {%>
    <%-- Step3 --%>
    <jsp:forward page="success.jsp"/>

    <%} else {%>
    <jsp:forward page="fail.jsp"/>
    <%
        }
    %>

</head>
<body>

</body>
</html>