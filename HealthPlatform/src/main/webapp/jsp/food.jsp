<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/jsp/header.jsp"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<title>教师饮食管理</title>
		
		<%-- <script type="text/javascript" src="${url}/dwr/engine.js"></script>
		<script type="text/javascript" src="${url}/dwr/util.js"></script>
		<script type="text/javascript" src="${url}/dwr/interface/foodheat.js"> 
		</script> --%>
		
<c:if test="${empty sessionScope.user}">
	<script>
		alert("请先登录！");
		window.location.href = "${url}/jsp/main.jsp";
	</script>
</c:if>
		
		<script type="text/javascript">
$(document).ready(function() {
	$("#sum").click(function() {
		DWRUtil.useLoadingMessage("正在计算...");
		var formMap = DWRUtil.getValues("heatform");
		foodheat.heatCalculate(formMap, heat);
		foodheat.showFoods(setTable);
	});
	var heat = function(value) {
		$("#heat").html("您的当前目标热量值为 ：" + value + "(千卡)");
		$("#xia").css('display','block');
	}
	var setTable = function(foodlist) {
		if (typeof window['DWRUtil'] == 'undefined')
			window.DWRUtil = dwr.util;
		$("#foodtable").html("");
		var i=1;
			DWRUtil.addRows("foodtable", foodlist, [
				function(item) {
					switch(i++){
					case 1:return "周一";break;
					case 2:return "周二";break;
					case 3:return "周三";break;
					case 4:return "周四";break;
					case 5:return "周五";break;
					case 6:return "周六";break;
					case 7:return "周日";break;
					}	
					}, 
				function(item) {return item[0].name}, 
				function(item) {return item[1].name}, 
				function(item) {return item[2].name}, 
				function(item) {return item[3].name}, 
				function(item) {return item[4].name}, 
				function(item) {return item[5].name}, 
				function(item) {return item[6].name}, 
				function(item) {return item[7].name}, 
				function(item) {return item[8].name}, 
				function(item) {return item[9].name}, 
				function(item) {return item[10].name}, 
				function(item) {return item[11].name}, 
			], {
        rowCreator:function(options) { //自定义 tr 的创建行为
            var row = document.createElement("tr"); 
            row.style.backgroundColor = "rgb(" + (options.rowIndex * 50) + ",80,140)"; 
            return row; 
        }, 
        cellCreator:function(options) { //自定义 td 的创建行为
            var td = document.createElement("td"); 
            td.style.fontWeight = "bold"; 
            td.style.height = "25px"; 
            return td; 
        } 
			});
		

	}
});
</script>
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
								<li>
									<a href="${url}/jsp/sick.jsp">疾病精确评估</a>
								</li>
								<li id="selected">
									教师饮食管理
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
					&nbsp;&nbsp;当前位置>>首页>>教师饮食管理
				</div>
			</div>
			<div id="content">
				<div id="shang" style="padding-top: 70px">
					<form id="heatform" action="" method="post">
						<table border="0" width="500" align="left">
							<tr>
								<th colspan="2">
									<font size=3px; color==#A4A4A4;float:left>配餐设置</font>
								</th>
							</tr>
							<tr>
								<td>
									体重:
								</td>
								<td>
									<input type="text" name="weight" id="weight" size="3px">
									公斤
								</td>
							</tr>
							<tr>
								<td>
									性别:
								</td>
								<td>
									<input type="radio" name="sex" value="0" checked>
									男
									<input type="radio" name="sex" value="1">
									女
								</td>

							</tr>

							<tr>
								<td>
									年龄:
								</td>
								<td>
									<input type="radio" name="agegroup" value="1" checked>
									18-30岁
									<input type="radio" name="agegroup" value="2">
									31-60岁
									<input type="radio" name="agegroup" value="3">
									60岁以上
								</td>
							</tr>
							<tr>
								<td>
									体力活动水平:
								</td>
								<td>
									<input type="radio" name="coefficient" value="1">
									极--轻卧床全天
									<input type="radio" name="coefficient" value="2" checked>
									轻--轻活动生活模式（多坐或缓步）
									<input type="radio" name="coefficient" value="3">
									重--一般活动度
									<input type="radio" name="coefficient" value="4">
									极重--活动量大的生活模式
								</td>
							</tr>
							<tr>
								<td colspan="2" align="center">
									<input type="button" id="sum" value="计算">
								</td>

							</tr>
							<tr>
								<td colspan="2">
									<div id="heat"></div>
								</td>
							</tr>

						</table>
					</form>
					<img src="../images/food.jpg" border="0" width="310" height="210" />
				</div>

				<div id="xia" style="display: none;">
					<table border=1 width="800" align="center" cellspacing="0"
						cellpadding="0" bgcolor="#cccccc">
						<caption>
							<h1>
								推荐配餐
							</h1>
						</caption>


						<tr bgcolor="#aaa">
							<th width="10%;" height="30px;">
								时间
							</th>
							<th colspan="4" width="30%;">
								早餐
							</th>
							<th colspan="4" width="30%;">
								午餐
							</th>
							<th colspan="4" width="30%;">
								晚餐
							</th>
						</tr>
						<tbody id="foodtable"></tbody>
					</table>
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
