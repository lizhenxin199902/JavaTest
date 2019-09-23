package 面向对象;
/**
 * 接口内的所有方法都是抽象的
 * 接口可以多继承
 * 接口内无法定义变量
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