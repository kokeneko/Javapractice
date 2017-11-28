package pokemon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("タイプ1:");
		String type1 = scan.next();
		System.out.print("タイプ2:");
		String type2 = scan.next();
		scan.close();

		System.out.println(type1 + " " +type2);

		TypeEffect sample = new TypeEffect();

		sample.effect(type1,type2);
	}

}
