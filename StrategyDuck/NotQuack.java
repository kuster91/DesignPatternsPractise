package StrategyDuck;

public class NotQuack implements QuackInterface{

	@Override
	public void quack() {
		System.out.println("[CISZA]");
		
	}

}
