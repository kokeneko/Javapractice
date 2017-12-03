package battle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class PokeData {
	String type1, type2;

	public PokeData pokedata(String poke) {
		PokeData poketype = new PokeData();

		try {
			File file = new File(".\\src\\battle\\PokemonData.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String str = br.readLine();

			//do {
				StringTokenizer st = new StringTokenizer(str, ",");
				String name = st.nextToken();
				poketype.type1 = st.nextToken();
				poketype.type2 = st.nextToken();

				System.out.println(name + poketype.type1 + poketype.type2);

					//if() {
					//	hogege
					//}

			//}while(!poke.equals(name));


			br.close();
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}

		return poketype;
	}
}
