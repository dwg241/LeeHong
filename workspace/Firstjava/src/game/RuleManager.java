package game;

import java.util.ArrayList;

import java.util.Scanner;




public class RuleManager {

	

	ArrayList<Player> pBook;

      Scanner kb;
	
	
	public static RuleManager getInstance() {
		if(m==null) {
			return new RuleManager();
		} else {
			return m;
		}
		
	}
	
	private static RuleManager m = new RuleManager();
	
	private RuleManager() {
		
		pBook= new ArrayList<Player>();

		kb = new Scanner(System.in);
	}
	static Player pi = null;
	
	static void Betting()
	{
		System.out.println("베팅 금액을 입력하세요!");
		int money = kb.nextInt();
		pi = new Player(money);
		System.out.println(money+"원을 걸었습니다.");
	}
	static void Hit(int select2) {
		int card=(int)(Math.random()/10);
		System.out.println(card+"을 받았습니다.");
		Player.CardSum(card);
		System.out.println("더 받겠습니까?");
	}
	static void Stop(int select2) {
		Dealer.DealerGame();
	    
  	                                  
	}
}
