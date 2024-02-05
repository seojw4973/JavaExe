package ch09.interface12;

public class StarMain {
	public static void walk(StarUnit[] units) {
		for (StarUnit unit : units) {
			unit.walk();
		}
		System.out.println();
	}

	public static void attack(StarUnit[] units) {
		for (StarUnit unit : units) {
			unit.attack();
		}
		System.out.println();
	}

	public static void die(StarUnit[] units) {
		for (StarUnit unit : units) {
			unit.die();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		StarUnit[] units = new StarUnit[] { new Marine(), new Scv(), new Hydra(), new Zealot() };

		walk(units);
		attack(units);
		die(units);
	}
}
