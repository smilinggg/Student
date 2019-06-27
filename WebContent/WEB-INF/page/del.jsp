<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>删除学生帐户</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0"> 
  </head>
  
  <body>
  <table border="0" align="center">
  	<s:form action="manage_delete" namespace="/" method="post">
  	<tr><th align="left">ID&nbsp; &nbsp; :  ${ employee.id }  <input type="hidden" value=${ employee.id } name="employee.id" ></th></tr>
  	<tr>	<th>姓名:<input type="text" value=${ employee.username } disabled="disabled">
  		<input type="hidden" value=${ employee.username } name="employee.username" ></th></tr>
  	<tr>	<th>密码:<input type="text" value=${ employee.password } disabled="disabled">
  		<input type="hidden" value=${ employee.password } name="employee.password"/></th></tr>
  	<tr>	<th align="left">性别:<s:radio list="#{'Man':'男','Woman':'女'}" listKey="key" listValue="value" name="employee.gender" disabled="true"/></th></tr>
  	<tr>	<th>	<input type="submit" value="确定"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="button"  value="取消"  onclick="location='list.action'"></th></tr>
  	</s:form>
  	</table>
</body>
</html>
