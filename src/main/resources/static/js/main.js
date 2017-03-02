var app = angular.module('app', ['rzModule', 'ui.bootstrap']);
app.controller('appCtrl', ['$scope', '$http', '$window', '$location', function ($scope, $http, $window, $location) {
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
        valueSum: 12000,
        optionsSum: {
            floor: 1000,
            ceil: 3000000,
            step: 1000,
            minLimit: 1000,
            maxLimit: 3000000,
            translate: function(value) {
                return value+' руб';
            },
            onChange: $scope.search,
            showSelectionBar: true,
            selectionBarGradient: {
                from: '#FC0',
                to: '#FC0'
            }
        }
    };

    $scope.sliderPeriod = {
        valuePeriod: 24,
        optionsPeriod: {
            floor: 1,
            ceil: 480,
            step: 1,
            minLimit: 1,
            maxLimit: 480,
            translate: function(value) {
                if (value==1){
                    return value+' день';
                }else if (value>1&&value<5){
                    return value+' дня'
                }else {
                    return value+' дней';
                }
            },
            onChange: $scope.search,
            showSelectionBar: true,
            selectionBarGradient: {
                from: '#FC0',
                to: '#FC0'
            }
        }
    };

    angular.element(document).ready($scope.search);

    $scope.redirect = function() {
        $window.location.href='http://xn----7sbgjeqdny1agesg7l.xn--p1ai/';
    };

}]);
