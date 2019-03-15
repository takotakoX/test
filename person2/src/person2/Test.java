package person2;

public class Test {
	public static void main(String[]args){

//インスタンス化①
	Person taro=new Person();
	taro.name="taro";
	taro.age=18;
	System.out.println(taro.name);
	System.out.println(taro.age);
//コンストラクタ①で処理される。

//インスタンス化②
	Person jiro=new Person("jiro",20);
	System.out.println(jiro.name);
	System.out.println(jiro.age);
//コンストラクタ②で処理される。

	//演習⑤
	Person saburo=new Person("saburo");
	System.out.println(saburo.name);
	System.out.println(saburo.age);

	Person shiro=new Person(25);
	System.out.println(shiro.name);
	System.out.println(shiro.age);

	Person hanako=new Person(17,"hanako");
	System.out.println(hanako.name);
	System.out.println(hanako.age);

	}
}
