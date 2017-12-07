<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/global.jsp"%>
<html lang="zh-cn">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>用户登录</title>
<link href="${pageContext.request.contextPath}/resources/css/login.css"
	rel="stylesheet">
</head>
<body>
	<div id="login-window">
		<div class="input-group m-b-20">
			<span class="input-group-addon"><i class="zmdi zmdi-account"></i></span>
			<div class="fg-line">
				<input id="username" type="text" class="form-control"
					name="username" placeholder="用户名" required autofocus>
			</div>
		</div>
		<div class="input-group m-b-20">
			<span class="input-group-addon"><i class="zmdi zmdi-lock"></i></span>
			<div class="fg-line">
				<input id="password" type="password" class="form-control"
					name="password" placeholder="密码" required>
			</div>
		</div>
		<div class="input-group m-b-20">
			<div class="checkbox checkbox-info">
				<input id="remember" class="styled" type="checkbox"> <label
					for="remember">记住我</label>
			</div>
		</div>
		<a id="login-bt" href="javascript:;"
			class="waves-effect waves-button waves-float"><i
			class="zmdi zmdi-arrow-forward"></i></a>
	</div>
	<script type="text/javascript">
		// Waves初始化（点击动画效果）
		Waves.displayEffect();
		// 输入框获取焦点后出现下划线
		$('.form-control').focus(function() {
			$(this).parent().addClass('fg-toggled');
		}).blur(function() {
			$(this).parent().removeClass('fg-toggled');
		});
		
		// 初始化值
		/*
		if($.cookie('username') != 'null'){
			$('#username').val($.cookie('username'));
			$('#password').val($.cookie('password'));
			$('#remember').attr('checked', $.cookie('remember'));
		}
		*/
		
		if($.cookie('loginCookie') != null && $.cookie('loginCookie') != 'null'){
			var loginCookies = $.cookie('loginCookie').split(',');
			$('#username').val(loginCookies[0]);
			$('#password').val(loginCookies[1]);
			$('#remember').attr('checked', loginCookies[2]);
		}
		
		// 登录事件
		$('#login-bt').click(function() {
			// 获取checkBox值
			$.post(
					'${pageContext.request.contextPath}/common/login/signin',
					{
						username : $('#username').val(),
						password : $('#password').val(),
						remember : $('#remember').is(":checked")
					},
					function(data) {
						if (data.status == 0) {
							$.alert(data.msg);
						} else {
							if(data.remember){
								var loginCookie = $('#username').val() + ',' + $('#password').val() + ',' + $('#remember').is(":checked");
								$.cookie('loginCookie', loginCookie, {expires: 7});
							}else{
								$.cookie('loginCookie', null);
							}
							location.href = '${pageContext.request.contextPath}'+ data.url;
						}
					});
		});
	</script>
</body>
</html>