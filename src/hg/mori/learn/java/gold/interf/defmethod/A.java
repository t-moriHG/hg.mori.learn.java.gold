package hg.mori.learn.java.gold.interf.defmethod;

public interface A {

	void x();

	static void y() {
		System.out.println("static");
	}

	default void z() {
		System.out.println("default");
	}

}
