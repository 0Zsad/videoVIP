$(function(){
	function calcPage(){
		//设定页面容器的高宽等于文档(视口)的高宽
		$("#panel").height($(document).outerHeight(true));
		$("#panel").width($(document).outerWidth(true));
		
		//动态计算页面右部分的宽度
		$("#right").outerWidth(
			$("#panel").outerWidth(true) - $("#left").outerWidth(true)
		);
		
		//动态计算右边内容展示区的高度
		$("#center").height(
			$("#panel").outerHeight(true) 
			- $("#top").outerHeight(true) 
			- $("#bottom").outerHeight(true)
		);
	}
	
	calcPage();
	
	//动态计算页面控件大小(当页面调整大小时)
	$(window).resize(function(){
		calcPage();
	});
	//动态计算页面控件大小(当出现滚动条时)
	$(window).scroll(function(){
		calcPage();
	});
	
	
	/*--------------- 左侧 - 菜单效果:begin ---------------*/
	$("#menu>p").each(function(){
		$(this).click(function(){
			if($(this).find("span").html() == "∧"){
				$(this).find("span").html("∨");
			}else{
				$(this).find("span").html("∧");
			}
			$(this).next().slideToggle("slow");
		});
	});
	/*--------------- 左侧 - 菜单效果:end ---------------*/
});

var user = sessionStorage.getItem("user")
var yh = JSON.parse(user);
$("#yhm").html(yh.yhnc);






