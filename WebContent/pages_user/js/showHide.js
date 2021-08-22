$(function(){
	$(".showHide").click(function(){
		var imgs = $(this).find("img");
		for (i = 0; i < imgs.length; i++) {
			if($(imgs[i]).css("display") == "none"){
				$(imgs[i]).css("display","");
			}else{
				$(imgs[i]).css("display","none");
			}
		}
//		$(".search .body").slideToggle("slow");
		$(".content").slideToggle("slow");
	});
});