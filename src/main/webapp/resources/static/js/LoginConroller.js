var app = angular.module("mainApp", []);
app.controller(
				'LoginController',
				[
						"$scope","$location",
						"LoginHRMSService",
						function($scope,$location,LoginHRMSService) {
							var controller = this;
							$scope.LoginUser = function() {
								$scope.loginResponse=null;
								$scope.userdetails = {
									'userName' : $scope.username,
									'password' : $scope.password
								};
								LoginHRMSService
										.login($scope.userdetails)
										.then(
												function(result) {
													console.log(result.data);
													if (result.data) {
														$scope.loginResponse = "success";
														//$location.path("/home");
														window.location="/spring-mvc-rest-jpa-junit-maven-angular/resources/templates/common/home-page.html";
													} else {
														$scope.loginResponse = "Invalid username/password combination";
													}
												});
							}
						} ]);