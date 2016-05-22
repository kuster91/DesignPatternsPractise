package StrategyDuck;

public abstract class Duck {
	FlyingInterface flyingInterface;
	QuackInterface quackInterface;
	public Duck(){
	}
	
	public abstract void show();
	
	public void makeFly(){
		flyingInterface.fly();
	}
	
	public void makeQuack()
	{
		quackInterface.quack();
	}
	
	public void swim()
	{
		System.out.println("Wszystkie kaczki plywaja");
	}
	
	public void setFlyingInterface(FlyingInterface fi){
		flyingInterface=fi;
	}
	public void setQuackInterface(QuackInterface qi){
		quackInterface = qi;
	}
}
