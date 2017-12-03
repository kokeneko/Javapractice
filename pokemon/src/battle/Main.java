package battle;

public class Main {

	public static String type1 = "失", type2 = "敗";

	public static void main(String[] args) {
		String[] Aparty = new String[6];
		PartyData pad = new PartyData();

		pad.partyscan(Aparty);
		pad.partyshow(Aparty);

		PokeData pod = new PokeData();
		PokeData type = pod.pokedata(Aparty[0]);

		type1 = type.type1;
		type2 = type.type2;

		System.out.println(type1 + type2);
	}

}
