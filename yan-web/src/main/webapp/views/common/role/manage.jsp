<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/global.jsp"%>
<%@ include file="/common/include_common.jsp"%>
<style>
<!-- /* 左右布局 */
.layout-left {
	position: fixed;
	width: 320px;
	background: #fff;
	height: 100%;
	transition: all;
	-webkit-transition-duration: .3s;
	transition-duration: .3s;
	z-index: 10;
	overflow-y: auto;
	box-shadow: 1px 0 4px rgba(0, 0, 0, .3);
}

.layout-right {
	position: fixed;
	width: calc(100% -320px);
	background: #fff;
	left: 320px;
	height: 100%;
}
</style>
<html lang="zh-cn">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>角色管理</title>
</head>
<body>

	<div class="layout-left">
		<div id="toolbar" align="right" style="background: #F5F5F5;">
			<a id="add-btn" class="waves-effect btn btn-info btn-sm"
				style="margin-right: 5px;" href="javascript:roleAdd();"><i
				class="zmdi zmdi-plus"></i> 添加</a> <a id="delete-btn"
				class="waves-effect btn btn-danger btn-sm"
				style="margin-right: 5px;" href="javascript:roleDelete();"><i
				class="zmdi zmdi-delete"></i> 删除</a> <a id="refresh-btn"
				class="waves-effect btn btn-warning btn-sm"
				style="margin-right: 5px;" href="javascript:roleAllRefresh();"><i
				class="zmdi zmdi-refresh"></i> 刷新</a>
		</div>
		<div id="ztree" class="ztree"></div>
	</div>
	<div class="layout-right">
		<iframe id="content_iframe" class="tab_iframe" frameborder="0"
			width="740" height="800" scrolling="no"></iframe>
	</div>
</body>
<script type="text/javascript">
	var treeObj;
	var setting = {
		async : {
			enable : true,
			url : "${pageContext.request.contextPath}/common/role/roleTree",
			autoParam : [ "id", "pid", "name", "level" ]
		},
		view: {
			fontCss: setFontCss
		},
		callback : {
			//beforeClick: zTreeBeforeClick,
			onClick : zTreeOnClick
		}
	};
	// 初始化 tree 数据
	treeObj = $.fn.zTree.init($('#ztree'), setting);
	// 设置样式
	function setFontCss(treeId, treeNode) {
		return treeNode.valid == false ? {color:"red"} : {};
	};
	// 禁止第一节点被选中
	/*
	function zTreeBeforeClick(treeId, treeNode, clickFlag) {
		return (treeNode.level != '0');
	}
	 */
	 var lastSelected;
	 var lastChecked;
	// tree 点击事件
	function zTreeOnClick(event, treeId, treeNode) {
		if(0 == treeNode.level){
			$('#delete-btn').hide();
		}else{
			$('#delete-btn').show();
		}
		if(lastSelected != treeNode.id || lastChecked != 'click'){
			$("#content_iframe").attr("src", "${pageContext.request.contextPath}/common/role/" + treeNode.id + "/edit");
		}
		lastSelected = treeNode.id;
		lastChecked = 'click';
	}
	// 添加 tree 节点
	function roleAdd() {
		var nodes = treeObj.getSelectedNodes();
		if ("" == nodes) {
			$.alert("请选择父节点");
		} else {
			if(lastSelected != nodes[0].id || lastChecked != 'add'){
				$("#content_iframe").attr("src", "${pageContext.request.contextPath}/common/role/" + nodes[0].id + "/add");
			}
			lastSelected = nodes[0].id;
			lastChecked = 'add';
		}
	}
	// 删除 tree 节点
	function roleDelete() {
		var nodes = treeObj.getSelectedNodes();
		if (nodes != '') {
			$.confirm({
				type : 'red',
				animationSpeed : 300,
				title : false,
				content : '确认删除[' + nodes[0].name + ']角色吗？',
				buttons : {
					confirm : {
						text : '确认',
						btnClass : 'waves-effect waves-button',
						action : function() {
							$.post('${pageContext.request.contextPath}/common/role/delete', {roleId:nodes[0].id, rolePid:nodes[0].pid}, function(data){
								if('1' == data.status){
									roleParentsNodeRefresh();
								}else{
									roleParentNodeRefresh();
								}
								$.alert(data.msg);
							});
						}
					},
					cancel : {
						text : '取消',
						btnClass : 'waves-effect waves-button'
					}
				}
			});
		} else {
			$.confirm({
				title : false,
				content : '请选择需要删除的菜单！',
				autoClose : 'cancel|3000',
				backgroundDismiss : true,
				buttons : {
					cancel : {
						text : '取消',
						btnClass : 'waves-effect waves-button'
					}
				}
			});
		}
	}
	// 全部 tree 刷新 
	function roleAllRefresh() {
		treeObj.reAsyncChildNodes(null, "refresh");
		lastSelected='';
		lastChecked='';
	}
	//选中 tree 节点父节点的父节点刷新 
	function roleParentsNodeRefresh() {
		var nodes = treeObj.getSelectedNodes();
		if (nodes.length > 0) {
			treeObj.reAsyncChildNodes(nodes[0].getParentNode().getParentNode(), "refresh");
		}
		lastSelected='';
		lastChecked='';
	}
	// 选中 tree 节点的父节点刷新 
	function roleParentNodeRefresh() {
		var nodes = treeObj.getSelectedNodes();
		if (nodes.length > 0) {
			treeObj.reAsyncChildNodes(nodes[0].getParentNode(), "refresh");
		}
		lastSelected='';
		lastChecked='';
	}
	// 选中 tree 节点刷新 
	function roleNodeRefresh() {
		var nodes = treeObj.getSelectedNodes();
		if (nodes.length > 0) {
			treeObj.reAsyncChildNodes(nodes[0], "refresh");
		}
		lastSelected='';
		lastChecked='';
	}
</script>
</html>