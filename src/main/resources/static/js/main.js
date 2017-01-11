// Define the `app` module
var app = angular.module('app', []);
// Define the `PhoneListController` controller on the `phonecatApp` module
app.controller('appCtrl', ['$scope', '$http', function ($scope, $http) {
    $scope.results = '';

    $scope.search = function(){

        var data = {
            sumCreditClient: $scope.sumCreditClient,
            periodCreditClient: $scope.periodCreditClient
        };

        $http.post('/resource/', data).then(
            function(response){
                $scope.results = response.data.toString();
            }
        );
    }
}]);
