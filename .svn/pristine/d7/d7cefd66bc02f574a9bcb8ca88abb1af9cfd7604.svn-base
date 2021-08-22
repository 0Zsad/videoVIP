var collflag = true; 	//收藏标志
bgc = "";				//按键颜色


selectsc();
$("#collbtn").click(function(){
	var yh = sessionStorage.getItem("user");
	console.log(yh!=null)
	if(yh!=null){
		if(collflag){
			sc();
		}else{
			qxsc();
		}
	}else{
		// alert("请登录后收藏！")
	}
})

// 查询是否收藏
function selectsc(){
	var yh = sessionStorage.getItem("user");
	var user = JSON.parse(yh);
	if(yh!=null){
		url = "/videoVIP/ScbController/select.do";
		parm = {
			"yhzh":user.yhzh,
			"spid":spid
		}
		$.post(url,parm,function(data){
			// 成功执行函数
			if(data){
				changbtng();	//已收藏
			}else{
				changbtnf();	//未收藏
			}
		})
	}else{
		$("#coll").addClass("colldiv");
	}
}

// ajax收藏
function sc(){
	var yh = sessionStorage.getItem("user");
	var user = JSON.parse(yh);
	var yhzh = user.yhzh;			//用户账号
	url = "/videoVIP/ScbController/add.do";
	parm = {
		"yhzh":yhzh,
		"scsj":new Date().toLocaleDateString(),
		"spid":spid
	}
	$.post(url,parm,function(data){
		// 成功执行函数
		changbtng();
	})
}
function changbtng(){
	bgc = "gray";
	collflag = false;
	$("#collbtn").css("background-color",bgc)
}

// ajax取消收藏（有问题）
function qxsc(){
	var yh = sessionStorage.getItem("user");
	var user = JSON.parse(yh);
	var yhzh = user.yhzh;			//用户账号
	url = "/videoVIP/ScbController/deleteByObj.do";
	parm = {
		"yhzh":yhzh,
		"spid":spid
	}
	$.post(url,parm,function(data){
		// 成功执行函数
		changbtnf();
	})
}
function changbtnf(){
	bgc = "#00FFFF";
	collflag = true;
	$("#collbtn").css("background-color",bgc)
}


// 弹框,绑定类.colldiv
new Vue({
      el: '.colldiv',
      data: function() {
        return {}
      },
	  methods:{
		  infomessage:function(){
			  this.$message('请登录后再收藏！！！');
		  },
		  seccessmessage:function(){
			   this.$message({message: '请登录后再收藏！！！',type: 'success'});
		  },
		  alertmessage:function(){
			  this.$message({message: '请登录后再收藏！！！',type: 'warning'});
		  },
		  errormessage:function(){
			  this.$message.error('请登录后再收藏！！！');
		  },
	  }
    })