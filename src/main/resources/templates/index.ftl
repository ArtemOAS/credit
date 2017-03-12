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
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</head>

<body ng-controller="appCtrl">
<div>

    <h2>Подбор онлайн займа</h2>

    <form id="search">

        <div id="sum" class="sumCreditClient"  >

            <h4>Сумма:</h4>
            <rzslider rz-slider-model="sliderSum.valueSum" rz-slider-options="sliderSum.optionsSum"></rzslider>
        </div>

        <div id="period" class="periodCreditClient" >
            <h4>Срок:</h4>
            <rzslider rz-slider-model="sliderPeriod.valuePeriod" rz-slider-options="sliderPeriod.optionsPeriod"></rzslider>
        </div>

    </form>

    <div class="row"  >
        <pre class="col-sm-3">Количество<br/>доступных<br/>предложений: <div id="results">{{results}}</div></pre>
        <button type="button" class="btn btn-info" ng-click="redirect()">Сравнить</button>
    </div>

</div>
</body>
</html>


