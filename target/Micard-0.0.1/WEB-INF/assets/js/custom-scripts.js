/*------------------------------------------------------
    Author : www.webthemez.com
    License: Commons Attribution 3.0
    http://creativecommons.org/licenses/by/3.0/
---------------------------------------------------------  */

(function ($) {
    "use strict";
    var mainApp = {

        initFunction: function () {
            /*MENU
            ------------------------------------*/
            $('#main-menu').metisMenu();

            $(window).bind("load resize", function () {
                if ($(this).width() < 768) {
                    $('div.sidebar-collapse').addClass('collapse')
                } else {
                    $('div.sidebar-collapse').removeClass('collapse')
                }
            });

            /* MORRIS BAR CHART
			-----------------------------------------*/
            Morris.Bar({
                element: 'morris-bar-chart',
                data: [{
                    y: '2006',
                    a: 100,
                    b: 90
                }, {
                    y: '2007',
                    a: 75,
                    b: 65
                }, {
                    y: '2008',
                    a: 50,
                    b: 40
                }, {
                    y: '2009',
                    a: 75,
                    b: 65
                }, {
                    y: '2010',
                    a: 50,
                    b: 40
                }, {
                    y: '2011',
                    a: 75,
                    b: 65
                }, {
                    y: '2012',
                    a: 100,
                    b: 90
                }],
                xkey: 'y',
                ykeys: ['a', 'b'],
                labels: ['Series A', 'Series B'],
                hideHover: 'auto',
                resize: true
            });

            /* MORRIS DONUT CHART
			----------------------------------------*/
            Morris.Donut({
                element: 'morris-donut-chart',
                data: [{
                    label: "Download Sales",
                    value: 12
                }, {
                    label: "In-Store Sales",
                    value: 30
                }, {
                    label: "Mail-Order Sales",
                    value: 20
                }],
                resize: true
            });

            /* MORRIS AREA CHART
			----------------------------------------*/

            Morris.Area({
                element: 'morris-area-chart',
                data: [{
                    period: '2010 Q1',
                    iphone: 2666,
                    ipad: null,
                    itouch: 2647
                }, {
                    period: '2010 Q2',
                    iphone: 2778,
                    ipad: 2294,
                    itouch: 2441
                }, {
                    period: '2010 Q3',
                    iphone: 4912,
                    ipad: 1969,
                    itouch: 2501
                }, {
                    period: '2010 Q4',
                    iphone: 3767,
                    ipad: 3597,
                    itouch: 5689
                }, {
                    period: '2011 Q1',
                    iphone: 6810,
                    ipad: 1914,
                    itouch: 2293
                }, {
                    period: '2011 Q2',
                    iphone: 5670,
                    ipad: 4293,
                    itouch: 1881
                }, {
                    period: '2011 Q3',
                    iphone: 4820,
                    ipad: 3795,
                    itouch: 1588
                }, {
                    period: '2011 Q4',
                    iphone: 15073,
                    ipad: 5967,
                    itouch: 5175
                }, {
                    period: '2012 Q1',
                    iphone: 10687,
                    ipad: 4460,
                    itouch: 2028
                }, {
                    period: '2012 Q2',
                    iphone: 8432,
                    ipad: 5713,
                    itouch: 1791
                }],
                xkey: 'period',
                ykeys: ['iphone', 'ipad', 'itouch'],
                labels: ['iPhone', 'iPad', 'iPod Touch'],
                pointSize: 2,
                hideHover: 'auto',
                resize: true
            });

            /* MORRIS LINE CHART
			----------------------------------------*/
            Morris.Line({
                element: 'morris-line-chart',
                data: [{
                    y: '2006',
                    a: 100,
                    b: 90
                }, {
                    y: '2007',
                    a: 75,
                    b: 65
                }, {
                    y: '2008',
                    a: 50,
                    b: 40
                }, {
                    y: '2009',
                    a: 75,
                    b: 65
                }, {
                    y: '2010',
                    a: 50,
                    b: 40
                }, {
                    y: '2011',
                    a: 75,
                    b: 65
                }, {
                    y: '2012',
                    a: 100,
                    b: 90
                }],
                xkey: 'y',
                ykeys: ['a', 'b'],
                labels: ['Series A', 'Series B'],
                hideHover: 'auto',
                resize: true
            });


        },

        initialization: function () {
            mainApp.initFunction();

        }

    }
    // Initializing ///

    $(document).ready(function () {
        mainApp.initFunction();
    });






}(jQuery));



(function(d) {
    d.fn.ClassyLoader = function(a) {
        a = d.extend({}, {
            width: 200,
            height: 200,
            animate: !0,
            displayOnLoad: !0,
            percentage: 100,
            speed: 1,
            roundedLine: !1,
            showRemaining: !0,
            fontFamily: "Helvetica",
            fontSize: "50px",
            showText: !0,
            diameter: 80,
            fontColor: "rgba(25, 25, 25, 0.6)",
            lineColor: "rgba(55, 55, 55, 1)",
            remainingLineColor: "rgba(55, 55, 55, 0.4)",
            lineWidth: 5,
            start: "left"
        }, a);
        var e = d(this);
        this.draw = function(b) {
            "undefined" !== typeof b && (a.percentage = b);
            var c = e[0].getContext("2d"),
                h = e.width() / 2,
                d = e.height() / 2,
                f = 0,
                g = 0;
            c.scale(1, 1);
            c.lineWidth = a.lineWidth;
            c.strokeStyle = a.lineColour;
            setTimeout(function k() {
                var b = Math.PI / 180 * 360 / 100 * (f + 1),
                    b = b || Math.PI / 180 * 360 / 100 * (f + 1);
                c.clearRect(0, 0, e.width(), e.height());
                !0 === a.showRemaining && (c.beginPath(), c.strokeStyle = a.remainingLineColor, c.arc(h, d, a.diameter, 0, 360), c.stroke(), c.closePath());
                c.strokeStyle = a.lineColor;
                c.beginPath();
                c.lineCap = !0 === a.roundedLine ? "round" : "butt";
                switch (a.start) {
                    case "top":
                        g = 1.5 * Math.PI;
                        break;
                    case "bottom":
                        g = .5 * Math.PI;
                        break;
                    case "right":
                        g = 1 * Math.PI;
                        break;
                    default:
                        g = 0
                }
                c.arc(h, d, a.diameter, g, b + g);
                c.stroke();
                c.closePath();
                !0 === a.showText && (c.fillStyle = a.fontColor, c.font = a.fontSize + " " + a.fontFamily, c.textAlign = "center", c.textBaseline = "middle", c.fillText(f + 1 + "%", h, d));
                f += 1;
                f < a.percentage && setTimeout(k, a.speed)
            }, a.speed)
        };
        this.setPercent = function(b) {
            a.percentage = b;
            return this
        };
        this.getPercent = function() {
            return a.percentage
        };
        this.show = function() {
            var b = e[0].getContext("2d"),
                c = e.width() / 2,
                d = e.height() / 2;
            b.scale(1, 1);
            b.lineWidth = a.lineWidth;
            b.strokeStyle = a.lineColour;
            b.clearRect(0, 0, e.width(), e.height());
            b.strokeStyle = a.lineColor;
            b.beginPath();
            b.arc(c, d, a.diameter, 0, Math.PI / 180 * (a.percentage / 100) * 360);
            b.stroke();
            b.closePath();
            !0 === a.showText && (b.fillStyle = a.fontColor, b.font = a.fontSize + " " + a.font, b.textAlign = "center", b.textBaseline = "middle", b.fillText(a.percentage + "%", c, d));
            !0 === a.showRemaining && (b.beginPath(), b.strokeStyle = a.remainingLineColor, b.arc(c, d, a.diameter, 0, 360), b.stroke(), b.closePath())
        };
        this.__constructor = function() {
            d(this).attr("width", a.width);
            d(this).attr("height", a.height);
            !0 === a.displayOnLoad && (!0 === a.animate ? this.draw() : this.show());
            return this
        };
        return this.__constructor()
    }
})(jQuery);
