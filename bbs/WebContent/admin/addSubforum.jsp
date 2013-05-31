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
	<div class="container-fluid">
		<div class="row-fluid">
			
			<jsp:include page="/admin/forumSidebar.jsp"></jsp:include>

			

			<div class="span9">
			
				<form class="form-horizontal" action="<%=basePath%>/admin/sub!add.action" method="post">  
            <fieldset>  
                <legend>新增子栏目</legend>  
              
                <div class="control-group">
            		<label class="control-label">名称：</label>
            		<div class="controls docs-input-sizes fr">
             			
             		     <input class="span6" id="name"  name="name"
								type="text" placeholder="">
                         <button type="submit" class="btn btn-primary fr">提交</button> 
     			    </div>
     			   
              	</div>
              	
              	<div class="control-group">
            		<label class="control-label">栏目：</label>
            		<div class="controls docs-input-sizes fr">
             			
             		    <s:action name="forum!forumList" namespace="/admin" executeResult="true" />
     			    </div>
     			   
              	</div>
             
              <div class="control-group">
            		<label class="control-label">版主：</label>
            		<div class="controls docs-input-sizes fr">
             			
             		     <input class="span6" id="moderato"  name="moderato"
								type="text" placeholder="">
                       
     			    </div>
     			   
              	</div>
              	
              	 <div class="control-group">
            		<label class="control-label">描述：</label>
            		<div class="controls docs-input-sizes fr">
             			
             		     <textarea class="span6" id="description" name="description" 
								type="text" rows="9"></textarea>
                          
     			    </div>
              </div>
              	
              	 <div class="control-group">
            		<label class="control-label">回复等级：</label>
            		<div class="controls docs-input-sizes fr">
             			
             		     <input class="span6" id="replyLevel"  name="replyLevel"
								type="text" placeholder="必须为数字">
                    
     			    </div>
     			   
              	</div>
              	 <div class="control-group">
            		<label class="control-label">发帖等级：</label>
            		<div class="controls docs-input-sizes fr">
             			
             		     <input class="span6" id="postLevel"  name="postLevel"
								type="text" placeholder="必须为数字">
                  
     			    </div>
     			   
              	</div>
              	
              	 <div class="control-group">
            		<label class="control-label">浏览等级：</label>
            		<div class="controls docs-input-sizes fr">
             			
             		     <input class="span6" id="scanLevele"  name="scanLevel"
								type="text" placeholder="必须为数字">
                  
     			    </div>
     			   
              	</div>
              
            
              
             
                  
            </fieldset>  
        </form>  
			
			</div>



		</div>
	</div>

	<script type="text/javascript">
		$(function(){
			$('.nav-list li').eq(7).addClass('active');
		})
	</script>

</body>
</html>
