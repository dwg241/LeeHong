package furit;

public class FruitBuyer {
    // 설계 방법 기능을 생각 -> 기능 구현의 단계를 생각한다. 
	// 상태 값: 보유 금액, 사과의 개수 
	
	int myMoney ;  // 보유금액 : 초기값은 10000원
	int numOfApple; // 보유사과 : 최값은 0개
		
   // 기능: 구매, 구매현황

   //구매 : 구매할 셀러, 구매할 금액 -> 
	//셀러에게 판매 요청(금액) -> 
	//반환 받은 사과의 개수로 사과의 개수를 변경-> 
	//금액 변경
	FruitBuyer(int money){
		myMoney= money;
		
	}
	
 void buyApple(FruitSeller seller, int money) {
	 
	 int num = seller.saleApple(money);
	 numOfApple += num; // 사과의 개수 변경
     myMoney -=money;     
	 
 }
    
 void showBuyResult() {
	 System.out.println("현재 보유금액: "+myMoney);
	 System.out.println("사과의 개수: "+ numOfApple);
 }

}
