package �������;
/**
 * ����������󷽷�
 * �������޷�ʵ����
 * ��������������ڣ�Ϊ�����ṩͳһ��ģ�档�������ʵ����صĳ��󷽷���
 * @author me
 *
 */
public abstract class MyAbstract {
	
	public static void main(String[] args) {
		Dog d= new Dog();
		d.shout();
		d.run();
	}
	//��һ��û��ʵ�֡��ڶ����������ʵ��
	abstract public void shout();
	
	public void run() {
		System.out.println("go away");
	}
}

class Dog extends MyAbstract{

	public void shout() {
		System.out.println("wangwangwang");
	}
	
}