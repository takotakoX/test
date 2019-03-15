<?php

mb_internal_encoding("utf8");
$pdo=new PDO("mysql:dbname=kevindatabase;host=localhost;","root","mysql");
$pdo->exec("insert into 4each_board(hn,title,comment)
                values(
                '".$_POST['hn']."',
                '".$_POST['title']."',
                '".$_POST['comment']."');
                ");
header("Location:http://localhost/4each_board/index.php");
?>