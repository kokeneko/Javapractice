package writetest;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	void write1() {
		try {
			File file = new File(".\\src\\writetest\\sample.txt");
			FileWriter fw = new FileWriter(file, true);

			fw.write("TEST\r\n");

			fw.close();
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
