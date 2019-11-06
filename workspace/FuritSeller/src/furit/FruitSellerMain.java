package furit;

public class FruitSellerMain {

	public static void main(String[] args) {
		//셀러 생성
		FuritSeller seller; // 참조변수 생성 :인스턴스의 주소를 저장
	    seller = new FuritSeller();
	    
		//바이어 생성 
	    FruitBuyer buyer = new FruitBuyer();
	
	    
	    //구매자가 5천원 어치 사과를 구매
	    buyer.buyApple(seller, 5000);
	    System.out.println("판매자의 현재상황");
	     seller.showSaleResult();
	    System.out.println("구매자의 현재상황");
	      buyer.showBuyResult();
	           
	 }

}
