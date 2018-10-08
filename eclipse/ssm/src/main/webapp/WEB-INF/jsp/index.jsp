<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE>
<html>
  <head>
  </head>
  <body>
  <form action="${pageContext.request.contextPath}/selectById2" method="post">
                        编号:<input name="id"/> 
          <input type="submit" value="查询"/>
    </form>
  <form action="listByName" method="post">
                        姓名:<input name="name"/> 
          <input type="submit" value="查询"/>
    </form>
    <a href="add.jsp">添加学生</a><br>
    <table border="1" width="100%">
    	<tr>
    	    <th>id</th>
    		<th>stuno</th>
    		<th>name</th>
    		<th>age</th>
    		<th>gender</th>
    		<th>操作</th>
    	</tr>
    	<c:forEach items="${list }" var="a">
    	<tr>
    	    <td>${a.id }</td>
    		<td>${a.stuno }</td>
    		<td>${a.name }</td>
    		<td>${a.age }</td>
    		<td>${a.gender }</td>
    		<td> 
    		<form action="studentDel" method="post">
    		<input name="id" value="${a.id }" hidden>
    		<input type="submit" value="删除">
    		</form>
    		<form action="selectById" method="post">
    		<input name="id" value="${a.id }" hidden>
    		<input type="submit" value="修改">
    		</form>
    		</td>
    	</tr>
    	</c:forEach>
    </table>
  </body>
</html>