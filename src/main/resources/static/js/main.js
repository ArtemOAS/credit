var app = angular.module('app', ['rzModule', 'ui.bootstrap']);
app.controller('appCtrl', ['$scope', '$http', function ($scope, $http) {
    $scope.results = '';

    $scope.search = function(){

        var data = {
            valueSum: $scope.sliderSum.valueSum,
            valuePeriod: $scope.sliderPeriod.valuePeriod
        };

        $http.post('/resource/', data).then(
            function (response) {
                $scope.results = response.data.toString();
            }
        );
    };

    $scope.sliderSum = {
        valueSum: 1000,
        optionsSum: {
            floor: 1000,
            ceil: 3000000,
            step: 1000,
            minLimit: 1000,
            maxLimit: 3000000,
            translate: function(value) {
                return value+' руб';
            },
            onChange:  $scope.search,
        }
    };

    $scope.sliderPeriod = {
        valuePeriod: 1,
        optionsPeriod: {
            floor: 1,
            ceil: 480,
            step: 1,
            minLimit: 1,
            maxLimit: 480,
            translate: function(value) {
                return value+' недель';
            },
            onChange:  $scope.search,
        }
    };

    angular.element(document).ready($scope.search);

}]);
