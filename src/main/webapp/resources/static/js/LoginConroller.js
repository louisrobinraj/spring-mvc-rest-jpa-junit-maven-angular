var app = angular.module("mainApp", []);
app.controller(
				'LoginController',
				[
						"$scope",
						"LoginHRMSService",
						function($scope, LoginHRMSService) {
							var controller = this;
							$scope.LoginUser = function() {
								$scope.userdetails = {
									'userName' : $scope.username,
									'password' : $scope.password
								};
								LoginHRMSService
										.login($scope.userdetails)
										.then(
												function(result) {
													if (result) {
														$scope.loginError = "success";
													} else {
														$scope.loginError = "Invalid username/password combination";
													}
												});
							}
						} ]);