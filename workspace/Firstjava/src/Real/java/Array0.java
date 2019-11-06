package Real.java;

public class Array0 {

	  //�����ϱ� : ��ĭ����� : �� ���¸� �ǹ��ϴ� ��
	    //1 ���������� �߰��� ���� �ִ´� - ������ �ڹٲ�
	    //2 ��ĭ�� ����� - �Ϲ���
	    //�ǹ̾��� ���� ã�ƶ�
	public static void main(String[] args) {
	  int[] score = new int[10];  //score�� �̸�(����)/ ��Ұ� �߿��� ���� ������ �� ���x// �ν��Ͻ� = �����Ѵ�
	  for(int i=0;i<score.length;i++) {//score.length�� �������ص� �ǰԲ��ϴ°�
	   //��ü ��ҵ��� �ʱⰪ�� �����ϰڴ�
	   score[i] = i*2;   
	  }
	  for(int i=0;i<score.length;i++) {
	   System.out.print(score[i]+" ");
	  }
	  //�⺻�� ����
	  
	  {//[4]�� ��Ҹ� �����ϼ��� : ���ܳ���
	   int del = 4;
	   int i=0;
	//  for(i=del;i<score.length-1;++i) {
	//   score[i] = score[i+1]; 
	//   }
	//   score[i]=0;          /////////�ؿ��� ���� ��������!! 
	   
	   for(i=del+1;i<score.length;++i) {
	    score[i-1] = score[i]; 
	   }     
	  score[i-1]=0;
	  
	  System.out.println();
	  for(i=0;i<score.length;i++) {
	   System.out.print(score[i]+" ");
	  }
}
}
}