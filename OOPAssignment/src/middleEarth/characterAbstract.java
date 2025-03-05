package middleEarth;

import java.util.Scanner;

public class characterAbstract {
	abstract class middleEarthCharacter{
		protected String name;
		protected double health;
		protected double power;
	}
	
	public middleEarthCharacter(String name, double health, double power) {
		this.name = name;
		this.health = health;
		this.power = power;
	}
}
