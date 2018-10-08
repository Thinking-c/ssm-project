<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page import="java.util.*" %>
<%@ page import="java.text.*" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":"
            + request.getServerPort()
            + path + "/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <base href="<%=basePath%>">

    <!-- jsp文件头和头部 -->
    <%@ include file="top.jsp" %>
    <!--css just for the preview-->

</head>
<body>
<div class="container-fluid" id="main-container">

    <div id="page-content" class="clearfix">

        <div class="page-header position-relative">
            <h1>
                Dashbord
                <small><i class="icon-double-angle-right"></i></small>
            </h1>
        </div>

        <div class="row-fluid">
            <div class="span7 infobox-container">

                <div class="infobox infobox-green">
                    <div class="infobox-icon"><i class="icon-comments"></i></div>
                    <div class="infobox-data">
                        <span class="infobox-data-number">32</span>
                        <span class="infobox-content">comments + 2 reviews</span>
                    </div>
                    <div class="stat stat-success">8%</div>
                </div>
                <div class="infobox infobox-blue">
                    <div class="infobox-icon"><i class="icon-twitter"></i></div>
                    <div class="infobox-data">
                        <span class="infobox-data-number">11</span>
                        <span class="infobox-content">new followers</span>
                    </div>
                    <div class="badge badge-success">+32%</div>
                </div>
                <div class="infobox infobox-pink">
                    <div class="infobox-icon"><i class="icon-shopping-cart"></i></div>
                    <div class="infobox-data">
                        <span class="infobox-data-number">8</span>
                        <span class="infobox-content">new orders</span>
                    </div>
                    <div class="stat stat-important">4%</div>
                </div>
                <div class="infobox infobox-red">
                    <div class="infobox-icon"><i class="icon-beaker"></i></div>
                    <div class="infobox-data">
                        <span class="infobox-data-number">7</span>
                        <span class="infobox-content">experiemnts</span>
                    </div>
                </div>
                <div class="infobox infobox-orange2">
                    <div class="infobox-chart">
                        <span class="sparkline" data-values="196,128,202,177,154,94,100,170,224"></span>
                    </div>
                    <div class="infobox-data">
                        <span class="infobox-data-number">6,251</span>
                        <span class="infobox-content">pageviews</span>
                    </div>
                    <div class="badge badge-success">7.2% <i class="icon-arrow-up"></i></div>
                </div>


                <div class="infobox infobox-blue2">
                    <div class="infobox-progress">
                        <div class="easy-pie-chart percentage" data-percent="42" data-size="46"><span
                                class="percent">42</span>%
                        </div>
                    </div>

                    <div class="infobox-data">
                        <span class="infobox-text">traffic used</span>
                        <span class="infobox-content"><span class="approx">~</span> 58GB remaining</span>
                    </div>
                </div>
                <div class="space-6"></div>
            </div>
        </div>
        <div class="hr hr32 hr-dotted"></div>
        <div id="container" style="height: 300px;width: 100%"></div>
        <script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/echarts/echarts.min.js"></script>
        <script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/echarts-gl/echarts-gl.min.js"></script>
        <script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/echarts-stat/ecStat.min.js"></script>
        <script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/echarts/extension/dataTool.min.js"></script>
        <script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/echarts/map/js/china.js"></script>
        <script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/echarts/map/js/world.js"></script>
        <script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=ZUONbpqGBsYGXNIYHicvbAbM"></script>
        <script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/echarts/extension/bmap.min.js"></script>
        <script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/simplex.js"></script>
        <script type="text/javascript">
            var dom = document.getElementById("container");
            var myChart = echarts.init(dom);
            var app = {};
            option = null;

            /*myChart.showLoading();
            $.get('static/echarts/webkit-dep.json', function (webkitDep) {
                myChart.hideLoading();

                option = {
                    legend: {
                        data: ['HTMLElement', 'WebGL', 'SVG', 'CSS', 'Other']
                    },
                    series: [{
                        type: 'graph',
                        layout: 'force',
                        animation: false,
                        label: {
                            normal: {
                                position: 'right',
                                formatter: '{b}'
                            }
                        },
                        draggable: true,
                        data: webkitDep.nodes.map(function (node, idx) {
                            node.id = idx;
                            return node;
                        }),
                        categories: webkitDep.categories,
                        force: {
                            // initLayout: 'circular'
                            // repulsion: 20,
                            edgeLength: 5,
                            repulsion: 20,
                            gravity: 0.2
                        },
                        edges: webkitDep.links
                    }]
                };

                myChart.setOption(option);
            });;*/
            var axisData = ['周一','周二','周三','很长很长的周四','周五','周六','周日'];
            var data = axisData.map(function (item, i) {
                return Math.round(Math.random() * 1000 * (i + 1));
            });
            var links = data.map(function (item, i) {
                return {
                    source: i,
                    target: i + 1
                };
            });
            links.pop();
            option = {
                title: {
                    text: '笛卡尔坐标系上的 Graph'
                },
                tooltip: {},
                xAxis: {
                    type : 'category',
                    boundaryGap : false,
                    data : axisData
                },
                yAxis: {
                    type : 'value'
                },
                series: [
                    {
                        type: 'graph',
                        layout: 'none',
                        coordinateSystem: 'cartesian2d',
                        symbolSize: 40,
                        label: {
                            normal: {
                                show: true
                            }
                        },
                        edgeSymbol: ['circle', 'arrow'],
                        edgeSymbolSize: [4, 10],
                        data: data,
                        links: links,
                        lineStyle: {
                            normal: {
                                color: '#2f4554'
                            }
                        }
                    }
                ]
            };;

            if (option && typeof option === "object") {
                myChart.setOption(option, true);
            }
        </script>
    </div>
</div>
<script type="text/javascript">
    $(top.hangge());
    $(function () {
        $('.dialogs,.comments').slimScroll({
            height: '300px'
        });
        $('#tasks').sortable();
        $('#tasks').disableSelection();
        $('#tasks input:checkbox').removeAttr('checked').on('click',
            function () {
                if (this.checked)
                    $(this).closest('li').addClass('selected');
                else
                    $(this).closest('li').removeClass('selected');
            });
        var oldie = $.browser.msie && $.browser.version < 9;
        $('.easy-pie-chart.percentage')
            .each(
                function () {
                    var $box = $(this).closest('.infobox');
                    var barColor = $(this).data('color')
                        || (!$box.hasClass('infobox-dark') ? $box
                                .css('color')
                            : 'rgba(255,255,255,0.95)');
                    var trackColor = barColor == 'rgba(255,255,255,0.95)' ? 'rgba(255,255,255,0.25)'
                        : '#E2E2E2';
                    var size = parseInt($(this).data('size')) || 50;
                    $(this).easyPieChart({
                        barColor: barColor,
                        trackColor: trackColor,
                        scaleColor: false,
                        lineCap: 'butt',
                        lineWidth: parseInt(size / 10),
                        animate: oldie ? false : 1000,
                        size: size
                    });
                })
        $('.sparkline').each(
            function () {
                var $box = $(this).closest('.infobox');
                var barColor = !$box.hasClass('infobox-dark') ? $box
                    .css('color') : '#FFF';
                $(this).sparkline('html', {
                    tagValuesAttribute: 'data-values',
                    type: 'bar',
                    barColor: barColor,
                    chartRangeMin: $(this).data('min') || 0
                });
            });
        var data = [{
            label: "social networks",
            data: 38.7,
            color: "#68BC31"
        }, {
            label: "search engines",
            data: 24.5,
            color: "#2091CF"
        }, {
            label: "ad campaings",
            data: 8.2,
            color: "#AF4E96"
        }, {
            label: "direct traffic",
            data: 18.6,
            color: "#DA5430"
        }, {
            label: "other",
            data: 10,
            color: "#FEE074"
        }];
        var placeholder = $('#piechart-placeholder').css({
            'width': '90%',
            'min-height': '150px'
        });
        $.plot(placeholder, data, {

            series: {
                pie: {
                    show: true,
                    tilt: 0.8,
                    highlight: {
                        opacity: 0.25
                    },
                    stroke: {
                        color: '#fff',
                        width: 2
                    },
                    startAngle: 2

                }
            },
            legend: {
                show: true,
                position: "ne",
                labelBoxBorderColor: null,
                margin: [-30, 15]
            },
            grid: {
                hoverable: true,
                clickable: true
            },
            tooltip: true, //activate tooltip
            tooltipOpts: {
                content: "%s : %y.1",
                shifts: {
                    x: -30,
                    y: -50
                }
            }

        });

        var $tooltip = $(
            "<div class='tooltip top in' style='display:none;'><div class='tooltip-inner'></div></div>")
            .appendTo('body');
        placeholder.data('tooltip', $tooltip);
        var previousPoint = null;
        placeholder.on('plothover', function (event, pos, item) {
            if (item) {
                if (previousPoint != item.seriesIndex) {
                    previousPoint = item.seriesIndex;
                    var tip = item.series['label'] + " : "
                        + item.series['percent'] + '%';
                    $(this).data('tooltip').show().children(0).text(tip);
                }
                $(this).data('tooltip').css({
                    top: pos.pageY + 10,
                    left: pos.pageX + 10
                });
            } else {
                $(this).data('tooltip').hide();
                previousPoint = null;
            }

        });
        var d1 = [];
        for (var i = 0; i < Math.PI * 2; i += 0.5) {
            d1.push([i, Math.sin(i)]);
        }
        var d2 = [];
        for (var i = 0; i < Math.PI * 2; i += 0.5) {
            d2.push([i, Math.cos(i)]);
        }
        var d3 = [];
        for (var i = 0; i < Math.PI * 2; i += 0.2) {
            d3.push([i, Math.tan(i)]);
        }

        var sales_charts = $('#sales-charts').css({
            'width': '100%',
            'height': '220px'
        });
        $.plot("#sales-charts", [{
            label: "Domains",
            data: d1
        }, {
            label: "Hosting",
            data: d2
        }, {
            label: "Services",
            data: d3
        }], {
            hoverable: true,
            shadowSize: 0,
            series: {
                lines: {
                    show: true
                },
                points: {
                    show: true
                }
            },
            xaxis: {
                tickLength: 0
            },
            yaxis: {
                ticks: 10,
                min: -2,
                max: 2,
                tickDecimals: 3
            },
            grid: {
                backgroundColor: {
                    colors: ["#fff", "#fff"]
                },
                borderWidth: 1,
                borderColor: '#555'
            }
        });
        $('[data-rel="tooltip"]').tooltip();
    })
</script>
</body>
</html>
