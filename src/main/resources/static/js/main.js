var app = angular.module('app', ['rzModule', 'ui.bootstrap']);
app.controller('appCtrl', ['$scope', '$http', function ($scope, $http) {
    $scope.results = '';

    $scope.search = function(){

        var data = {
            valueSum: $scope.sliderSum.valueSum,
            valuePeriod: $scope.sliderPeriod.valuePeriod
        };

        $http.post('/resource/', data).then(
            function(response){
                $scope.results = response.data.toString();
            }
        );
    };

    $scope.sliderSum = {
        valueSum: 1000,
        optionsSum: {
            floor: 0,
            ceil: 100000000,
            step: 1000,
            minLimit: 1000,
            maxLimit: 100000000
        }
    };

    $scope.sliderPeriod = {
        valuePeriod: 1,
        optionsPeriod: {
            floor: 0,
            ceil: 60,
            step: 1,
            minLimit: 1,
            maxLimit: 60
        }
    };

}]);
