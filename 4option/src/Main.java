public class Main {

	public static void main(String[] args) {
		Mondai mondai = new Mondai();
		GetRandom random = new GetRandom();

		for(int i = 1;i <= 5;i++) {
			mondai.mondai(random.daburandom(5));
		}
		mondai.close();
	}

}
