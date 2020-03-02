<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    
    <title>更改密码</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link href="${pageContext.request.contextPath }/css/Style.css" type=text/css rel=stylesheet>
	<link href="${pageContext.request.contextPath }/css/Manage.css" type=text/cssrel=stylesheet>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.4.4.min.js"></script>


  </head>
  <body>
   <form id=form1 name=form1
		action="${pageContext.request.contextPath }/login_updatePassword.action" method=post>
		<table cellSpacing=0 cellPadding=0 width="98%" border=0>
			<tbody>
				<tr>
					<td width=15><img src="${pageContext.request.contextPath }/images/new_019.jpg"
						border=0></td>
					<td width="100%" background="${pageContext.request.contextPath }/images/new_020.jpg"
						height=20></td>
					<td width=15><img src="${pageContext.request.contextPath }/images/new_021.jpg"
						border=0></td>
				</tr>
			</tbody>
		</table>
		<table cellSpacing=0 cellPadding=0 width="98%" border=0>
			<tbody>
				<tr>
					<td width=15 background="${pageContext.request.contextPath }/images/new_022.jpg"><img
						src="${pageContext.request.contextPath }/images/new_022.jpg" border=0></td>
					<td vAlign=top width="100%" bgColor=#ffffff>
						<table cellSpacing=0 cellPadding=5 width="100%" border=0>
							<tr>
								<td class=manageHead>当前位置：修改密码</td>
							</tr>
							<tr>
								<td height=2></td>
							</tr>
						</table>
						
						<table cellSpacing=0 cellPadding=5  border=0>
						  
						    <s:actionerror/>
						    <tr></tr>
						    <br/>
							<tr>
								<td>旧密码：</td>
								<td>
								<input class=textbox id=sChannel2 type="text" style="width: 180px" maxLength=50 name="oldpassword">
								</td>
							</tr>
							
							<tr>
								<td>新密码：</td>
								<td>
								<input class=textbox id=sChannel2 type="password" style="width: 180px" maxLength=50 name="newpassword">
								</td>

							</tr>
							
							<tr>
								<td>确认新密码 ：</td>
								<td>
								<input class=textbox id=sChannel2 type="password" style="width: 180px" maxLength=50 name="renewpassword">
								
							</tr>
							
							<tr>
								<td rowspan=2>
							<!-- 	<input class=button id=sButton2 type=submit value="修改 " name=sButton2>-->
								<button type="submit" class="button" name="sButton">提交</button>
								</td>
								<td rowspan="2">
								<button type="reset" class="button">重置</button>
								</td>
							</tr>
						</table>
						
						
					</td>
					<td width=15 background="${pageContext.request.contextPath }/images/new_023.jpg">
					<img src="${pageContext.request.contextPath }/images/new_023.jpg" border=0></td>
				</tr>
			</tbody>
		</table>
		<table cellSpacing=0 cellPadding=0 width="98%" border=0>
			<tbody>
				<tr>
					<td width=15><img src="${pageContext.request.contextPath }/images/new_024.jpg"
						border=0></td>
					<td align=middle width="100%"
						background="${pageContext.request.contextPath }/images/new_025.jpg" height=15></td>
					<td width=15><img src="${pageContext.request.contextPath }/images/new_026.jpg"
						border=0></td>
				</tr>
			</tbody>
		</table>
	</form>
   
   
   
   
  </body>
</html>
