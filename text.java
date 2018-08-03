public class text {
}

/*
	
	메커니즘 정리

	card_set_simulator

	1. 한 팩은 5장의 카드로 구성되어있다.

	2. 한팩에선 반드시 1개 이상의 r이 들어있다
	 - 1번부터 순서로 나열하여 1~4가 n일때 마지막 5를 r로 바꾼다 
	  - 사용자가 확인만 못하면 되므로 이 방식도 적합함
	    => 나중에 shuufle 해서 순서를 섞어 보여주면 되므로 이 방식으로 짜도 ok

	3. 5% 확률로 SSR이, 10% 확률로 SR이, 20%확률로 R이 나온다
	 -> 3.1 5장당 1개 R (20%) , 25장당 1개 R (0.04%) , 100장당 1개 SSR (0.01%)

	===== 18.08.03 0934 3라인까지 완료
	
	4. 만약 40팩을 개봉하는 동안 SSR이 한개도 나오지 않았다면 40번째 팩에서 고정적으로 SSR이 나온다
	 - R 대신 나올 수 있다
	
	5. 만약 20팩을 개봉하는 동안 SR이 한개도 나오지 않았다면 20번째 팩에서 고정적으로 SR이 나온다
	 - R 대신 나올 수 있다
	
	6. 한 팩에서 두 장 이상의 같은 카드가 나오지 않는다
	
	7. 5% 확률로 황금카드 (등급무관)로 바뀌어 나온다
	 - 기존 카드에서 황금으로 바뀔 확률을 계산
	  = > 기존 카드 접두사에 "황금" 을 부여함 [[[완료]]]
	  -> golden을 boolean 타입값으로 줘서 카드값에 t/f를 부여한다.

	8. 이미 가지고 있는 SSR 카드는 나오지 않는다
	 - 만약 모든 SSR을 가지고 있다면 중복된 경우가 랜덤하게 나온다
	
	
	[클래스 설계]

	Pack : 팩 
	 void open(PackType pack) : PackType 타입에서 pack값을 받아 어떤 팩을 개봉할지 정하게 된다  팩을 개봉한다

	CardSet : 카드 확률을 정리



	


	




*/