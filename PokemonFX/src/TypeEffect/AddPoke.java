package TypeEffect;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddPoke {

	public void write(String poke) { //PokeData.txtに書き込む
		Scanner scan = new Scanner(System.in);
		System.out.println(poke + "のタイプは?");
		String pokedata = scan.next();

		try{
			File file = new File(".\\src\\TypeEffect\\PokemonData.txt");
			FileWriter fw = new FileWriter(file, true);

			fw.write(poke + "," + pokedata + "\r\n");

			fw.close();
		}catch(IOException e) {
			System.out.println(e);
		}
		scan.close();
	}
}