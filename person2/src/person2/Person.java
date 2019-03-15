package person2;

public class Person {

	public String name=null;
	public int age=0;

	//コンストラクタ①=デフォルトコンストラクタ
	public Person(){}

	//コンストラクタ②
	public Person(String name, int age){
		this.name=name;
		this.age=age;
	}
//	this.nameは5行目のnameを指している。

	//コンストラクタ③
	public Person(String name){
		this.name=name;
		this.age=age;
	}

	//コンストラクタ④
	public Person(int age){
		this.name="名前なし";
		this.age=age;
	}

	//コンストラクタ⑤
	public Person(int age, String name){
		this.name=name;
		this.age=age;
	}
}
