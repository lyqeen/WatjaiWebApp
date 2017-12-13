<%-- 
    Document   : Test02
    Created on : Nov 1, 2017, 10:16:42 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <script src="https://www.amcharts.com/lib/3/amcharts.js"></script>
        <script src="https://www.amcharts.com/lib/3/serial.js"></script>
        <script src="https://www.amcharts.com/lib/3/plugins/export/export.min.js"></script>
        <link rel="stylesheet" href="https://www.amcharts.com/lib/3/plugins/export/export.css" type="text/css" media="all" />
        <script src="https://www.amcharts.com/lib/3/themes/light.js"></script>

    </head>
    <body>

        HELLO <br>
        <div id="chartdiv" style="width: 640px; height: 400px;"></div>


        <script type="text/javascript">
            var chartData = [];
            var a = [1.84, 1.83, 1.86, 1.87, 1.88, 1.89, 1.91, 1.93];
            var c = [];
            for (var i = 0; i < a.length; i++) {
                chartData.push({
                    point: i,
                    value: a[i]
                });
            }

           
           AmCharts.makeChart( "chartdiv", {
  "type": "serial",
  "dataProvider": chartData,
  "categoryField": "point",
  "graphs": [ {
    "valueField": "value",
    "type": "column"
  } ]
} );


        </script>
    </body>
</html>
