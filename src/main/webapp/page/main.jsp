<%@ page contentType="text/html; utf-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<title>zhuyemian</title>
<link href="${pageContext.request.contextPath}/ioc/favicon.ico" rel="shortcut icon">
<style>
    #uname{
        color: aquamarine;
        align-content: center;
        font-size: 90px;
        margin-left: 16cm;
    }
    .moti{
        color: blue;
    }
</style>
<body>
    <c:forEach items="${li}" var="i">
        <p>${i}</p>
    </c:forEach>
    <div id="uname">${uname}</div>
    <h4 class="moti"><hr></h4>
    <p>ahhah</p>
</body>
</html>
