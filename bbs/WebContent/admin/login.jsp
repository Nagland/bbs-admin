<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath();
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台登陆</title>
	<link rel="stylesheet" href="<%=basePath%>/assets/admin/css/bootstrap.css" type="text/css" media="all">
	<script type="text/javascript" src="<%=basePath%>/assets/admin/js/jquery-1.9.1.min.js"></script>
 	<script type="text/javascript" src="<%=basePath%>/assets/admin/js/bootstrap.js"></script>
 	<style>

 	
 	</style>
</head>
<body>
  <div class="container" style="margin-top:100px">
  
  <div class="span9">
       <form class="form well" style="width:220px;margin:0px auto;" action="<%=basePath%>/admin/login!signin.action" method="post">
       <h4>论坛系统后台登陆</h4>
       <hr>
  			<div class="control-group">
   				 <label class="control-label" for="inputEmail">账号</label>
    				<div class="controls">
     			 		<input type="text" id="userName" name="adminName" placeholder="">
   				 	</div>
  			</div>
 			<div class="control-group">
    			<label class="control-label" for="inputPassword">密码</label>
    				<div class="controls">
     			 		<input type="password" id="inputPassword" name="password" placeholder="">
     			 		<button type="submit" class="btn btn-primary">登陆系统</button>
    				</div>
  			</div>
		</form>
	</div>
  </div> 
   
</body>
</html>