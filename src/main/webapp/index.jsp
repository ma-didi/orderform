<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<title>gogogoogo</title>
<style>
    body{
        background-image: url(img/305133.jpg);
        background-repeat: no-repeat;
        background-size: 100%;
    }
    .bgc{
        margin: 190px;
    }
    .tishi{
        color: red;
    }
</style>
<link href="${pageContext.request.contextPath}/ioc/favicon.ico" rel="shortcut icon">
<body>
    <div class="bgc">
        <form action="${pageContext.request.contextPath}/My_findAndUid" method="post">
            <table border="1">
                <span class="tishi">${metter}</span>
                <tr>
                    <td>登录</td>
                    <td><input type="text" name="use.uname" placeholder="我太喜欢"/></td>
                </tr>
                <tr>
                    <td>密码</td>
                    <td><input type="text" name="use.upaw" placeholder="王子怡"/></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="登录">
                            <input type="reset" value="重置">
                    </td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
