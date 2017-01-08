// Define the `app` module
var app = angular.module('app', []);
// Define the `PhoneListController` controller on the `phonecatApp` module
app.controller('appCtrl', ['$scope', '$http', function ($scope, $http) {

    $scope.search = function(){

        var data = {
            sumCreditClient: $scope.sumCreditClient,
            periodCreditClient: $scope.periodCreditClient
        };

        var successCallBack = function(response){
            $scope.results = response.data;
        };

        var errorCallBack = function(response){
            // error response found from server
        };
        $http.post('/resource/', data).then(successCallBack, errorCallBack);
    }
}]);
