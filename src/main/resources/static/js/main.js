var app = angular.module('app', []);
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
