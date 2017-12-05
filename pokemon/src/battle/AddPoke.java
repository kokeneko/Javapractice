package battle;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AddPoke {

	public void write(String poke) { //PokeData.txtに書き込む

		System.out.println(poke + "のタイプは?");
		String pokedata = Main.scan.next();

		try{
			File file = new File(".\\src\\battle\\PokemonData.txt");
			FileWriter fw = new FileWriter(file, true);

			fw.write(poke + "," + pokedata + "\r\n");

			fw.close();
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}