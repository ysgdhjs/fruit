<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>新增水果</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>新增水果</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/shop/addShop" method="post">
        <div class="form-group"></div>
        水果名称：<input type="text" name="name" class="form-control" required>
        水果价格：<input type="text" name="price" class="form-control" required>
        <input type="submit" value="添加">
    </form>

</div>
