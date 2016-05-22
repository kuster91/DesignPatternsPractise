package StrategyPuzzle;

public class Queen extends Character{

	public void fight() {
		weaponBehavior.fight();		
	}
	public Queen(){
		weaponBehavior = new KnifeBehavior();
	}
}