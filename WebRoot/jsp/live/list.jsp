<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD html 4.01 Transitional//EN" "http://www.w3.org/tr/html4/loose.dtd">
<html>
<head>
<title>直播列表</title> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath }/css/Style.css" type=text/css rel=stylesheet>
<link href="${pageContext.request.contextPath }/css/Manage.css" type=text/cssrel=stylesheet>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.4.4.min.js"></script>

<script language=javascript>
	function to_page(page){
		if(page){
			$("#page").val(page);
		}
		document.customerForm.submit();
		
	}
</script>

<meta content="MSHTML 6.00.2900.3492" name=generator>
</head>
<body>
	<form id="videoForm" name="videoForm" action="${pageContext.request.contextPath }/customerServlet?method=list"
		method=post>
		
		<table cellSpacing=0 cellPadding=0 width="98%" border=0>
			<tbody>
				<tr>
					<td width=15><IMG src="${pageContext.request.contextPath }/images/new_019.jpg"
						border=0></td>
					<td width="100%" background="${pageContext.request.contextPath }/images/new_020.jpg"
						height=20></td>
					<td width=15><IMG src="${pageContext.request.contextPath }/images/new_021.jpg"
						border=0></td>
				</tr>
			</tbody>
		</table>
		<table cellSpacing=0 cellPadding=0 width="98%" border=0>
			<tbody>
				<tr>
					<td width=15 background="${pageContext.request.contextPath }/images/new_022.jpg"><IMG
						src="${pageContext.request.contextPath }/images/new_022.jpg" border=0></td>
					<td vAlign=top width="100%" bgColor=#ffffff>
						<table cellSpacing=0 cellPadding=5 width="100%" border=0>
							<tr>
								<td class=manageHead>当前位置：直播管理 &gt; 直播列表</td>
							</tr>
							<tr>
								<td height=2></td>
							</tr>
						</table>
						<table borderColor=#cccccc cellSpacing=0 cellPadding=0
							width="100%" align=center border=0>
							<tbody>
								<tr>
									<td height=25>
										<table cellSpacing=0 cellPadding=2 border=0>
											<tbody>
												<tr>
													<td>直播名称：</td>
													<td><input class=textbox id=sChannel2
														style="WIDTH: 80px" maxLength=50 name="custName"></td>
													
													<td><input class=button id=sButton2 type=submit
														value=" 筛选 " name=sButton2></td>
												</tr>
											</tbody>
										</table>
									</td>
								</tr>
							    
								<tr>
									<td>
										<table id=grid
											style="BORDER-TOP-WIDTH: 0px; FONT-WEIGHT: normal; BORDER-LEFT-WIDTH: 0px; BORDER-LEFT-COLOR: #cccccc; BORDER-BOTTOM-WIDTH: 0px; BORDER-BOTTOM-COLOR: #cccccc; WIDTH: 100%; BORDER-TOP-COLOR: #cccccc; FONT-STYLE: normal; BACKGROUND-COLOR: #cccccc; BORDER-RIGHT-WIDTH: 0px; TEXT-DECORATION: none; BORDER-RIGHT-COLOR: #cccccc"
											cellSpacing=1 cellPadding=2 rules=all border=0>
											<tbody>
												<tr
													style="FONT-WEIGHT: bold; FONT-STYLE: normal; BACKGROUND-COLOR: #eeeeee; TEXT-DECORATION: none">
													<td>直播名称</td>
													<td>申请人</td>
													<td>申请日期</td>
													<td>直播时间</td>
													<td>直播地址</td>
													<td>直播状态</td>
													<td>操作</td>
												</tr>
												<c:forEach items="${list}" var="live">
												<tr
													style="FONT-WEIGHT: normal; FONT-STYLE: normal; BACKGROUND-COLOR: white; TEXT-DECORATION: none">
													<td>${live.name }</td>
													<td>${live.create_by}</td>
													<td>${live.create_date}</td>
													<td>${live.date}</td>
													<td>${live.url}</td>
													<td>${live.status_mc}</td>
													<td>
											 		<a href="${pageContext.request.contextPath }/live_openLive.action?liveid=${live.id}&userid=${live.create_by}&livestatus=${live.status}">开启</a>
													&nbsp;&nbsp;
													<a href="${pageContext.request.contextPath }/live_closeLive.action?liveid=${live.id}&userid=${live.create_by}">关闭</a>
													
													</td>
												</tr>
												
												</c:forEach>

											</tbody>
										</table>
									</td>
								</tr>
								
								<tr>
									<td><span id=pagelink>
											<div style="line-height: 20px; height: 20px; TEXT-ALIGN: right">
												共[<b>${total}</b>]条记录,[<b>${totalPage}</b>]页
												,每页显示
												<select name="pageSize">
												
												<option value="15" <c:if test="${pageSize==1 }">selected</c:if>>5</option>
												<option value="30" <c:if test="${pageSize==30 }">selected</c:if>>10</option>
												</select>
												条
												[<a href="javascript:to_page(${page-1})">前一页</a>]
												<b>${page}</b>
												[<a href="javascript:to_page(${page+1})">后一页</a>] 
												到
												<input type="text" size="3" id="page" name="page" />
												页
												
												<input type="button" value="Go" onclick="to_page()"/>
											</div>
									</span></td>
								</tr>
							</tbody>
						</table>
					</td>
					<td width=15 background="${pageContext.request.contextPath }/images/new_023.jpg"><IMG
						src="${pageContext.request.contextPath }/images/new_023.jpg" border=0></td>
				</tr>
			</tbody>
		</table>
		<table cellSpacing=0 cellPadding=0 width="98%" border=0>
			<tbody>
				<tr>
					<td width=15><IMG src="${pageContext.request.contextPath }/images/new_024.jpg"
						border=0></td>
					<td align=middle width="100%"
						background="${pageContext.request.contextPath }/images/new_025.jpg" height=15></td>
					<td width=15><IMG src="${pageContext.request.contextPath }/images/new_026.jpg"
						border=0></td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>
