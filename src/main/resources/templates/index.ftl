<!DOCTYPE HTML>
<html ng-app="app">
<head>
    <title>Credit</title>
    <link href="/css/index.css" rel="stylesheet" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <script type="text/javascript" src="/lib/angular.min.js"></script>
    <script type="text/javascript" src="/js/main.js"></script>
</head>

<body ng-controller="appCtrl">
<div>

    <div class="logo">
        <h1>CREDIT</h1>
    </div>
    <!-- call $scope.search() when submit is clicked. -->
    <form ng-submit="search()">
        <!-- will automatically update $scope.user.first_name and .last_name -->
        <div class="sumCreditClient">
            Summa:
            <input type="text" ng-model="sumCreditClient"/>
        </div>
        <div class="periodCreditClient">
            Date:
            <input type="text" ng-model="periodCreditClient"/>
        </div>
        <label>
            <button class="search_bank" type="submit" value="search">Search</button>
        </label>
    </form>

    <div class="resultBanks">
       Bank(s): {{results}}
    </div>

</div>
</body>
</html>


