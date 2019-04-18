package example;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

//LocalDateTime（曖昧な日時）を表すクラスの利用例
public class Example23 {
	public static void main(String[] args){

//		現在日時を取得
		LocalDateTime l1 = LocalDateTime.now();
//		2014年1月1日9時5分を指定して取得
		LocalDateTime l2 = LocalDateTime.of(2014,1,1,9,5,0,0);

//		LocalDateTimeをZonedDateTimeに変換
		ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
//		ZonedDateTimeをLocalDateTimeに変換
		LocalDateTime l3 = z1.toLocalDateTime();
	}

}
