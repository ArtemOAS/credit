var app = angular.module('app', ['rzModule', 'ui.bootstrap']);
app.controller('appCtrl', ['$scope', '$http', '$window', function ($scope, $http, $window) {
    $scope.results = '0';

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
        valueSum: 5000,
        optionsSum: {
            floor: 1000,
            ceil: 30000,
            step: 1000,
            minLimit: 1000,
            maxLimit: 30000,
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
        valuePeriod: 14,
        optionsPeriod: {
            floor: 1,
            ceil: 30,
            step: 1,
            minLimit: 1,
            maxLimit: 30,
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

    $scope.redirect = function() {
        $window.location.href='http://xn----7sbgjeqdny1agesg7l.xn--p1ai/';
    };

}]);
