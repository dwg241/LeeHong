package Complete;

public class Hw1105Q1 {
	public static void main(String[] args) {
	System.out.println("문제2");
	  System.out.println((25*5 +36-24-72)/5);
	  
	  System.out.println("");
	  System.out.println("문제3");
	int x=3;
	int i;
	int y;
	int z = 0;
	for(i=1; i<5; i++)
	  {
	     y=x*i;
	     z= z+y;
		if(1<i)
	  {
	   System.out.println(z);
	   
	  }
	  }
	  
	  //a= {{(25+5)+(36/4)}-72}*5, b= {{(25x5)+(36-4)}-71}/4, c=(128/4)*2 일 때
			 // a>b>c 가 참이면 true 아니면 false를 출력하는 프로그램 작성
	
	System.out.println("");  
	System.out.println("문제4");
	    int a= (25+5+36/4-72)*5;
		int b= (25*5+36-4-71)/4;
		int c=  128/4*2;
	  
	  System.out.println("a값: "+a);
	  System.out.println("b값: "+b);
	  System.out.println("c값: "+c);
	  if (a>b && b>c)
	  {
		  System.out.println("진실입니다.");
	  }
	  else
		  System.out.println("거짓입니다.");
	  
	
}
}
