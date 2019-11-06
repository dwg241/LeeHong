package homework;

public class Homework1106Q2Child1 {
int ball;

int Game(int b1, int k) {
	
	ball = b1;
	ball = b1 +k;
	return ball;
}

void GameShow() {
	System.out.println("어린이1의 구슬의 개수는 " + ball);
}
}
