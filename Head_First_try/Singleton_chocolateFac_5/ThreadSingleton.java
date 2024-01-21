package Singleton_chocolateFac_5;

public class ThreadSingleton {
    private volatile static ThreadSingleton uniqueInstance; //设置可见性.

    //    更加符合逻辑的修改: 双重检查加锁(多线程知识) 使用volatile. 大大减少时间耗费.
//
//            将一个变量声明为volatile，可以保证变量写入时对其他线程的可见
    private ThreadSingleton() {
    }

    public static ThreadSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) { //进入锁
                if (uniqueInstance == null) {
                    uniqueInstance = new ThreadSingleton();
                }
            }
        }//第一次使用才会进入以上代码

        return uniqueInstance;
    }
}
