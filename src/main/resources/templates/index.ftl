<!DOCTYPE HTML>
<html ng-app="app">
<head>
    <title>Credit</title>
    <link href="/css/index.css" rel="stylesheet"/>
    <link rel="stylesheet" type="text/css" href="/css/rzslider.css"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <script type="text/javascript" src="/lib/angular.min.js"></script>
    <script type="text/javascript" src="/js/main.js"></script>
    <script type="text/javascript" src="/lib/rzslider.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-bootstrap/0.14.3/ui-bootstrap-tpls.js"></script>
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
            Sum:
            <rzslider rz-slider-model="sliderSum.valueSum" rz-slider-options="sliderSum.optionsSum"></rzslider>
        </div>
        <div id="period" class="periodCreditClient">
            Date:
            <rzslider rz-slider-model="sliderPeriod.valuePeriod"
                      rz-slider-options="sliderPeriod.optionsPeriod"></rzslider>
        </div>
        <button id="search" class="search_bank" type="submit" value="search">Search</button>
    </form>

    <div id="result" class="resultBanks">
        Bank(s): {{results}}
    </div>

</div>
</body>
</html>


