package example;

import java.util.Date;

//Dateクラスを用いたプログラミングの例
public class Example21 {
	public static void main(String[] args){
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.getTime());
		Date past = new Date(1316622225835L);
		System.out.println(past);
	}

}
