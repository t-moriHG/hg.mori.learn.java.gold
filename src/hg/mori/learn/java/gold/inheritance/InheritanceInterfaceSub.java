package hg.mori.learn.java.gold.inheritance;

/*
 * 継承出来る数について(子インタフェース)
 * クラスは多重継承出来ない
 * インタフェースは多重継承出来る
 */
public interface InheritanceInterfaceSub extends InheritanceInterfaceParent_A, InheritanceInterfaceParent_B{
	public String getUser();
}
