<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib uri="/struts-tags" prefix="s"%>
  <%@ page import="org.apache.struts2.ServletActionContext" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD html 4.01 Frameset//EN" "http://www.w3c.org/tr/1999/REC-html401-19991224/frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv=Content-Type content="text/html; charset=utf-8">
<meta content="MSHTML 6.00.6000.16809" name=GENERATOR>
<style type=text/css>
body {
	font-SIZE: 12px; color: #ffffff; font-FAMILY: 宋体
}
td {
	font-SIZE: 12px; color: #ffffff; font-FAMILY: 宋体
}
</style>

<!-- jQuery and Modernizr-->
	<script src="js/jquery-2.1.1.js"></script>
<!-- 登录后端 -->
<%-- <script type="text/javascript" src="js/login.js"></script> --%>




</head>
<body>
<form id=form1 name=form1 action="${ pageContext.request.contextPath }/user_login.action?checkcode=${checkcode}" method=post target="_parent">
<%-- action="${ pageContext.request.contextPath }/user_login.action?checkcode=${checkcode}" --%>
<div id=UpdatePanel1>
<div id=div1 
style="left: 0px; POSITION: absolute; top: 0px; BACKGROUND-color: #0066ff"></div>
<div id=div2 
style="left: 0px; POSITION: absolute; top: 0px; BACKGROUND-color: #0066ff"></div>


<div>&nbsp;&nbsp; </div>
<div>
<table cellSpacing=0 cellPadding=0 width=900 align=center border=0>
  <tbody>
  <tr>
    <td style="height: 105px"><img src="images/login_1.gif"  border=0></td></tr>
  <tr>
    <td background=images/login_2.jpg height=300>
      <table height=300 cellPadding=0 width=900 border=0>
        <tbody>
        <tr>
          <td colSpan=2 height=35></td>
         </tr>
        <tr>
          <td width=360></td>
          <td>
          	<s:actionerror/>
          	<input type="hidden" align="top">
            <table cellSpacing=0 cellPadding=2 border=0>
              <tbody>
              <tr>
                <td style="height: 28px;width: 130px" >登 录 名：</td>
                <td style="height: 28px" ><input id="username" style="width: 130px" name=username></td>
               	<td><s:fielderror fieldName="aname"></s:fielderror> </td>
                <td style="height: 28px;width: 370px" ><span 
                  id=RequiredFieldValidator3 
                  style="font-weight: bold; visibility: hidden; color: white">请输入登录名</span></td></tr>
              <tr>
                <td style="height: 28px">登录密码：</td>
                <td style="height: 28px"><input id=password style="width: 130px"  type=password name=password></td>
                <td>	<s:fielderror fieldName="apassword"></s:fielderror> </td>
                <td style="height: 28px"><span id=RequiredFieldValidator4  style="font-weight: bold; visibility: hidden; color: white">请输入密码</span></td></tr>
              <tr>
                <td style="height: 28px">验证码：</td>
                <td style="height: 28px">
                <input id=check  style="width: 130px" name=check></td>
                  <td><img src="${pageContext.request.contextPath}/show_checkCode.action"></td>
                  <td>
                  
                  </td>
               
                <td style="height: 28px">&nbsp;</td></tr>
              <tr>
                <td style="height: 18px"></td>
                <td style="height: 18px"></td>
                <td style="height: 18px"></td></tr>
              <tr>
                <td></td>
                <td><input id="btntologin" 
                  style="border-top-width: 0px; border-left-width: 0px; border-BOTTOM-width: 0px; border-RIGHT-width: 0px" 
                  type=image src="images/login_button.gif" name=btn> 
              </td></tr></tbody></table></td></tr></tbody></table></td></tr>
  <tr>
    <td><img src="images/login_3.jpg" 
border=0></td></tr></tbody></table></div></div>


</form></body></html>
