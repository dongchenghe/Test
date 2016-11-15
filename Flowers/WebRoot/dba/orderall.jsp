<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 	<%-- <link type="text/css" rel="stylesheet" href="../css/easyui.css" >
	<script type="text/javascript" src="../js/jquery.min.js"></script>
	<script type="text/javascript" src="../js/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="../js/easyui-lang-zh_CN.js"></script> --%>
</head>
<body style="font-family: 微软雅黑" bgcolor="#F7F8F9">
<script>
	function updateProduct() {
		var row = $("#orderalldg").datagrid("getSelected"); //获取选中行数据
		if(row) {
			$("#frm").form("clear");
			$("#frm").form("load", row); //将行数据加载到表单的每一个input元素中(要求是input元素的名称必须和row对象的属性相同)
			$("#dlg").dialog("open");
		}
	}
	function allorderfun1(){
		$("#orderalldg").datagrid({
	    url:"dbaOderAction?checked=all",
	    onDblClickRow: function(index,row) {
   			var row = $("#orderalldg").datagrid("getSelected"); //获取选中行数据
			if(row) {
				$("#frm").form("clear");
				$("#frm").form("load", row); //将行数据加载到表单的每一个input元素中(要求是input元素的名称必须和row对象的属性相同)
				$("#dlg").dialog("open");
			}
		},
	    columns:[[
	        {field:'order_id',title:'订单编号'},
	        {field:'user_id',title:'用户id'},
	        {field:'order_date',title:'下单日期'/* ,formatter: function(value,row,index){
				  var time;
				  for(var i in value){
                        time.append(toDate(data[i].arrDate,"yyyy-MM-dd"));
                    }
                    return time;
			} */},
	        {field:'pay_date',title:'支付日期'},
	        {field:'order_state',title:'订单状态'},
	        {field:'deliver_date',title:'送货日期'},
	        {field:'receive_name',title:'收货人姓名'},
	        {field:'receive_addr',title:'收货人地址'},
	        {field:'receive_phone',title:'收货人电话'},
	    ]]
	});
	}
</script>
<div style = "text-align: center">
	<!-- <input id="orderclsall" type="button" value="刷新" onclick="allorderfun1()"> -->
	<div id="orderalltoolbar">
		<a id="orderclsall" href="javascript:void(0)" class="easyui-linkbutton" onclick="allorderfun1()">刷新</a>
	</div>
	<table id = "orderalldg" class="easyui-datagrid" data-options="singleSelect:true" toolbar="#orderalltoolbar">
	</table>
</div>
<!-- 定义对话框中的按钮 -->
	<div id="mybuttons">
		<a href="javascript:void(0)" class="easyui-linkbutton" style="width:100px" onclick="">保存</a>
		<a href="javascript:void(0)" class="easyui-linkbutton" style="width:100px" onclick="$('#dlg').dialog('close')">取消</a>
	</div>
	
<div id="dlg" class="easyui-dialog" style="width:600px; height:400px" title="商品编辑" buttons="#mybuttons" closed="true">
		<form id="frm">
			<table>
				<tr>
					<td>订单编号:</td>
					<td><input name="order_id" class="easyui-textbox" style="width:500px"></td>
				</tr>
				<tr>
					<td>用户id:</td>
					<td><input name="user_id" class="easyui-textbox"  style="width:500px"></td>
				</tr>
				<tr>
					<td>下单日期:</td>
					<td><input name="order_date" class="easyui-validatebox" style="width:500px"></td>
				</tr>
				<tr>
					<td>支付日期:</td>
					<td><input name="pay_date" class="easyui-textbox"></td>
				</tr>
				<tr>
					<td>订单状态:</td>
					<td><input name="order_state" class="easyui-textbox"></td>
				</tr>
				<tr>
					<td>送货日期:</td>
					<td><input name="deliver_date" class="easyui-textbox"></td>
				</tr>
				<tr>
					<td>收货人姓名</td>
					<td><input name="receive_name" class="easyui-textbox"></td>
				</tr>
				<tr>
					<td>收货人地址</td>
					<td><input name="receive_addr" class="easyui-textbox"></td>
				</tr>
				<tr>
					<td>收货人电话</td>
					<td><input name="receive_phone" class="easyui-textbox"></td>
				</tr>
				<tr>
					<td>寄语</td>
					<td><input name="order_message" class="easyui-textbox"></td>
				</tr>
			</table>
		</form>
	</div>
<script type="text/javascript">
		$("#orderclsall").click();
		$("#dlg").dialog({closed:'true'});
		//$("#dlg").dialog("close"); //默认让对话框隐藏
</script>
</body>
</html>