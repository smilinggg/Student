<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>更新学生信息</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0"> 
  </head>
  
  <body>
  <table border="0" align="center">
  	<s:form action="manage_update" namespace="/" method="post">
  		ID&nbsp; :  ${ employee.id }  <input type="hidden" value=${ employee.id } name="employee.id" ><br/>
  		姓名:<input type="text" value=${ employee.username } name="employee.username"><br/>
  		密码:<input type="text" value=${ employee.password } name="employee.password"><br/>
  		性别:<s:radio list="#{'男':'男','女':'女'}" listKey="key" listValue="value" name="employee.gender"/>
  		<input type="submit" value="提交"/>
  	</s:form>
  </table>
  </body>
</html>
