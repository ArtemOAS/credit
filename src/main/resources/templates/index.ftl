<!DOCTYPE HTML>
<html ng-app="app">
<head>
    <title>Credit</title>
    <link rel="stylesheet" type="text/css"
          href="https://cdnjs.cloudflare.com/ajax/libs/angularjs-slider/6.1.0/rzslider.min.css"/>
    <link href="/css/index.css" rel="stylesheet"/>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
    <link href="/css/angular-tooltips.min.css" rel="stylesheet" type="text/css" />

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <script type="text/javascript" src="/lib/angular.min.js"></script>
    <script type="text/javascript" src="/js/main.js"></script>
    <script type="text/javascript"
            src="https://cdnjs.cloudflare.com/ajax/libs/angularjs-slider/6.1.0/rzslider.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-bootstrap/0.14.3/ui-bootstrap-tpls.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/angular-ui-bootstrap/2.5.0/ui-bootstrap.min.js"></script>
</head>

<body ng-controller="appCtrl">
<script src="/lib/angular-tooltips.min.js"></script>

<div id="credit_block">

    <div id="logotype">Подбор онлайн займа</div>

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

    <div id="cont" class="container-fluid">
        <div id="row_res" class="row">
            <div id="block_result" class="col-xs-6 col-sm-4">
                Найдено:
                <div id="results" tooltips tooltip-template="Количество доступных предложений">{{results}}</div>
            </div>
            <button id="but" class="btn btn-info" type="button" ng-click="redirect()">Сравнить</button>
        </div>
    </div>

</div>
</body>
</html>


