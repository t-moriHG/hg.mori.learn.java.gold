package hg.mori.learn.java.gold.immutable;

public class Main {

	public static void main(String[] args) {

		ImmutableClass im1 = new ImmutableClass(3);
		System.out.println(im1.getX());
		System.out.println(im1.add(2).getX());
		System.out.println(im1.getX());

	}

}
