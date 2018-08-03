import java.util.Scanner;

public class OpenResult {

	public static void main(String[] args) {
		Shop s = new Shop();

		Scanner scn = new Scanner(System.in);
		System.out.print("몇 팩 까시겠습니까?  : ");
				int number = scn.nextInt();

	
		// 왜 2팩이상 까면 오류?
		// - > result = 5에서 6의값을 넣으려고 하기 때문 (배열은 [5]자리라)
		// 배열을 고치면? = > 고친만큼 개봉할 수 있음 (5 = 1팩)
		for (int i=0; i<number ; i++) {
			s.howMany();
		}

		s.result();
		
	}
} 