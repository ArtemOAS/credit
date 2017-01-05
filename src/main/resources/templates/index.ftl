<!DOCTYPE HTML>
<html>
<head>
    <title>Getting Started: Handling Form Submission</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <script type="text/javascript" src="/lib/angular.min.js"></script>
    <script type="text/javascript" src="/js/main.js"></script>
</head>
<body>
<div ng-app="app" ng-controller="appCtrl">
    <!-- call $scope.search() when submit is clicked. -->
    <form ng-submit="search()">
        <!-- will automatically update $scope.user.first_name and .last_name -->
        <input type="text" ng-model="user.first">
        <input type="text" ng-model="user.second">
        <input type="submit" value="search">
    </form>

    <div>
        Results:
        <ul>
            <!-- assuming our search returns an array of users matching the search -->
            <li ng-repeat="user in results">
                {{user.first}} {{user.second}}
            </li>
        </ul>
    </div>

</div>
</body>
</html>


