package me;


public class Data {
	public static void main(String[] args) {   
	  
		int [][] HoresMoney = new int [7][7];
		HoresMoney[1][3]=;
		System.out.println(HoresMoney[5][5]);
		for(int i=1; i<6; i++)
    	{        	  
    	if(i==1) HoresMoney[1][i]=HoresMoney[1][i]*4;
    	if(i==2) HoresMoney[1][i]=HoresMoney[1][i]*2;
    	if(i==3) HoresMoney[1][i]=(int)(HoresMoney[1][i]*1.5);
    	if(i==4) HoresMoney[1][i]=(int)(HoresMoney[1][i]*1.25);
    	if(i==5) HoresMoney[1][i]=(int)(HoresMoney[1][i]*1.1);
    	}
    	for(int i=1; i<6; i++) 
    	{
        HoresMoney[1][0]=HoresMoney[1][0]+HoresMoney[1][i];	
    	}
        System.out.println(HoresMoney[1][0]);
}
}

