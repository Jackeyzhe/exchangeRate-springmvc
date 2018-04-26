<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>汇率转换器</title>
</head>
<body>

    汇率转
    <div id="result"></div>
    <input id="quantity" type="text">
    <select id="coin" value="">
        <c:forEach items="${rateList}" var="item">
        <option value="${item.rate}" >${item.coin}</option>
        </c:forEach>
    </select>
    <button id="transfer">转换</button>
</body>
<script type="text/javascript" src="<c:url value='/plugins/jquery-1.8.0.min.js' />"></script>
<script type="text/javascript">
    $("#transfer").unbind("click").bind("click", function () {debugger;
        var quantity = $("#quantity").val();
        var rate = $("#coin").val();
        var per = rate / 100;
        $("#result").append(per * quantity);
    });
</script>

</html>