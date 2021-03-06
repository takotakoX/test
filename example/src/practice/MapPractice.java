package practice;

import java.util.HashMap;
import java.util.Map;
import practice.Person;

public class MapPractice {
	public static void main(String[] args){

		Person person1 = new Person("sato",28);
		Person person2 = new Person("monzen",22);
		Person person3 = new Person("suzuki",31);

		Map<String, Person> personMap = new HashMap<String, Person>();

		personMap.put("佐藤", person1);
		personMap.put("門前", person2);
		personMap.put("鈴木", person3);

		if(personMap.containsKey("門前")){
			System.out.println("門前さんはいます");
		}else{
			System.out.println("門前さんはいません");
		}

		int a = personMap.get("鈴木").getAge();
		System.out.println(a+"才が最年長です");

		for(String key : personMap.keySet()){
			Person p = personMap.get(key);
			int age = p.getAge();
			System.out.println(key+"は"+age+"才");
		}
	}

}
