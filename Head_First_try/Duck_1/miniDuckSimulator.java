package Duck_1;

public class miniDuckSimulator { // 测试小鸭子 -> 使用封装好的方法族, 而不是自己构建实例

    // !针对接口编程而不是实现,封装该封装的部分,尽量少使用继承等基础要求

    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();
        System.out.println();
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly(); // 突然就有了火箭动力, 如果把实现绑定在对象里面实现,就做不到了.
    }
}
