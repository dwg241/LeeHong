package BlackJack2;

import java.util.Scanner;

//기능 클래스
public class BRuleManager {

	Player[] pBook ;
	
	
	int cnt;
	
	Scanner sc;
	String name;
	public static BRuleManager getInstance() {
		if(m==null) {
			return new BRuleManager();
		} else {
			return m;
		}
		
	}
	
	private static BRuleManager m = new BRuleManager();
	
	private BRuleManager() {
	    pBook = new Player[5];
		sc = new Scanner(System.in);
	}
	

	void moneyset() {
        
        Player wallet=null;
		wallet = new Player();
		System.out.println("게임을 하기위해 먼저 사용하실 아이디를 입력해주세요!");	
	    System.out.println("아이디");
		name=sc.nextLine();
		System.out.println("초기 금액은 100원에서 시작합니다.");
		int money = 100;
		wallet.insertmoney(money);
	    pBook[1]=wallet;
		
	}
	
	
	
	void machine(int select) {
		
		
		Player pi= new Player();
		Card ai = new Card();
		int count=1;
		
		int Sum=0;
		int result;
	    int Card;
	  
     		
		
		 System.out.println("");
		 System.out.println("베팅금액을 입력해주세요!");
		 int Bmoney = sc.nextInt();
	      
		 Card=ai.GiveCard(count);
         pi.Save(Card,count);
         count++;
        
         Card=ai.GiveCard(count);
         pi.Save(Card,count);
         count++;
         ai.GiveShow(count);
		 pi.Circulate(count);
		 
	    if(pi.Sum2==21) 
	    {
	    	
			System.out.println("블랙잭 win");
			 pBook[1].money=pBook[1].money+2*Bmoney;
			 System.out.println( name +"님의 잔액: "+ pBook[1].money+"원");
			 return;
	    }

		while(true) {
			
			System.out.println("HIT [1] STOP [2]");
		    System.out.println("===========================");
		    int menu = sc.nextInt();
		
		
		if(menu==1) {
	
			Card=ai.GiveCard(count);
	        pi.Save(Card,count);
	        count++;
	        ai.GiveShow(count);
	        pi.Circulate(count);
	        
	        result= pi.gameresult();
		   
		    if(result==1)
		    {
		    System.out.println("lose");
		
		    pBook[1].money=pBook[1].money-Bmoney;
		    System.out.println(name +"님의 잔액: "+ pBook[1].money+"원");
		    if(pBook[1].money<0) {
				System.out.println(name+ "님은 파산했습니다.");
				System.out.println(name+ "님은 100원이 자동충전됩니다.");
				pBook[1].money=100;
				return;
				}
		    break;
		    }
		    
		    if(result==2)
		    {
		    System.out.println("블랙잭 Win");
		    pBook[1].money=pBook[1].money+2*Bmoney;
		    System.out.println(name +"님의 잔액: "+ pBook[1].money+"원");
		    
		    break;
		    }
		    
	    }
		if(menu==2){
			Dealer di = new Dealer();
			
			
			if(pi.Sum2>pi.Sum) {
				di.dealergame(pi.Sum2,count, ai);
				result=di.result;
			}
			else{
				di.dealergame(pi.Sum,count, ai);
				result=di.result;
			}
			
			ai.DGiveShow(di.Dcount,count);
			di.show();
		    
			if(result==1)
		    {
		 
		    System.out.println("lose");
		    pBook[1].money=pBook[1].money-Bmoney;
			System.out.println(name +"님의 금액: "+ pBook[1].money+"원");
			if(pBook[1].money<0) {
					System.out.println(name+ "님은 파산했습니다.");
					System.out.println(name+ "님은 100원이 자동충전됩니다.");
					pBook[1].money=100;
					return;
					}
			       break;
		    }
		   
		    if(result==2)
		    {
		    System.out.println("Win");
		    pBook[1].money=pBook[1].money+Bmoney;
			System.out.println(name +"님의 금액: "+ pBook[1].money+"원");
		    break;
		    }
		}
		}
	}


	
}

	
		
	
	
	
	
	

	
	
	
	
	
