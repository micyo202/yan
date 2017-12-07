<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/global.jsp"%>
<%@ include file="/common/include_common.jsp"%>
<html lang="zh-cn">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>template</title>
</head>
<body>
	<div id="main">
		<!-- 栅格布局 -->
		<div class="row">
			<div class="col-xs-1" style="background-color: #FFD2D2">col-xs-1</div>
			<div class="col-xs-2" style="background-color: #FFF8D7">col-xs-2</div>
			<div class="col-xs-4" style="background-color: #D2E9FF">col-xs-4</div>
			<div class="col-xs-5" style="background-color: #DFFFDF">col-xs-5</div>
		</div>
		<!-- 组件 -->
		<div class="row" style="margin-top: 5px; margin-bottom: 5px;">
			<div class="col-xs-4"
				style="background-color: #F5F5F5; line-height: 26px; vertical-align: middle;">
				<label style="margin-top: 5px; font-size: 14px; color: grey;">一般输入框：</label>
			</div>
			<div class="col-xs-8">
				<input type="text" class="form-control" placeholder="一般输入框" required />
			</div>
		</div>

		<div class="row" style="margin-top: 5px; margin-bottom: 5px;">
			<div class="col-xs-4"
				style="background-color: #F5F5F5; line-height: 26px; vertical-align: middle;">
				<label style="margin-top: 5px; font-size: 14px; color: grey;">内联输入框：</label>
			</div>
			<div class="col-xs-8">
				<div class="input-group">
					<div class="input-group-addon">$</div>
					<input type="text" class="form-control" id="exampleInputAmount"
						placeholder="Amount">
					<div class="input-group-addon">.00</div>
				</div>
			</div>
		</div>

		<div class="row" style="margin-top: 5px; margin-bottom: 5px;">
			<div class="col-xs-4"
				style="background-color: #F5F5F5; line-height: 26px; vertical-align: middle;">
				<label style="margin-top: 5px; font-size: 14px; color: grey;">日期选择框：</label>
			</div>
			<div class="col-xs-8">
				<div class="input-group date form_date col-md-16">
					<input id="astaleDate" class="form-control" size="16" type="text"
						placeholder="请选择日期" readonly> <span
						class="input-group-addon"><span
						class="glyphicon glyphicon-remove"></span></span> <span
						class="input-group-addon"><span
						class="glyphicon glyphicon-calendar"></span></span>
				</div>
				<script type="text/javascript">
					//	日历组件选择
					$(".form_datetime").datetimepicker({
						language : 'zh-CN',
						format : "yyyy-mm-dd hh:ii",
						autoclose : true,
						todayBtn : true,
						minuteStep : 10
					});
					$('.form_date').datetimepicker({
						language : 'zh-CN',
						format : "yyyy-mm-dd",
						todayBtn : true,
						autoclose : true,
						startView : 2,
						minView : 2
					});
				</script>
			</div>
		</div>

		<div class="row" style="margin-top: 5px; margin-bottom: 5px;">
			<div class="col-xs-4"
				style="background-color: #F5F5F5; line-height: 64px; vertical-align: middle;">
				<label style="margin-top: 5px; font-size: 14px; color: grey;">文本域：</label>
			</div>
			<div class="col-xs-8">
				<textarea class="form-control" rows="3"></textarea>
			</div>
		</div>

		<div class="row" style="margin-top: 5px; margin-bottom: 5px;">
			<div class="col-xs-4"
				style="background-color: #F5F5F5; line-height: 26px; vertical-align: middle;">
				<label style="margin-top: 5px; font-size: 14px; color: grey;">输入框参考：</label>
			</div>
			<div class="col-xs-8">
				<label style="margin-top: 5px; font-size: 14px;"><a
					href="http://v3.bootcss.com/css/?#forms">http://v3.bootcss.com/css/?#forms</a></label>
			</div>
		</div>

		<div class="row" style="margin-top: 5px; margin-bottom: 5px;">
			<div class="col-xs-4"
				style="background-color: #F5F5F5; line-height: 26px; vertical-align: middle;">
				<label style="margin-top: 5px; font-size: 14px; color: grey;">单选下拉框：</label>
			</div>
			<div class="col-xs-8">
				<select class="selectpicker" title="单选下拉框">
					<option>Mustard</option>
					<option>Ketchup</option>
					<option>Relish</option>
				</select> <select class="selectpicker" data-style="btn-info"
					title="带btn样式的下拉框">
					<option>Mustard</option>
					<option>Ketchup</option>
					<option>Relish</option>
				</select> <select class="selectpicker" title="分组下拉框">
					<optgroup label="Picnic">
						<option>Mustard</option>
						<option>Ketchup</option>
						<option>Relish</option>
					</optgroup>
					<optgroup label="Camping">
						<option>Tent</option>
						<option>Flashlight</option>
						<option>Toilet Paper</option>
					</optgroup>
				</select>
			</div>
		</div>

		<div class="row" style="margin-top: 5px; margin-bottom: 5px;">
			<div class="col-xs-4"
				style="background-color: #F5F5F5; line-height: 26px; vertical-align: middle;">
				<label style="margin-top: 5px; font-size: 14px; color: grey;">多选下拉框：</label>
			</div>
			<div class="col-xs-8">
				<select class="selectpicker" multiple>
					<option>Mustard</option>
					<option>Ketchup</option>
					<option>Relish</option>
				</select> <select class="selectpicker" multiple data-max-options="2"
					title="限制选择个数">
					<option>Mustard</option>
					<option>Ketchup</option>
					<option>Relish</option>
				</select> <select class="selectpicker" multiple title="限制选择个数">
					<optgroup label="Condiments" data-max-options="2">
						<option>Mustard</option>
						<option>Ketchup</option>
						<option>Relish</option>
					</optgroup>
					<optgroup label="Breads" data-max-options="2">
						<option>Plain</option>
						<option>Steamed</option>
						<option>Toasted</option>
					</optgroup>
				</select>
			</div>
		</div>


		<div class="row" style="margin-top: 5px; margin-bottom: 5px;">
			<div class="col-xs-4"
				style="background-color: #F5F5F5; line-height: 26px; vertical-align: middle;">
				<label style="margin-top: 5px; font-size: 14px; color: grey;">带搜索的下拉框：</label>
			</div>
			<div class="col-xs-8">
				<select class="selectpicker form-control" data-live-search="true">
					<option data-tokens="ketchup mustard">Hot Dog, Fries and a
						Soda</option>
					<option data-tokens="mustard">Burger, Shake and a Smile</option>
					<option data-tokens="frosting">Sugar, Spice and all things
						nice</option>
				</select>
			</div>
		</div>

		<div class="row" style="margin-top: 5px; margin-bottom: 5px;">
			<div class="col-xs-4"
				style="background-color: #F5F5F5; line-height: 26px; vertical-align: middle;">
				<label style="margin-top: 5px; font-size: 14px; color: grey;">下拉组件参考：</label>
			</div>
			<div class="col-xs-8">
				<label style="margin-top: 5px; font-size: 14px;"><a
					href="http://silviomoreto.github.io/bootstrap-select/examples/">http://silviomoreto.github.io/bootstrap-select/examples/</a></label>
			</div>
		</div>
		<h2>CheckBox</h2>
		<div class="row">
			<div class="col-md-4">
				<fieldset>
					<legend> Basic </legend>
					<p>
						Supports bootstrap brand colors:
						<code>.checkbox-primary</code>
						,
						<code>.checkbox-info</code>
						etc.
					</p>
					<div class="checkbox">
						<input id="checkbox1" class="styled" type="checkbox"> <label
							for="checkbox1"> Default </label>
					</div>
					<div class="checkbox checkbox-primary">
						<input id="checkbox2" class="styled" type="checkbox" checked>
						<label for="checkbox2"> Primary </label>
					</div>
					<div class="checkbox checkbox-success">
						<input id="checkbox3" class="styled" type="checkbox"> <label
							for="checkbox3"> Success </label>
					</div>
					<div class="checkbox checkbox-info">
						<input id="checkbox4" class="styled" type="checkbox"> <label
							for="checkbox4"> Info </label>
					</div>
					<div class="checkbox checkbox-warning">
						<input id="checkbox5" type="checkbox" class="styled" checked>
						<label for="checkbox5"> Warning </label>
					</div>
					<div class="checkbox checkbox-danger">
						<input id="checkbox6" type="checkbox" class="styled" checked>
						<label for="checkbox6"> Check me out </label>
					</div>
					<p>Checkboxes without label text</p>
					<div class="checkbox">
						<input type="checkbox" class="styled" id="singleCheckbox1"
							value="option1" aria-label="Single checkbox One"> <label></label>
					</div>
					<div class="checkbox checkbox-primary">
						<input type="checkbox" class="styled styled-primary"
							id="singleCheckbox2" value="option2" checked
							aria-label="Single checkbox Two"> <label></label>
					</div>
					<p>Checkboxes with indeterminate state</p>
					<div class="checkbox checkbox-primary">
						<input id="indeterminateCheckbox" class="styled" type="checkbox"
							onclick="changeState(this)"> <label></label>
					</div>
					<p>Inline checkboxes</p>
					<div class="checkbox checkbox-inline">
						<input type="checkbox" class="styled" id="inlineCheckbox1"
							value="option1"> <label for="inlineCheckbox1">
							Inline One </label>
					</div>
					<div class="checkbox checkbox-success checkbox-inline">
						<input type="checkbox" class="styled" id="inlineCheckbox2"
							value="option1" checked> <label for="inlineCheckbox2">
							Inline Two </label>
					</div>
					<div class="checkbox checkbox-inline">
						<input type="checkbox" class="styled" id="inlineCheckbox3"
							value="option1"> <label for="inlineCheckbox3">
							Inline Three </label>
					</div>
				</fieldset>
			</div>
			<div class="col-md-4">
				<fieldset>
					<legend> Circled </legend>
					<p>
						<code>.checkbox-circle</code>
						for roundness.
					</p>
					<div class="checkbox checkbox-circle">
						<input id="checkbox7" class="styled" type="checkbox"> <label
							for="checkbox7"> Simply Rounded </label>
					</div>
					<div class="checkbox checkbox-info checkbox-circle">
						<input id="checkbox8" class="styled" type="checkbox" checked>
						<label for="checkbox8"> Me too </label>
					</div>
				</fieldset>
			</div>
			<div class="col-md-4">
				<fieldset>
					<legend> Disabled </legend>
					<p>Disabled state also supported.</p>
					<div class="checkbox">
						<input class="styled" id="checkbox9" type="checkbox" disabled>
						<label for="checkbox9"> Can't check this </label>
					</div>
					<div class="checkbox checkbox-success">
						<input class="styled styled" id="checkbox10" type="checkbox"
							disabled checked> <label for="checkbox10"> This
							too </label>
					</div>
					<div class="checkbox checkbox-warning checkbox-circle">
						<input class="styled" id="checkbox11" type="checkbox" disabled
							checked> <label for="checkbox11"> And this </label>
					</div>
				</fieldset>
			</div>
		</div>
		<h2>Radios</h2>
		<div class="row">
			<div class="col-md-4">
				<fieldset>
					<legend> Basic </legend>
					<p>
						Supports bootstrap brand colors:
						<code>.radio-primary</code>
						,
						<code>.radio-danger</code>
						etc.
					</p>
					<div class="row">
						<div class="col-sm-6">
							<div class="radio">
								<input type="radio" name="radio1" id="radio1" value="option1"
									checked> <label for="radio1"> Small </label>
							</div>
							<div class="radio">
								<input type="radio" name="radio1" id="radio2" value="option2">
								<label for="radio2"> Big </label>
							</div>
						</div>
						<div class="col-sm-6">
							<div class="radio radio-danger">
								<input type="radio" name="radio2" id="radio3" value="option1">
								<label for="radio3"> Next </label>
							</div>
							<div class="radio radio-danger">
								<input type="radio" name="radio2" id="radio4" value="option2"
									checked> <label for="radio4"> One </label>
							</div>
						</div>
					</div>
					<p>Radios without label text</p>
					<div class="radio">
						<input type="radio" id="singleRadio1" value="option1"
							name="radioSingle1" aria-label="Single radio One"> <label></label>
					</div>
					<div class="radio radio-success">
						<input type="radio" id="singleRadio2" value="option2"
							name="radioSingle1" checked aria-label="Single radio Two">
						<label></label>
					</div>
					<p>Inline radios</p>
					<div class="radio radio-info radio-inline">
						<input type="radio" id="inlineRadio1" value="option1"
							name="radioInline" checked> <label for="inlineRadio1">
							Inline One </label>
					</div>
					<div class="radio radio-inline">
						<input type="radio" id="inlineRadio2" value="option2"
							name="radioInline"> <label for="inlineRadio2">
							Inline Two </label>
					</div>
				</fieldset>
			</div>
			<div class="col-md-4">
				<fieldset>
					<legend> Disabled </legend>
					<p>Disabled state also supported.</p>
					<div class="radio radio-danger">
						<input type="radio" name="radio3" id="radio5" value="option1"
							disabled> <label for="radio5"> Next </label>
					</div>
					<div class="radio">
						<input type="radio" name="radio3" id="radio6" value="option2"
							checked disabled> <label for="radio6"> One </label>
					</div>
				</fieldset>
			</div>
			<div class="col-md-4">
				<fieldset>
					<legend> As Checkboxes </legend>
					<p>Radios can be made to look like checkboxes.</p>
					<div class="checkbox checkbox">
						<input type="radio" name="radio4" id="radio7" value="option1"
							checked> <label for="radio7"> Default </label>
					</div>
					<div class="checkbox checkbox-success">
						<input type="radio" name="radio4" id="radio8" value="option2">
						<label for="radio8"> Success </label>
					</div>
					<div class="checkbox checkbox-danger">
						<input type="radio" name="radio4" id="radio9" value="option3">
						<label for="radio9"> Danger </label>
					</div>
				</fieldset>
			</div>
		</div>
		<h2>font-awesome</h2>
		<div class="row">
			<div class="col-xs-12">
				<label style="margin-top: 5px; font-size: 14px;"><a
					href="http://fontawesome.io/examples/#">font-awesome更多参考：http://fontawesome.io/examples/#</a></label>
				<label style="margin-top: 5px; font-size: 14px;"><a
					href="http://zavoloklom.github.io/material-design-iconic-font/icons.html">material-design-iconic-font更多参考：http://zavoloklom.github.io/material-design-iconic-font/icons.html</a></label>
			</div>
		</div>
		<div class="row">
			<a class="btn btn-danger" href="#abc"> <i
				class="fa fa-trash-o fa-lg"></i> Delete
			</a> <a class="btn btn-default btn-sm" href="#abc"> <i
				class="fa fa-cog"></i> Settings
			</a> <a class="btn btn-lg btn-success" href="#abc"> <i
				class="fa fa-flag fa-2x pull-left"></i> Font Awesome<br>Version
				4.7.0
			</a>

			<div class="btn-group">
				<a class="btn btn-default" href="#abc"> <i
					class="fa fa-align-left" title="Align Left"></i>
				</a> <a class="btn btn-default" href="#abc"> <i
					class="fa fa-align-center" title="Align Center"></i>
				</a> <a class="btn btn-default" href="#abc"> <i
					class="fa fa-align-right" title="Align Right"></i>
				</a> <a class="btn btn-default" href="#abc"> <i
					class="fa fa-align-justify" title="Align Justify"></i>
				</a>
			</div>

			<div class="input-group margin-bottom-sm">
				<span class="input-group-addon"><i
					class="fa fa-envelope-o fa-fw"></i></span> <input class="form-control"
					type="text" placeholder="Email address">
			</div>
			<div class="input-group">
				<span class="input-group-addon"><i class="fa fa-key fa-fw"></i></span>
				<input class="form-control" type="password" placeholder="Password">
			</div>

			<div class="btn-group open">
				<a class="btn btn-primary" href="#abc"><i
					class="fa fa-user fa-fw"></i> User</a> <a
					class="btn btn-primary dropdown-toggle" data-toggle="dropdown"
					href="#abc"> <span class="fa fa-caret-down"
					title="Toggle dropdown menu"></span>
				</a>
				<ul class="dropdown-menu">
					<li><a href="#abc"><i class="fa fa-pencil fa-fw"></i> Edit</a></li>
					<li><a href="#abc"><i class="fa fa-trash-o fa-fw"></i>
							Delete</a></li>
					<li><a href="#abc"><i class="fa fa-ban fa-fw"></i> Ban</a></li>
					<li class="divider"></li>
					<li><a href="#abc"><i class="fa fa-unlock"></i> Make admin</a></li>
				</ul>
			</div>
		</div>

	</div>
</body>
</html>