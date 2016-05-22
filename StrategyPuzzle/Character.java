package StrategyPuzzle;

public abstract class Character {
	WeaponBehavior weaponBehavior;
	
	public abstract void fight();
	public Character(){}
	
	public void setWeapon(WeaponBehavior wb){
		weaponBehavior = wb;
	}
}
