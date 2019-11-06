package Complete;

public class Hw1106Q1Triangle {

	double area;
	
	
	double Calculation(int b, int h) {
		area= b*h/2;
		return area;
	}
	
	void CalculationShow() {
		System.out.println("삼각형 넓이는 "+area );
		System.out.println("높이와 밑변을 변경하고 싶으면 1을 누리세요!");
	}
}
