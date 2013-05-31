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
	<link rel="stylesheet" href="<%=basePath%>/assets/admin/css/bootstrap.css" type="text/css" media="all">
	   <style type="text/css">
      body {
        padding-top: 60px;
        padding-bottom: 40px;
      }
      .sidebar-nav {
        padding: 9px 0;
      }

      @media (max-width: 980px) {
        /* Enable use of floated navbar text */
        .navbar-text.pull-right {
          float: none;
          padding-left: 5px;
          padding-right: 5px;
        }
      }
    </style>
    <script type="text/javascript" src="<%=basePath%>/assets/admin/js/jquery-1.9.1.min.js"></script>
 	<script type="text/javascript" src="<%=basePath%>/assets/admin/js/bootstrap.js"></script>
 	
</head>
<body>

 	<jsp:include page="/admin/header.jsp"></jsp:include>
    
     <div class="container-fluid">
      <div class="row-fluid">
      <jsp:include page="/admin/userSidebar.jsp"></jsp:include>
       
        
        
        <div class="span9">
           <form id="psform" class="form-horizontal" action="<%=basePath%>/admin/user!changeps.action" method="post">  
           <input name="id" style="display:none" value="<s:property value='singleUser.id'/>" />
           
            <fieldset>  
                <legend><s:property value="singleUser.userName"/>-----更改密码</legend>  
              
                <div class="control-group">
            		<label class="control-label">新的密码：</label>
            		<div class="controls docs-input-sizes fr">
             			
             		     <input class="span6" id="password"  name="password"
								type="password" />   
     			    </div>
     			   
              </div>
            
          
              
              <div class="control-group">
            		<label class="control-label">重新输入：</label>
            		<div class="controls docs-input-sizes fr">
             			
             		     <input class="span6" id="rPassword"
								type="password" >
                         <button id="sb" type="button" class="btn btn-primary fr">修改</button>  
     			    </div>
     			   
              </div>
                  
            </fieldset>  
        </form>  
          
        </div>
        
        <div class="span6 offset3">
        	
        
        </div>
        
      </div>
    </div>
  
     
     <script>
    	$(function(){
    		$('.nav-list li').eq(4).addClass('active');
    		$('#sb').click(function(){
    			var p1 = $('#password').val();
    			var p2 = $('#rPassword').val();
    			
    			if(p1 != p2) {
    				alert('两次输入不相等')
    			} else {
    				$('#psform').submit();
    			}
    		})
    	});
     </script>
</body>
</html>
