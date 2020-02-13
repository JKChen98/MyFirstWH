<%@page import="nuc.edu.cn.cx.bean.User"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/jsp/header.jsp"%>
<%@ include file="../tool/kindeditor/editor.jsp"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.*"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
	<base href="<%=basePath%>" />
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<title>教师健康日记</title>
		<script type="text/javascript" src="${url}/js/calendar.js"></script>
		<c:if test="${empty sessionScope.user}">
		<script>
		alert("请先登录！");
		window.location.href = "${url}/jsp/main.jsp";
		</script>
		</c:if>
	</head>
	<body>
	<!-- 获取当天系统时间 -->
	<%
		Date d = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String date = df.format(d);
	%>
		<div id="main">
			<div id="header">
				<div id="top">
					<div style="padding-top: 143px">
						<div id="menu11" class="menu11">
							<ul>

								<li>
									<a href="${url}/jsp/main.jsp">主页</a>
								</li>
								<li>
									<a href="${url}/test/find?id=${sessionScope.user.id}">教师体检管理</a>
								</li>
								<li>
									<a href="${url}/jsp/sick.jsp">疾病精确评估</a>
								</li>
								<li >
									<a href="${url}/jsp/food.jsp">教师饮食管理</a>
								</li>
								<li id="selected">
									教师健康日记
								</li>

							</ul>
						</div>
					</div>
				</div>
				<br />
				<div id="locate">
					&nbsp;&nbsp;当前位置>>首页>>教师健康日记
				</div>
			</div>
			<div id="content">
				<div id="shang" style="padding-top: 70px">
					<form action="dairy/find?date=<%=request.getParameter("date_add") %>" method="get">
		
					<font style="font-size: 24px;font-weight: bold;">我的健康日记</font><br/><br/>
						<script>
						var c = new Calendar("c");
						document.write(c);
						</script>
						
					<!-- c:if标签用来判断是否查询过日记，若没查询过，则显示空白；若查询过，以后再点击，即为上次查询日期 -->
					<c:if test="${empty sessionScope.dairy}">	 
					日记记录:<input type="text" id="date" name="date_add" onfocus="c.show(this);" size="20"/>
					<input type="submit" value="查询" >
					</c:if>
					
					<c:if test="${empty sessionScope.dairy == false}">	 
					日记记录:<input type="text" id="date" name="date_add" onfocus="c.show(this);" value="${sessionScope.date_add }" size="20"/>
					<input type="submit" value="查询" >
					</c:if>
					
					</form>
					<form id="eform" action="dairy/add" method="post">
						<div>
						今天时间:
						<input type="text" id="date" name="date_add"  value="<%=date %>" readonly="readonly" size="20"/>
						<br/><br/>
						<textarea id="text" name="text" style="width: 95%; height: 200px; visibility: hidden;">${dairy.text}</textarea>
						<br><br/>
						睡眠：<input type="text" name="sleeptime" value="${dairy.sleeptime}" size="4">小时&nbsp;&nbsp;&nbsp;&nbsp;
						心情：<input type="text" name="mood" value="${dairy.mood}" size="4">&nbsp;&nbsp;&nbsp;&nbsp;
						体重：<input type="text" name="weight" value="${dairy.weight}" size="4">kg&nbsp;&nbsp;&nbsp;&nbsp;
						压力：<input type="text" name="pressure" value="${dairy.pressure}" size="4">&nbsp;&nbsp;&nbsp;&nbsp;
						血压：
						高<input type="text" name="BpHigh" value="${dairy.bpHigh}" size="4">
						低<input type="text" name="BpLow" value="${dairy.bpLow}" size="4"><br>
						血糖:<input type="text" name="Glu" value="${dairy.glu}" size="4">mmol/L&nbsp;&nbsp;&nbsp;&nbsp;
						血脂:<input type="text" name="Bf" value="${dairy.bf}" size="4">mmol/L&nbsp;&nbsp;&nbsp;&nbsp;
						心率:<input type="text" name="heart" value="${dairy.heart}" size="4">次/分<br><br><br>
						</div>
						<input type="submit" value="记录"/> 	
						</form>
				</div>
			</div>

			<div id="footer">
				<div id="copyright">
					<div id="copy">
						<p>
							<font size=3px; color=#666666;> CopyRight&copy; 中北大学</font>
						</p>

					</div>
				</div>
				<div id="bgbottom"></div>
			</div>

		</div>

	</body>
</html>
