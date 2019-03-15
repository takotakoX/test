<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>4eachblog 掲示板</title>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
    <?php
        
    mb_internal_encoding("utf8");
        $pdo = new PDO("mysql:dbname=kevindatabase;host=localhost;","root","mysql");
        $stmt=$pdo->query("select * from 4each_board");
        
    ?>
    <header>
        <img src="4eachblog_logo.jpg">
        <ul>
            <li>トップ</li>
            <li>プロフィール</li>
            <li>4eachについて</li>
            <li>登録フォーム</li>
            <li>問い合わせ</li>
            <li>その他</li>
        </ul>
    </header>
    <main>
        <div class="main-container">
            <div class="left">
                <h1>プログラミングに役立つ掲示板</h1>
                <form method="post" action="insert.php">
                <div class="content-wrapper">
                    <h2>入力フォーム</h2>
                    <div>
                        <label>ハンドルネーム</label>
                        <br>
                        <input type="text" name="hn" size="15">
                    </div>
                    <div>
                        <label>タイトル</label>
                        <br>
                        <input type="text" name="title" size="25">
                    </div>
                    <div>
                        <label>コメント</label>
                        <br>
                        <textarea name="comment" rows="7" cols="70"></textarea>
                    </div>
                    <div class="submit">
                        <input type="submit" value="投稿する">
                    </div>
                </div>
            </form>
                <div class="lower">
                    
                    <?php
                    
                    while($row =$stmt->fetch()){
                        echo "<div class='row-wrapper'>";
                        echo "<div class='row'>";
                        echo "<h2>".$row['title']."</h2>";
                        echo "<p class='row-content'>";
                        echo $row['comment'];
                        echo "</p>";
                        echo "<p class='row-footer'>posted by ".$row['hn']."</p>";
                        echo "</div>";
                        echo "</div>";
                    }
                    
                    ?>
                    
                </div>
            </div>
            <div class="right">
                <div class="menu _1">
                    <ul>
                        <li id="bold">人気の記事</li>
                        <li>PHP オススメ本</li>
                        <li>PHP MyAdminの使い方</li>
                        <li>今人気のエディタ Top5</li>
                        <li>HTMLの基礎</li>
                    </ul>
                </div>
                <div class="menu _2">                  
                    <ul>
                        <li id="bold">オススメリンク</li>
                        <li>インターノウス株式会社</li>
                        <li>XAMPPのダウンロード</li>
                        <li>Eclipseのダウンロード</li>
                        <li>Bracketsのダウンロード</li>
                    </ul>
                </div>
                <div class="menu _3">
                    <ul>
                        <li id="bold">カテゴリ</li>
                        <li>HTML</li>
                        <li>PHP</li>
                        <li>MySQL</li>
                        <li>JavaScript</li>
                    </ul>
                </div>
            </div>
        </div>
    </main>
    <footer>
        copyright @ internous | 4each blog is the one which provides A to Z about programming.
    </footer>
    </body>
</html>