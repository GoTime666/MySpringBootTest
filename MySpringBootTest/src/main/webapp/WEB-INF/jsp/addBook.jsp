<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加书籍</title>
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">

<!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>
<style type="text/css">
</style>
</head>
<body>

	<div class="container">
		<form  >

			<div class="col-md-6 col-md-offset-3">
				<div class="row">
					<h1 align="center">添加书籍</h1>
				</div>
			</div>
			<div class="form-group col-md-6 col-md-offset-3">
				<label for="bookName">书名</label> <input type="email"
					class="form-control" id="bookName" placeholder="书名">
			</div>

			<div class="form-group col-md-6 col-md-offset-3">
				<label for="publisher">出版社</label> <input type="password"
					class="form-control" id="publisher" placeholder="出版社">
			</div>

			<div class="form-group col-md-6 col-md-offset-3">
				<label for="price">价格</label> <input type="password"
					class="form-control" id="price" placeholder="出版社">
			</div>
			
			<div class="form-group col-md-6 col-md-offset-3">
				<label for="publishTime">出版时间</label> <input type="password"
					class="form-control" id="publishTime" placeholder="出版时间">
			</div>
			
			<div class="form-group col-md-6 col-md-offset-3">
				<label for="author">作者</label> <input type="password"
					class="form-control" id="author" placeholder="作者">
			</div>
			
			<div class="form-group col-md-6 col-md-offset-3">
				<label for="amount">数量</label> <input type="password"
					class="form-control" id="amount" placeholder="数量">
			</div>
			
			<div class="form-group col-md-6 col-md-offset-3">
				<label for="publisher">出版社</label> <input type="password"
					class="form-control" id="publisher" placeholder="出版社">
			</div>
			
			<div class="form-group col-md-6 col-md-offset-3">
				<label for="picture">上传图片</label> <input type="file"
					id="picture">
			</div>
			
			<button type="submit"
				class="btn btn-success col-md-6 col-md-offset-3">提交</button>
		</form>
	</div>

</body>
</html>