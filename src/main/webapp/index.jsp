<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">
<title>CodePen - Random Login Form</title>
<link href="resources/css/main.css" rel="stylesheet">


<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script type="text/javascript" src="resources/js/LoginConroller.js"></script>
<script type="text/javascript" src="resources/js/hrms_services.js"></script>
</head>

<body ng-app="mainApp">
	<div class="log-form" ng-controller="LoginController">
		<h1>Login Page</h1>

		<form>
			<label>User name</label>
			<input type="text" ng-model="username"	class="ng-pristine ng-valid">
			<label>Password</label>
			<input type="password" ng-model="password" class="ng-pristine ng-valid">
			<br /> {{loginError}} <br /> <br />
			
			<button class="btn btn-success" ng-click="LoginUser()">Submit</button>
			<button class="btn btn-warning" ng-click="cancel()">Cancel</button>
		</form>

	</div>

</body>

</html>