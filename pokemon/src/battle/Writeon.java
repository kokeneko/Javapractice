package battle;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writeon {

	public void write() {
		try{
			File file = new File(".\\src\\battle\\pokedata.txt");
			FileWriter fw = new FileWriter(file, true);
			Scanner scan = new Scanner(System.in);

			System.out.println("ポケモン,タイプ1,タイプ2");
			String pokedata = scan.next();
			fw.write(pokedata + "\r\n");

			scan.close();
			fw.close();
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
