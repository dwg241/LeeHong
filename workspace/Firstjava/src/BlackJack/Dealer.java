package BlackJack;

public class Dealer  {
	
	int DCard [] = new int [15];
	int Dcount;
	int DSum=0;
	int DSum2=0;
	int result =0;
	int special=13;
	String Picture[] = {"공백","♣A","♣2","♣3","♣4","♣5","♣6","♣7","♣8","♣9","♣10"
                             ,"♣J","♣Q","♣K"
                             ,"♠A","♠2","♠3","♠4","♠5","♠6","♠7","♠8","♠9","♠10"
                             ,"♠J","♠Q","♠K"
                             ,"♥A","♥2","♥3","♥4","♥5","♥6","♥7","♥8","♥9","♥10"
                             ,"♥J","♥Q","♥K"
                             ,"◆A","◆2","◆3","◆4","◆5","◆6","◆7","◆8","◆9","◆10"
			                 ,"◆J","◆Q","◆K"};
	
	int numeber [] = {0,1,2,3,4,5,6,7,8,9,10,10,10,10,
                        1,2,3,4,5,6,7,8,9,10,10,10,10,
                        1,2,3,4,5,6,7,8,9,10,10,10,10,
                        1,2,3,4,5,6,7,8,9,10,10,10,10};
  



	void dealergame(int Sum,Player pi, int count) {
		// TODO Auto-generated method stub
		Dcount=count+2;
		
		for(int i=0 ;i<count;i++) {
			 {
			DCard [i]= pi.Card[i];
			}
		}
		 for(int i=count ;i<count+2;i++) {
			 DCard[i] =(int)(Math.random()*52+1);
			 for(int j=0 ;j<count;j++) {
			 if(DCard[i]==DCard[j])
    		{
    			i--;
    			
    		}
			 }
    	 }
		
		
		this.DSum= numeber [DCard[count]]+numeber [DCard[count+1]];
		
		if(numeber [DCard[count+1]]==1 || numeber [DCard[count]] ==1)
		{
	    this.DSum2= numeber [DCard[count]]+numeber [DCard[count+1]]+10;
		}
		
		while(true)	{	
		        
			if(this.DSum2>Sum && this.DSum2<22) {
				

					this.result=1;
					break;
				
			}
	
	
		
			if(this.DSum>21) {
				this.result=2;
			    break;
				
			}

			if(this.DSum>Sum) {

				this.result=1;
				break;
				
			}
			
		
		DCard [Dcount]= (int)(Math.random()*52+1);
		 
		for(int i=0 ;i<Dcount;i++) {
	    		
    		 if(DCard[i]==DCard[Dcount])
    		{
    			i=-1;
    			DCard[Dcount] =(int)(Math.random()*52+1);
    		}
    	 
    	 }
		
		
		Dcount=Dcount+1;
         
		
		
		for(int i=Dcount-1; i<Dcount ;i++) {
			this.DSum= DSum + numeber [DCard[i]];	
			}
		if(numeber [DCard[Dcount-1]]==1 && this.DSum<11) {
			this.DSum2= this.DSum+10; 	
		}
		 
		
		if(this.DSum2>0 && this.DSum2<22)
		{
			for(int i=Dcount-1; i<Dcount ;i++) {
				this.DSum2= DSum2 + numeber [DCard[i]];	
				}
		}
		}
		
	}
	
		

	
    void show(int count)
    {
    	if(this.DSum2<22 && this.DSum2>this.DSum)
		{
        System.out.println("딜러의 카드합: "+ this.DSum2);
		}
    	
    	else {
    	System.out.println("딜러의 카드합: "+ this.DSum);
    
    	}

    	
    	for(int i=count; i<Dcount ;i++) {
      	  System.out.print(Picture[DCard[i]] +" ");
  		}
    	
    }
    
	
}
