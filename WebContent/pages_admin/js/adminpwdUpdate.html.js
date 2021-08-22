/**校验密码的合法性*/
	function checkPwd() {
		if (/^[A-Za-z0-9]{4,30}$/.test(form1.glypwd.value)) {
			$("#glypwd").html("");
			return true;
		} else {
			$("#glypwd").html("密码错误(至少四位字母或数字)");
			return false;
		}
	}
	
	/**校验两次密码是否一致*/
	function checkPwd2(){
		var span = document.querySelector("#glypwd2+span");
		if(form1.glypwd.value == form1.glypwd2.value){
			span.innerHTML = "*";
			return true;
		}else{
			span.innerHTML = "两次密码不一致！";
			return false;
		}
	}
	
	/** 修改保存*/
	function doUpdate(){
		var obj = sessionStorage.getItem("obj");
		var gly = JSON.parse(obj);
		var glyzh = gly.glyzh;
		if(checkPwd() && checkPwd2()){
			$.post("/videoVIP/GlybController/update.do", {
				glyzh:glyzh ,
				glypwd: $("#glypwd").val()
			},
			function(ret) {
				if (ret == true) {
					$("#tip").html("更新成功！");
					window.parent.location.href = "/videoVIP/pages_Login/adminlogin.html";
				} else {
					$("#tip").html("更新失败！");
				}
			}
		);
		}
	}