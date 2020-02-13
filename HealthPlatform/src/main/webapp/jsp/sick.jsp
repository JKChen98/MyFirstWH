<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/jsp/header.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<title>疾病精确评估</title>
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

								<li>
									<a href="${url}/jsp/main.jsp">主页</a>
								</li>
								<li>
									<a href="${url}/test/find?id=${sessionScope.user.id}">教师体检管理</a>
								</li>
								<li id="selected">
									疾病精确评估
								</li>
								<li >
									<a href="${url}/jsp/food.jsp">教师饮食管理</a>
								</li>
								<li>
									<a href="${url}/jsp/dairy.jsp">教师健康日志</a>
								</li>

							</ul>
						</div>
					</div>
				</div>
				<br />
				<div id="locate">
					&nbsp;&nbsp;当前位置>>首页>>疾病精确评估
				</div>
			</div>
			<div id="content">
				<div id="shang" style="padding-top: 70px;">
					<form action="${url}/sick/evaluate" method="post">
					<table width="100%;">
					<tr>
						<td colspan="2" style="text-align: left;">请填写以下信息：</td>
					</tr>
					<tr>
						<td style="text-align: right;">收缩压：</td>
						<td><input type="text" name="bpHigh" size="10" >mmHg</td>
					</tr>
					<tr>
						<td style="text-align: right;">舒张压：</td>
						<td><input type="text" name="bpLow"  size="10">mmHg</td>
					</tr>
					<tr>
						<td style="text-align: right;">心率：</td>
						<td><input type="text" name="bs"  size="10"></td>
					</tr>
					<tr>
						<td style="text-align: right;">高血压既往史：</td>
						<td><input type="radio" name="historyHypertension" value="true">有<input type="radio" name="historyHypertension" value="false" checked="checked">无</td>
					</tr>
					<tr>
						<td style="text-align: right;">高血压家族史:</td>
						<td><input type="radio" name="historyFamilyHypertension" value="true">有<input type="radio" name="historyFamilyHypertension" value="false" checked="checked">无</td>
					</tr>
					<tr>
						<td style="text-align: right;">吸烟史：</td>
						<td><input type="radio" name="historySmoking" value="true">有<input type="radio" name="historySmoking" value="false">无</td>
					</tr>
					<tr>
						<td style="text-align: right;">体育锻炼：</td>
						<td><input type="radio" name="exerciseGroup" value="0">从不<input type="radio" name="exerciseGroup" value="1" checked="checked">一周＜3次<input type="radio" name="exerciseGroup" value="2">一周≥3次</td>
					</tr>
					<tr>
						<td style="text-align: right;">年龄：</td>
						<td><input type="radio" name="ageGroup" value="0">0-20<input type="radio" name="ageGroup" value="1" checked="checked">21-40
						<input type="radio" name="ageGroup" value="2">41-60<input type="radio" name="ageGroup" value="3">60以上</td>
					</tr>
					<tr>
						<td colspan="2" style="text-align:center;"><input type="submit" value="预测评估"></td>
					</tr>
					</table>	
					</form>
				</div>
				
				<div id="xia">
				<c:if test="${!empty result}">
				您患有高血压的可能性：${result}<br/>
				<c:if test="${result>90}">
				高血压预防建议：<br/>
				1、不吸烟、少饮酒；<br/>
				2、控制饮食、防止肥胖；<br/>
				3、低盐饮食、多食蔬菜；<br/>
				4、适度锻炼、睡眠充足；<br/>
				5、保持情绪稳定、乐观。<br/>
				</c:if>
				</c:if>
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
