import java.util.Random;

public class GetRandom {
	int[] tmp = new int [5];
	int countM;

	int daburandom(int max) {
		Random rand = new Random();

		int daburand = rand.nextInt(max) + 1;

		for(int i = 0;i <= countM;i++) {
			if(daburand == tmp[i]) {
				daburand = rand.nextInt(max) + 1;
				i = -1;
			}
			if(i == countM) {
				tmp[i] = daburand;
			}
		}
		countM++;

		return daburand;

	}

}
