/** 用户名 校验 */
function checkYhzh(){
	if(form1.yhzh.value == ''){
		$("#yhzh").next().html("用户名不能为空");
		return false;
	}else{
		$("#yhzh").next().html("*");
		
		var isExisted = false;
		$.ajax({
			type:"post",
			data:{yhzh:$("#yhzh").val()},
			url:"/videoVIP/YhbController/isExists.do",
			async:false,
			dataType:"json",
			success:function(ret){//用户名被注册ret返回true，否则返回false
				isExisted = ret;
			}
		});
		
		if(isExisted == true){
			$("#yhzh").next().html("用户名已被注册");
			form1.yhzh.focus();	// 让用户名文本框获取焦点
			return false;
		}else{
			$("#yhzh").next().html("*");
			return true;
		}
	}
}

/**校验密码的合法性*/
function checkPwd() {
	if (/^[A-Za-z0-9]{4,30}$/.test(form1.pwd.value)) {
		$("#pwdPrompt").html("");
		return true;
	} else {
		$("#pwdPrompt").html("密码错误(至少四位字母或数字)");
		return false;
	}
}

/**校验两次密码是否一致*/
function checkPwd2(){
	var span = document.querySelector("#pwd2+span");
	if(form1.pwd.value == form1.pwd2.value){
		span.innerHTML = "*";
		return true;
	}else{
		span.innerHTML = "两次密码不一致！";
		return false;
	}
}

/** 新增保存*/
function doAdd(){
	if(checkYhzh() && checkPwd() && checkPwd2()){
		$.post("/videoVIP/YhbController/add.do",
				{	
					yhzh:$("#yhzh").val(),
					pwd:$("#pwd").val(),
					yhnc:$("#yhnc").val()
				},
				function(ret){
					if(ret == true){
						$("#tip").html("添加成功！");
						location.href = "/videoVIP/pages_admin/userMgr.html";
					}else{
						$("#tip").html("添加失败！");
					}
				}
		);
	}
}