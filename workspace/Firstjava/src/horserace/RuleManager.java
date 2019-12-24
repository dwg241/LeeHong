package horserace;

import java.util.Scanner;

//기능 클래스
public class RuleManager {

	Player[] pBook ;
	
	
	int cnt;
	Scanner sc;
	String name;
	public static RuleManager getInstance() {
		if(m==null) {
			return new RuleManager();
		} else {
			return m;
		}
		
	}
	
	private static RuleManager m = new RuleManager();
	
	private RuleManager() {
	    pBook = new Player[5];
		sc = new Scanner(System.in);
	}
	

	 void moneyset() {
     
        Player wallet=null;
		wallet = new Player();
		System.out.println("게임을 하기위해 먼저 사용하실 아이디를 입력해주세요!");	
	    name=sc.nextLine();
		System.out.println("초기 금액은 100원에서 시작합니다.");
		int money = 100;
		wallet.insertmoney(money);
	    pBook[1]=wallet;
		
	}
	
	
	
	void machine(int select) {
	 
		Horeses h= new Horeses();
	    int times=0;
		
		
		System.out.println("♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣");
		for(int i=1 ; i<7;i++) {
		System.out.print(i+"번 레인|");
        System.out.println("馬");
		}
         System.out.println("♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣");
		while(true) {
			times++;
			if(times<4) {
			System.out.println("");
			System.out.println("베팅을 걸지 않으려면 0원을 입력하세요!");
		    System.out.println("베팅금액을 입력해주세요!");
			int Bmoney = sc.nextInt();
			if(Bmoney!=0) {
			System.out.println("몇번 말에 거시겠습니까!");
			System.out.println("[1] [2] [3] [4] [5] [6]");
			int hores = sc.nextInt();
			h.insertmoney(hores, Bmoney, times);
			}
			}
			if(times>3) {
		    System.out.println(times+ " Round 진행하고 싶으면 엔터를 누르세요.");
		    String go = sc.nextLine();
			}
			h.Start(times);
			h.PeopleMoney(times);
			h.Moneychart(times);
			
			if(h.goal==1) {
				for(int i=1 ; i<7 ;i++) 
				{
			    pBook[1].money=pBook[1].money+h.HoresMoney[i][0]; 
				}
				System.out.println(name +"님의 잔액: " +pBook[1].money+"원");
				break;
			
			}
			
			}
	
	
	}


	
}

	
		
	
	
	
	
	

	
	
	
	
	
