package example;

import java.util.ArrayList;
import java.util.Iterator;

public class Example33 {
	public static void main(String[] args){
		ArrayList<String> names = new ArrayList<String>();
		names.add("taro");
		names.add("jiro");
		names.add("hanako");
		Iterator<String> it = names.iterator();
		while(it.hasNext()){
			String e = it.next();
			System.out.println(e);
		}
	}
}
