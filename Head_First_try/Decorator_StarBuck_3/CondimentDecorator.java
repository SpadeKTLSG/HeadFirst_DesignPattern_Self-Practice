package Decorator_StarBuck_3;

public abstract class CondimentDecorator extends Beverage { //���ϳ�����,װ����
    protected Beverage beverage;  //װ�η���: ��Ҫ��װ�Ķ�������������Ϊ˽�г�Ա.

    public abstract String getDescription();
}
