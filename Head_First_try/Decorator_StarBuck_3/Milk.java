public class Milk extends CondimentDecorator { //ʵ�ְ�װ,��Ҫ��һ��ʵ����¼��װ�Ķ���(������)
    public Milk(Beverage beverage) {
        this.beverage = beverage; //��¼
    }

    public String getDescription() { //���ñ���װ�Ķ�������������,�������Լ�������
        return beverage.getDescription() + ", Milk";
    }

    public double cost() { //ͬ��, ����ļ۸�����Լ��ļ۸�
        return .10 + beverage.cost();
    }
}
