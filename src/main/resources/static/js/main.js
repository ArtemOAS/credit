// Define the `app` module
var app = angular.module('app', []);
// Define the `PhoneListController` controller on the `phonecatApp` module
app.controller('appCtrl', ['$scope', '$http', function ($scope, $http) {
    $scope.user = {};

    $scope.search = function () {
        var parameters = {
            user: $scope.user
        };
        var config = {
            params: parameters
        };
        /* the $http service allows you to make arbitrary ajax requests.
         * in this case you might also consider using angular-resource and setting up a
         * User $resource. */
        $http.get('/resource/', config).success(
            function (data, status, header, config) {
                $scope.Datails = data;
            }
        ).error(function (data, status, header, config) {
            $scope.ResponseDetails = "Data: " + data +
                "<hr />status: " + status +
                "<hr />headers: " + header +
                "<hr />config: " + config;
        });
    }
}]);
