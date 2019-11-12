package me;

public class HelpFile {
	static float  result;
	
	public static void main(String[] args) {
	 
		   int radius = (int)(Math.random()*10)+1;
		  	
	   
	       circleAreaCalculation(radius); 
	       //return 타입으로 보기
	    
	       circleAreaCalculationShow();
		}
	private static void circleAreaCalculationShow() {
		// TODO Auto-generated method stub
		 System.out.println("원의 넓이값: "+result);
	}
	private static float circleAreaCalculation(int r) {
		// TODO Auto-generated method stub
		float pi = 3.14f;
		  result =r*r*pi;
     
		return result;
		
			
		}
}
