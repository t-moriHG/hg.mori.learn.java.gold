package hg.mori.learn.java.gold.encapsulation;
/*
 * カプセル化について
 * フィールド変数はprivateに
 * メソッドでprivateの変数をコントロールするイメージ
 */
public class Bean {

	// フィールドの値はprivateに
	private String name;
	private int id;

	// メソッドはpublicにしてフィールド変数を操作する
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
