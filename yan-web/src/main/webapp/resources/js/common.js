$(function() {
	// Waves初始化（点击动画效果）
	Waves.displayEffect();
	// 数据表格动态高度
	$(window).resize(function() {
		$('#table').bootstrapTable('resetView', { height : getHeight() });
	});
	// 设置main的div高度
	$("#main").css("height", getHeight());
});

// Yan重写bootstrapTable方法使用更便捷
// http://bootstrap-table.wenzhixin.net.cn/zh-cn/documentation/
(function($) {
	$.fn.bsTable = function(options) {
		//创建一些默认值，拓展任何被提供的选项
        var settings = $.extend({
        	url: '/',
    		contentType: "application/x-www-form-urlencoded",
    		method: 'post',
    		toolbar: '#toolbar',
    		idField: 'id',
    		clickToSelect: true,// 点击行时选中
    		singleSelect: false,// 只能单选
    		detailView: true,// 显示详细页面模式
    		detailFormatter: 'detailFormatter',// 详细页格式化
    		pagination: true,// 显示分页条
    		sidePagination: 'server',// 可选值为 client 或者 server
    		search: false,// 是否启用搜索框
    		classes: 'table table-hover',// table table-hover table-no-bordered
    		columns: []
        }, options);
        return this.each(function () {
        	// 插件方法
        	$(this).bootstrapTable({
        		url: settings.url,
        		contentType: settings.contentType,
        		method: settings.method,
        		toolbar: settings.toolbar,
        		height: getHeight(),
        		idField: settings.idField,// 指定主键列
        		striped: true,// 隔行变色效果
        		showRefresh: true,//是否显示 刷新按钮
        		showColumns: true,//是否显示 内容列下拉框
        		minimumCountColumns: 2,// 最小显示列数
        		clickToSelect: settings.clickToSelect,// 点击行时选中
        		singleSelect: settings.singleSelect,// 只能单选
        		detailView: settings.detailView,// 显示详细页面模式
        		detailFormatter: settings.detailFormatter,// 格式化详细页面模式的视图。
        		pagination: settings.pagination,// 显示分页条
        		paginationLoop: false,// 启用分页条无限循环的功能
        		sidePagination: settings.sidePagination,// 可选值为 client 或者 server
        		silentSort: false,// 点击分页按钮时，自动记住排序项
        		smartDisplay: true,// 是否自动隐藏分页条
        		escape: true,// 转义HTML字符串
        		search: settings.search,// 是否启用搜索框
        		searchOnEnterKey: true,// 按回车触发搜索方法
        		classes: settings.classes,// table table-hover table-no-bordered
        		columns: settings.columns
        	}).on('all.bs.table', function (e, name, args) {
        		$('[data-toggle="tooltip"]').tooltip();
        		$('[data-toggle="popover"]').popover();  
        	});
        });
	};
})(jQuery);

//动态高度
function getHeight() {
	return $(window).height() - 20;
}

// 数据表格展开内容
function detailFormatter(index, row) {
	var html = [];
	$.each(row, function(key, value) {
		html.push('<p><b>' + key + ':</b> ' + value + '</p>');
	});
	return html.join('');
}