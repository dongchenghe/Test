<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head> 
    <title>My JSP 'jsdemo.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  <body>
  </body>
  
  <script>
  	function Polygon(isSides){//多边形
  		this.isSides = isSides;
  	}
	Polygon.prototype.GetArea = function(){
		return 0;
	}  
	function Triangle(iBase,iHeight){
		this.iBase = iBase;
		this.iHeight = iHeight;
	}
	Triangle.prototype = new Polygon(3);
	Triangle.prototype.GetArea= function(){
		return 0.5*this.iBase*this.iHeight;
	}
	function Rectangle(Iwidth,Iheight){
		this.Iwidth = Iwidth;
		this.Iheight = Iheight; 
	}
	Rectangle.prototype = new Polygon(4);
	Rectangle.prototype.GetArea = function(){
		return this.Iheight*this.Iwidth;
	}
	/* var san = new Triangle(55, 33);
	var zheng = new Rectangle(55, 66);
	alert(san.isSides+"边形,面积是"+san.GetArea());
	alert(zheng.isSides+"边形,面积是"+zheng.GetArea()); */
	function Circular (Irai){
		this.Irai = Irai;
	}
	Circular.prototype = new Rectangle(5, 6);
	Circular.prototype.GetArea = function(){
		return this.Irai*this.Irai;
	}
	var cri = new Circular(10);
	alert(cri.isSides);
	alert(cri.GetArea());
  </script>
</html>
