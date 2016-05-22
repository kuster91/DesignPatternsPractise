package StrategyDuck;

public class DuckSymulator {
	public static void main(String[] args){
		Duck wild = new WildDuck();
		wild.makeFly();
		wild.makeQuack();
		System.out.println("koniec dzikiej");
		Duck model = new ModelDuck();
		model.makeFly();
		model.setFlyingInterface(new FlyWithRocketFuel());
		model.makeFly();
	}

}
