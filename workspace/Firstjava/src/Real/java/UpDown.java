package Real.java;

import java.util.Scanner;

/***
 * 
 *-up > ���� , Down ����
- A: �������ϱ�
-B: ���� �θ��� 
-A: ����ϱ�
-B: ����� ��� ���� ���� ����
} BREAK: �����̸�....

1. ����� ���, ��ǻ�� ���߱�
2. ��ǻ�ͳ��� ���а����� 
// private ���������ʰ� ���������� ���ڴ�.
 */

public class UpDown {
	private static int min; // ���� ���ߴ� ����(�˰���(�߰���)) 
	private static int max;
	public static void main(String[] args) 
	{
		//������(����)
		//�ʱ�ȭ
		Scanner kb = new Scanner(System.in);
		String resp; // ����� ��� Ű����
	     int callValue;
		min =1 ;
		max= 100;
	     //��������
	     System.out.println("������ ���ϼ���<enter>:("+min+"~"+max+")");
	     resp = kb.nextLine();// ȭ�鿡�� �� ����ģ�κб���
		do{
			//���� �θ���
			callValue = getValue();
			System.out.println("is" +callValue+"?");
			//����� �޴´�
			resp =kb.nextLine();
			//��信 ���� �������� ����Ѵ�.
			setResponse(resp,callValue);
		}while(!resp.equals("correct"));
		kb.close();
		//�� : �����̸�
	}

	private static void setResponse(String resp, int call) {
		// TODO Auto-generated method stub
		// ����� ��信 ���� ó�� ���� ������ ����, 
		
		if("up".equals(resp)) {
			min = call;  //�ٷ� ������ �θ��� 
		}
		else if("down".equals(resp)) {
			max = call;
		}
		else if("correct".equals(resp)) {
			System.out.println("wow");
		}
		else {
			System.out.println("error");
		}
		
	}

	private static int getValue() {
		// TODO Auto-generated method stub
		//������� �θ���
		return (min+max)/2; //�߰���( min~,max)
	}
}
