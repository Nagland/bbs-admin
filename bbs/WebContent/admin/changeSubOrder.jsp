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
<title>栏目管理</title>
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
	<input id="forumId" value="<s:property value='forumId'/>" style="display:none">
	
	<div class="container-fluid">
		<div class="row-fluid">
			<jsp:include page="/admin/forumSidebar.jsp"></jsp:include>

			<div class="span9">
				<form class="form-horizontal" action="<%=basePath%>/admin/sub!list.action" method="post">  
           			 <fieldset>  
                <legend>调整子栏目顺序</legend>  
              
              	<div class="control-group">
            		<label class="control-label">栏目：</label>
            		<div class="controls docs-input-sizes fr">
             			
             		    <s:action name="forum!forumList" namespace="/admin" executeResult="true" />
             		    <button type="submit" class="btn btn-primary fr">查看</button> 
     			    </div>  
              	</div>  
            		</fieldset>  
       			</form>  	
			</div>
			
			<div class="span9">
			<s:if test="subforumList!=null">
				<table class="table  table-bordered" id="<s:property value='id'/>">
				<thead>
					<tr>
						<th class="span3">名称</th>
						<th class="span6">调整顺序</th>
					</tr>
				</thead>
				<tbody>
			<s:iterator value="subforumList">
				
					<tr id="<s:property value='id'/>">
						<td class="span3"><s:property value='name'/></td>
						<td class="span6">
					 <button class="btn btn-success mvtop">↑</button>
					 <button class="btn btn-info mvdown">↓</button></td>
					
					</tr>
				
				
		
			</s:iterator>
			</tbody>
			</table>
		</s:if>

		</div>
		</div>
	</div>

	<script type="text/javascript">
		$(function(){
			$('.nav-list li').eq(9).addClass('active');
			$('select').val($('#forumId').val());
			
		});
		
		function del_sure(){ 
			var gnl=confirm("你真的确定要删除吗?"); 
			if (gnl==true){ 
			return true; 
		}}; 
		
		function getRootPath(){
			var strFullPath=window.document.location.href;
			var strPath=window.document.location.pathname;
			var pos=strFullPath.indexOf(strPath);
			var prePath=strFullPath.substring(0,pos);
			var postPath=strPath.substring(0,strPath.substr(1).indexOf('/')+1);
			return(prePath+postPath);	
		}
	</script>
	
	<script type="text/javascript" src="<%=basePath%>/assets/admin/js/subOrder.js"></script>

</body>
</html>
