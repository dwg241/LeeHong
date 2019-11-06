package Real.java;


// ��� �ڵ��  class {} �ȿ��� �ۼ��ȴ�.
//-����: �������=field: static, non static 2���� �ִ�. -class �ȿ������ �Լ�, �Լ��ȿ� ��������- void main�ȿ�
// field: static, non static 2���� �ִ�.
// static �� ������ ����
// -method: static, non static(������ �� �ִ�.)
// mew �ν��Ͻ��� �������� �ʾƵ� ����� �����ϴ�. 
public class practice {

	private static int number;
	
	public static void main(String[] args) //�̹� ���������� ���θ޼��� �ȿ��� ���Ǵ� �Լ����� ���δ�  static���� �������Ѵ�. 
	{
		
		//�Լ�: ����(); ���� {} ȣ��(��);
		//practice.main(args); // ��ġ, ���
		int value =200; // �ٸ��Լ������� ����Ҽ� ����. 
		number =100;
		printLine(value); //�Լ��� ȣ���� �ڴ�. {������}{Ư����}{��ȯ��} {�Լ���}({�Ű����� ���}) "{}" ���̸� �����ҳ��� "() " �̰Ŵ� �׳ɼ��� void�� ���� 
        // static �޼���� static ������ �޼��常 ��밡���ϴ� 
		//���������� �ٸ��Լ����� �ַ��� ������ �־���Ѵ�. 
	}
	public static void printLine(int value)
	{
		
		System.out.println("--------"+number+"+"+value+"----------");
		return;// void�϶��� return; ���� ���Լ��� ����ȴ�. �ؿ��� ��Լ��� �ϵ� �ٱ����� ������.  
		
	}
}
