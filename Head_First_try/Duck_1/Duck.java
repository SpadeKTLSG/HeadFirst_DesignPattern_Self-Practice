public abstract class Duck {
    // 给这两个行为接口都声明两个引用变量, 让所有的子类都去继承他们, 这样以后都可以使用.
    FlyBehavior flybe;
    QuackBehavior quackbe;

    public Duck() {

    }

    public abstract void display();

    // 这里将duck的行为委托给了行为类, 而不是要反复的复写接口
    public void performFly() {
        flybe.fly();
    }

    public void performQuack() {
        quackbe.quack();
    }

    public void swim() {
        System.out.println("ALL ducks float.");
    }

    // 可以动态设计鸭子的行为
    public void setFlyBehavior(FlyBehavior fb) {
        flybe = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackbe = qb;
    }
}
