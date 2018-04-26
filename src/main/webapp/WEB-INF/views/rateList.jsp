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

    丸子牌汇率转换器
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
    $("#transfer").unbind("click").bind("click", function () {
        var quantity = $("#quantity").val();
        var rate = $("#coin option:selected").val();
        var coin = $("#coin option:selected").text();
        var per = rate / 100;
        var result = per * quantity;
        var msg = quantity + coin + "=" + result + "人民币";
        $("#result").empty();
        $("#result").append(msg);
    });
</script>

</html>