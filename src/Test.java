
public class Test {
	public static void main(String[] args) {
		DoWork<Person> doWork = new DoWork<>();
		doWork.doSth(new Person());

		DoEat<Man> doEat = new DoEat<>();
		doEat.doSth(new Man());

	}

	// 普通类
	public static class Person {

		public void doWork(DoWork<?> dw) {

		}

	}

	// 继承上一个普通类
	public static class Man extends Person {

	}

	// 接受泛型的类
	public static class DoWork<T> {
		public void doSth(T obj) {

		}
	}

	// 泛型的继承
	public static class DoEat<T extends Person> {
		public void doSth(T obj) {

		}
	}

}
