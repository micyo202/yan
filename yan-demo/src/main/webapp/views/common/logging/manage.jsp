<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/global.jsp" %>
<%@ include file="/common/include_common.jsp" %>
<html lang="zh-cn">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>日志记录</title>
</head>
<body>
<div id="main">
	<div id="toolbar">
		<a class="waves-effect waves-button" href="javascript:deleteAction();" ><i class="zmdi zmdi-close"></i> 清空日志</a>
	</div>
	<table id="table"></table>
</div>

<script type="text/javascript">
var $table = $('#table');
$(function() {
	// bootstrap table初始化
	// http://bootstrap-table.wenzhixin.net.cn/zh-cn/documentation/
	$table.bsTable({
		url: '${pageContext.request.contextPath}/common/logging/list',	// 请求后台的URL
		idField: 'eventId',
		search: true,
		classes: 'table table-hover table-no-bordered',
		columns: [
			{field: 'timestmp', title: '时间戳', align: 'center'},
			{field: 'levelString', title: '日志界别', align: 'center'},
			{field: 'callerFilename', title: '执行类', align: 'center'},
			{field: 'formattedMessage', title: '日志内容', align: 'left', formatter: function(value, row, index){
				var res;
				if(value.length > 72){
					res = value.substring(0, 72)+'...';
				}else{
					res = value;
				}
				return res;
			}},
			{field: 'action', title: '操作', align: 'center', formatter: 'actionFormatter', events: 'actionEvents', clickToSelect: false}
		]
	});
});
function actionFormatter(value, row, index) {
    return [
        '<a class="detail ml10" href="javascript:void(0)" data-toggle="tooltip" title="查看"><i class="glyphicon glyphicon-search"></i></a>　'
    ].join('');
}

window.actionEvents = {
    'click .detail': function (e, value, row, index) {
        alert(JSON.stringify(row.formattedMessage));
        //console.log(value, row, index);
    }
};
function detailFormatter(index, row) {
	var html = [];
	$.each(row, function (key, value) {
		html.push('<p><b>' + key + ':</b> ' + value + '</p>');
	});
	return html.join('');
}
// 删除
function deleteAction() {
	$.confirm({
		type: 'red',
		animationSpeed: 300,
		title: false,
		content: '确认清空全部日志吗？',
		buttons: {
			confirm: {
				text: '确认',
				btnClass: 'waves-effect waves-button',
				action: function () {
					$.post('${pageContext.request.contextPath}/common/logging/clear',null,function(data){
						$table.bootstrapTable('refresh'); 
					});
				}
			},
			cancel: {
				text: '取消',
				btnClass: 'waves-effect waves-button'
			}
		}
	});
}
</script>
</body>
</html>