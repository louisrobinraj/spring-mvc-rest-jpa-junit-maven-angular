<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script
	src="//ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-route.js"></script>
<link href="<c:url value="/resources/theme/css/hrms.css" />"
	rel="stylesheet">
<script type="text/javascript">
	var app = angular.module("myApp", [ "ngRoute" ]);

	app
			.config(function($routeProvider, $httpProvider) {

				$routeProvider.when('/login/:redirectto*', {
					templateUrl : '/spring-mvc-rest-jpa-junit-maven-angular/resources/templates/common/login-page.html',
					controller : 'Router'
				}).when('/about', {
					templateUrl : '/spring-mvc-rest-jpa-junit-maven-angular/resources/templates/common/about-page.html',
					controller : 'Router'
				}).

				otherwise({
					redirectTo : '/'
				});

				if (!$httpProvider.defaults.headers.get) {
					$httpProvider.defaults.headers.get = {};
				}
				//disable IE ajax request caching
				$httpProvider.defaults.headers.get['If-Modified-Since'] = 'Mon, 26 Jul 1997 05:00:00 GMT';
				// extra
				$httpProvider.defaults.headers.get['Cache-Control'] = 'no-cache';
				$httpProvider.defaults.headers.get['Pragma'] = 'no-cache';
			});
</script>

</head>
<body ng-app="myApp">
	<ul id="menu">
		<li><a href="#">Home</a></li>
		<li><a href="#about">About Us</a>
			<ul>
				<li><a href="">Office</a></li>
				<li><a href="">History</a></li>
				<li><a href="">Vision</a></li>
			</ul></li>
		<li><a href="">HR-Payroll</a>
			<ul>
				<li><a href="">View Salary Slip</a></li>
				<li><a href="">Sodoxo</a></li>
				<li><a href="">Food Card</a></li>
				<li><a href="">Income Tax</a></li>
				<li><a href="">Help Desk</a></li>
			</ul>
		</li>
		<li><a href="">Employee management</a>
			<ul>
				<li><a href="">New Join</a></li>
				<li><a href="">Exit Employee</a></li>
			</ul>
		</li>
		<li><a href="">Help Disk</a>
			<ul>
				<li><a href="">New Join</a></li>
				<li><a href="">Exit Employee</a></li>
			</ul>
		</li>
		<li><a href="">Contact</a>
			<ul>
				<li><a href="">Online</a></li>
				<li><a href="">Right Here</a></li>
				<li><a href="">Somewhere Else</a></li>
			</ul></li>
	</ul>
	<div ng-view></div>

</body>
</html>