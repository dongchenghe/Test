<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员登录</title>
</head>
<script src="../js/jquery-2.2.4.min.js" type="text/javascript"></script>
<script src="../js/layer/layer.js" type="text/javascript"></script>
<link type="text/css" rel="stylesheet" href="../css/mainlogin.css" />
<script type="text/javascript">
	function testManager(){
		if($("#name").prop("value")==""){
			layer.msg("用户名不能为空");
			return false ;
		}
		if($("#pwd").prop("value")==""){
			layer.msg("密码不能为空");
			return false ;
		}
		$.ajax({
			url:"dbaloginAction",
			data:"&dba_name="+$("#name").prop("value")+"&dba_pwd="+$("#pwd").prop("value"),
			dataType:"text", 
			success: function(data){
				var arr = eval("("+data+")");
				if(arr.managerlogin=="false"){
					layer.msg("用户名或密码错误");
					return false;
				}
				if(arr.managerlogin=="ok"){
					$("#tijiao").submit();
				}
			}
		});
	}
</script>
<body oncontextmenu="return false">
	<div style="margin: 120px auto 0 auto;">
		<h1>鲜花网内部网</h1>
		<form id="tijiao" action="../manindex.jsp" method="post">
			<div>
				<input id = "name" type="text" name="username" class="username"
					placeholder="员工名" autocomplete="off" />
			</div>
			<div>
				<input id = "pwd" type="password" name="password" class="password"
					placeholder="密码" oncontextmenu="return false"
					onpaste="return false" />
			</div>
			<button id="sub" type="button" onclick="testManager()">登录</button>
		</form>
	</div>
</body>
</html>