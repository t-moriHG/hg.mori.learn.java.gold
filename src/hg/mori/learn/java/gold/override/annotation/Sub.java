package hg.mori.learn.java.gold.override.annotation;

/*
 * @Overrideアノテーションについて(子クラス)
 * オーバーライドしている事をコンパイラに対して明示する。
 * アノテーションをつけて指定が間違っていればコンパイルエラーとなる。
 */
public class Sub extends Parent {
	String name = "次郎";

	@Override
	public String getName() {
		return name;
	}

	// コンパイルエラーになる
//	@Override
//	public String getName(String name) {
//		return name;
//	}

}
