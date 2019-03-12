package person;

public class Test {
	public static void main(String[]args){
		Person taro=new Person();
		taro.name="山田太郎";
		taro.age=20;
		taro.phoneNumber="060-1111-2222";
		taro.emailAddress="abc@gmail.com";

		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.emailAddress);

		Person jiro=new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		jiro.phoneNumber="070-1111-2222";
		jiro.emailAddress="def@gmail.com";

		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.emailAddress);

		Person hanako=new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		hanako.phoneNumber="080-1111-2222";
		hanako.emailAddress="ghi@gmail.com";

		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.emailAddress);

		Person kohei=new Person();
		kohei.name="鈴川昂平";
		kohei.age=28;
		kohei.phoneNumber="090-1111-2222";
		kohei.emailAddress="jkl@gmail.com";

		System.out.println(kohei.name);
		System.out.println(kohei.age);
		System.out.println(kohei.phoneNumber);
		System.out.println(kohei.emailAddress);;

		//演習⑥
		taro.talk();
		kohei.walk();
		hanako.run();

		//演習⑧
		Robot aibo=new Robot();
		aibo.name="aibo";

		Robot asimo=new Robot();
		asimo.name="asimo";

		Robot pepper=new Robot();
		pepper.name="papper";

		aibo.talk();
		asimo.walk();
		pepper.run();
	}
}
