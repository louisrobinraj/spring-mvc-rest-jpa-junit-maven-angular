<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html id="ng-app" class="ng-app:myapp">
<head>
<meta charset="iso-8859-1">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="Sat, 01 Dec 2001 00:00:00 GMT">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title></title>
<style>
body {
	font-style: italic;
	width: 50%;
	margin: 0px auto;
}

#login_form {
	margin-top: 10%;
}

#f1 {
	background-color: #FFF;
	border-style: solid;
	border-width: 1px;
	padding: 23px 1px 20px 114px;
}

.f1_label {
	white-space: nowrap;
}

span {
	color: white;
}

.new {
	background: black;
	text-align: center;
}
.error {
	color: #ff0000;
}

.errorblock {
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>
</head>
<body>

	<div id="login_form">
		<div class="new">
			<span>Enter login details</span>
		</div>
		<form:form id="loginForm" method="post"
			action="/spring-mvc-rest-jpa-junit-maven-angular/api/v1/hrms/authenticate.action"
			modelAttribute="user">
			<form:errors path="*" cssClass="errorblock" element="div" />
			<table>
				<tr>
					<td class="f1_label">User Name :</td>
					<td><input type="text" name="userName" /></td>
					<td><form:errors path="userName" cssClass="error" /></td>
				</tr>
				<tr>
					<td class="f1_label">Password :</td>
					<td><input type="password" name="password" /></td>
					<td><form:errors path="password" cssClass="error" /></td>
				</tr>
				<tr>
					<td><input type="submit" name="login" value="Log In"
						style="font-size: 18px;" /></td>
				</tr>
			</table>
		</form:form>

	</div>

</body>
</html>
