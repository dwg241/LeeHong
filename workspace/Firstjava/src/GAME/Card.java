package GAME;

public class Card {
	int CardSave [] = new int [30];
	String Picture[] = {"공백","♣A","♣2","♣3","♣4","♣5","♣6","♣7","♣8","♣9","♣10"
                             ,"♣J","♣Q","♣K"
                             ,"♠A","♠2","♠3","♠4","♠5","♠6","♠7","♠8","♠9","♠10"
                             ,"♠J","♠Q","♠K"
                             ,"♥A","♥2","♥3","♥4","♥5","♥6","♥7","♥8","♥9","♥10"
                             ,"♥J","♥Q","♥K"
                             ,"◆A","◆2","◆3","◆4","◆5","◆6","◆7","◆8","◆9","◆10"
                             ,"◆J","◆Q","◆K"
                         };

    int number [] = {0,1,2,3,4,5,6,7,8,9,10,10,10,10,
                       1,2,3,4,5,6,7,8,9,10,10,10,10,
                       1,2,3,4,5,6,7,8,9,10,10,10,10,
                       1,2,3,4,5,6,7,8,9,10,10,10,10};
    
   int GiveCard(int count){
   	  	 
    	int Card =(int)(Math.random()*52+1);
		CardSave[count]=Card;
    	
		for(int i=0 ;i<count;i++) {
		 if(CardSave[i]==CardSave[count])
		{
			 Card =(int)(Math.random()*52+1);
		     CardSave[count]=Card;
			 i=-1;	
		}
		 }
       return number[CardSave[count]];
		
   }
    
    void GiveShow(int count) {
    	for(int i=1 ; i<count ; i++) {
    	System.out.print(Picture[CardSave[i]]+"  ");	
    }
    }	
   void DGiveShow(int Dcount, int count) {
	   for(int i=count ; i<Dcount ; i++) {
	    	System.out.print(Picture[CardSave[i]]+"  ");
	   
   }
}
}