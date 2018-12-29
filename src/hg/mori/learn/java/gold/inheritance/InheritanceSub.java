package hg.mori.learn.java.gold.inheritance;

/*
 * 継承出来る数について(子クラス)
 * クラスは多重継承出来ない
 * インタフェースは多重継承出来る
 */
public class InheritanceSub extends InheritanceParent {
	String name = super.name;
}
