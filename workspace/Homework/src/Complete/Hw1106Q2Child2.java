package Complete;

public class Hw1106Q2Child2 {
	int ball;
	int Game(int k) {
		
		ball +=k*-1;
		return ball;
	}

	void GameShow() {
		System.out.println("어린이2의 구슬의 개수는 " + ball);
		System.out.println("다음 버튼을 입력하세요!" );
		System.out.println("계속 [1] 종료 [2] " );
	}
}
