package Singleton_chocolateFac_5;

public class ThreadSingleton {
    private volatile static ThreadSingleton uniqueInstance; //���ÿɼ���.

    //    ���ӷ����߼����޸�: ˫�ؼ�����(���߳�֪ʶ) ʹ��volatile. ������ʱ��ķ�.
//
//            ��һ����������Ϊvolatile�����Ա�֤����д��ʱ�������̵߳Ŀɼ�
    private ThreadSingleton() {
    }

    public static ThreadSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) { //������
                if (uniqueInstance == null) {
                    uniqueInstance = new ThreadSingleton();
                }
            }
        }//��һ��ʹ�òŻ�������ϴ���

        return uniqueInstance;
    }
}
