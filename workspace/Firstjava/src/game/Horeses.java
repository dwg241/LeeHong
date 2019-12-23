package game;

public class Horeses {

	int[] HoresMoney = new int [7];
	int[] Hores = new int [7];
	int goal=0;
	int arrive=0;
	int max=0;
	int maxi=0;
	void insertmoney(int horse , int Bmoney)
	{
	if(horse==1)      HoresMoney[1]=HoresMoney[1]+Bmoney;
	else if(horse==2) HoresMoney[2]=HoresMoney[2]+Bmoney;
	else if(horse==3) HoresMoney[3]=HoresMoney[3]+Bmoney;
	else if(horse==4) HoresMoney[4]=HoresMoney[4]+Bmoney;
	else if(horse==5) HoresMoney[5]=HoresMoney[5]+Bmoney;
	else if(horse==6) HoresMoney[6]=HoresMoney[6]+Bmoney;
	}

	
	void Start() {
	    for(int i=1 ; i<7;i++) {
		 
		Hores[i] =Hores[i] +(int)(Math.random()*6+1);;
		if(Hores[i]>20)  {
		if(Hores[i]>max) {
			 
		max=Hores[i];
		maxi=i;
		}
		Hores[i]=19;
		}
		}
		Hores[maxi]=20;
		System.out.println("♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣");
		for(int j=1 ; j<7;j++){
		System.out.print(j+"번 레인|");
		for(int i=0 ; i<Hores[j] ;i++)
		{
		System.out.print(" ");
		if(i==19) {
		arrive=1;
		}
		}
		if(arrive==0) {
		System.out.println("馬");
		} 
		if(arrive==1){
	    System.out.println("馬 도착!");
		arrive=0;
		}
		}
         System.out.println("♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣");
         
    	 for(int i=1 ; i<7;i++) {
    		 
    		 if(Hores[i]==20) {
    			 for(int k=1 ; k<7 ; k++){
    	        	  if(Hores[k]==20)
    	        	  {
    	        	     HoresMoney[k]=HoresMoney[k]*2;
    	        		 goal=1;
    	        	  }
    	        	  if(Hores[k]!=20) {
    	        		 HoresMoney[k]=HoresMoney[k]*-1;
    	        	  }	 
    		 }
    		 }
             }
	}

	void Moneychart()
	{
		System.out.println("========베팅 현황========");
		for(int i=1 ; i<7;i++) {
		System.out.println(i+"번말 금액: "+ HoresMoney[i] +"원");		
		}
		 System.out.println("======================");
		}
}
