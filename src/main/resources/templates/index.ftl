<!DOCTYPE HTML>
<html ng-app="app">
<head>
    <title>Credit</title>
    <link rel="stylesheet/less" type="text/css" href="/css/style.less">
    <script src="//cdnjs.cloudflare.com/ajax/libs/less.js/2.7.2/less.min.js"></script>

    <link href="/css/index.css" rel="stylesheet"/>
    <link rel="stylesheet" type="text/css" href="/css/rzslider.css"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <script type="text/javascript" src="/lib/angular.min.js"></script>
    <script type="text/javascript" src="/js/main.js"></script>
    <script type="text/javascript" src="/lib/rzslider.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-bootstrap/0.14.3/ui-bootstrap-tpls.js"></script>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
    <!-- Latest compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-bootstrap/2.5.0/ui-bootstrap.min.js"></script>
</head>

<body ng-controller="appCtrl">
<div>

    <h2>Подбор онлайн займа</h2>

    <form id="search">

        <div id="sum" class="sumCreditClient">

            <h4>Сумма:</h4>
            <rzslider rz-slider-model="sliderSum.valueSum"
                      rz-slider-options="sliderSum.optionsSum"></rzslider>
        </div>

        <div id="period" class="periodCreditClient">

            <h4>Срок:</h4>
            <rzslider rz-slider-model="sliderPeriod.valuePeriod"
                      rz-slider-options="sliderPeriod.optionsPeriod"></rzslider>

        </div>

    </form>

    <div id="container" class="container-fluid">
        <div class="row">
            <div id="block_result" class="col-xs-6 col-sm-4">
                Количество доступных предложений:
                <div id="results">{{results}}</div>
            </div>
            <button type="button" class="btn btn-info" ng-click="redirect()">Сравнить</button>
        </div>
    </div>

</div>
</body>
</html>


