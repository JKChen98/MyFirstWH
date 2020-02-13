function tick() {
var today=new Date();
var month=today.getMonth()+1;<!--getMonth显示当前月份-1，所以要+1才能显示当前月份-->
var year, date, hours, minutes, seconds;
var intHours, intMinutes, intSeconds;
var week=new Array() <!--显示几天为星期几-->
    week[0]="星期天 ";
    week[1]="星期一 ";
    week[2]="星期二 ";
    week[3]="星期三 ";
    week[4]="星期四 ";
    week[5]="星期五 ";
    week[6]="星期六 ";
intHours = today.getHours();
intMinutes = today.getMinutes();
intSeconds = today.getSeconds();
year=today.getFullYear();
date=today.getDate();
var time;
if (intHours == 0) {
 hours = "00:";
} 
else if (intHours < 10) { 
 hours = "0" + intHours+":";
} 
else {
 hours = intHours + ":";
}
if (intMinutes < 10) {
 minutes = "0"+intMinutes+":";
} 
else {
 minutes = intMinutes+":";
}
if (intSeconds < 10) {
 seconds = "0"+intSeconds+" ";
} 
else {
 seconds = intSeconds+" ";
} 
timeString="今天是："+year+"年"+month+"月"+date+"日  "+hours+minutes+seconds+week[today.getDay()];
clock.innerHTML = timeString;
window.setTimeout("tick();", 1000);
}
window.onload = tick;