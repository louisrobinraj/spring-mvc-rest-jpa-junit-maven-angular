app.factory('LoginHRMSService', function($http) {
	return {

		logOut : function(userId) {
			return $http({
				method : 'GET',
				url : "api/v1/hrms/logout/" + escape(userId)
			});
		},
		login : function(userData) {
			return $http({
				method : 'POST',
				url : "api/v1/hrms/authenticate",
				data : userData
			});
		}

	}
});
