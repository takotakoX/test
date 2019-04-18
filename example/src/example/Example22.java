package example;

import java.time.*;

//InstantとZonedDateTimeの利用例
public class Example22 {
	public static void main(String[] args){

//		現在日時を取得
		Instant i1 = Instant.now();

//		long値をInstantに、Instantをlong値に
		Instant i2 = Instant.ofEpochMilli(31920291332L);
		long l = i2.toEpochMilli();

//		現在日時を取得。「東京時間2014年1月2日3時4分5秒6ナノ秒」を指定して取得。
		ZonedDateTime z1 = ZonedDateTime.now();
		ZonedDateTime z2 = ZonedDateTime.of(2014,1,2,3,4,5,6,ZoneId.of("Asia/Tokyo"));

//		ZonedDateTimeをInstantに、InstantをZonedDateTimeに。
		Instant i3 = z2.toInstant();
		ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));

		System.out.println("東京:" + z2.getYear() + z2.getMonthValue() + z2.getDayOfMonth());
		System.out.println("ロンドン:" + z3.getYear() + z3.getMonthValue() + z3.getDayOfMonth());

		if(z2.isEqual(z3)){
			System.out.println("これらは同じ瞬間を指しています");
		}
	}

}
