public class Milk extends CondimentDecorator { //实现包装,需要用一个实例记录包装的对象(对象组)
    public Milk(Beverage beverage) {
        this.beverage = beverage; //记录
    }

    public String getDescription() { //调用被包装的对象组的描述语句,并加上自己的描述
        return beverage.getDescription() + ", Milk";
    }

    public double cost() { //同理, 对象的价格加上自己的价格
        return .10 + beverage.cost();
    }
}
