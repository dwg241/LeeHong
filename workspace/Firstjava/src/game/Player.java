package game;

public class Player {
int money;
int card;
static int sum ;

public Player(int money) {
	
	this.money = money;
	
}

static int CardSum (int card){

	
	sum=card+sum;
	return sum;
}

int Wallet (int result, int bet) {

 if(result==0)
 {
     this.money= money +bet;
	return money;
 }
 else {
	 this.money=money -bet;
	 return money;
 }
 	
}

void CardShow() {
	System.out.println("갖고있는 카드:"+ card);
}
void moneyShow() {
	System.out.println("현재 보유금액: "+money);
}

void CardSumShow() {
	System.out.println("카드총합: "+ sum);
}

}
