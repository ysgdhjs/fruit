<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍展示</title>

    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column"></div>
        <div class="page-header">
            <h1>
                <small>水果列表————-显示所有水果</small>
            </h1>
        </div>
    </div>

    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/shop/toAddShop">新增</a>
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/shop/allShop">显示所有水果</a>
        </div>
        <div class="col-md-4 column">
            <form method="post" action="${pageContext.request.contextPath}/shop/queryByName}" >
                <span style="color: red;font-weight: bold">${error}</span>
                <input type="text" name="queryShopName" class="form-coontrol" placeholder="请输入要查询的水果名称">
                <input type="submit" value="查询">
            </form>

        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column"></div>
        <table class="table table-hover table-striped">
            <thead>
            <tr>
                <th>水果编号</th>
                <th>水果名称</th>
                <th>水果单价</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="shop" items="${list}">
                <tr>
                    <td>${shop.id}</td>
                    <td>${shop.name}</td>
                    <td>${shop.price}</td>
                    <td>
                        <a href="${pageContext.request.contextPath}/shop/toUpdateShop?id=${shop.id}">修改</a>
                        &nbsp; | &nbsp;
                        <a href="${pageContext.request.contextPath}/shop/del/${shop.id}">删除</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>


</body>
</html>
