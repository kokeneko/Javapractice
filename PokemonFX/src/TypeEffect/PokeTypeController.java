package TypeEffect;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PokeTypeController {

	@FXML private TextField Poke1, Poke2, Poke3, Poke4, Poke5, Poke6;
	@FXML private TextField Poke1Type1, Poke2Type1, Poke3Type1, Poke4Type1, Poke5Type1, Poke6Type1;
	@FXML private TextField Poke1Type2, Poke2Type2, Poke3Type2, Poke4Type2, Poke5Type2, Poke6Type2;
	@FXML private TextField EffectiveType;
	@FXML private Button ImportButton;

	public static String[][] party = new String[6][3];
	public static int[] partyrate = new int[18];
	private String Etype;

	@FXML
	private void ImportPoke() {
		//スキャン、短くなる？
		party[0][0] = Poke1.getText();
		party[1][0] = Poke2.getText();
		party[2][0] = Poke3.getText();
		party[3][0] = Poke4.getText();
		party[4][0] = Poke5.getText();
		party[5][0] = Poke6.getText();

		//タイプインポート、クソ長いなんとか短くする
		Effect ef = new Effect();
		PokeData pod = new PokeData();
		PokeData type0 = pod.pokedata(party[0][0]);

		for(int i = 0;i < 18;i++) { //リセット
			partyrate[i]  = 0;
		}

		//Poke1
		party[0][1] = type0.type1;
		party[0][2] = type0.type2;

		if(party[0][2].equals("なし")) {
			Poke1Type1.setText(party[0][1]);
			Poke1Type2.setText(null);
		}
		else{
			Poke1Type1.setText(party[0][1]);
			Poke1Type2.setText(party[0][2]);
		}
		ef.effect(type0.type1, type0.type2);

		//Poke2
		PokeData type1 = pod.pokedata(party[1][0]);
		party[1][1] = type1.type1;
		party[1][2] = type1.type2;

		if(party[1][2].equals("なし")) {
			Poke2Type1.setText(party[1][1]);
			Poke2Type2.setText(null);
		}
		else{
			Poke2Type1.setText(party[1][1]);
			Poke2Type2.setText(party[1][2]);
		}
		ef.effect(type1.type1, type1.type2);

		//Poke3
		PokeData type2 = pod.pokedata(party[2][0]);
		party[2][1] = type2.type1;
		party[2][2] = type2.type2;

		if(party[2][2].equals("なし")) {
			Poke3Type1.setText(party[2][1]);
			Poke3Type2.setText(null);
		}
		else{
			Poke3Type1.setText(party[2][1]);
			Poke3Type2.setText(party[2][2]);
		}
		ef.effect(type2.type1, type2.type2);

		//Poke4
		PokeData type3 = pod.pokedata(party[3][0]);
		party[3][1] = type3.type1;
		party[3][2] = type3.type2;

		if(party[3][2].equals("なし")) {
			Poke4Type1.setText(party[3][1]);
			Poke4Type2.setText(null);
		}
		else{
			Poke4Type1.setText(party[3][1]);
			Poke4Type2.setText(party[3][2]);
		}
		ef.effect(type3.type1, type3.type2);

		//Poke5
		PokeData type4 = pod.pokedata(party[4][0]);
		party[4][1] = type4.type1;
		party[4][2] = type4.type2;

		if(party[4][2].equals("なし")) {
			Poke5Type1.setText(party[4][1]);
			Poke5Type2.setText(null);
		}
		else{
			Poke5Type1.setText(party[4][1]);
			Poke5Type2.setText(party[4][2]);
		}
		ef.effect(type4.type1, type4.type2);

		//Poke6
		PokeData type5 = pod.pokedata(party[5][0]);
		party[5][1] = type5.type1;
		party[5][2] = type5.type2;

		if(party[5][2].equals("なし")) {
			Poke6Type1.setText(party[5][1]);
			Poke6Type2.setText(null);
		}
		else{
			Poke6Type1.setText(party[5][1]);
			Poke6Type2.setText(party[5][2]);
		}
		ef.effect(type5.type1, type5.type2);
		//このコードを見ても怒らないでほしいぞ俺は


		//ダメージ効率計算
		int maxrate = partyrate[0];

		for(int i = 1;i < 18;i++) { //レート計算
			if(maxrate < partyrate[i]) {
				maxrate = partyrate[i];
			}
		}

		Etype = ""; //リセット
		for(int i = 0;i < 18;i++) { //タイプ算出
			if(maxrate == partyrate[i]) {
				Etype = Etype + Effect.Atype[i];
			}
				EffectiveType.setText(Etype);
		}
	}

}
