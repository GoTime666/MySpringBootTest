<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册</title>
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
		<form action="/index" method="post">

			<div class="col-md-6 col-md-offset-3">
				<div class="row">
					<h1 align="center">登录</h1>
				</div>
			</div>
			<div class="form-group col-md-6 col-md-offset-3">
				<label for="inputEmail">邮箱</label> <input type="email"
					class="form-control" id="inputEmail" placeholder="Email">
			</div>

			<div class="form-group col-md-6 col-md-offset-3">
				<label for="inputPassword">密码</label> <input type="password"
					class="form-control" id="inputPassword" placeholder="Password">
			</div>

			
			<button type="submit"
				class="btn btn-success col-md-6 col-md-offset-3">登录</button>
		</form>
	</div>

</body>
</html>