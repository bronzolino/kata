/* 
 * 
 */

function circle(radius) {
    var circleArea = function(radius) {
        if (radius <= 0 || isNaN(radius)) return false;
        var area = radius * radius * Math.PI;
        return Math.round(area * 100) / 100;
    };
    alert("Radius : " + radius + " Area : " + circleArea(radius));
}

