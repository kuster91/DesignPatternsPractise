package StrategyPuzzle;

public class King extends Character{
	
	@Override
	public void fight() {
		weaponBehavior.fight();		
	}
	public King(){
		weaponBehavior = new SwordBehavior();
	}
}