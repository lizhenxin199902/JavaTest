package 面向对象;
/**
 * 抽象类与抽象方法
 * 抽象类无法实例化
 * 抽象类的意义在于：为子类提供统一的模版。子类必须实现相关的抽象方法；
 * @author me
 *
 */
public abstract class MyAbstract {
	
	public static void main(String[] args) {
		Dog d= new Dog();
		d.shout();
		d.run();
	}
	//第一：没有实现。第二：子类必须实现
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