package StrategyPuzzle;

public class Test {
	public static void main(String[] args){
		Character artur = new King();
		artur.fight();
		artur.setWeapon(new ArrowBehavior());
		artur.fight();
	}

}
