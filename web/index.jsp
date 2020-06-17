
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/login" method="post">
    登录:<input type="text" name="account">
    密码:<input type="password" name="password">
    <input type="submit" value="登录">
  </form>
  </body>
</html>
