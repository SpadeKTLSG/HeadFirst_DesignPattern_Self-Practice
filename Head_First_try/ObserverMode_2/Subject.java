public interface Subject {//����ӿ�: �ܹ����ע��۲����Լ��Ƴ��ȹ���,����֪ͨ�۲���.

    public void registerObserver(Observer o);

    void registerObserver(CurrentConditionsDisplay o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}


