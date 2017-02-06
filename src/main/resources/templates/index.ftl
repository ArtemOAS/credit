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

    <h2>Подбор онлайн займа</h2>

    <form id="search">

        <div id="sum" class="sumCreditClient"  >
            Сумма:<rzslider rz-slider-model="sliderSum.valueSum" rz-slider-options="sliderSum.optionsSum" callback='callback1'></rzslider>
        </div>

        <div id="period" class="periodCreditClient" >
            Срок:<rzslider rz-slider-model="sliderPeriod.valuePeriod" rz-slider-options="sliderPeriod.optionsPeriod"></rzslider>
        </div>

    </form>

    <#--<div id="result" class="resultBanks">-->
        <#--Количество доступных предложений: {{results}}-->
    <#--</div>-->

    <div class="submit_bank">

        <div id="result" class="resultBanks">
            Количество доступных предложений: {{results}}
            <button id="submit" class="redirect" ng-click="redirect()">
                Сравнить
            </button>
        </div>
    </div>

</div>
</body>
</html>


