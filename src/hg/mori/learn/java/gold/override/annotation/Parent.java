package hg.mori.learn.java.gold.override.annotation;

/*
 * @Overrideアノテーションについて(親クラス)
 * オーバーライドしている事をコンパイラに対して明示する。
 * アノテーションをつけて指定が間違っていればコンパイルエラーとなる。
 */
public class Parent {
	String name = "太郎";

	public String getName() {
		return name;
	}

}
