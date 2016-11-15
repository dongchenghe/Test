<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<style>
.table{font-size: 15px;border-width: 1px;border-collapse: collapse;}
.table th{border-width:1px;border-style: solid;background-color:LightGray;height:30px;}
.table tr{background-color:AliceBlue;}
.table td{border-width: 1px;border-style:solid;height:20px;}
</style>
<body style="font-family: 微软雅黑" bgcolor="#F7F8F9">
<center>
	<h2>所有的订单信息</h2>
	<table class="table">
		<tr>
		<th>订单编号</th>
		<th>用户id</th>
		<th>下单日期</th>
		<th>支付日期</th>
		<th>订单状态</th>
		<th>送货日期</th>
		<th>收货人姓名</th>
		<th>收货人地址</th>
		<th>收货人电话</th>
		<c:if test="${state=='未发货'}">
		<th>操作</th>
		</c:if>
		<th>详细信息</th>
		</tr>	
		<c:forEach items="${orders}" var="dd" varStatus="i" >
			<c:choose>
			<c:when test="${dd.order_state=='未发货'}">
				<tr style="background: #FF6700">
			</c:when>
			<c:otherwise>
				<tr>
			</c:otherwise>
			</c:choose>
				<td>${dd.order_id}</td>
				<td>${dd.user_id}</td>
				<td>${dd.order_date}</td>
				<td>${dd.pay_date}</td>
				<td>${dd.order_state}</td>
				<td>${dd.deliver_date}</td>
				<td>${dd.receive_name}</td>
				<td>${dd.receive_addr}</td>
				<td>${dd.receive_phone}</td>
				<c:if test="${state=='未发货'}">
					<td>
						<input type = "button" value = "发货" onclick = "javascript:fahuo(${dd.order_id})"/>
					</td>
				</c:if>
				<td>
					<input type = "button" value = "查看"/>
				</td>
			</tr>
		</c:forEach>
	</table>
	</center>
</body>
<script type="text/javascript">
function createXMLHttpRequest(){           // 创建XMLHttpRequest对象
	if(window.ActiveXObject){             // 判断是否是IE内核的浏览器
		xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");  // 创建适用于IE内核的XMLRequest的对象
	}else if(window.XMLHttpRequest){     // 判断是否是FireFox内核的浏览器
		xmlHttp = new XMLHttpRequest();    // 创建适用于IE内核的XMLRequest的对象
	}
}
createXMLHttpRequest(); 
function fahuo(order){
	var user_order = order;
	xmlHttp.open("POST", "../AjaxUserOrderSet?user_order="+user_order+"&cao=fahuo", true);
	xmlHttp.setRequestHeader("Context-Type", "application/x-www-form-urlencoded");
	// 服务器返回消息
	xmlHttp.onreadystatechange = function (){
		if(xmlHttp.readyState==4){   
			if(xmlHttp.status==200){
				window.location.href="../ManageOrdersServlet?checked="; 
			}
		}
	}
	xmlHttp.send();
}
</script>
</html>