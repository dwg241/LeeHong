package Real.java;

public class Tbaseball {
	public static void main(String[] args) {
		Player[] player =new Player[2];
		int caller = 0;
		int STRIKE = 0;
		int BALL= 1;
		// while �ȿ� int �ȿ������� ������ �� ��ȸ��
		player[0] = new TeamA();
		player[1] =	new Player();
		
		player[0].setCode(0); //null �λ��´� ���� ����������
		player[1].setCode(1);
		while(true) {
			System.out.println(
					player[caller].getName()+" vs "
					+player[1-caller].getName());
			int callValue = player[caller].getCallvalue(); // ~�Ѵ�. �޼���� ����  ".":~~ �ൿ�Ѵ�. �޼��带 ����� 
			int[] rv= player[1-caller].getResponse(callValue); //��Ÿ����ũ ���� ���ϴ� ��
			player[caller].setResponse(rv); //���Ӹ����� ���� 
			
			if(rv[STRIKE] ==3) //�Ǵ��Ѵ�. 
				{
				System.out.println(player[caller].getName()+"Win");
				break;
			}
		// �극��ũ�� �Ȱɸ���  �����̾ƴϸ�
			caller = 1-caller;
			
		}
	}
}
