<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath();
%>

<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container-fluid">
				<button type="button" class="btn btn-navbar" data-toggle="collapse"
					data-target=".nav-collapse">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="brand" href="#">BBS后台管理</a>
				<div class="nav-collapse collapse">
					<ul class="nav">
						<li><a href="<%=basePath%>/admin/user!search.action">用户管理</a></li>
						<li><a href="<%=basePath%>/admin/forum!load.action">栏目管理</a></li>
					</ul>
					<ul class="nav pull-right">
						<li><a href="<%=basePath%>/admin/login!logout.action">退出</a></li>

					</ul>
				</div>
			</div>
		</div>
	</div>