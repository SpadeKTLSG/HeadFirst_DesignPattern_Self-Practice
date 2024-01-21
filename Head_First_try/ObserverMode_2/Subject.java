public interface Subject {//主题接口: 能够完成注册观察者以及移除等功能,并且通知观察者.

    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}


