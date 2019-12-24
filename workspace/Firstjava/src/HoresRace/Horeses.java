package HoresRace;

public class Horeses {

	int [][] HoresMoney = new int [7][7];
	int[] Hores = new int [7];
	int [] PHoresMoney=new int [7];
	int goal=0;
	int arrive=0;
	int max=0;
	int maxi=0;
	double rank[] = new double [7];
	
	void insertmoney(int horse , int Bmoney, int Round)
	{
             if(horse==1) { 
             HoresMoney[1][Round]=Bmoney;
             HoresMoney[1][0]=HoresMoney[1][0]+HoresMoney[1][Round];
         }
         else if(horse==2) { 
             HoresMoney[2][Round]=Bmoney;
             HoresMoney[2][0]=HoresMoney[2][0]+HoresMoney[1][Round];
             }
         else if(horse==3) { 
             HoresMoney[3][Round]=Bmoney;
             HoresMoney[3][0]=HoresMoney[3][0]+HoresMoney[1][Round];
             }
         else if(horse==4) { 
             HoresMoney[4][Round]=Bmoney;
             HoresMoney[4][0]=HoresMoney[4][0]+HoresMoney[1][Round];
             }
         else if(horse==5) { 
             HoresMoney[5][Round]=Bmoney;
             HoresMoney[5][0]=HoresMoney[5][0]+HoresMoney[1][Round];
             }
         else if(horse==6) { 
             HoresMoney[6][Round]=Bmoney;
             HoresMoney[6][0]=HoresMoney[6][0]+HoresMoney[1][Round];
             }
         
	}

	
	void PeopleMoney(int Round) {
		for(int i=1 ; i<7 ; i++) {
		int m=(int)(Math.random()*10000+1);
		PHoresMoney[i]=PHoresMoney[i]+m;
		}
		if(goal==1) {
		for(int i=1 ; i<7 ; i++) {
		rank[i]=1;
		for(int k=1 ; k<7 ; k++) {
		if(PHoresMoney[i]<PHoresMoney[k])
		rank[i]=(double)(rank[i]+0.3);
		}
		}
		MoneyCount();	
		}
	}
	
	
	
	void Start(int Round) {
	    for(int i=1 ; i<7;i++) {
		 
		Hores[i] =Hores[i] +(int)(Math.random()*6+1);
		
		if(Hores[i]>=20)  {

		if(Hores[i]>max) {
			 
		max=Hores[i];
		maxi=i;
		}
		Hores[i]=19;
		}
		}
	
		Hores[maxi]=20;
		System.out.println("========== "+Round+" Round ==========");
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
	    goal=1;
	    arrive=0;
		}
		}
        System.out.println("♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣");
         
    		 
	}
    
	void MoneyCount() {
    
            for(int k=1 ; k<7 ; k++){
        	if(Hores[k]==20)
        	{
      
            HoresMoney[k][0]=0;
        		
        	for(int i=1; i<4; i++)
        	{        	  
        	if(i==1) HoresMoney[k][i]=(int)(HoresMoney[k][i]*3*rank[k]);
        	if(i==2) HoresMoney[k][i]=(int)(HoresMoney[k][i]*1.5*rank[k]);
        	if(i==3) HoresMoney[k][i]=(int)(HoresMoney[k][i]*1.25*rank[k]);
        	}
        	 
        	for(int i=1; i<4; i++) 
        	{
            HoresMoney[k][0]=HoresMoney[k][0]+HoresMoney[k][i];	
        	}
        	}
        	
        	if(Hores[k]!=20) {
        	HoresMoney[k][0]=HoresMoney[k][0]*-1;
            
            }	 
            }
            }
	
	
	void Moneychart(int times)
	{
		if(goal==1) {
		System.out.println("============베팅 배당금액===========");
		System.out.println("**나의 배당금액**      **전체 베팅판**");
		}
		else if(times<4)
		{
		System.out.println("============베팅 현황============");
		System.out.println("**나의 베팅금액**      **전체 베팅판**");
		}
		if(times<4 || goal==1)
		{
		for(int i=1 ; i<7;i++) {
		System.out.print(i+"번말 금액: "+ HoresMoney[i][0] +"원");		
		System.out.println("         "+i+"번말 금액: "+ PHoresMoney[i] +"원");
		}
		}
		System.out.println("===============================");
		}
}
