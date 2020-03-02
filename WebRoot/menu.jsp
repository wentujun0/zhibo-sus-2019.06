<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/tr/1999/REC-html401-19991224/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head id=Head1>
<title>导航</title>
<meta http-equiv=Content-Type content="text/html; charset=utf-8">
<style type=text/css>
body {
	padding-right: 0px;
	padding-left: 0px;
	padding-bottom: 0px;
	margin: 0px;
	padding-top: 0px;
	background-colcor: #2a8dc8
}

body {
	font-size: 11px;
	colcor: #003366;
	font-family: Verdana
}

td {
	font-size: 11px;
	colcor: #003366;
	font-family: Verdana
}

div {
	font-size: 11px;
	colcor: #003366;
	font-family: Verdana
}

p {
	font-size: 11px;
	colcor: #003366;
	font-family: Verdana
}

.mainMenu {
	font-weight: bold;
	font-size: 14px;
	cursor: pointer;
	colcor: #000000
}

a.style2:link {
	padding-left: 4px;
	colcor: #0055bb;
	text-decoration: none
}

a.style2:visited {
	padding-left: 4px;
	colcor: #0055bb;
	text-decoration: none
}

a.style2:hover {
	padding-left: 4px;
	colcor: #ff0000;
	text-decoration: none
}

a.active {
	padding-left: 4px;
	colcor: #ff0000;
	text-decoration: none
}

.span {
	colcor: #ff0000;
}
</style>

<script language=javascript>
	function MenuDisplay(obj_id) {
	//console.log("obj_id:"+obj_id);
		for (var i = 1; i <= 9; i++) {
			var obj = document.getElementById('table_' + i);
			if(obj){
				document.getElementById('table_' + i).style.display = 'none';
				document.getElementById('table_' + i + 'Span').innerText = '＋';
			}
			
		}
		var obj = document.getElementById(obj_id);
		console.log("obj"+obj);
		if(obj){
			if (obj.style.display == 'none') {
				obj.style.display = 'block';
				document.getElementById(obj_id + 'Span').innerText = '－';
			} else if(obj.style.display == 'block'){
				obj.style.display = 'none';
				document.getElementById(obj_id + 'Span').innerText = '＋';
			}
		}
		
	}

</script>

<meta content="MSHTML 6.00.2900.3492" name=GENERATOR>
</head>
<body>
	<form id=form1 name=form1 action=YHMenu.aspx method=post>
		<table cellSpacing=0 cellPadding=0 width=210 align=center border=0>
			<tboy>
				<tr>
					<td width=15><img src="images/new_005.jpg" border=0></td>
					<td align=middle width=180 background=images/new_006.jpg
						height=35><b>功能菜单</b></td>
					<td width=15><img src="images/new_007.jpg" border=0></td>
				</tr>
			</tbody>
		</table>
		<table cellSpacing=0 cellPadding=0 width=210 align=center border=0>
			<tbody>
				<tr>
					<td width=15 background=images/new_008.jpg></td>
					<td vAlign=top width=180 bgColor=#ffffff>
						<table cellSpacing=0 cellPadding=3 width=165 align=center border=0>
							<tbody>
								<tr>
									<td class=mainMenu onClick="MenuDisplay('table_1');">
									<span class=span id=table_1Span>＋</span>用户管理</td>
								</tr>
								<tr>
									<td>
										<table id=table_1 style="DISPLAY: none" cellSpacing=0
											cellPadding=2 width=155 align=center border=0>
											<tbody>
												<tr>
													<td class=menuSmall><a class=style2 href="${pageContext.request.contextPath}/jsp/user/add.jsp" 
														target=main>－ 新增用户</a></td>
												</tr>
												<tr> 
													<td class=menuSmall><a class=style2 href="${ pageContext.request.contextPath }/user_findAllUser.action"
														target=main>－ 用户列表</a></td>
												</tr>
												
											</tbody>
										</table>
									</td>
								</tr>
								 
								<tr>
									<td background=images/new_027.jpg height=1></td>
								</tr>
								<tr>
									<td class=mainMenu onClick="MenuDisplay('table_2');"><span
										class=span id=table_2Span>＋</span>视频管理</td>
								</tr>
								<tr>
									<td>
										<table id=table_2 style="DISPLAY: none" cellSpacing=0
											cellPadding=2 width=155 align=center border=0>
											<tbody>
												<tr>
													<td class=menuSmall><a class=style2 href="${pageContext.request.contextPath}/jsp/video/add.jsp"
														target=main>－ 新增视频</a></td>
												</tr>
												<tr>
													<td class=menuSmall><a class=style2 href="${pageContext.request.contextPath}/video_findAllVideo.action"
														target=main>－视频列表</a></td>
												</tr>
												
											</tbody>
										</table>
									</td>
								</tr>
								
								<tr>
									<td background=images/new_027.jpg height=1></td>
								</tr>
								<tr>
									<td class=mainMenu onClick="MenuDisplay('table_3');"><span
										class=span id=table_3Span>＋</span>直播管理</td>
								</tr>
								<tr>
									<td>
										<table id=table_3 style="DISPLAY: none" cellSpacing=0
											cellPadding=2 width=155 align=center border=0>
											<tbody>
												<tr>
													<td class=menuSmall><a class=style2 href="${pageContext.request.contextPath}/jsp/live/add.jsp"
														target=main>－新增直播源</a></td>
												</tr>
												<tr>
													<td class=menuSmall><a class=style2 href="${pageContext.request.contextPath}/live_findAllLive.action"
														target=main>－直播源列表</a></td>
												</tr>
												
											</tbody>
										</table>
									</td>
								</tr>
								<!--  
								<tr>
									<td background=images/new_027.jpg height=1></td>
								</tr>
								<tr>
									<td class=mainMenu onClick="MenuDisplay('table_3');"><span
										class=span id=table_3Span>＋</span> 综合查询</td>
								</tr>
								<tr>
									<td>
										<table id=table_3 style="DISPLAY: none" cellSpacing=0
											cellPadding=2 width=155 align=center border=0>
											<tbody>
												<tr>
													<td class=menuSmall><a class=style2 href="#"
														target=main>－ 客户信息查询</a></td>
												</tr>
												<tr>
													<td class=menuSmall><a class=style2 href="#"
														target=main>－ 联系人信息查询</a></td>
												</tr>
												<tr>
													<td class=menuSmall><a class=style2 href="#"
														target=main>－ 客户拜访记录查询</a></td>
												</tr>
											</tbody>
										</table>
									</td>
								</tr>
								<tr>
									<td background=images/new_027.jpg height=1></td>
								</tr>
								<tr>
									<td class=mainMenu onClick="MenuDisplay('table_4');"><span
										class=span id=table_4Span>＋</span> 统计分析</td>
								</tr>
								<tr>
									<td>
										<table id=table_4 style="DISPLAY: none" cellSpacing=0
											cellPadding=2 width=155 align=center border=0>
											<tbody>
												<tr>
													<td class=menuSmall><a class=style2 href="#"
														target=main>－客户行业统计</a></td>
												</tr>
												<tr>
													<td class=menuSmall><a class=style2 href="#"
														target=main>－客户来源统计</a></td>
												</tr>
												
											</tbody>
										</table>
									</td>
								</tr>-->
								<!-- 应该不会完善这个功能了 -->
								<!--  
								<tr>
									<td background=images/new_027.jpg height=1></td>
								</tr>
								<tr>
									<td class=mainMenu onClick="MenuDisplay('table_4');"><span
										class=span id=table_4Span>＋</span>系统管理</td>
								</tr>
								<tr>
									<td>
										<table id=table_4 style="DISPLAY: none" cellSpacing=0
											cellPadding=2 width=155 align=center border=0>
											<tbody>
												<tr>
													<td class=menuSmall><a class=style2 href="#"
														target=main>－角色管理</a></td>
												</tr>
												<tr>
													<td class=menuSmall><a class=style2 href="#"
														target=main>－用户管理</a></td>
												</tr>
												<tr>
													<td class=menuSmall><a class=style2 href="#"
														target=main>－数据字典</a></td>
												</tr>
											</tbody>
										</table>
									</td>
								</tr>
								-->
								
							</tbody>
						</table>
					</td>
					<td width=15 background=images/new_009.jpg></td>
				</tr>
			</tbody>
		</table>
		<table cellSpacing=0 cellPadding=0 width=210 align=center border=0>
			<tbody>
				<tr>
					<td width=15><img src="images/new_010.jpg" border=0></td>
					<td align=middle width=180 background=images/new_011.jpg
						height=15></td>
					<td width=15><img src="images/new_012.jpg" border=0></td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>
