package Duck_1;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flybe = new FlyNoWay();
        quackbe = new Quack();
    }

    public void display() {
        System.out.println("A model");
    }
}
