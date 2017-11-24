import java.util.Scanner;

public class Mondai {
	Scanner scan = new Scanner(System.in);

	void mondai(int x) {
		int correct = 0;

		switch(x) {
		case 1:{
			System.out.println("mondai1");
			System.out.println("sentakusi1○");
			System.out.println("sentakusi2");
			System.out.println("sentakusi3");
			System.out.println("sentakusi4");
			correct = 1;
			break;
		}
		case 2:{
			System.out.println("mondai2");
			System.out.println("sentakusi1");
			System.out.println("sentakusi2○");
			System.out.println("sentakusi3");
			System.out.println("sentakusi4");
			correct = 2;
			break;
		}
		case 3:{
			System.out.println("mondai3");
			System.out.println("sentakusi1");
			System.out.println("sentakusi2");
			System.out.println("sentakusi3○");
			System.out.println("sentakusi4");
			correct = 3;
			break;
		}
		case 4:{
			System.out.println("mondai4");
			System.out.println("sentakusi1");
			System.out.println("sentakusi2");
			System.out.println("sentakusi3");
			System.out.println("sentakusi4○");
			correct = 4;
			break;
		}
		case 5:{
			System.out.println("mondai5");
			System.out.println("sentakusi1○");
			System.out.println("sentakusi2");
			System.out.println("sentakusi3");
			System.out.println("sentakusi4");
			correct = 1;
			break;
		}
		}
		torf(correct);

	}

	void torf(int correct) {
		int ans = scan.nextInt();

		if(ans == correct) {
			System.out.println("正解");
		}
		else {
			System.out.println("不正解");
		}
	}

	void close() {
		scan.close();
	}
}
