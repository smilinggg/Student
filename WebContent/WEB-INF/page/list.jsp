<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>学生帐户列表</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0"> 
  </head>
  
  <body><!-- 
   ONGL:
   <br/>
   <s:iterator value="#request.employees">
   	<s:property value="username"/> ,<s:property value="password"/>, <s:property value="gender"/><br/>
   </s:iterator>
    -->

 <!--  JSTL/EL: --> 
 <h2 align="center">欢迎登录学生信息管理系统</h2>

<table border="1" align="center">
   
    <tr>
    <td width="100" align="center">姓名</td>
   <td width="100" align="center">密码</td>
   <td width="100" align="center">性别</td>
   <td width="100" align="center">操作</td>
    </tr>
    <c:forEach items="${employees}" var="employee">
  <tr>
  <td width="100" align="center"> ${employee.username}</td>
   <td width="100" align="center"> ${employee.password}</td>
   <td width="100" align="center">   ${employee.gender}</td>
   	<td width="100" align="center"><a href="manage_deleteUI.action?employee.id=${employee.id}">删除</a>
   	<a href="manage_updateUI.action?employee.id=${employee.id}">更新</a></td></tr>
   </c:forEach>
   <tr>
   <td colspan="1" align="center"><input type="button"  value="添加"  onclick="location='manage_addUI.action'"></td>
    <td colspan="2" align="center"><input type="button"  value="清空信息"  onclick="location='list_del.action'"></td>
   <td colspan="2" align="center"><input type="button"  value="注销"  onclick="location.href='login.jsp'"></td></tr>
   </table>
  </body>
</html>