package Real.java;

public class Array1 {
	public static void main(String[] args) {
		int[] score= {12,23,34,23,15,78,34,34};
		int[] temp = new int [score.length];
		// Ư���� ã��: �˻���� : ����, �ִ�.
		int  key =34;
		//���� Ž��
		int count =0;
		for(int i=0; i<score.length; ++i){
		if(score[i]==key){

		System.out.println(i+":"+score[i]); // ���° ã�°��ִ�.
		temp[count] =score[i];
		//break;
		count++;
		}
		}
        System.out.println(count +"�� �˻�");     
        System.out.println("�˻� ���");
        for(int i = 0; i <count; i++) 
       {
		System.out.println(i+":"+temp[i]);  // -> �˻���� � ���� �˷��ִ°�! 
		}
	}       
}	
		
	//if(count==0){
//		System.out.println("�˻� ��� ����");}
//}

