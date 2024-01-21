// NOTE: This is not thread safe!
// 经典的单件实现
public class Singleton {
    private static Singleton uniqueInstance; // 如果uniqueInstance是空的,则说明其还没创建实例
    // 这代表, 如果我们不需要这个实例,则它永远不会产生 ( 延迟实例化 )

    private Singleton() {
    }

    public static Singleton getInstance() { //暴露公开的static接口,使得可以直接点出这个方法,返回一个特殊变量.
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    // other useful methods here
    public String getDescription() {
        return "I'm a classic Singleton!";
    }
}
