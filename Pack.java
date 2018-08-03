public class Pack extends CardSet {

	public int result = 0;

	private int normal = 0;
	private int rare = 0;
	private int sRare = 0;
	private int ssRare = 0;

	private int normalRate = 0;
	private int goldenLegend = 0;

	private int countPack = 0;

	private int unitTest = 0;
	private int unitTestCompare = 0;

	// String[] �ȿ� ���� ��ŭ ������ �� �ִ�. (5 :1)
	String openResult[] = new String[5000];

	public void open() {

		rndGen();


		// 1������ 5����� �̾ư��� �ݺ���
	
		// 21 ���� �۴ٸ� R (1~20)
		if (getCardRate() < getRareRate() ) {
			openResult[result] = "	��� ī�� [R]";
			rare ++;

		// 24 ���� �۴ٸ� SR (21 ~ 24)
		} else if (getCardRate() <getSRareRate() && getCardRate() >= getRareRate() ) {
			openResult[result] = "	���� ī�� [SR]";
			sRare ++;

		// 25�� SSR (25)
		} else if (getCardRate() == getSsRareRate()) {
			openResult[result] = "	��-�� ī�� [SSR]";
			ssRare ++;

		} else if (getCardRate() > getSsRareRate()) {
			openResult[result] = "	�Ϲ� ī��";
			normal ++;
			normalRate ++;
		} 


		if (normalRate == 5) {
				openResult[result] = "	��� ī��(����) [R]";	
				rare ++;
				normal --;
			}
		

		if (getCardRate() > getGoldenRate()) {
			openResult[result] = "Ȳ��" + openResult[result];

		}

		System.out.print(openResult[result]);


		// Ȳ�� ��-�� ī�� [SSR] ��ġ
		String getGold = "Ȳ��	��-�� ī�� [SSR]";
		if (openResult[result].equals(getGold)) {
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			goldenLegend ++;
		}

		// TODO : ���� ���ڿ��� �־ .equals()�� �� ���� �ִ�.
		// "Ȳ��	��-�� ī�� [SSR]".equals(openResult[result]);

		// �����׽�Ʈ (���) 
		String getRare = "Ȳ��	��� ī�� [R]";
		String getRare2 = "Ȳ��	��� ī��(����) [R]";
		if (openResult[result].equals(getRare) || openResult[result].equals(getRare2)) {
			System.out.print("		<!>");
			unitTest ++;
			unitTestCompare = countPack;

		}
		
		System.out.println();


		result ++;

	}

	public void openResult() {
		
		System.out.println("[" + (countPack + 1) + " ��]");
		countPack ++;

		// 1�� (5�� ����)
		for (int i = 0; i<5; i++) {
			open();
			
		}

		normalRate=0;

	}

	public void totalResult() {
		System.out.println("���� ī�� : " + ssRare + "��");
		System.out.println("���� ī�� : " + sRare+ "��");
		System.out.println("��� ī�� : " + rare+ "��");
		System.out.println("�Ϲ� ī�� : " + normal+ "��");
		if (goldenLegend > 1) {
			System.out.println("	Ȳ�� ���� ī�� : " + goldenLegend + "��");
		}
	}

	public int caclulateDust() {
		int dust = ssRare * 400 + sRare * 100 + rare * 20 + normal * 5;
		System.out.println("���� : " + dust);
		return dust;

	}

	public void unitTestResult() {
		System.out.println("======");

		

		if (unitTest > 0) {
			System.out.println ("���� �׽�Ʈ�� �߻��� �� : " + unitTestCompare);
		} else {
			System.out.println("���� �׽�Ʈ �߻� ��� ����.");
		} 

	}
}