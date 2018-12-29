package hg.mori.learn.java.gold.inheritance;

/*
 * is-aクラスについて(子クラス)
 * IsASubはIsAParentである
 * IsAParentはIsASubではない
 */
public class IsASub extends IsAParent {
	String name = super.name;
}
