package StrategyDuck;

public class ModelDuck extends Duck{
	public ModelDuck(){
		flyingInterface = new NotFly();
		quackInterface = new Quack();
	}

	@Override
	public void show() {
		System.out.println("Jestem modelem kaczki");
	}

}
