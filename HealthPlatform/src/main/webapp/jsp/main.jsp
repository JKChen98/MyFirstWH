<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
<%@ include file="/jsp/header.jsp"%> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<title>健康网</title>
		<script src="${url}/js/main.js" type="text/javascript">
</script>
<script type="text/javascript">
	$(document).ready(function(){
		$("#login").click(function() {
			$("#loginform").attr("action","${url}/user/login").submit();
		});
		
	}); 
</script>
	</head>
	<body>
	<body>
		<div id="btm">
			<div id="main">

				<div id="header">
					<div id="top"></div>
					<div>
						<h1></h1>
					</div>

					<div id="mainnav">

						<span>
							<form method="post" id="loginform" >
								<table width="100%">
									<tr>
									<c:choose>
									<c:when test="${empty sessionScope.user}">
									<td align="right">
											<font size=2px; color=#A4A4A4>用户名</font>
											<input type="text" name="nickname" style="width: 80px" />
										</td>
										<td>
											<font size=2px; color=#A4A4A4>密码</font>
											<input type="password" name="password" style="width: 80px" />
										</td>
										<td><a style="cursor: pointer;">
												<img src="${url}/images/login.gif" border="0"
													id="login" /> </a>
										</td>
										<td>
											<a href="${url}/jsp/register.jsp" >
											<!-- <input class="common_button" type="button" value="注册"> -->
												<img src="${url}/images/reg_v2.gif" border="0" /> </a>
										</td>

										<td>
											<a href="${url}/user/member"><font size=2px; color=#990000>申请成为会员</font>
											</a> ｜
											<a href="${url}/jsp/manager/manager_login.jsp"> <font size=2px;
												color=#990000>后台管理</font> </a>
										</td>
									</c:when>
									<c:otherwise>
										<td align="right">
											<font size=2px; color=#A4A4A4>您好，</font>
										</td>
										<td>
										<font size=2px; color=#A4A4A4>
										 ${user.nickname}&nbsp; 欢迎您。
										 </font>
										</td>
										<td>
											<a href="${url}/user/logout" >
												<img src="${url}/images/logout.jpg" border="0"
													id="logout" /> </a>
										</td>
									</c:otherwise>
									</c:choose>
									</tr>
								</table>
							</form>
						</span>
					</div>
				</div>


				<div id="content">


					<div id="left">

						<div id="hots">
							<h2>
								<font size=5px; color=#2E2E2E>欢迎使用</font>
							</h2><br><br><br>
							<ul>
								<li>
									<div>
										<img src="${url}/images/a.png" />
										<a href="${url}/test/find?id=${sessionScope.user.id}"><font size=3px; color=#01A9DB>教师体检管理</font>
										</a>
										<p>
											<font size=2px; color=#2E2E2E>用户可查询每次体检的结果。显示体检部分项目随时间变化的曲线。</font>
										</p>
									</div>
								</li>
								<li>
									<div>
										<img src="${url}/images/b.gif" />
										<a href="../jsp/sick.jsp"><font size=3px;color=#00FF29>疾病精确评估</font> </a>
										<p>
											<font size=2px; color=#2E2E2E>预测慢性病的风险等级，根据症状判断可能疾病，制订防范方案。</font>
										</p>
									</div>
								</li>
								<li>
									<div>
										<img src="${url}/images/c.gif" />
										<a href="../jsp/food.jsp"><font size=3px;color=#FF8000>教师饮食管理</font> </a>
										<p>
											<font size=2px; color=#2E2E2E>用户输入每天的饮食，系统计算卡路里，提出修改饮食习惯的建议。</font>
										</p>
									</div>
								</li>
								<li>
									<div>
										<img src="${url}/images/d.gif" />
										<a href="../jsp/dairy.jsp"><font size=3px; color=#B40486>教师健康日记</font></a>
										<p>
											<font size=2px; color=#2E2E2E>记录心情、运动、血压、血糖、血脂、心率、体重、睡眠。</font>
										</p>
									</div>
								</li>
							</ul>
						</div><br><br>
						
						<div id="News">
							<h2>
								<font size=5px; color=#2E2E2E>健康新闻</font>
							</h2>
						</div>
						
					</div>

					<div id="right">
						<table width="325">
							<tr>
								<td align="left">
									<font size=4px; color=#A4A4A4> </font>
								</td>
							</tr>

						</table>
						<div id="demo">
							<a href="#"><img src="${url}/images/health.jpg" border="0" width="310"
											height="210" /> </a>
						</div>
						<br/>
						<h2>
							<font size=5px; color=#2E2E2E> 相关链接</font>
						</h2>
						<ul>
							<li>
								<a href="http://www.nuc.edu.cn/"><font size=2px; color==#A4A4A4>中北大学主页</font> </a>
							</li>
							<li>
								<a href="http://zbdxyy.nuc.edu.cn/"><font size=2px; color==#A4A4A4>中北大学校医院</font> </a>
							</li>
							<li>
								<a href="http://www.sxsrmyy.com/index.asp"><font size=2px; color==#A4A4A4>山西省人民医院</font> </a>
							</li>
							<li>
								<a href="http://www.tyszxyy.com/web/zxyy"><font size=2px; color==#A4A4A4>太原市中心医院</font> </a>
							</li>
							<li>
								<a href="https://www.sxxxgyy.com/"><font size=2px; color==#A4A4A4>山西省心血管疾病医院</font> </a>
							</li>


						</ul>
					</div>
					<div class="clear"></div>

				</div>

				<div id="copyright">
					<p>
						<font size=3px; color=#666666;> CopyRight&copy; 中北大学</font>
					</p>


				</div>

			</div>

		</div>
		</div>
	</body>
</html>