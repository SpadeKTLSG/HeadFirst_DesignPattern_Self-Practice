package Duck_1;

public class miniDuckSimulator { // ����СѼ�� -> ʹ�÷�װ�õķ�����, �������Լ�����ʵ��

    // !��Խӿڱ�̶�����ʵ��,��װ�÷�װ�Ĳ���,������ʹ�ü̳еȻ���Ҫ��

    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();
        System.out.println();
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly(); // ͻȻ�����˻������, �����ʵ�ְ��ڶ�������ʵ��,����������.
    }
}
