package com.class11;

public class FamilyDemo {
	public static void main(String[] args) {

		JamesMember member1 = new JamesMember();
		member1.firstName = "Lebro";

		member1.age = 34;

		JamesMember member2 = new JamesMember();
		member2.firstName = "savse";

		member2.age = 28;

		member1.fullName();
		member2.fullName();

	}
}
