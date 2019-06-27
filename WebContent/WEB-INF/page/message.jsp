<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head> 
    <title>操作结果信息</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">  
  </head>
  
  <body>
   <h2 align="center"><font color="red"> <s:property value="#request.message"/> </font></h2>
   <h4 align="center">浏览器将在3秒后自动跳转到列表页...</h4>
    <script>
function e()
{
location.href="list.action";
}
setTimeout("e()",3000);//设置等待时间
</script>
  </body>
</html>