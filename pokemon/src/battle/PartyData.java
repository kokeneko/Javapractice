package battle;

import java.util.Scanner;

public class PartyData {

	public void partyscan(String[] party) {
		Scanner scan = new Scanner(System.in);

		for(int i = 0;i < 6;i++) {
			System.out.print("ポケモン" + (i + 1) + ":");
			party[i] = scan.next();
		}
		scan.close();
	}

	public void partyshow(String[] party) {
		for(int i = 0;i < 6;i++) {
			System.out.println(party[i]);
		}
	}

}
