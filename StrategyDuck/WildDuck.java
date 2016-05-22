package StrategyDuck;

public class WildDuck extends Duck{

	@Override
	public void show() {
		System.out.println("Jestem dzika kaczka - bój siê !");
	}
	
	public WildDuck()
	{
		quackInterface = new Quack();
		flyingInterface = new FlyingBecauceWings();
	}
	

}
