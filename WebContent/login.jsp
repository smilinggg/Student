<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>欢迎登录学生信息管理系统</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
</head>

<body>
 <div align="center">${message}</div>
<form action="${pageContext.request.contextPath }/login_lg.action" method="post">
<div align="center">姓名:<input type="text" name="username"/><br/>
  	密码:<input type="text" name="password"/><br/>
  	<input type="submit" value="登录" />
  	<input type="button" onclick="location='manage_addUI.action'" value="注册"/></div>	
  	</form>
</body>
</html>
