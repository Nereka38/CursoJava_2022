package com.capgemini.training.java;

public class PlanetMain {

	public static void main(String[] args) {
		for(Planet p : Planet.values()) {
            System.out.println("The Mass of " + p.toString() + " is " + p.getMass() + " and the radio is " + p.getRadius());
        }

	}

}
