// NOTE: This is not thread safe!
// ����ĵ���ʵ��
public class Singleton {
    private static Singleton uniqueInstance; // ���uniqueInstance�ǿյ�,��˵���仹û����ʵ��
    // �����, ������ǲ���Ҫ���ʵ��,������Զ������� ( �ӳ�ʵ���� )

    private Singleton() {
    }

    public static Singleton getInstance() { //��¶������static�ӿ�,ʹ�ÿ���ֱ�ӵ���������,����һ���������.
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
