package mapia;

import java.util.Scanner;

public class MafiaMain {
	static ID id = null;
	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) 
	{
	
		MafiaManager MM = MafiaManager.getInstance();
	
		while (true) {
			System.out.println("===블랙잭 게임에 오신걸 환영합니다!===");
			System.out.println("메뉴를 입력해주세요.");
			System.out.println("1. 게임시작/다시시작");
			System.out.println("2. 게임메뉴/돌아가기");
			System.out.println("===========================");

			int select2 = MM.sc.nextInt();
			MM.sc.nextLine();

			switch (select2) {
			case 1:
				MM.machine(select2,id);
				break;
			
            case 2:
				
				return;
			}
	
}
}

private static void SignUp() {
	// TODO Auto-generated method stub

	System.out.println("게임을 하기위해 먼저 사용하실 아이디를 입력해주세요!");	
	String name = kb.next();
	System.out.println("초기 금액은 100원에서 시작합니다.");
	int money=100;
	id= new ID(name, money);
	
}
}
