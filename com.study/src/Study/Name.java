package Study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Name {
	public static void main(String[] args) {
		String[] rnd = { "a", "v", "b", "c", "e", "d", "g", "l", "s", "a", "n", "g", "b", "a", "e", "k", "l", "l",
				"q" };
		StringBuilder name = new StringBuilder("sangbaek");

		ArrayList<String> list = new ArrayList<String>();

		for (int i = 0; i < name.length(); i++) {
			for (String e : rnd) {
				if (e.equals(Character.toString(name.charAt(i)))) {
					list.add(e);
					name.deleteCharAt(i);
				} 
			}
			
		}

		System.out.println(list);
	}
}
