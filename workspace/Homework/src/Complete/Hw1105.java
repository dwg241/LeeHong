package Complete;
import java.util.Scanner;

public class Hw1105 {
	public static void main(String[] args) {
	//	(25x5)+(36-4)}-72}/5 
		  System.out.println("문제1");
		  System.out.println((25*5 +36-24-72)/5);
		  
		  System.out.println("");
		  System.out.println("문제2");
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
		System.out.println("문제3");
		    int a= (25+5+36/4-72)*5;
			int b= (25*5+36-4-71)/4;
			int c=  128/4*2;
		  
		  System.out.println(a);
		  System.out.println(b);
		  System.out.println(c);
		  if (a>b && b>c)
		  {
			  System.out.println("진실입니다.");
		  }
		  else
			  System.out.println("거짓입니다.");
		  
		  System.out.println("");
		  System.out.println("문제4:삼항 연산자 ");
		  int num1=50, num2=100;
		  	if(num1>num2)
	       { System.out.println(num1);
	
        	}
		  	else
		  		System.out.println(num2);
		  	if(num1>num2)
		  	{
		  		System.out.println(num1-num2);
		  	}		
		  	else
		  	System.out.println(num2-num1);
		  
		  	System.out.println("");
 		  	 System.out.println("문제5:switch 구문으로 if로");
		  	int n=3;
		  	if(n==1) {
		  	System.out.println("Simple Java");
		  	}
		  	
		  	else if(n==2) {
		  	System.out.println("Funny Java");
		  	}
		  	else if(n==3) {
		  	System.out.println("Fantastic Java");
		  	}
		  	else
		  	System.out.println("The best programming language");
		  	
		  	System.out.println("Do you like coffee?");
		  	
		  	System.out.println("");
		  	 System.out.println("문제5:1부터 99까지 합 ");
		  	 int k=1;
		  	 int sum=0;
		  	 while(k<100)
		  	 {
		  		sum = sum +k;
		  		
		  		if(k==99)
		  		{
		  		System.out.println(sum);	
		  		}
		  		k++;
		  				 
		  	 }
		  	System.out.println("");
		  	System.out.println("문제6"); //2배수 7배수일때 합 1부터 1000까지 
		  	int m=0;
		  	int sum1=0;
		  	while(m<=1000)
		  	 { m++;
		  	 if(m%2==0 && m%7== 0)
		  	 { 
		  		 sum1= sum1 +m;
		  	 }
		  	 	
		  	 if(m==1000)
		  		 System.out.println("1부터 1000까지에서 2의 배수이면서 7의배수의 수들의합: "+ sum1);
		  	 }
		  	System.out.println("");
		  	System.out.println("문제7");
		  	
		  	//자연수 1부터 시작해서 모든 홀수와 3의 배수인 짝수를 더해 나간다.
		  //	그리고 그 합이 언제 (몇을 더했을 때) 1000이 넘어서는지,
		  ///	그리고 1000이 넘어선 값은 얼마가 되는지 계산하여 출력하는
		  //	프로그램을 작성.
		  //	프로그램 내부에 while문을 무한 루프로 구성하여 작성.
		  	int sum2=0;
		  	int hole=0;
		  	int three=0;
		    int order1=0;
		    
		  	while(true) 
		  	{ 
		  		hole++;
		  		three=3*hole;
		  		if( hole%2 != 0 || three%2== 0)
		  		{
		  			sum2= hole+three+sum2;
		  			
		  		}
		  		if(sum2>1000) {
		  		  if(hole%2 !=0){
		  			order1= (hole+1)/2;
		  			 System.out.println("최초의 1000이 넘는값은 "+sum2);
		  			System.out.println("이때 마지막으로 더한 값은 홀수이고 "+order1+"번째 " +hole+"값이다.");  
		  		  break;
		  		  }
		  			
		  		  else
		  		  order1= three/6;
		  		 System.out.println("최초의 1000이 넘는값은 "+sum2);
		  		  System.out.println("이때 마지막으로 더한 값은 3의 배수이고 "+order1+"번째 " +three+"값이다.");
		  			
		  			break;
		  		}
		     	}
		  	
		  	System.out.println("");
		  	System.out.println("문제8");
		  	//두 개의 정수를 전달받아서, 두수의 사칙연산 결과를 출력하는 메서드와 이
		  	//메서드를 호출하는 main메서드를 정의해보자.
		  	//단, 나눗셈은 몫과 나머지를 각각 출력해야 한다.
		  int	ran1 = (int)(Math.random()*100)+1;
		  int   ran2 = (int)(Math.random()*100)+1;
		  
		  add(ran1,ran2);
	      divide(ran1,ran2);
	      
	      //원의 반지름 정보를 전달하면, 원의 넓이를 계산해서 반환하는 메서드와 원
	      //의 둘레를 계산해서 반환하는 메서드를 각각 정의하고, 이를 호출하는 main
	      //메서드를 정의하자. (2*π*r), (π*r∧2)
	      
	  	System.out.println("");
	  	System.out.println("문제9");
	    int radius = (int)(Math.random()*10)+1;
	  	
	       circleRound(radius); //void 타입
	       circleAreaCalculation(radius); 
	       float circleArea=circleAreaCalculation(radius);  //return 타입으로 보기
	       System.out.println("원의 넓이값: "+circleArea);
	       //전달되는 값이 소수(prime number)인지 아닌지를 판단하여, 소수인경우
	     //  true를, 소수가 아닌 경우 false를 반환하는 메서드를 정의하고, 이를 이용해
	       //서 1이상 100 이하의 소수를 전부 출력할 수 있도록 main 메서드를 정의하자
		  	
	       System.out.println("");
		   System.out.println("문제10");
		   int primeNumber= (int)(Math.random()*99)+1;

              discriminate(primeNumber);
              Scanner kb = new Scanner(System.in);
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
