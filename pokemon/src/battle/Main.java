package battle;

import java.util.Scanner;

public class Main {

	public static String type1, type2;
	public static Scanner scan = new Scanner(System.in);
	public static int[] partyrate = new int[18];
	//private String[] Atype = {"ノーマル","かくとう","どく","じめん","ひこう","むし","いわ","ゴースト","はがね","ほのお","みず","でんき","くさ","こおり","エスパー","ドラゴン","あく","フェアリー"};


	public static void main(String[] args) {
		String[] Aparty = new String[6];
		PartyData pad = new PartyData();
		Effect ef = new Effect();

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

			ef.effect(type.type1, type.type2);
		}

		int maxrate = partyrate[0];

		for(int i = 1;i < 18;i++) { //最大のレートを算出
			if(maxrate < partyrate[i]) {
				maxrate = partyrate[i];
			}
		}
		for(int i = 0;i < 18;i++) {
			if(maxrate == partyrate[i])
				System.out.println(Effect.Atype[i]);
		}

		scan.close();
	}

}
