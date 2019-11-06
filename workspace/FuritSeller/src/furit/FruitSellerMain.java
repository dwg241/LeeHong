package furit;

public class FruitSellerMain {

	public static void main(String[] args) {
		//셀러1 생성
		FruitSeller seller1; // 참조변수 생성 :인스턴스의 주소를 저장
	  //  seller1 = new FruitSeller(0,30,1500);
		seller1 = new FruitSeller();
	    //셀러2 생성
	    FruitSeller seller2; // 참조변수 생성 :인스턴스의 주소를 저장
	    seller2 = new FruitSeller(0,10,1000);
	    
		//바이어 생성 
	    FruitBuyer buyer = new FruitBuyer(10000);
	
	    
	    //구매자가 5천원 어치 사과를 구매
	    buyer.buyApple(seller1, 3000);
	    buyer.buyApple(seller2, 3000);
	    System.out.println("판매자1 의 현재상황");
	     seller1.showSaleResult();
	     System.out.println("판매자2 의 현재상황");
	     seller2.showSaleResult();
	     System.out.println("구매자의 현재상황");
	      buyer.showBuyResult();
	           
	 }

}
