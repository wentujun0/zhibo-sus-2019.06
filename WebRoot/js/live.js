$(function() { 
	
	
	
	var ID = $.getUrlParam('id');
	//alert("ID"+ID);
	var datas = {
			'live.id':ID,
		};
		//查找一个视频
		$.post("live_findOne.action",datas,function(data){
			//alert(data);
			//alert("为什么没有值呢？");
			var livedata=JSON.parse(data);
			//alert(livedata);
			//alert("url:"+livedata.url);
			
			//展示页面
			$('#livemedia').attr('src',livedata.url);	
			$('#live_name').find('a').text(livedata.name);
			$('#live_description').text(livedata.description);
			
			
			
			
			
		},"json");
		
	
	
});
//获取url的参数
$.getUrlParam = function(name){
    var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
    var r = window.location.search.substr(1).match(reg);
    if (r!=null) return unescape(r[2]); 
    
    return null;

};

