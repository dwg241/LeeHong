package GAME;



public class Player {
	
	int Card[] = new int [15];
	int Sum;
	int Sum2;
	int money;
	
	// 생성자 : 초기화 메서드
	// 기본 데이터 초기화	
	void Save(int Card, int count) {
	
		this.Card [count] = Card;
		
    
	}
	
	void Circulate(int count) {
		Sum=0;
		Sum2=0;
		for(int i=1 ;i<count;i++)
		{
			if(Card[i]==1 && Sum+11<22)
			{
			Sum2=Sum+Card[i]+10;
			
			if(Card[1]==1 && count==3) {
			
			this.Sum2=Sum2-1;
			
			}
			}
			
			if(Sum2>0 && Card[i]!=1)
			{
			Sum2=Sum2+Card[i];
			}
			
			
			Sum=Sum+Card[i];
			
		}
		System.out.println("");
		System.out.println("나의 카드합: " + Sum);
		if(Sum2>0 &&  Sum2<22) {
		System.out.println("나의 카드합: " + Sum2);
		}
		System.out.println("===========================");
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
	void insertmoney(int money) {
		this.money=money;
			
	}
   
}


	
	