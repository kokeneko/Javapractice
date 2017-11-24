import java.util.Random;
import java.util.Scanner;


public class Main {

	static int[] tmp = new int[5];
	static int countM = 0;
	static Scanner scan = new Scanner(System.in);

	static void torf(int correct) {

		int ans = scan.nextInt();

		if(ans == correct) {
			System.out.println("正解");
		}
		else {
			System.out.println("不正解");
		}
	}

	static void mondai(int x) {
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

	static int getrand(int min,int max) {
		Random rand = new Random();

		int randrange = rand.nextInt(max + 1);

		while(true) {
			if(randrange < min) {
				randrange = rand.nextInt(max + 1);
			}
			else {
				break;
			}
		}

		return randrange;
	}

	static int daburandom(int y) {
		int daburand = getrand(1,y);

		for(int i = 0;i <= countM;i++) {
			if(daburand == tmp[i]) {
				daburand = getrand(1,y);
				i = -1;
			}
			if(i == countM) {
				tmp[i] = daburand;
			}
		}
		countM++;

		return daburand;

	}

	public static void main(String[] args) {
		for(int i = 1;i <= 5;i++) {
			mondai(daburandom(5));
		}
		scan.close();

	}

}
