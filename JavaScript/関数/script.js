//-------------------------
document.write("問1")
document.write("<br>")
//ここから解答
function circle(hankei){
    return "半径"+ hankei +"cmの円の面積は" + hankei*hankei*3.14 + "平方cmです。";
}

document.write(circle(5));
document.write("<br>");
document.write(circle(7));
document.write("<br>");
document.write(circle(10));
document.write("<br>");
//ここまで解答
document.write("<br>");
//-------------------------
document.write("問2")
document.write("<br>")
//ここから解答
function totalprice(group,adult,child){
    return group+"グループの合計金額は"+(500*adult+200*child)+"円です。";
}

document.write(totalprice("A",2,4));
document.write("<br>");
document.write(totalprice("B",1,5));
document.write("<br>");
document.write(totalprice("C",3,7));
document.write("<br>");
//ここまで解答