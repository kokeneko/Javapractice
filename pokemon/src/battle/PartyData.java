package battle;

public class PartyData {

	public void partyscan(String[] party) { //配列[6]を渡すとパーティ入力

		for(int i = 0;i < 6;i++) {
			System.out.print("ポケモン" + (i + 1) + ":\n");
			party[i] = Main.scan.next();
		}
	}

	public void partyshow(String[] party) { //配列[6]を渡すと表示する
		for(int i = 0;i < 6;i++) {
			System.out.println(party[i]);
		}
	}

}
