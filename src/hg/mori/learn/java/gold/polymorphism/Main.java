package hg.mori.learn.java.gold.polymorphism;

/*
 * ポリモーフィズムについて(メインクラス)
 * 子クラスのインスタンスを作成する際に
 * 親クラスの型指定で使える
 *
 * 親クラスの型指定で子クラスをインスタンス化した場合
 * フィールド変数は親クラスの物しか使えない
 * メソッドは親クラスと同名のメソッドはオーバーライドされる。
 */
public class Main {

	public static void main(String[] args) {
		Parent a = new Parent();
		Parent b = new Sub();

		System.out.println(a.name);
		System.out.println(b.name);
		System.out.println(a.getName());
		System.out.println(b.getName());

		// Parentクラスに存在しないフィールドは使用できない。
		//System.out.println(b.id);
	}

}
