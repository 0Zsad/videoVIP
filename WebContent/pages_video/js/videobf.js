var spid = UrlParm.parm("spid");
// spid = 1;  //test
url = "/videoVIP/SpbController/selectById.do";
parm = {"spid":spid};
$.post(url,parm,function(data){
	var str = "<video controls autoplay>"
			+ "<source src='"+data.spdz+"' type='video/mp4'>"
			+ "<source src='"+data.spdz+"' type='video/ogg'>"
			+ "<source src='"+data.spdz+"' type='video/webm'>"
			+ "</video>"
	document.getElementById("video").innerHTML=str;
	$("#spm").html(data.sppm);
	$("#sppm").html("视频名："+data.sppm);
	$("#spname").html(data.sppm);
	$("#sptype").html(getLx(data.splx));
	$("#spinfo").html(data.spjj);
	$("#spfm").attr("src","/videoVIP/spfmfile/"+data.spfm);
})

function getLx(ret){
	var dq ;
	switch (parseInt(ret)){
	case 1 :
		dq = "电影";
		break;
	case 2 :
		dq = "动漫";
		break;
	case 3 :
		dq = "纪录片";
		break;
	case 4 :
		dq = "综艺";
		break;
	}
	return dq;
}

$.ajax({
	type:"post",
	url:"/videoVIP/SpbController/list.do",
	dataType:"json",
	success:function(data){
		var zy = '';
		n = 0
		for(i = 1;(i-1) < data.length;i++,n++){
			if(n>=10){break;}
			 zy += 	'<div class="video_den">'
				+	'<img src="/videoVIP/spfmfile/'+data[i].spfm+'">'
				+	'<div>'
				+	'<p>'+data[i].sppm+'</p>'
				+	'</div></div>'
		}
		$("#video_side_den").html(zy);
	}
});
