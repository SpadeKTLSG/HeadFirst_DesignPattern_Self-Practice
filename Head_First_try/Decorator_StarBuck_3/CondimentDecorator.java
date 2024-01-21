package Decorator_StarBuck_3;

public abstract class CondimentDecorator extends Beverage { //调料抽象类,装饰类
    protected Beverage beverage;  //装饰方法: 把要包装的对象放在类里面成为私有成员.

    public abstract String getDescription();
}
