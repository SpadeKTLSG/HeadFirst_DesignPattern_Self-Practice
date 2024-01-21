package Duck_1;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackbe = new Quack();
        flybe = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println(" I am a MallardDuck");
    }

}
