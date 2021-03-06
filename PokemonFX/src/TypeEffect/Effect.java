package TypeEffect;

public class Effect {

	private int[][] rate = { // A側のタイプ                   B側のタイプ
			{2,4,2,2,2,2,2,0,2,2,2,2,2,2,2,2,2,2}, // ノーマル 0:効果なし
			{2,2,2,2,4,1,1,2,2,2,2,2,2,2,4,2,1,4}, // かくとう 1:いまひとつ
			{2,1,1,4,2,1,2,2,2,2,2,2,1,2,4,2,2,1}, // どく     2:通常の効果
			{2,2,1,2,2,2,1,2,2,2,4,0,4,4,2,2,2,2}, // じめん   4:ばつぐん
			{2,1,2,0,2,1,4,2,2,2,2,4,1,4,2,2,2,2}, // ひこう
			{2,1,2,1,4,2,4,2,2,4,2,2,1,2,2,2,2,2}, // むし
			{1,4,1,4,1,2,2,2,4,1,4,2,4,2,2,2,2,2}, // いわ
			{0,0,1,2,2,1,2,4,2,2,2,2,2,2,2,2,4,2}, // ゴースト
			{1,4,0,4,1,1,1,2,1,4,2,2,1,1,1,1,2,1}, // はがね
			{2,2,2,4,2,1,4,2,1,1,4,2,1,1,2,2,2,1}, // ほのお
			{2,2,2,2,2,2,2,2,1,1,1,4,4,1,2,2,2,2}, // みず
			{2,2,2,4,1,2,2,2,1,2,2,1,2,2,2,2,2,2}, // でんき
			{2,2,4,1,4,4,2,2,2,4,1,1,1,4,2,2,2,2}, // くさ
			{2,4,2,2,2,2,4,2,4,4,2,2,2,1,2,2,2,2}, // こおり
			{2,1,2,2,2,4,2,4,2,2,2,2,2,2,1,2,4,2}, // エスパー
			{2,2,2,2,2,2,2,2,2,1,1,1,1,4,2,4,2,4}, // ドラゴン
			{2,4,2,2,2,4,2,1,2,2,2,2,2,2,0,2,1,4}, // あく
			{2,1,4,2,2,1,2,2,4,2,2,2,2,2,2,0,1,2}, // フェアリー
	};
	private int[] currentrate = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
	public static String[] Atype = {"ノーマル","かくとう","どく","じめん","ひこう","むし","いわ","ゴースト","はがね","ほのお","みず","でんき","くさ","こおり","エスパー","ドラゴン","あく","フェアリー"};
	public static String[] Btype = {"ノーマル","かくとう","どく","じめん","ひこう","むし","いわ","ゴースト","はがね","ほのお","みず","でんき","くさ","こおり","エスパー","ドラゴン","あく","フェアリー"};

	public void effect(String type1, String type2) {
		int j = 0;
			for(int i = 0;i < 18;i++) {
			if(type1.equals(Btype[i]) || type2.equals(Btype[i])) {
				for(j = 0;j < 18;j++) {
					currentrate[j] *= rate[i][j];
				}
			}
			if(type2.equals("なし")) {
				currentrate[i] *= 2;
			}
			PokeTypeController.partyrate[i] += currentrate[i];
		}
	}
}
