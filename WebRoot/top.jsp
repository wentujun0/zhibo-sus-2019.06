<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD html 4.01 Transitional//EN" "http://www.w3c.org/tr/1999/REC-html401-19991224/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head id=Head1>
<title>顶部</title>
<meta http-equiv=Content-Type content="text/html; charset=utf-8">
<style type=text/css>
body {
	PADDING-RIGHT: 0px;
	PADDING-LEFT: 0px;
	PADDING-BOTTOM: 0px;
	MARGIN: 0px;
	PADDING-TOP: 0px;
	BACKGROUND-COLOR: #2a8dc8
}

body {
	font-SIZE: 12px;
	COLOR: #003366;
	font-FAMILY: Verdana, Arial, Helvetica, sans-serif
}

td {
	font-SIZE: 12px;
	COLOR: #003366;
	font-FAMILY: Verdana, Arial, Helvetica, sans-serif
}

div {
	font-SIZE: 12px;
	COLOR: #003366;
	font-FAMILY: Verdana, Arial, Helvetica, sans-serif
}

p {
	font-SIZE: 12px;
	COLOR: #003366;
	font-FAMILY: Verdana, Arial, Helvetica, sans-serif
}
</style>

<meta content="MSHTML 6.00.2900.3492" name=GENERATOR>
</head>
<body>
	<form id=form1 name=form1 action="" method=post>
		<table cellSpacing=0 cellPadding=0 width="100%" border=0>
			<tbody>
				<tr>
					<td width=10><img src="images/new_001.jpg" border=0></td>
					<td background=images/new_002.jpg><font size=5><b>校园网直播管理系统v1.0</b></font></td>
					<td background=images/new_002.jpg>
						<table cellSpacing=0 cellPadding=0 width="100%" border=0>
							<tbody>
								<tr>
									<td align=right height=35></td>
								</tr>
								<tr>
									<td height=35 align="right">
										当前用户：<s:property value="#session.existUser.name"/>
										&nbsp;&nbsp;&nbsp;&nbsp;
										<a href="${pageContext.request.contextPath}/jsp/loginer/update.jsp " target=main><font color=red>修改密码</font></a>
										&nbsp;&nbsp;&nbsp;&nbsp;
										<a href="${pageContext.request.contextPath}/login_logout.action" target=_top><font color=red>安全退出</font></a>
									</td>
								</tr>
							</tbody>
						</table>
					</td>
					<td width=10><img src="images/new_003.jpg" border=0></td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>
