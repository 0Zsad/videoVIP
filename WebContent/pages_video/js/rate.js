layui.use(['rate'], function(){
  var rate = layui.rate;
  
  rate.render({
    elem: '#test6'
    ,value: 0
    ,text: true
    ,setText: function(value){
      this.span.text(value);
    },choose: function(value){	//点击执行该函数
		//console.log(value);
	}
  })
 
  
  //只读
  rate.render({
    elem: '#test9'
    ,value: 3.7
	,half:true
    ,readonly: true
  });

});