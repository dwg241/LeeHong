package Complete;

import java.util.Scanner;

public class Hw1105Q2 {
	public static void main(String[] args) {
		
		 Scanner kb = new Scanner(System.in);
		 System.out.println("문제3");
	      int radius = (int)(Math.random()*10)+1;
	  	
	       circleRound(radius); //void 타입
	       circleAreaCalculation(radius); 
	      
	       float circleArea=circleAreaCalculation(radius);  //return 타입으로 보기
	       System.out.println("원의 넓이값: "+circleArea);
	       
	       
	       //전달되는 값이 소수(prime number)인지 아닌지를 판단하여, 소수인경우
	       //  true를, 소수가 아닌 경우 false를 반환하는 메서드를 정의하고, 이를 이용해
	       //서 1이상 100 이하의 소수를 전부 출력할 수 있도록 main 메서드를 정의하자
		  	
	       System.out.println("");
		   System.out.println("문제4");
		   int primeNumber= (int)(Math.random()*99)+1;

           discriminate(primeNumber);
             
           System.out.println("찾고 싶은 소수 범위를 입력하세요!"); 
           int number= kb.nextInt();;
             
              output(number);
}
	
	private static void output(int n) {
		// TODO Auto-generated method stub
		System.out.print(n+"범위안에 소수는 ");

		for(int i=2 ; i<n;++i) {	
			int key =0;
			for(int j=1; j<=i;j++)  {
	    if(i%j==0) {
	            	key++;
	           	
	               }
			       }
		
			if(key==2) {
				System.out.print(i+" ");
		         }
		     }
		System.out.print("입니다.");
	}

	private static void discriminate(int p) {
		// TODO Auto-generated method stub
		int key =0;
		for(int i=1; i<=p;i++) {
             if(p%i==0) {
            	key++;
            	
             }
		}
		
		if(key==2) {
			System.out.println(p+"값은 소수입니다.");
		}
             else
            	 System.out.println(p+"값은 소수가 아닙니다.");
		}
	

	
	
	private static void circleRound(int r) {
		// TODO Auto-generated method stub
		float pi = 3.14f;
		float  result =r*2*pi;
          
          System.out.println("원의 둘레값: "+result);
	}

	private static float circleAreaCalculation(int r) {
		// TODO Auto-generated method stub
		float pi = 3.14f;
		float  result =r*r*pi;
          return result;
          
	}

	private static void divide(int ran1, int ran2) {
		// TODO Auto-generated method stub
		int  result1;
		int  result2;
		if(ran1>ran2)
		{
		  result1=ran1/ran2;
		  result2= ran1%ran2;
		  System.out.println("몫: "+result1 + " 나머지: "+result2); 
		}
		else
		  result1=ran2/ran1;
		  result2= ran2%ran1;
		  System.out.println("몫: "+result1 + " 나머지: "+result2);
        
	}

	private static void add(int ran1, int ran2) {
             int  result =ran1+ran2;
             
             System.out.println("덧셈값: "+result);
	
	}	
	}

