package Study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Name {
	public static void main(String[] args) {
		String[] rnd = { "a", "v", "b", "c", "e", "d", "g", "l", "s", "a", "n", "g", "b", "a", "e", "k", "l", "l",
				"q" };
		StringBuilder rndBuilder = new StringBuilder();

		for (String e : rnd) {
			rndBuilder.append(e);
		}

		StringBuilder name = new StringBuilder("asdffff");

		ArrayList<String> list = new ArrayList<String>();

		for (int i = 0; i < name.length(); i++) {
			int j = 0;
			Loop2: for (String e : rndBuilder.toString().split("")) {
				j++;
				if (e.equals(Character.toString(name.charAt(i)))) {
					list.add(e);
					break Loop2;
				}
			}

		}

		System.out.println(list);
	}
}
