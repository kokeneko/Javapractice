package battle;

import java.util.Scanner;

public class Main {

	public static String type1, type2;
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		String[] Aparty = new String[6];
		PartyData pad = new PartyData();

		pad.partyscan(Aparty);
		//pad.partyshow(Aparty);

		for(int i = 0;i < 6;i++) {
			PokeData pod = new PokeData();
			PokeData type = pod.pokedata(Aparty[i]);

			type1 = type.type1;
			type2 = type.type2;

			if(type2.equals("なし")) {
				System.out.println(Aparty[i] + ":" +type1);
			}
			else{
				System.out.println(Aparty[i] + ":" +type1 + type2);
			}
		}

		scan.close();
	}

}
