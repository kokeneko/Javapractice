package TypeEffect;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class PokeData {
	String type1, type2;

	public PokeData pokedata(String poke) { //ポケモンの名前を渡すとPokemonData.txtからタイプを返す
		PokeData poketype = new PokeData();
		AddPoke ap = new AddPoke();

		try {
			File file = new File(".\\src\\TypeEffect\\PokemonData.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String name = null;

			do {
				String str = br.readLine();

				if(str == null) {
					ap.write(poke);
					str = br.readLine();
				}

				StringTokenizer st = new StringTokenizer(str, ",");
				name = st.nextToken();
				poketype.type1 = st.nextToken();
				poketype.type2 = st.nextToken();

			}while(!poke.equals(name));

			br.close();
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}

		return poketype;
	}
}
