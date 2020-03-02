//页面加载完成就开始
$(function() { 
	//需要传值过来包括liveid号
	$.livelist();
	$.videolist();
	
	/*$('#zblb').change(function(){
		var id = $('#zblb').val();
		alert("被选中的："+id);	
		
	});*/
	/* $("#a").html().click(function() {
		 	alert("函数运行了呀");
		var Name = $(this).html();

		var tid = $(this).attr("value");
	alert("tid"+tid);
	 });*/
	 
	 
	 
	 
	 
	/* $("#a")[0].click(function(){
		 alert("函数运行了呀");
		 var tid = $(this).attr("value");
			alert("tid"+tid);
		 
	 });*/
	/*var oLi = document.getElementById("oLi");
	oLi.addEventListener(click,function(){
		console.log(1);
		
	});*/
	
	
});
/*******************测试****************************/






//开始进行查询,直播列表的查询
$.livelist = function(){
	$.postJSON('showview_showLive.action',{}, function(data) {
		//alert("data:"+data);
		 var backdata1=JSON.parse(data);//转化后的json对象，里面包含的是office
		
		   $.each(backdata1, function (i, item) {  
    		 
    	        $('#zblb').append("<li id=oLi><a href='live.html?id="+item.id+"' id='oLi'>"+item.name +"</a></li>");
    	        
            });
		   
	});
	
};
//开始进行视频列表的查询
$.videolist = function(){
	$.postJSON('showview_showVideo.action',{}, function(data) {
		//alert("data:"+data);
		 var backdata=JSON.parse(data);//转化后的json对象，里面包含的是office
		   $.each(backdata, function (i, item) {  
    		 
                
    	        $('#splb').append("<li ><a href=video.html?id="+item.id+">"+item.name +"</a></li>");
    	        //<li><a href="archive.html">Text 202</a></li>
            });
	});
};
//直播被选中



//ajax传参
$.postJSON = function(url, data, callback) { 
	$.post(url, data, callback, "json"); 
	}; 