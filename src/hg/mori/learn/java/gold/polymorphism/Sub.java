package hg.mori.learn.java.gold.polymorphism;

/*
 * ポリモーフィズムについて(子クラス)
 * 子クラスのインスタンスを作成する際に
 * 親クラスの型指定で使える
 */
public class Sub extends Parent {
	String name = "次郎";
	int id = 1;

	String getName() {
		return name;
	}

	int getId() {
		return id;
	}
}
