package Real.java;

public class Array2 {
	public static void main(String[] args) {
		int[] score= {12,23,34,23,15,78};
		int[] copy1 = score; //�����Ѵ�... 
		//���� : ���δٸ� �ΰ�.. 
		System.out.println(score[2]);
		copy1[2]=100; // �ѳ��� �����Ǹ� ���� �ٲ��???
		System.out.println(copy1[2]);
		System.out.println(score[2]);
		int[] copy2 = score.clone();
		System.out.println(copy2[2]);
		System.out.println(score[2]); // ���� ������ ������ �ٸ���. �迭�̴ٸ��� 
		copy2[2]=50;
		System.out.println(score[2]); // �ȹٲ��..??? ������ �迭�̶� ���� �ȹٲ� Ÿ�԰� �ּҸ� �����Ѵ�. 
		System.out.println(copy2[2]);

		System.out.println(score.hashCode());   // ��ü�� ���� toString ���� �������� 
		System.out.println(copy2.hashCode());
		}
}
