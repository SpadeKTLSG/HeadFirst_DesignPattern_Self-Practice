public abstract class Duck {
    // ����������Ϊ�ӿڶ������������ñ���, �����е����඼ȥ�̳�����, �����Ժ󶼿���ʹ��.
    FlyBehavior flybe;
    QuackBehavior quackbe;

    public Duck() {

    }

    public abstract void display();

    // ���ｫduck����Ϊί�и�����Ϊ��, ������Ҫ�����ĸ�д�ӿ�
    public void performFly() {
        flybe.fly();
    }

    public void performQuack() {
        quackbe.quack();
    }

    public void swim() {
        System.out.println("ALL ducks float.");
    }

    // ���Զ�̬���Ѽ�ӵ���Ϊ
    public void setFlyBehavior(FlyBehavior fb) {
        flybe = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackbe = qb;
    }
}
