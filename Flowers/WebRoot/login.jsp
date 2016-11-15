<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ page errorPage="serverErrorPage.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>鲜花网登录页面</title>
	<script src="js/jquery-2.2.4.min.js" type="text/javascript" charset="utf-8"></script>
	<script src="js/layer/layer.js" type="text/javascript"></script>
	<link type="text/css" rel="stylesheet" href="css/denglu.css" />
</head>
<script type="text/javascript">
	function isName(){
		var name = $("input[name='username']");
		if(name.prop("value")==""){
			return false;
		}
		return true;
	}
	function isPwd(){
		var password = $("input[name='password']");
		if(password.prop("value")==""){
			return false;
		}
		return true;
	}
	function testName(name){
		 if(name==""){
			 document.getElementById("spanname").innerHTML = "用户名不能为空";
		 }else{
			 document.getElementById("spanname").innerHTML = "";
		 }
	}
	function testPwd(pwd){
		 if(pwd==""){
			 document.getElementById("spanpwd").innerHTML = "密码不能为空";
		 }else{
			 document.getElementById("spanpwd").innerHTML = "";
		 }
	}
	function writeFlag(){
	var der = false;//ajax验证有无错误
		if(!isName()){
			document.getElementById("spanname").innerHTML = "用户名不能为空";
			return false;
		}
		if(!isPwd()){
			document.getElementById("spanpwd").innerHTML = "密码不能为空";
			return false;
		}
		$.ajax({
			url:"loginAction",
			async:false,
			data:"&name="+$("input[name='username']").prop("value")+"&pwd="+$("input[name='password']").prop("value"),
			dataType:"text", 
			success:function(json){
				var arr = eval("("+json+")");
				if(arr.result=="nameError"){
					layer.msg("用户名不存在，请重新输入")
					$("#name").focus();
					$("#name").select();
					return 0;
				}
				if(arr.result=="pwdError"){
					layer.msg("密码错误，请重新输入");
					$("#pwd").focus();
					$("#pwd").select();
					return 0;
				}
				der = true;
			},
		});
		if(der){return true;}
		return false;
	}
</script>
<body  style="font-family: '微软雅黑';">
<div style="background:#CCFFCC; width:100%">
			<div style="width:100%; background:#F2F2F2">
				<div class="top">
					<div class="top-left">
						<a name="top">欢迎来到鲜花网</a>
						<span>|</span>
						<c:choose>
						<c:when test="${empty sessionScope.user}">
							<a class="top-lefta" href="${pageContext.request.contextPath}/login.jsp">登录</a>
	   					 <span>|</span>
	   						<a class="top-lefta" href = "${pageContext.request.contextPath}/register.jsp">快速注册</a>
						</c:when>
						<c:otherwise>
							<a class="top-lefta" href = #">${sessionScope.user.user_name}</a>
						<span>|</span>
							<a class="top-lefta" href = "ResetServlet">注销</a>
						</c:otherwise>
						</c:choose>
						<span>|</span>
						<a style="font-size:17px; text-decoration:none;">送至</a>
						<select style="width:60px; height:35px; font-size:18px;	">
							<option>湖南</option>
							<option>广东</option>
							<option>广西</option>
							<option>北京</option>
							<option>上海</option>
							<option>深圳</option>
						</select>
						<span>|</span>
					</div>
					<div class="top-right">
						<a href="#">服务保证</a>
						<span>|</span>
						<a href="#" class="top-lefta">收藏的鲜花</a>
						<span>|</span>
						<a href="#" class="top-lefta">个人中心</a>
						<span>|</span>
						<a href="shopingCar.jsp" class="top-lefta">我的花篮</a>
					</div>
				</div>
			</div>
        <div id="mian">
        	<div class="top1">
            	<div class="top1-1">
                	<a href="./"><img src="images/tubiao.png" height="80px" width="200px"/></a>
                </div>
                <div class="top1-2">
                	<ul class="topul">
                    	<li class="topli"><a href="./">首页</a></li>
                    </ul>
                </div>
            </div>
            <div class="center">
            	<div class="left">
                	<img src="images/zhuceleft.png" width="590" height="260" style=" margin-top:40px;" />
                </div>
                <div class="right">
                	<div class="right1">
                	  <ul style="list-style:none;padding-left: 10px;">
                      <li><div><font color="#660099" size="+1">会员登录</div></li>
                      <form action = "indexAction" onsubmit="return writeFlag();" method="post">
                          <li>
                           	  <div class="right1div">
                               	  用户名:&nbsp;<input id="name" class="input" type = "text" name = "username" onblur="testName(this.value)" value="${param.username}" />
                               	  <span id = "spanname" style ="font-size: 1px;color: red"></span>
                              </div>
                          </li>
                          <li>
                           	  <div class="right1div">
                               	  密&nbsp;&nbsp;&nbsp;码:&nbsp;<input id="pwd" class="input" type = "password" name = "password" onblur="testPwd(this.value)"/>
                              	<span id = "spanpwd" style ="font-size: 1px;color: red"></span>
                              </div>
                          </li>
                          <li>
                           	  <div class="right1div1" style ="margin-right: 50px;">
                               	  <input type="checkbox" /> 记住密码 <input type="checkbox" /> 自动登录
                              </div>
                          </li>
                          <span id="yant" style ="font-size: 1px;color: red">&nbsp;${erro}</span>
                          <li>
                       		 <div class="right1div1">
                               	  <input class="divbutton" type="submit" name="jijiao" value="登录" />
                               	  <input class = "divbutton" type = "button" value = "注册" onclick="location.href='register.jsp'"/>
                             </div>
                          </li>
                          </form>
                        </ul>
                    </div>
                </div>
                <a style="float: right;margin-top: 50px;margin-right: 5px;" href="dba/managerLogin.jsp">管理员入口</a>
            </div>
          
            <!--底部-->
            <div class="dip">
            	<table bgcolor="#FFFFFF" height="100px" width="1200px" cellspacing="0" class="o">
                    <tr style="font-weight:bolder;">
                        <td><a href="#">新手指南</a></td>
                        <td><a href="#">贺卡服务</a></td>
                        <td><a href="#">全国配送服务</a></td>
                        <td><a href="#">支付与查询</a></td>
                        <td><a href="#">售后保障</a></td>
                        <td rowspan="3" width="150px">您有任何疑问，请拨打全国统一热线(免长途费)或联系 网页客服 </td>
                    </tr>
                    <tr>
                        <td><a href="#">玫瑰支数详细寓意</a></td>
                        <td><a href="#">星座、巧克力、爱情</a></td>
                        <td><a href="#">配送服务说明</a></td>
                        <td><a href="#">发票及支付方式</a></td>
                        <td><a href="#">鲜花绿植先行赔付</a></td>
                    </tr>
                    <tr>
                        <td><a href="#">送花技巧</a></td>
                        <td><a href="#">送花祝福语大全</a></td>
                        <td><a href="#">全国城郊配送查询</a></td>
                        <td><a href="#">如何查询订单</a></td>
                        <td><a href="#">订购必读</a></td>
                    </tr>
                </table>
            </div>
        </div>
    </div>
</body>
</html>