package Complete;

import java.util.Scanner;

public class Hw1106Q2Main {
	//다음조건을 만족하는 클래스를 구성하자. 구슬치기와 딱지치기
	//어린아이가 소유하고 있는 구슬의 개수 정보를 담을 수 있다.
	//놀이를 통한 구슬을 주고받음을 표현하는 메서드가 존재한다.
	//두 번째 조건은 두 아이가 구슬치기를 하는 과정에서 구슬의 잃고 얻음을 의미/하는 것이다.
	//조건을 만족하는 클래스를 정의하였다면, 다음조건을 만족하는 인스턴스를 각각 생성하자.
    //어린이 1의 보유자산  구슬 15개
	//어린이 2의 보유자산  구슬 9개
	//인스턴스의 생성이 완료되면 다음의 상황을 main 메서드 내에서 시뮬레이션하자.
	//“1차 게임에서 어린이 1은 어린이 2의 구슬 2개를 획득한다”
	//“2차 게임에서 어린이 2는 어린이 1의 구슬 7개를 획득한다.”
	//마지막으로 각각의 어린이의 보유 구슬의 개수를 출력하고 프로그램 종료
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int count = 0;
		Hw1106Q2Child1 child1 = new Hw1106Q2Child1();
		Hw1106Q2Child2 child2 = new Hw1106Q2Child2();
				
		System.out.println("어린이1의 구슬개수를 입력하세요 " );
		int child1ball = kb.nextInt();
		child1.ball = child1ball;
		
		System.out.println("어린이2의 구슬개수를 입력하세요 " );
		int child2ball = kb.nextInt();	
		child2.ball = child2ball;
		
		System.out.println("게임을 실행하려면 1을 입력하세요! " );
		System.out.println("게임을 종료하려면 2를 입력하세요! " );
		
		while(true) { 
		int menu = kb.nextInt();
	    if(menu==1){
		count++;
		
		System.out.println("어린이1의 구슬을 획득했거나 혹은 잃은 구슬을 입력하세요!" );
		System.out.println("참고: 구슬을 잃었으면 -를 붙여주세요!" );
		int key = kb.nextInt();
		
		System.out.println(count+"차 게임 실행결과" );
		child1.Game(key);
		child1.GameShow();
		child2.Game(key);
		child2.GameShow();
		
			}
	   else if(menu==2)
	   {
		   break;
	   }
	   else
			System.out.println("다시 입력하세요!" );
		
		}			
	    }
	
		}


