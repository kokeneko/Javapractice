package writetest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class Read {

	void read1(){
		try {
			File file = new File(".\\src\\writetest\\sample.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			String str = br.readLine();
			String str2 = br.readLine();

			System.out.println(str);
			System.out.println(str2);

			br.close();
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
