package StrategyPuzzle;

public class Knight extends Character{

	public void fight() {
		weaponBehavior.fight();		
	}
	public Knight(){
		weaponBehavior = new ArrowBehavior();
	}
}