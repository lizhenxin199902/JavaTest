package �������;
/**
 * �ӿ��ڵ����з������ǳ����
 * �ӿڿ��Զ�̳�
 * �ӿ����޷��������
 * @author me
 *
 */
public class MyInterface {
	public static void main(String[] args) {
		Angel A = new Angel();
		A.fly();
		A.helpOther();
	}
}

interface Volant{
	int FLY_HEIGHT=100;
	void fly();
}

interface Honest{
	void helpOther();
}

class Angel implements Volant,Honest{

	public void helpOther() {
		System.out.println("Angel.helpOther()");
	}

	public void fly() {
		System.out.println("Angel.fly()");
	}
	
	
}