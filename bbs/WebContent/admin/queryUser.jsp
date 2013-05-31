<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath();
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户管理</title>
<link rel="stylesheet"
	href="<%=basePath%>/assets/admin/css/bootstrap.css" type="text/css"
	media="all">
<link rel="stylesheet"
	href="<%=basePath%>/assets/admin/css/paginate.style.css"
	type="text/css" media="all">


<style type="text/css">
body {
	padding-top: 60px;
	padding-bottom: 40px;
}

.sidebar-nav {
	padding: 9px 0;
}

@media ( max-width : 980px) { /* Enable use of floated navbar text */
	.navbar-text.pull-right {
		float: none;
		padding-left: 5px;
		padding-right: 5px;
	}
}
</style>
<script type="text/javascript"
	src="<%=basePath%>/assets/admin/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript"
	src="<%=basePath%>/assets/admin/js/jquery.paginate.js"></script>
<script type="text/javascript"
	src="<%=basePath%>/assets/admin/js/bootstrap.js"></script>


</head>
<body>
	<jsp:include page="/admin/header.jsp"></jsp:include>

	<div class="container-fluid">
		<div class="row-fluid">
			<jsp:include page="/admin/userSidebar.jsp"></jsp:include>


			<div class="span9">
				<form class="form-horizontal"
					action="<%=basePath%>/admin/user!search.action" method="post">
					<fieldset>
						<legend></legend>

						<div class="control-group">
							<label class="control-label">用户名：</label>
							<div class="controls docs-input-sizes fr">

								<input class="span6" id="userName" name="userName" type="text"
									value="<s:property value='userName'/>"> <input
									id="pageNum" name="pageNum" style="display: none"
									value="<s:property value='pageNum'/>">
								<button type="button" id="st" class="btn btn-primary fr">搜索</button>
							</div>

						</div>

					</fieldset>
				</form>

			</div>

			<div class="span9">
				<table class="table table-condensed">
					<thead>
						<tr>
							<th>用户名</th>
							<th>邮箱</th>
							<th>积分</th>
							<th>等级</th>
							<th>操作</th>
							<th>更改密码</th>
						</tr>
					</thead>

					<tbody>


						<s:iterator value="userList">
							<tr id="<s:property value ='id'/>">

								<td><s:property value="userName" /></td>
								<td><s:property value="email" /></td>

								<td><s:property value="score" /></td>
								<td><s:property value="currentLevel" />级</td>
								<td>
								<a class="update" href="<%=basePath%>/admin/user!edit.action?id=<s:property value="id"/>">修改</a>&nbsp;
								</td>
								<td>
								<a href="<%=basePath%>/admin/user!psedit.action?id=<s:property value="id"/>">更改密码</a>
								</td>

							</tr>
						</s:iterator>
					</tbody>
				</table>

				<s:if test="pageCount != null">
				<div class="pagination">
					<ul>


						<li><a href="javascript:void(0)">Prev</a></li>


						<s:bean name="org.apache.struts2.util.Counter" id="counter">
							<s:param name="first" value="1" />
							<s:param name="last" value="pageCount" />
							<s:iterator>
								<li class="changepage"><a ><s:property /></a></li>
							</s:iterator>
						</s:bean>
						<li><a href="javascript:void(0)">Next</a></li>

					</ul>
				</div>
				</s:if>

			</div>



		</div>
	</div>

	<script type="text/javascript">
		$(function(){
			
			$('.nav-list li').eq(1).addClass('active');
			$('.changepage').click(function(){
				var nowrow = $(this);
				var sn = nowrow.prevAll().length;
				$('#pageNum').val(sn);
				$('form').submit();
				
			});	
			
			var pageNum = $('#pageNum').val();
			$(".pagination li").eq(parseInt(pageNum)).addClass('disabled');
			
			$('#st').click(function(){
				$('#pageNum').val('1');
				$('form').submit();
			});
			
			
		});
	</script>
	
	<script type="text/javascript" src="<%=basePath%>/assets/admin/js/forumOrder.js"></script>

</body>
</html>
