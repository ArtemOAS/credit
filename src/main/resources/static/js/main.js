var app = angular.module('app', []);
app.controller('appCtrl', ['$scope', '$http', function ($scope, $http) {
    $scope.results = '';

    $scope.valueSum = 10;
    $scope.minSum = 10;
    $scope.maxSum = 1000000;

    $scope.valuePeriod = 6;
    $scope.minPeriod = 1;
    $scope.maxPeriod = 60;

    $scope.search = function(){

        var data = {
            valueSum: $scope.valueSum,
            valuePeriod: $scope.valuePeriod
        };

        console.log(data.valueSum);
        $http.post('/resource/', data).then(
            function(response){
                $scope.results = response.data.toString();
            }
        );
    }
}]);
