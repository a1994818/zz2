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
    
    <title>图书与作者详细信息</title>
    
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
     author information：<br>
   <table border="1" width="100%">
   <tr>
   		<td>authorID</td>
   		<td>name</td>
   		<td>age</td>
   		<td>book</td>
   </tr>
   
   <s:iterator value="list" status="st">
   <tr>
   		<td><s:property value = "authorID"/> </td>
   		<td><s:property value = "name"/> </td>
   		<td><s:property value = "age"/> </td>
   		<td><s:property value = "country"/> </td>
    </tr>
   </s:iterator>
   </table>
  book information：
  <table border="1" width="100%">
  	<tr>
  		<td>ISBN</td>
  		<td>title</td>
  		<td>author</td>
  		<td>publisher</td>
  		<td>publishDate</td>
  		<td>price</td>
  	<s:iterator value="bookList" status="st">
   <tr>
   		<td><s:property value = "ISBN"/> </td>
   		<td><s:property value = "title"/> </td>
   		<td><s:property value = "author"/> </td>
   		<td><s:property value = "publisher"/> </td>
   		<td><s:property value = "publishDate"/> </td>
   		<td><s:property value = "price"/> </td>
    </tr>
   </s:iterator>
  		
  	</tr>
  </table>
  </body>
</html>
