package me;


public class Data {
	public static void main(String[] args) {   
		int Card[] = new int [15];
		int Sum = 0;
		int Sum2 = 0;
		Card[2]=1;
		Card[1]=3;
		int count =3;
		for(int i=1 ;i<3;i++)
		{
			if(Card[i]==1 && Sum+11<22)
			{
			Sum2=Sum+Card[i]+10;
			
			if(Card[1]==1 && count==3) {
			
		    Sum2=Sum2 -1;
			
			}
			}
			
			if(Sum2>0 && Card[i]!=1)
			{
			
			Sum2=Sum2+Card[i];
			
			}
			
			
			Sum=Sum+Card[i];
			}
		System.out.println(Sum2);
		System.out.println(Sum);
		
}
}

