package Complete;

public class Hw1106Q1Triangle {

	double area;
	
	
	double Calculation(int b, int h) {
		area= b*h/2;
		return area;
	}
	
	void CalculationShow() {
		System.out.println("삼각형 넓이는 "+area );
		System.out.println("다음 버튼을 입력하세요!");
		System.out.println("높이와 밑변 변경 [1] 종료 [2]");
		
	}
}
