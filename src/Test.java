
public class Test {
	public static void main(String[] args) {
		DoWork<Person> doWork = new DoWork<>();
		doWork.doSth(new Person());

		DoEat<Man> doEat = new DoEat<>();
		doEat.doSth(new Man());

	}

	// ��ͨ��
	public static class Person {

		public void doWork(DoWork<?> dw) {

		}

	}

	// �̳���һ����ͨ��
	public static class Man extends Person {

	}

	// ���ܷ��͵���
	public static class DoWork<T> {
		public void doSth(T obj) {

		}
	}

	// ���͵ļ̳�
	public static class DoEat<T extends Person> {
		public void doSth(T obj) {

		}
	}

}
