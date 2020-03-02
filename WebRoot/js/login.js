$(function(){
	/*function but1(){
		
		 alert("111");
		
		
		
	}*/
	
	
	$("#btntologin").click(function(){
		// alert("111");
	      //  alert($("#checkcodes").val());
		 
		 $.post("live_findOne.action",datas,function(data){});
	        
	        
	       /* $.post("user_login.action", function(data) {

	    	});*/
	    });
	
	
});