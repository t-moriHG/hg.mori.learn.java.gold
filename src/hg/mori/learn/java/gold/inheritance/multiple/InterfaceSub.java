package hg.mori.learn.java.gold.inheritance.multiple;

/*
 * 継承出来る数について(子インタフェース)
 * クラスは多重継承出来ない
 * インタフェースは多重継承出来る
 */
public interface InterfaceSub extends InterfaceParent_A, InterfaceParent_B{
	public String getUser();
}
