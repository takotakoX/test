package example;

import java.util.HashSet;
import java.util.Set;

public class Example35 {
	public static void main(String[] args){
		Set<String> colors = new HashSet<String>();
		colors.add("赤");
		colors.add("青");
		colors.add("黃");
		for(String s:colors){
			System.out.print(s + "→");
		}
	}
}
