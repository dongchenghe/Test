<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员主页</title>
</head>
<frameset rows="8%,*" border="1" id="frame_main">
	<frame src="${pageContext.request.contextPath}/dba/managerhead.jsp"
		scrolling="no" marginwidth="0" marginheight="0">
	</frame>
	<frameset cols="15%,*" style="color: Cornsilk;">
		<frame src="${pageContext.request.contextPath}/dba/left.jsp"
			marginwidth="0" marginheight="0">
		</frame>
		<frame
			src="${pageContext.request.contextPath}/ManagerGoodsServlet?checked=all"
			name="rightframe">
		</frame>
	</frameset>
</frameset>
<body>
</body>
</html>