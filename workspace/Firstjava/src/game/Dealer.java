package game;

public class Dealer {

static int CardSum;

static int DealerGame() {
   for(int i=0; i<2; i++) {
	int Card=(int)(Math.random()/10);
	CardSum=CardSum+Card;
   }

   return CardSum;
   
	
	
}

}
