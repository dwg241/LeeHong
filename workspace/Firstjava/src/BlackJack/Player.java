package BlackJack;



public class Player {
	

	int Card [] = new int [10];
	String Picture[] = {"공백","♣A","♣2","♣3","♣4","♣5","♣6","♣7","♣8","♣9","♣10"
			                 ,"♣J","♣Q","♣K"
			                 ,"♠A","♠2","♠3","♠4","♠5","♠6","♠7","♠8","♠9","♠10"
			                 ,"♠J","♠Q","♠K"
			                 ,"♥A","♥2","♥3","♥4","♥5","♥6","♥7","♥8","♥9","♥10"
			                 ,"♥J","♥Q","♥K"
			                 ,"◆A","◆2","◆3","◆4","◆5","◆6","◆7","◆8","◆9","◆10"
			                 ,"◆J","◆Q","◆K"
			                 };
	
	int numeber [] = {0,1,2,3,4,5,6,7,8,9,10,10,10,10,
			            1,2,3,4,5,6,7,8,9,10,10,10,10,
			            1,2,3,4,5,6,7,8,9,10,10,10,10,
			            1,2,3,4,5,6,7,8,9,10,10,10,10};
	
	
	int Sum;
	int Sum2;
	int money;
	
	// 생성자 : 초기화 메서드
	// 기본 데이터 초기화	
	public Player(int Card1, int Card2) {
	
		Card[0] = Card1;
		Card[1] = Card2;
       	
		this.Sum = numeber [Card[0]] + numeber [Card[1]];
		if(numeber [Card[0]]==1 || numeber [Card[1]]==1)
		{
			this.Sum2= numeber [Card[0]]+numeber [Card[1]]+10;
		 
		}
		
	
	}
     void NewCard(int count)
	{
    	 Card[count] =(int)(Math.random()*52+1);
    	 
    	 for(int i=0 ;i<count;i++) {
    		
    		 if(Card[i]==Card[count])
    		{
    			i=-1;
    			Card[count] =(int)(Math.random()*52+1);
    		}
    	 
    	 }
    	 
       
      
      this.Sum =Sum + numeber [ Card[count]];
     
      
      if(numeber [ Card[count]]==1 && this.Sum<11)
     {
      this.Sum2 =Sum + numeber [ Card[count]]+10;
     }
      if(this.Sum2>0) {
      this.Sum2=Sum2 +numeber [ Card[count]];
      }
	}
	
	void showBasicInfor(int c1, int c2) {
		if(this.Sum2>0 && this.Sum2<22) {
			System.out.println("카드의 총합: " +this.Sum2);
		      }   
		System.out.println("카드의 총합: " +this.Sum);
		
		System.out.print(Picture[c1] +" ");
		System.out.print(Picture[c2] +" ");
		
	   
	}
	
	void show(int count,int c1, int c2) {
		showBasicInfor(c1,c2);
		
		for(int i=2; i<count+1 ;i++) {
	    	  System.out.print(Picture[Card[i]] +" ");
			}		
		System.out.println("");
		System.out.println("==========================");
		
	}
    

	public int gameresult() {
	int result=0;
	
	if(Sum>21) {
	
		result=1;
	}
	if(Sum==21 || Sum2==21)
	{
		
		result=2;
	}
	
	return result;	
	} 
	void insertmoney(int m) {
		this.money=m;
		
		
	}
   }


	
	