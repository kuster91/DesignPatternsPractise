package StrategyPuzzle;

public class Troll extends Character{

	public void fight() {
		weaponBehavior.fight();		
	}
	public Troll(){
		weaponBehavior = new AxeBehavior();
	}
}