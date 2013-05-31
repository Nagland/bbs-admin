<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath();
%>

<div class="span3">
				<div class="well sidebar-nav">
					<ul class="nav nav-list">
						<li class="nav-header"></li>
						<li><a href="<%=basePath%>/admin/forum!load.action">查看栏目</a></li>
						<li><a href="<%=basePath%>/admin/addForum.jsp">新增栏目</a></li>
						<li><a href="javascript:void(0)">修改栏目</a></li>
						<li><a href="<%=basePath%>/admin/forum!changeOrder.action">修改栏目顺序</a></li>
						<li class="divider"></li>
						<li><a href="<%=basePath%>/admin/querySub.jsp">查看子栏目</a></li>
						<li><a href="<%=basePath%>/admin/addSubforum.jsp">新增子栏目</a></li>
						<li><a href="javascript:void(0)">修改子栏目</a></li>
						<li><a href="<%=basePath%>/admin/changeSubOrder.jsp">修改子栏目顺序</a></li>
					</ul>
				</div>
</div>