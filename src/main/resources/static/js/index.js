$(function(){
	$("#publishBtn").click(publish);
});

function publish() {
	$("#publishModal").modal("hide");
	//获取标题和内容
	var title = $("#recipient-name").val();
	var content =$("#message-text").val();
	//发布异步请求
	$.post(
		CONTEXT_PATH+"/discuss/add",
		{"title":title,"content":content},
		function (data){
			data = $.parseJSON(data);
			//在提示框上显示返回的消息
			$("#hintBody").text(data.msg);
			//显示提示框
			$("#hintModal").modal("show");
			//两秒后隐藏
			setTimeout(function(){
				$("#hintModal").modal("hide");
				//如果成功则刷新整个页面
				if(data.code==0){
					window.location.reload();
				}
			}, 2000);
		}
	);


}