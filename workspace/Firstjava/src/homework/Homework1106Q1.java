package homework;

import java.util.Scanner;

public class Homework1106Q1 {
	

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Homework1106Q1Triangle triangle = new Homework1106Q1Triangle();
		System.out.println("밑변과 넓이를 입력하고 싶으면 1을 누르세요!");
		
		while(true) {
			int menu= kb.nextInt();;
			if(menu==1) {
				
				System.out.println("밑변을 입력하세요!");
				int bottom= kb.nextInt();;
				System.out.println("높이를 입력하세요!");
				int high= kb.nextInt();;
				triangle.Calculation(bottom, high);
				triangle.CalculationShow();
			}
			else
				System.out.println("다시입력하세요!");
		}
	
	}
}
