import java.util.Scanner;

public class OpenResult {

	public static void main(String[] args) {
		Shop s = new Shop();

		Scanner scn = new Scanner(System.in);
		System.out.print("�� �� ��ðڽ��ϱ�? (�ְ� 1000��)  : ");
				int number = scn.nextInt();

		// �迭�� ��ġ��? = > ��ģ��ŭ ������ �� ���� (5 = 1��)
		for (int i=0; i<number ; i++) {
			s.howMany();
		}

		s.result();
		
	}
} 