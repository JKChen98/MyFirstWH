	function checkLogin(form){
		
		var sp1 = document.getElementById("sp1");
		var sp2 = document.getElementById("sp2");
		var sp3 = document.getElementById("sp3");
		var sp4 = document.getElementById("sp4");
		var sp5 = document.getElementById("sp5");
		var sp6 = document.getElementById("sp6");
		var sp7 = document.getElementById("sp7");
		
		//获取name内容
		var nicknamestr = form.nickname.value;
		
		//获取密码内容和确认密码内容
		var pwdstr = form.password.value;
		var repwdstr = form.repassword .value;
		
		//获取真实姓名内容
		var namestr = form.name.value;
		
		//获取邮箱内容
		var emailstr = form.email.value;
		
		var agestr = form.age.value;
		
		var telstr = form.tel.value;
		
		if(nicknamestr==null||nicknamestr==""){
			sp1.innerHTML="<font color='red'>昵称不能为空,请输入昵称</font>"
			form.nickname.focus;//让元素获取焦点  停留在指定位置
			return false;
		}else if(nicknamestr.trim().length>16){
			sp1.innnerHTMl="<font color='red'>昵称太长,请重新输入</font>"
			form.nickname.focus;
			return false;
		}
		
		if(pwdstr==null||pwdstr==""){
			sp2.innerHTML="<font color='red'>密码不能为空，请输入密码</font>"
			form.password.focus;//让元素获取焦点  停留在指定位置
			return false;
		}
		else if(pwdstr.trim().length<6||pwdstr.trim().length>14){
			sp2.innerHTML="<font color='red'>密码长度为6-14字符</font>"
			form.password.focus;//让元素获取焦点  停留在指定位置
			return false;
		}
		
		if(repwdstr == null || repwdstr == "" || repwdstr!=pwdstr){
			sp3.innerHTML="<font color='red'>密码输入不一致,请重新确认</font>"
			form.repassword.focus;
			return false;
		}
		
		if(namestr==null || namestr==""){
			sp4.innerHTML="<font color='red'>真实姓名不能为空,请输入姓名</font>"
			form.name.focus;//让元素获取焦点  停留在指定位置
			return false;
		}else if(namestr.trim().length<2 || namestr.trim().length>4){
			sp4.innerHTMl="<font color='red'>姓名长度有误,请重新输入</font>"
			form.name.focus;
			return false;
		}
		
		//使用正则表达式判断邮箱格式
		var reg = /^([a-zA-Z0-9]+[_|_|.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|_|.]?)*[a-zA-Z0-9]+\.(?:com|cn)$/;
		if(emailstr == null || emailstr == ""){
			sp5.innerHTML="<font color='red'>邮箱不能为空，请输入邮箱</font>"
			form.email.focus;//让元素获取焦点  停留在指定位置
			return false;
		}else if(!reg.test(emailstr)){
			sp5.innerHTML="<font color='red'>邮箱格式不正确,请输入正确邮箱</font>"
			form.email.focus;//让元素获取焦点  停留在指定位置
			return false;
		}
		
		//使用正则表达式判断年龄是否为数字
		var reg2 = /^[1-9]\d*$/;
		if(agestr == null || agestr == ""){
			sp6.innerHTML="<font color='red'>年龄不能为空!"
			form.age.focus;
			return false;
		}else if(!reg2.test(agestr)){
			sp6.innerHTML="<font color='red'>年龄必须为数字!</font>"
			form.age.focus;//让元素获取焦点  停留在指定位置
			return false;
		}
		
		if(telstr == null || telstr == ""){
			sp7.innerHTML="<font color='red'>电话不能为空!"
			form.tel.focus;
			return false;
		}else if(!reg2.test(telstr)){
			sp7.innerHTML="<font color='red'>电话必须为数字!</font>"
			form.tel.focus;//让元素获取焦点  停留在指定位置
			return false;
		}else if(telstr.trim().length != 11){
			sp7.innerHTML="<font color='red'>请检查电话输入是否为正常手机号!</font>"
			form.tel.focus;//让元素获取焦点  停留在指定位置
			return false;
		}
		
		alert('注册成功！')
		
		return true;
		
	}