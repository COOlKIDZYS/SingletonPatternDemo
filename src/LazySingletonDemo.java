public class LazySingletonDemo {
    public static void main(String[] args) {
        //测试多线程运行情况
        new Thread(()->{
            LazySingleton instance=LazySingleton.getInstance();
            System.out.println(instance);
        },"Thread01").start();
        new Thread(()->{
            LazySingleton instance=LazySingleton.getInstance();
            System.out.println(instance);
        },"Thread02").start();

    }
}
class LazySingleton {
    //添加volatile防止指令重排
    private volatile static LazySingleton instance;
    private LazySingleton() { }
    //双锁机制保证线程安全
    public static LazySingleton getInstance()
    {
        if (instance==null)
        {
            synchronized (LazySingleton.class)
            {
                if (instance==null)
                {
                    instance=new LazySingleton();
                }
            }
        }
        return  instance;
    }
}
