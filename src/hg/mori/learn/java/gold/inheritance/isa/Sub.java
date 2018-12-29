package hg.mori.learn.java.gold.inheritance.isa;

/*
 * is-aクラスについて(子クラス)
 * SubはParentである
 * ParentはSubではない
 */
public class Sub extends Parent {
	String name = super.name;
}
