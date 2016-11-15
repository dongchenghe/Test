<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>管理员界面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link type="text/css" rel="stylesheet" href="css/easyui.css" >
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="js/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="js/easyui-lang-zh_CN.js"></script>

  </head>
  
  <body>
    <div class="easyui-layout" style="width:100%;height:700px">
		<div data-options="region:'north'" style="width:100%; height:80px">
			<h2>鲜花网管理界面</h2>
		</div>
		<div data-options="region:'west',split:true" title="West" style="width:20%;">
			<div id="menu" class="easyui-tree">
			</div>
			<script>
				$("#menu").tree({
					url:"dbaMenuAction",
					onClick:function(node){
						if(!node.children||node.children==""){
							openTab(node);
						}else{
							$("#tt").tree('collapse',node.target);
						}
					}
				});
				function openTab(node){
					if($("#tt").tabs("exists",node.text)){
						$("#tt").tabs("select",node.text);
					}else{
						$("#tt").tabs("add",{
						title:node.text,
						href:node.path,
						closable:true
					});
					}
				}
			</script>
		</div>
		<div data-options="region:'center',title:'Main Title'" style="background:#fafafa; width:78%">
			<div id="tt" class="easyui-tabs" style="width:100%;height:100%;">
			    <div title="欢迎页面" style="padding:20px;display:none" closable="true">
			        你好呀
			    </div>
			</div>
		</div>
	</div>
  </body>
</html>
