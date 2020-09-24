package jp.co.learning;

import java.util.Random;

public class SupperMain {

	public static void main(String[] args) {
		String[] menu = {"中華", "和食", "エスニック"};
		Random r = new Random();
			String menue = menu[r.nextInt(3)];
			System.out.println(menue);
				
	}

}
