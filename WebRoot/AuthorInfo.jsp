<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>	

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>AuthorInfo</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    
 <form action="http://172.17.20.56:8080/library/" method="post">
      		<input type="submit" value="Back Homepage"/>
   		</form>
   <table border="1" width="100%">
   <tr>
   	<td><h1>title</h1></td><td><h1>function</h1></td>
   	<td>  </td>
   </tr>
    <s:iterator value="bookList" status="st">
    <tr>
      <td> <a href="author?title=<s:property value="title"/> " >
      <s:property value = "title"/></a></td> 
      <td><a href="Delete?title=<s:property value="title"/> " >delete</a></td>
    </tr>
    </s:iterator>
    </table>
  </body>
</html>
