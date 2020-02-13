<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/jsp/header.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>教师体检管理</title>
<style type="text/css">
#shang td {
	color: #A38DEB;
	font-size: 12px;
	text-align: center;
	width: 5%;
	background-color: #FCFF99
}

#xia {
	color: #8EADEA;
}

.pager {
	text-align: center;
	font-size: 15px;
}
</style>
<c:if test="${empty sessionScope.user}">
	<script>
		alert("请先登录！");
		window.location.href = "${url}/jsp/main.jsp";
	</script>
</c:if>
</head>
<body>
	<div id="main">
		<div id="header">
			<div id="top">
				<div style="padding-top: 143px">
					<div id="menu11" class="menu11">
						<ul>

							<li><a href="${url}/jsp/main.jsp">主页</a></li>
							<li id="selected">教师体检管理</li>
							<li><a href="${url}/jsp/sick.jsp">疾病精确评估</a></li>
							<li><a href="${url}/jsp/food.jsp">教师饮食管理</a></li>
							<li><a href="${url}/jsp/dairy.jsp">教师健康日志</a></li>

						</ul>
					</div>
				</div>
			</div>
			<br />
			<div id="locate">&nbsp;&nbsp;当前位置>>首页>>教师体检管理</div>
		</div>
		<div id="content">
			<div id="xia" style="padding-top: 50px">
				<img src="${sessionScope.chartURL }" width=850 height=500 border=0
					id="examimg">
			</div>

			<div id="shang" style="padding-top: 70px">
				<h1>我的体检记录</h1>
				<table>
					<tr>
						<td width="25%" style="color: #000">体检时间</td>
						<td style="color: #000">舒张压</td>
						<td style="color: #000">收缩压</td>
						<td style="color: #000">体重指数</td>
						<td style="color: #000">腰臀比</td>
						<td style="color: #000">尿素</td>
						<td style="color: #000">尿酸</td>
						<td style="color: #000">肌酐</td>
						<td style="color: #000">甘油三酯</td>
						<td style="color: #000">胆固醇</td>
						<td style="color: #000">高密度脂蛋白胆固醇</td>
						<td style="color: #000">低密度脂蛋白胆固醇</td>
						<td style="color: #000">葡萄糖</td>
						<td style="color: #000">同型半膀胱氨酸</td>
						<td style="color: #000">微量白蛋白</td>
						<td style="color: #000">微量白蛋白/尿肌酐</td>
					</tr>
					<c:forEach items="${examlist}" var="e">
						<tr>
							<td>${e.datetime}</td>
							<td>${e.dp}</td>
							<td>${e.sp}</td>
							<td>${e.bmi}</td>
							<td>${e.whr}</td>
							<td>${e.bun}</td>
							<td>${e.ua}</td>
							<td>${e.crea}</td>
							<td>${e.tg}</td>
							<td>${e.chol}</td>
							<td>${e.hdl}</td>
							<td>${e.ldl}</td>
							<td>${e.glu}</td>
							<td>${e.hcy}</td>
							<td>${e.m_alb}</td>
							<td>${e.m_alb_crea}</td>
						</tr>
					</c:forEach>
				</table>

				<div class="pager">
					每页 ${sessionScope.page.pageSize}条 第${sessionScope.page.pageNum}页 <a
						href="find?id=${sessionScope.user.id}">首页</a>
					<c:choose>
						<c:when test="${sessionScope.page.pageNum-1>0}">

							<a
								href="find?id=${sessionScope.user.id}&pageNum=${sessionScope.page.pageNum-1}">上一页</a>
						</c:when>
						<c:otherwise>
							<font color="#ABA8AB">上一页</font>
						</c:otherwise>
					</c:choose>
					<c:choose>
						<c:when
							test="${sessionScope.page.pages-sessionScope.page.pageNum>0}">

							<a
								href="find?id=${sessionScope.user.id}&pageNum=${sessionScope.page.pageNum+1}">下一页</a>
						</c:when>
						<c:otherwise>
							<font color="#ABA8AB">下一页</font>
						</c:otherwise>
					</c:choose>
					<a
						href="find?id=${sessionScope.user.id}&pageNum=${sessionScope.page.pages}">尾页</a>
					总共${sessionScope.page.total}条体检记录
				</div>

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
