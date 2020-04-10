package com.class08;

public class World {

	public static void main(String[] args) {

		Human h1 = new Human("Ajwa");
		System.out.println("the best student is " + h1.name);

		Human.planet = "World";

		Human h2 = new Human("Gulbaher");

		System.out.println(h2.name + " live in " + h2.planet);

	}

}
