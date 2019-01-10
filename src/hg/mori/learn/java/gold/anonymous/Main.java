package hg.mori.learn.java.gold.anonymous;

public class Main {

	public static void main(String[] args) {
		A a =  new A() {
			public void doIt() {
				System.out.println("OK");
			}
		};
		a.doIt();
	}

}
