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
              <li><a href="<%=basePath%>/admin/user!search.action">查询用户</a></li>
              <li><a href="<%=basePath%>/admin/addUser.jsp">增加用户</a></li>
              <li><a href="javascript:void(0)">修改用户</a></li>
              <li><a href="javascript:void(0)">更改密码</a></li>
            </ul>
          </div>
</div>