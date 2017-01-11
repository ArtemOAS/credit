<!DOCTYPE HTML>
<html ng-app="app">
<head>
    <title>Credit</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <script type="text/javascript" src="/lib/angular.min.js"></script>
    <script type="text/javascript" src="/js/main.js"></script>
</head>
<body ng-controller="appCtrl">
<div>
    <!-- call $scope.search() when submit is clicked. -->
    <form ng-submit="search()">
        <!-- will automatically update $scope.user.first_name and .last_name -->
        <input type="text" ng-model="sumCreditClient">
        <input type="text" ng-model="periodCreditClient">
        <input type="submit" value="search">
    </form>

    <div>
        Results:
        <ul>
            <!-- assuming our search returns an array of users matching the search -->
            <li>
                {{results}}
            </li>
        </ul>
    </div>

</div>
</body>
</html>


