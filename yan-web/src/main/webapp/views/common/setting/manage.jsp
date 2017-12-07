<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/global.jsp"%>
<%@ include file="/common/include_common.jsp"%>
<html lang="zh-cn">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>系统设置</title>
</head>
<body>
	<form id="dataForm" method="post">
		<div class="container col-xs-11"
			style="margin-top: 30px; margin-left: 50px; display: table;">

			<div class="row" style="margin-top: 10px; margin-bottom: 10px;">
				<div class="col-xs-4 text-left"
					style="background-color: #F5F5F5; line-height: 26px; vertical-align: middle;">
					<label style="margin-top: 5px; font-size: 14px; color: grey;">文件上传路径：</label>
				</div>
				<div class="col-xs-7">
					<div class="form-group">
						<input type="text" id="uploadPath" name="uploadPath"
							value="${uploadPath}" class="form-control"
							placeholder="示例：C:/Users/Administrator/Desktop/upload" />
					</div>
				</div>
			</div>
			<div class="row" style="margin-top: 10px; margin-bottom: 10px;"
				align="center">
				<button id="save-btn" class="waves-effect btn btn-info"
					style="margin-left: 10px;" type="button" href="javascript:;">
					<i class="zmdi zmdi-save"></i> 保存
				</button>
			</div>

		</div>
	</form>
</body>
<script type="text/javascript">

	//表单效验
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
			'uploadPath' : {
				validators : {
					notEmpty : {
						message : '上传路径不能为空'
					},
					regexp : {
						regexp : /^[a-zA-Z0-9_/\.]+$/,
						message : '请输入正确的路径地址'
					}
				}
			}
		}
	});

	$('#save-btn').click(function() {
		// 获取form表单中的值
		$.post('${pageContext.request.contextPath}/common/setting/save', { 'uploadPath' : $('#uploadPath').val() }, function(data) {
			alert(data.msg);
		});
	});
</script>
</html>