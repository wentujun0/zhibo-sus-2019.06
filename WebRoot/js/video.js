$(function() { 
	var ID = $.getUrlParam('id');
	//alert("ID"+ID);
	var datas = {
		'video.idString':ID
	};
	//查找一个视频
	$.post("video_findOne.action",datas,function(data){
		//alert(data);
		var videodata=JSON.parse(data);
		//alert(videodata);
		//alert("data.url:"+videodata.url);
		
		$('#videomedia').attr('src',videodata.url);	
		$('#video_name').find('a').text(videodata.name);
		$('#video_description').text(videodata.description);
		
		
		
		
	},"json");
	
	
	
	
});
//获取url的参数
$.getUrlParam = function(name){
    var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
    var r = window.location.search.substr(1).match(reg);
    if (r!=null) return unescape(r[2]); 
    
    return null;

};

