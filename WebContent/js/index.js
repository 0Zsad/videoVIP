/********************* 热播左侧Ajax遍历视频封面 ********************/
$.ajax({
	type:"post",
	url:"/videoVIP/SpbController/list.do?sp=1",
	dataType:"json",
	success:function(data){
		var zy = '';
		for(i = 0;i < data.length;i++){
		  if(i < 1){
		  	zy +=	'<div class="col-md-12">'
			 +	'<div class="thumbnail">'
			 +	'<a href="/videoVIP/pages_xq/spxq.html?spid='+data[i].spid+'"><img style="height: 307px;" alt="图片加载失败" src="/videoVIP/spfmfile/'+ data[i].spfm +'" /></a>'
			 +	'<h5>剧名：'+ data[i].sppm +'</h5>'
			 +	'<p>年份：'+ data[i].spsj +'</p>'
			 +	'<p>简介：'+ data[i].spjj +'</p>'
			 +	'</div>'
			 +	'</div>'
		  }else{
		  	break;
		  }
		}
		$(".item-big").append(zy);
	}
});


/********************* 热播右侧Ajax遍历视频封面 ********************/
$.ajax({
	type:"post",
	url:"/videoVIP/SpbController/list.do?sp=1",
	dataType:"json",
	success:function(data){
		var zy = '';
		for(i = 0;i < data.length;i++){
		  if(i < 8){
		  	zy +=	'<div class="col-md-3">'
			 +	'<div class="thumbnail">'
			 +	'<a href="/videoVIP/pages_xq/spxq.html?spid='+data[i].spid+'"><img alt="图片加载失败" src="/videoVIP/spfmfile/'+ data[i].spfm +'" /></a>'
			 +	'<h5>剧名：'+ data[i].sppm +'</h5>'
			 +	'</div>'
			 +	'</div>'
		  }else{
		  	break;
		  }
		}
		$(".item-rebo").append(zy);
	}
});

/********************* 电影Ajax遍历视频封面 ********************/
$.ajax({
	type:"post",
	url:"/videoVIP/SpbController/list.do?splx=1",
	dataType:"json",
	success:function(data){
		var zy = '';
		for(i = 0;i < data.length;i++){
		 if(i < 12){
			 zy +=	'<div class="col-md-2">'
				 +	'<div class="thumbnail">'
				 +	'<a href="/videoVIP/pages_xq/spxq.html?spid='+data[i].spid+'"><img alt="图片加载失败" src="/videoVIP/spfmfile/'+ data[i].spfm +'" /></a>'
				 +	'<h5>剧名：'+ data[i].sppm +'</h5>'
				 +	'</div>'
				 +	'</div>'
		 }else{
			 break;
		 }
		}
		$(".dy").append(zy);
	}
});

/********************* 动漫Ajax遍历视频封面 ********************/
$.ajax({
	type:"post",
	url:"/videoVIP/SpbController/list.do?splx=2",
	dataType:"json",
	success:function(data){
		var zy = '';
		for(i = 0;i < data.length;i++){
		  if(i < 12){
		  	zy +='<div class="col-md-2">'
			 +	'<div class="thumbnail">'
			 +	'<a href="/videoVIP/pages_xq/spxq.html?spid='+data[i].spid+'"><img alt="图片加载失败" src="/videoVIP/spfmfile/'+ data[i].spfm +'" /></a>'
			 +	'<h5>剧名：'+ data[i].sppm +'</h5>'
			 +	'</div>'
			 +	'</div>'
		  }else{
		  	break;
		  }
		}
		$(".dm").append(zy);
	}
});

/********************* 纪录片Ajax遍历视频封面 ********************/
$.ajax({
	type:"post",
	url:"/videoVIP/SpbController/list.do?splx=3",
	dataType:"json",
	success:function(data){
		var zy = '';
		for(i = 0;i < data.length;i++){
		  if(i < 12){
		  	zy +='<div class="col-md-2">'
			 +	'<div class="thumbnail">'
			 +	'<a href="/videoVIP/pages_xq/spxq.html?spid='+data[i].spid+'"><img alt="图片加载失败" src="/videoVIP/spfmfile/'+ data[i].spfm +'" /></a>'
			 +	'<h5>剧名：'+ data[i].sppm +'</h5>'
			 +	'</div>'
			 +	'</div>'
		  }else{
		  	break;
		  }
		}
		$(".jj").append(zy);
	}
});

/********************* 综艺Ajax遍历视频封面 ********************/
$.ajax({
	type:"post",
	url:"/videoVIP/SpbController/list.do?splx=4",
	dataType:"json",
	success:function(data){
		var zy = '';
		for(i = 0;i < data.length;i++){
		  if(i < 12){
		  	zy +='<div class="col-md-2">'
			 +	'<div class="thumbnail">'
			 +	'<a href="/videoVIP/pages_xq/spxq.html?spid='+data[i].spid+'"><img alt="图片加载失败" src="/videoVIP/spfmfile/'+ data[i].spfm +'" /></a>'
			 +	'<h5>剧名：'+ data[i].sppm +'</h5>'
			 +	'</div>'
			 +	'</div>'
		  }else{
		  	break;
		  }
		}
		$(".zy").append(zy);
	}
});


/********************* 排行榜 ********************/
function ranksp(type){
	$.ajax({
		type:"post",
		url:"/videoVIP/SpbController/listByType.do",
		data:{splx:type},
		dataType:"json",
		success:function(data){
			var zy = '';
			n = 0
			for(i = 1;(i-1) < data.length;i++,n++){
				if(n>=10){break;}
				 zy += '<tr>'
					 + '<td>'+i+'</td>'
					 + '<td><a href="/videoVIP/pages_xq/spxq.html?spid='+data[i-1].spid+'">'+data[i-1].sppm+'</a></td>'
					 + '</tr>'
			}
			$("#rank"+type).html(zy);
		}
	});
}
ranksp(1);
ranksp(2);
ranksp(3);
ranksp(4);