$(function() { 
	$.post("show_showCompany.action", function(data) {
		 var backdata=JSON.parse(data);//转化后的json对象，里面包含的是company
		 //alert(backdata);
		 //遍历
		for(var key in backdata){
			//alert(key+":"+backdata[key]);
			var value = backdata[key];
			$("#companyId").append("<option value='"+value+"'>"+key+"</option>");
		}
		
		$("#companyId option:first").prop("selected",true);//默认设置选中第一个
		//之后跟计划选中的一个的值
		var companyId = $("#companyId").val();
		//alert("一开始被选中的值为:"+$("#companyId").val());
		$.postJSON('show_showOffice.action',{'companyid':companyId}, function(data) {
			 var backdata1=JSON.parse(data);//转化后的json对象，里面包含的是office
			for(var key in backdata1){
				//alert(key+":"+backdata1[key]);
				var value = backdata1[key];
				$("#officeId").append("<option value='"+value+"'>"+key+"</option>");
			}
			$("#officeId option:first").prop("selected",true);//默认设置选中第一个
			//alert("默认选中的第一个office:"+$('#officeId').val());
		});
		//当院发生改变时，系也会改变
		$('#companyId').change(function(){
		     console.log($('#companyId').val());//每次选择都会输出选择的当前option的value
		   //  alert("后来被选中的"+$('#officeId').val());
		     		//改变company后的值是
		     	var companyId1 = $('#companyId').val();
		    	 	//置空
		     		$("#officeId").empty();
		    		$.postJSON('show_showOffice.action',{'companyid':companyId1}, function(data) {
		    			var backdata2=JSON.parse(data);//转化后的json对象，里面包含的是office
		    			for(var key in backdata2){
		    				//alert("改变后"+key+":"+backdata2[key]);
		    				var value = backdata2[key];
		    				$("#officeId").append("<option value='"+value+"'>"+key+"</option>");
		    			}
		    			$("#officeId option:first").prop("selected",true);//默认设置选中第一个
		    			//alert("company改变后选中的第一个office:"+$('#officeId').val());
		    			
		    		});
		    	 
		   
		});
		//var offid = $("#officeId").val();
		
		
		},"json"); 
});
$.postJSON = function(url, data, callback) { 
	$.post(url, data, callback, "json"); 
	}; 
