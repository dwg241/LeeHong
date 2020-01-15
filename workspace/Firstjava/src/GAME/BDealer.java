package GAME;

public class BDealer  {
	
	int DCard [] = new int [15];
	int Dcount;
	int DSum;
	int DSum2;
	int result =0;
	int times=2;
  



	void dealergame(int Sum, int count, BCard ai) {
		
		
		 Dcount=count;
		 DCard[0]=ai.GiveCard(Dcount);
         Dcount++;
         DCard[1]=ai.GiveCard(Dcount);
         Dcount++;
   
		
		while(true)	{	
			DSum=0;
			DSum2=0;
	
			for(int i=0 ;i<times;i++)
			{
				if(DCard[i]==1 && Sum+11<22)
				{
				this.DSum2=Sum +DCard[i]+10;
				
				if(DCard[1]==1 && times==2) {
				
				this.DSum2=DSum2 -1;
				
				}
				}
				if(DSum2>0 && DCard[i]!=1)
				{
					this.DSum2=DSum2+DCard[i];
				}
				 
				this.DSum=DSum +DCard[i];
				
			}	
			
			if(this.DSum2>Sum && this.DSum2<22) {
					this.result=1;
					break;
			}
	
		
			if(this.DSum>21) {
				this.result=2;
			    break;
				
			}

			if(this.DSum>=Sum) {

				this.result=1;
				break;
				
			}
			
			 DCard[times]=ai.GiveCard(Dcount);
	         Dcount++;
			 times++;
			
	}
	}
		
    void show()
    {
    	System.out.println("");
    	if(this.DSum2<22 && this.DSum2>this.DSum)
		{
        System.out.println("딜러의 카드합: "+ this.DSum2);
		}
    	
    	else {
    	System.out.println("딜러의 카드합: "+ this.DSum);
    
    	}
    	System.out.println("===========================");	
    }
    
	
}
