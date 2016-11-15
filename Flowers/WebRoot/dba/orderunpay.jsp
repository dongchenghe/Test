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
		var row = $("#orderunpaydg").datagrid("getSelected"); //获取选中行数据
		if(row) {
			$("#frm").form("clear");
			$("#frm").form("load", row); //将行数据加载到表单的每一个input元素中(要求是input元素的名称必须和row对象的属性相同)
			$("#dlg").dialog("open");
		}
	}
	function unpayorderfun1(){
		$("#orderunpaydg").datagrid({
	    url:"dbaOderAction?checked=unpay",
	    onDblClickRow: function(index,row) {
   			var row = $("#orderunpaydg").datagrid("getSelected"); //获取选中行数据
			if(row) {
				$("#frm").form("clear");
				$("#frm").form("load", row); //将行数据加载到表单的每一个input元素中(要求是input元素的名称必须和row对象的属性相同)
				$("#dlg").dialog("open");
			}
		},
	    columns:[[
	        {field:'order_id',title:'订单编号'},
	        {field:'user_id',title:'用户id'},
	        {field:'order_date',title:'下单日期'},
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
	<div id="orderunpaytoolbar">
		<a id="orderclsunpay" href="javascript:void(0)" class="easyui-linkbutton" onclick="unpayorderfun1()">刷新</a>
	</div>
	<table id = "orderunpaydg" class="easyui-datagrid" data-options="singleSelect:true" toolbar="#orderunpaytoolbar">
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
					<td>商品名称:</td>
					<td><input name="name" class="easyui-textbox" style="width:500px"></td>
				</tr>
				<tr>
					<td>商品类型:</td>
					<td><input name="type" class="easyui-textbox"  style="width:500px"></td>
				</tr>
				<tr>
					<td>商品介绍:</td>
					<td><input name="details" class="easyui-validatebox" style="width:500px"></td>
				</tr>
				<tr>
					<td>商品原价:</td>
					<td><input name="goods_old_price" class="easyui-textbox"></td>
				</tr>
				<tr>
					<td>订购价:</td>
					<td><input name="price" class="easyui-textbox"></td>
				</tr>
				<tr>
					<td>商品库存:</td>
					<td><input name="store_amount" class="easyui-textbox"></td>
				</tr>
				<tr>
					<td>状态:</td>
					<td><input name="state" class="easyui-textbox"></td>
				</tr>
			</table>
		</form>
	</div>
<script type="text/javascript">
		$("#orderclsunpay").click();
		$("#dlg").dialog({closed:'true'});
		//$("#dlg").dialog("close"); //默认让对话框隐藏
</script>
</body>
</html>