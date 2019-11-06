package Real.java;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Parking {
	public static void main(String[] args) {
		
		
		Scanner kb = new Scanner(System.in);// Ű���� ���ڸ� �����ɷ� ����
		//�ʱ�ȭ : ����
		Space[] space = new Space[20]; // ������ ���� / �迭(���)�� ���� / ����� -ó�����ϸ� null
		Space s = new Space(); // �迭 ���� �ּҸ� ����
		
		String[] cars = new String[20]; //���� 20�븸 �޾ƾ���~
		int car_last = 0;// ���� �� ��, ������ ��ҹ�ȣ
		//������� ��������
		int[][] state = new int[20][2]; // �������ٰ�
		int log_no = 0; 
		
		// state[o][]
		// [0] : �������ȣ , [1] : ����������ȣ
		
		//�����
		
		while(true){ 
			// �������, ��Ȳ, ��� - ������
			for(int i=0;i<space.length;++i) {
				if(space[i]==null) {
					if(i<10) {
					System.out.print("["+i+" :"+space[i]+"]\t");
					}
					else {
					System.out.print("["+i+":"+space[i]+"]\t");
				}
				}
				else {
					System.out.print("["+i+":"+space[i].carNumber+"]\t");
				}				
				if((i+1)%5==0) System.out.println("");
			}
			// �޴�, ��� �Է� or ����
			System.out.println("[0]Exit [1]In [2]Out");
			int menu = Integer.parseInt(kb.nextLine()); // ���ڿ��� int�� �ٲ۴�
				//Double.parseDouble(s)
			// ����
			if( menu == 0 )		break; // �����(kb)�� ����			
			// ó����� show or ����
			if( menu == 1 ) {// car in
				//���ڸ� Ȯ�� - ���� 0�ΰ� ã�´�
				int empty_space = -1;
				for(int i=0;i<space.length;++i) {
					if(space[i] == null) { //.able�̶� ���� - i���ڸ� �������
						space[i] = new Space(); // ���� ����
						System.out.println(i+"�� �ڸ�����");
						empty_space = i;
						break;
					}
				}
			if(empty_space != -1 ) {
				System.out.println("car number :");
				String carnumber = kb.nextLine();
				// ���� �ð� : �ڵ����
				space[empty_space].able = false; //�����Ǿ�����
				space[empty_space].carNumber = carnumber;
				space[empty_space].in = LocalDateTime.now();
				
					
			}else{
					System.out.println("����");
				}
			}
			else if( menu == 2 ) {// car out		/ ��ȣ�϶� else�� ���̸� �� �����̶� ���Ѵ�		
				System.out.println("car number :");
				String carnumber = kb.nextLine();
				//�ش� ���� �ð����� ã��
			
				
 				 //�ݺ��� : for each : ��� ������ �ݺ��Ѵ� - ��ȣx
//					for(String number : cars) {//���� : �迭��(����Ʈ)
//					if (number.equals(carnumber)) {
//						break;
//				
							//		int ci = 0;
							//		for(ci=0;ci<cars.length;++ci) {
							//			if (cars[ci].equals(carnumber)) {
							//				break;
							//			} //������ ��ġ�� ����Ų�� - �ν��Ͻ��� �ʿ���!
							//				}
				Space result = null;
				for(int i=0;i<space.length;++i) {
					if(space[i] != null) {
						
						if(space[i].carNumber.equals(carnumber)) {
							result = space[i]; // ���� : ���� ������ ����: space[i]�� ���߿� ������ �־ !! �����Ѱ���  
							space[i] = null;
							break;
						}
					}
		          	}	//���� �˻� ��
				
				if(result != null) {
					result.able = true;
					result.out = LocalDateTime.now();
					//result.out - result.in;  
					//�ð��� �� : �⺻��� + �߰����
					//������ : ���ڸ� Ȯ��	
								//		space[ no ] = null;
				
									//state�迭���� [1]���� ���� ���� ã�´�.
								//int no =-1;
								//			for(int si=0; si<state.length;++si) {
								//			if(state[si][1]==ci) {
								//				no = state[si][0]; //space[]
								//				break;
								//								 }
								//											}
								//if(no != -1) {
								//space[no].able = true;//����·� ��ȯ
								// }
					
				}
				
				else  // for ���ȿ��� ���� �� �˻��ϱ����� �������ü� ���� �׷��� result ���� ���簡 �̶��� �ʿ��Ѱ���!! 
				{
					System.out.println("�ش����������� �����ϴ�.");
				}
				//state[1] [0]  
				
				
								}//menu == 2
		}// ���� ó���ϴ°�
		// ����ó�� : �޸� ����, ���� �ݱ�
		{
			// ���� ���� : ����
		}
		System.out.println("Good bye");
		kb.close();
	} // end of main
}// end of class

