$(function(){
	doList();
})

function doList(){
	$.ajax({
		type:"post",
		url:"/videoVIP/SpbController/list.do",
		data:{
			spid:null,
			sppm: form1.sppm.value,
			splx: form1.splx.value,
			spdq: form1.spdq.value
			},
		dataType:"json",
		success:function(data){
			$(".dy").empty();
			var sp = '';
			for(i = 0;i < data.length;i++){
			  sp +=	'<div class="col-md-2">'
				 +	'<div class="thumbnail">'
				 +	'<a href="/videoVIP/pages_admin/videoUpdate.html?spid='+data[i].spid+'"><img alt="'+ data[i].sppm +'" src="/videoVIP/spfmfile/'+ data[i].spfm +'" /></a>'
				 +	'<h4> '+ data[i].sppm +'</h4>'
				 +	'<input type="button" onclick="doDelete(\''+data[i].spid+'\')" value="删除" />'
				 +	'</div>'
				 +	'</div>'
			}
			$(".dy").append(sp);
		}
	});
}

function doDelete(spid){
	$.post("/videoVIP/SpbController/deleteById.do",{spid:spid},function(ret){
		if(ret == true){
			location.href = "/videoVIP/pages_admin/videoMgr.html";
		}else{
			alert("删除失败！");
		}
	});
}