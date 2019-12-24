package Complete;

import java.util.Scanner;

public class Hw1106Q1Main {
	

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Hw1106Q1Triangle triangle = new Hw1106Q1Triangle();
		System.out.println("밑변과 넓이를 입력하고 싶으면 1을 누르세요!");
		
		while(true) {
			int menu= kb.nextInt();
			if(menu==1) {
				
				System.out.println("밑변을 입력하세요!");
				int bottom= kb.nextInt();
				System.out.println("높이를 입력하세요!");
				int high= kb.nextInt();
				triangle.Calculation(bottom, high);
				triangle.CalculationShow();
				triangle.M(kb);
			}
			else if(menu==2)
			{
				break;
			}
			else
				System.out.println("다시 입력하세요!");
		}
	
	}
}
