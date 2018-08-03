public class Pack extends CardSet {

	public int result = 0;

	private int normal = 0;
	private int rare = 0;
	private int sRare = 0;
	private int ssRare = 0;

	private int normalRate = 0;

	// String[] 안에 넣은 만큼 개봉할 수 있다. (5 :1)
	String openResult[] = new String[5000];

	public void open() {

		rndGen();

		// 1번부터 5장까지 뽑아가는 반복문
	
		// 21 보다 작다면 R (1~20)
		if (getCardRate() < getRareRate() ) {
			openResult[result] = "희귀 카드 [R]";
			rare ++;

		// 24 보다 작다면 SR (21 ~ 24)
		} else if (getCardRate() <getSRareRate() && getCardRate() >= getRareRate() ) {
			openResult[result] = "영웅 카드 [SR]";
			sRare ++;

		// 25면 SSR (25)
		} else if (getCardRate() == getSsRareRate()) {
			openResult[result] = "전-설 카드 [SSR]";
			ssRare ++;

		} else if (getCardRate() > getSsRareRate()) {
			openResult[result] = "일반 카드";
			normal ++;
			normalRate ++;
		} 


		if (normalRate == 5) {
				openResult[result] = "희귀카드(보정) [R]";		
			}
		

		if (getCardRate() > getGoldenRate()) {
			openResult[result] = "황금 " + openResult[result];

		}

		// 황금 전-설 카드 [SSR] 서치
		String getGold = "황금 전-설 카드 [SSR]";
		if (openResult[result].equals(getGold)) {
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		}

		// 단위테스트 (희귀) 
		String getRare = "황금 희귀카드 [R]";
		String getRare2 = "황금 희귀카드(보정) [R]";
		if (openResult[result].equals(getRare) || openResult[result].equals(getRare2)) {
			System.out.print(" >>>>> ");
		}

		System.out.println(openResult[result]);

		result ++;

	}

	public void openResult() {
		
		// 1팩 (5장 개봉)
		for (int i = 0; i<5; i++) {
			open();
			
		}

		normalRate=0;


	}
}