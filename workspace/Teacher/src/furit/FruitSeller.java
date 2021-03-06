package furit;

public class FruitSeller {

	//상태값: 사과의 개수, 수익금, 사과의가격 
	int numofApple;    //사과의 개수
    int myMoney;  //판매금액
    //final int APPLE_PRICE = 1000;
      
      // 기능 : 판매 , 판매 데이터 출력 
      
      // 판매기능 : 돈을 받고-> 사과의 개수를 계산-> 사과의 개수 변경 -> 돈의 수치 변경-> 사과의 개수를 반환
  //인스턴스 생성시에 단한번 실행 => 멤버변수의 초기화 할때 사용:초기화 메서드 
    final int APPLE_PRICE;
    
    public FruitSeller(int money, int num, int price){

    	numofApple =num;
    	myMoney=money;
    	APPLE_PRICE=price;
    }
    
    public FruitSeller(FruitSeller fs){

    	this.numofApple =fs.numofApple;
    	this.myMoney=fs.myMoney;
    	this.APPLE_PRICE=fs.APPLE_PRICE;
    }
    
    int saleApple(int money)
    {
    	//판매할 사과의 개수 
    	int num= money/APPLE_PRICE;
    	numofApple = numofApple-num; //보유한 사과의 개수 변경 
    	myMoney =myMoney + money;  // 보유한 돈의 금액 변경
    	
    	return num;
    	
    }
    
    // 판매 결과 출력
    void showSaleResult() {
    	System.out.println("남은 사과의 개수: "+ numofApple);
    	System.out.println("판매 수익: "+ myMoney );
    }
    public FruitSeller() {
    	this(0,20,500);
    }
}
