package GAME;

import java.util.Scanner;

//기능 클래스
public class BRuleManager {

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
	    
		sc = new Scanner(System.in);
	}
	

	

	void machine(int select, ID id) {
		
		
		Player pi= new Player();
		Card ai = new Card();
		int count=1;
		
		int Sum=0;
		int result;
	    int Card;
	    int Bmoney=0;
     		
		
		 System.out.println("");
		 while(true) {
				System.out.println("베팅금액을 입력해주세요!");
				Bmoney = sc.nextInt();
				if(Bmoney<id.money) {
				break;
				}
				System.out.println("보유하고 있는 "+(int)(id.money)+"원 보다 많습니다.");

				}
	      
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
			 id.money=id.money+2*Bmoney;
			 System.out.println( id.name +"님의 잔액: "+ (int)(id.money)+"원");
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
		
		    id.money=id.money-Bmoney;
		    System.out.println(id.name +"님의 잔액: "+ (int)(id.money)+"원");
		    if(id.money<0) {
				System.out.println(id.name+ "님은 파산했습니다.");
				System.out.println(id.name+ "님은 100원이 자동충전됩니다.");
				id.money=100;
				return;
				}
		    break;
		    }
		    
		    if(result==2)
		    {
		    System.out.println("블랙잭 Win");
		    id.money=id.money+2*Bmoney;
		    System.out.println(id.name +"님의 잔액: "+ (int)(id.money)+"원");
		    
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
		    id.money=id.money-Bmoney;
			System.out.println(id.name +"님의 금액: "+ (int)(id.money)+"원");
			if(id.money<0) {
					System.out.println(id.name+ "님은 파산했습니다.");
					System.out.println(id.name+ "님은 100원이 자동충전됩니다.");
					id.money=100;
					return;
					}
			       break;
		    }
		   
		    if(result==2)
		    {
		    System.out.println("Win");
		    id.money=id.money+Bmoney;
			System.out.println(id.name +"님의 금액: "+ (int)(id.money)+"원");
		    break;
		    }
		}
		}
	}


	
}

	
		
	
	
	
	
	

	
	
	
	
	
