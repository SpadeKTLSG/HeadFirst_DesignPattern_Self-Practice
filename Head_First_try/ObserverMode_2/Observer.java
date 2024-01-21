public interface Observer { //搭建观察者的功能
    public void update(float temp, float humidity, float pressure); //观测值改变要传递这3参数给所有的观测者
}
