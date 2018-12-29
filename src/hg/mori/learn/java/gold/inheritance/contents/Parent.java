package hg.mori.learn.java.gold.inheritance.contents;

/*
 * 継承出来る内容について(親クラス)
 * 状態(フィールド) → 〇
 * 振る舞い(メソッド) → 〇
 * 内部クラス → ×
 * インタフェース → ×
 * 列挙型 → ×
 *
 * privateは継承されない、概念的な話では解釈が色々あるみたいだけど
 * 少なくともそのまま使う事は出来ない
 */
public class Parent {

	String name = "太郎";

	String getName() {
		return "次郎";
	}

}
