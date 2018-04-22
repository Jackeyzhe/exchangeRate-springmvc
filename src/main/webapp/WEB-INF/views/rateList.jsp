<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>查询商品列表Rate</title>
</head>
<body>
<form name="itemsForm" action="${pageContext.request.contextPath }/queryRates.action" method="post">
    查询条件：
    商品列表：
    <table width="100%" border=1>
        <tr>
            <td>选择</td>
            <td>商品名称</td>
            <td>商品价格</td>
            <td>生产日期</td>
            <td>商品描述</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${rateList}" var="item">
            <tr>
                <td><input type="checkbox" name="items_id" value="${item.id}"/></td>
                <td>${item.coin }</td>
                <td>${item.rate }</td>
                <td><fmt:formatDate value="${item.time}" pattern="yyyy-MM-dd"/></td>

            </tr>
        </c:forEach>

    </table>
</form>
</body>

</html>