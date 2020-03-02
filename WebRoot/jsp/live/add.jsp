<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD html 4.01 Transitional//EN" "http://www.w3.org/tr/html4/loose.dtd">
<html>
<head>
<title>添加直播</title> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath }/css/Style.css" type=text/css rel=stylesheet>
<link href="${pageContext.request.contextPath }/css/Manage.css" type=text/cssrel=stylesheet>

<meta content="MSHTML 6.00.2900.3492" name=GENERATOR>
</head>
<body>
	<form id=form1 name=form1
		action="${pageContext.request.contextPath }/live_addLive.action" method=post>
		

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
								<td class=manageHead>当前位置：直播管理 &gt; 申请直播</td>
							</tr>
							<tr>
								<td height=2></td>
							</tr>
						</table>
						
						<table cellSpacing=0 cellPadding=5  border=0>
						  
						    
							<tr>
								<td>直播名称：</td>
								<td>
								<input class=textbox id=sChannel2
														style="width: 180px;height : 20px" maxLength=50 id="name" name="name">
								</td>
								
							</tr>
							<tr>
								
								<td>直播日期：</td>
								<td>
								<input class=textbox id=sChannel2 type="date"
														style="width: 180px;height : 20px " maxLength=50  name="date1">
								
							</tr>
							
							<tr>
								
								<td>直播时间：</td>
								<td>
								<input class=textbox id=sChannel2 type="time"
														style="width: 180px;height : 20px " maxLength=50  name="time1">
								
							</tr>
							<tr>
								
								<td>直播密码：</td>
								<td>
								<input class="textbox" type="password" id=sChannel2 style="width: 180px; height : 20px"  name="password">
								</td>
								
							</tr>
							<tr>
								
								<td>直播地址：</td>
								<td>
								<input class="textbox" type="text" id=sChannel2 style="width: 180px; height : 20px" id="" name="url">
								</td>
								
							</tr>
							<tr>
								
								<td>直播介绍：</td>
								<td>
									<textarea class="textbox"  style="width:200px;height:80px;"  name="description" id="description"></textarea>
								</td>
							</tr>
								
							
							<tr>
								<td rowspan=2>
								<input class=button id=sButton2 type=submit	value=" 提交 " name=sButton2>
								</td>
								<td rowspan=2>
								<button class="button" type="reset"  >重置</button>
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
