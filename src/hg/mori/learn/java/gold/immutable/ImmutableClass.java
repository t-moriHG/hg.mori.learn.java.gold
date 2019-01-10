package hg.mori.learn.java.gold.immutable;

public class ImmutableClass {

	private final int x;

	public ImmutableClass(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public ImmutableClass add(int x) {
		return new ImmutableClass(this.x + x);
	}

}
