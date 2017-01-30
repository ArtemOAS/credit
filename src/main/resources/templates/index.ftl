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
        <div id="sum" class="sumCreditClient">
            Summa:
            <input type="range" name="range" ng-model="valueSum" min="{{minSum}}"  max="{{maxSum}}">
        </div>
        <div id="period" class="periodCreditClient">
            Date:
            <input type="range" name="range" ng-model="valuePeriod" min="{{minPeriod}}"  max="{{maxPeriod}}">
        </div>
        <label>
            <button id="search" class="search_bank" type="submit" value="search">Search</button>
        </label>
    </form>

    <div id="result" class="resultBanks">
       Bank(s): {{results}}
    </div>

</div>
</body>
</html>


