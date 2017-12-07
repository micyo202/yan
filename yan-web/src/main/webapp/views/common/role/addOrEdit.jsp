<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/global.jsp"%>
<%@ include file="/common/include_common.jsp"%>
<html lang="zh-cn">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>角色添加修改页</title>
</head>
<body>
	<form id="dataForm" method="post">
		<div id="toolbar" align="left" style="background: #F5F5F5;">
			<button id="save-btn" class="waves-effect btn btn-success btn-sm"
				style="margin-left: 10px;" type="button" href="javascript:;">
				<i class="zmdi zmdi-save"></i> 保存
			</button>
			<c:if test="${role.roleType == 'role'}">
				<button id="resource-btn"
					class="waves-effect btn btn-primary btn-sm"
					style="margin-left: 10px;" type="button" data-toggle="modal"
					data-target="#meneModal" href="javascript:;">
					<i class="zmdi zmdi-wrench"></i> 菜单资源
				</button>
			</c:if>
		</div>

		<div class="container col-xs-11"
			style="margin-top: 30px; margin-left: 50px; display: table;">

			<c:if test="${role.roleValid == 'false' }">
				<div class="row">
					<div class="col-xs-11">
						<div class="alert alert-warning alert-dismissible" role="alert">
							<button type="button" class="close" data-dismiss="alert"
								aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
							<strong>注意！</strong> 当前角色状态是无效，该角色及其子角色在用户中不生效。
						</div>
					</div>
				</div>
			</c:if>
			
			<div id="noSelDiv" style="display: none;" class="row">
				<div class="col-xs-11">
					<div class="alert alert-danger alert-dismissible" role="alert">
						<strong>警告！</strong> 请选择左侧角色节点再进行操作。
					</div>
				</div>
			</div>

			<div class="row" style="margin-top: 10px; margin-bottom: 10px;">
				<div class="col-xs-4 text-left"
					style="background-color: #E6E6F2; line-height: 26px; vertical-align: middle;">
					<label style="margin-top: 5px; font-size: 14px; color: grey;">角色名称：</label>
				</div>
				<div class="col-xs-7">
					<div class="form-group">
						<input type="text" id="roleName" name="roleName"
							value="${role.roleName}" class="form-control"
							placeholder="角色树显示的名称（必填）" />
					</div>
				</div>
			</div>

			<div class="row" style="margin-top: 10px; margin-bottom: 10px;">
				<div class="col-xs-4 text-left"
					style="background-color: #E6E6F2; line-height: 26px; vertical-align: middle;">
					<label style="margin-top: 5px; font-size: 14px; color: grey;">排序：</label>
				</div>
				<div class="col-xs-7">
					<div class="form-group">
						<input type="text" id="roleIndex" name="roleIndex"
							value="${role.roleIndex}" class="form-control"
							placeholder="整数，按从小到大顺序排列" />
					</div>
				</div>
			</div>
			<div class="row" style="margin-top: 10px; margin-bottom: 10px;">
				<div class="col-xs-4 text-left"
					style="background-color: #E6E6F2; line-height: 26px; vertical-align: middle;">
					<label style="margin-top: 5px; font-size: 14px; color: grey;">域级次：</label>
				</div>
				<div class="col-xs-7">
					<div class="form-group">
						<c:if test="${role.roleLevel == 1}">
							<button disabled="disabled" class="btn btn-danger"><b>Level</b>
						</c:if>
						<c:if test="${role.roleLevel == 2}">
							<button disabled="disabled" class="btn btn-warning"><b>Level</b>
						</c:if>
						<c:if test="${role.roleLevel == 3}">
							<button disabled="disabled" class="btn btn-primary"><b>Level</b>
						</c:if>
						<c:if test="${role.roleLevel != 1 && role.roleLevel != 2 && role.roleLevel != 3}">
							<button disabled="disabled" class="btn btn-info"><b>Level</b>
						</c:if>
							<span class="badge">${role.roleLevel}</span>
						</button>
					</div>
				</div>
			</div>
			<div class="row" style="margin-top: 10px; margin-bottom: 10px;">
				<div class="col-xs-4 text-left"
					style="background-color: #E6E6F2; line-height: 26px; vertical-align: middle;">
					<label style="margin-top: 5px; font-size: 14px; color: grey;">类型：</label>
				</div>
				<div class="col-xs-7">
					<select id="roleType" name="roleType" class="selectpicker">
						<option value="group">角色组</option>
						<option value="role">角色</option>
					</select>
				</div>
			</div>
			<div class="row" style="margin-top: 10px; margin-bottom: 10px;">
				<div class="col-xs-4 text-left"
					style="background-color: #E6E6F2; line-height: 26px; vertical-align: middle;">
					<label style="margin-top: 5px; font-size: 14px; color: grey;">状态：</label>
				</div>
				<div class="col-xs-7">
					<select id="roleValid" name="roleValid" class="selectpicker">
						<option value="true">有效</option>
						<option value="false">无效</option>
					</select>
				</div>
			</div>
			<div class="row" style="margin-top: 10px; margin-bottom: 10px;display: none;">
				<input type="hidden" id="roleId" name="roleId" value="${role.roleId}" />
				<input type="hidden" id="rolePid" name="rolePid" value="${role.rolePid}" />
				<input type="hidden" id="roleLevel" name="roleLevel" value="${role.roleLevel}" />
			</div>
		</div>
	</form>
	
	<!-- 资源管理 -->
	<div class="modal fade" id="meneModal" tabindex="-1" role="dialog" aria-hidden="true" data-backdrop="static">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
						&times;
					</button>
					<h4 class="modal-title">
						角色拥有的菜单资源
					</h4>
				</div>
				<div class="modal-body">
					<div id="menuZtree" class="ztree"></div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default btn-sm" data-dismiss="modal"><i class="zmdi zmdi-close"></i> 关闭</button>
					<button id="menuSave-btn" class="waves-effect btn btn-success btn-sm"
						style="margin-left: 10px; type="button"
						href="javascript:;">
						<i class="zmdi zmdi-save"></i> 保存
					</button>
				</div>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript">
	$(function() {
		// 下拉框赋值
		$('#roleType').selectpicker('val', '${role.roleType}');
		$('#roleValid').selectpicker('val', '${role.roleValid}');

		// 表单效验
		$('form').bootstrapValidator({
			//container : "tooltip",
			container : "popover",
			message : 'This value is not valid',
			feedbackIcons : {
				valid : 'glyphicon glyphicon-ok',
				invalid : 'glyphicon glyphicon-remove',
				validating : 'glyphicon glyphicon-refresh'
			},
			fields : {
				'roleName' : {
					validators : {
						notEmpty : {
							message : '角色名称不能为空'
						},
						stringLength : {
							min : 1,
							max : 36
						},
					}
				},
				'roleIndex' : {
					validators : {
						integer : {
							message : '请输入整数类型'
						}
					}
				}
			}
		});

		// 保存提交
		$('#save-btn').click(function() {
			if('' == $('#roleId').val() && '' == $('#rolePid').val()){
				$.alert('请选择左侧角色节点！');
				return;
			}
			//进行表单验证
			var bv = $('#dataForm').data('bootstrapValidator');
			bv.validate();
			if (bv.isValid()) {
				// 获取form表单中的值
				var formData = $('#dataForm').serializeArray();
				$.post('${pageContext.request.contextPath}/common/role/save', formData, function(data) {
					if('0' == data.status){
						parent.roleNodeRefresh();//调用父页面 tree 节点刷新方法
						resetForm();
					}else{
						parent.roleParentNodeRefresh();//调用父页面 tree 父节点刷新方法
					}
					$.alert(data.msg);
				});
			}
		});
		
		// 重置表单
		function resetForm(){
			// 清空 form 表单值
			$('#roleId').val('');
			$('#rolePid').val('');
			$('#roleName').val('');
			$('#roleIndex').val('');
			$('#roleLevel').val('');
			$('#roleValid').selectpicker('val', 'true');
			
			// 验证销毁
		    $("#dataForm").data('bootstrapValidator').destroy();
		    $('#dataForm').data('bootstrapValidator', null);
		    
		    // 警告提示框
			$('#noSelDiv').show();
		}
		
		// 菜单资源 tree 构建
		var treeObj;
		var setting = {
			async : {
				enable : true,
				url : "${pageContext.request.contextPath}/common/menu/menuCheckedTree",
				autoParam : [ "id", "pid", "name", "level" ],
				otherParam: {"roleId" : $('#roleId').val()}
			},
			check: {
				enable: true,
				chkStyle: "checkbox",
				chkboxType: { "Y": "s", "N": "s" }
			},
			view : {
				fontCss: setFontCss
			}
		};
		// 初始化 tree 数据
		treeObj = $.fn.zTree.init($('#menuZtree'), setting);
		// 设置样式
		function setFontCss(treeId, treeNode) {
			return treeNode.valid == false ? {color:"red"} : {};
		};
		
		// 菜单资源保存方法
		$('#menuSave-btn').click(function(){
			var nodes = treeObj.getCheckedNodes(true);
			var menuStr = "";
			$.map(nodes, function(item, index){
				menuStr  += "," + item.id;
			});
			
			$.post('${pageContext.request.contextPath}/common/role/menuSave',{'roleId' : $('#roleId').val(), 'menuStr' : menuStr.substr(1)},function(data){
				$('#meneModal').modal('hide');
				$.alert(data.msg);
			});
			
		});
		
	});
	
</script>
</html>