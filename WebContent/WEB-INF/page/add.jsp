<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>添加学生帐户</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0"> 
  </head>
  
  <body>
  	<s:form action="manage_add" namespace="/" method="post">
  <div align="center">		姓名:<s:textfield name="employee.username"/><br/>
  		密码:<s:textfield name="employee.password"/><br/>
  		性别:<s:radio list="#{'Man':'男','Woman':'女'}" listKey="key" listValue="value" name="employee.gender"/>
  		<input type="submit" value="保存"/></div>	
  	</s:form>
  </body>
</html>
