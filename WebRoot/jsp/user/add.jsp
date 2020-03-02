<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD html 4.01 Transitional//EN" "http://www.w3.org/tr/html4/loose.dtd">
<html>
<head>
<title>添加用户</title> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath }/css/Style.css" type=text/css rel=stylesheet>
<link href="${pageContext.request.contextPath }/css/Manage.css" type=text/cssrel=stylesheet>
<%--引入js文件 --%>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-2.1.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/showlist.js"></script>

<meta content="MSHTML 6.00.2900.3492" name=GENERATOR>
</head>
<body>
	<form id=form1 name=form1 action="${pageContext.request.contextPath }/user_addUser.action" method=post>
		
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
								<td class=manageHead>当前位置：用户管理 &gt; 添加用户</td>
							</tr>
							<tr>
								<td height=2></td>
							</tr>
						</table>
							<s:actionerror/>
						<table cellSpacing=0 cellPadding=5  border=0>
						  
							<tr>
								<td>账号：</td>
								<td>
								<input class=textbox id=sChannel2
														style="width: 180px" maxLength=50 name="username">
								</td>
								<td>密码 ：</td>
								<td>
								<input class=textbox id=sChannel2 type="password"
														style="width: 180px" maxLength=50 name="password">
								</td>
							</tr>				
							<tr>		
								<td>姓名：</td>
								<td>
								<input class=textbox id=sChannel2
														style="width: 180px" maxLength=50 name="name">
								</td>
								<td>工号：</td>
								<td>
								<input class=textbox id=sChannel2
														style="width: 180px" maxLength=50 name="no">
								</td>
							</tr>
							<tr>
								<td>电话 ：</td>
								<td>
								<input class=textbox id=sChannel2
														style="width: 180px" maxLength=50 name="phone">
								</td>
								<td>邮箱：</td>
								<td>
								<input class=textbox id=sChannel2
														style="width: 180px" maxLength=50 name="email">
								</td>
							</tr>
								<tr>
								
								<td>所属院：</td>
								<td>
								<select id="companyId" name="company_id" class=textbox style="width: 180px" maxLength=50 >
					
									</select>
								</td>
								<td>所属系：</td>
								<td>
								<select id="officeId" name="office_id" class=textbox style="width: 180px" maxLength=50 >
										
									</select>
								</td>
								<td>
									
								</td>
							</tr>
							
							<tr>
								<td rowspan=5>
								<input class=button id=sButton2 type=submit
														value=" 注册 " name=sButton2>
								</td>
								<td rowspan=5>
									<button  class="button" type="reset">重置</button>
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
					<td align="middle" width="100%"
						background="${pageContext.request.contextPath }/images/new_025.jpg" height=15></td>
					<td width=15><img src="${pageContext.request.contextPath }/images/new_026.jpg"
						border=0></td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>
