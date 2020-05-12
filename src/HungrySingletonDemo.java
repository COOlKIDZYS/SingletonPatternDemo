public class HungrySingletonDemo {
    public static void main(String[] args) {
        HungrySingleton instance1=HungrySingleton.getInstance();
        HungrySingleton instance2=HungrySingleton.getInstance();
        System.out.println(instance1==instance2);
    }
}
class HungrySingleton{
    private static HungrySingleton instance=new HungrySingleton();
    //声明无参的私有构造函数防止外部访问默认的构造函数
    private HungrySingleton() { }
    public static  HungrySingleton getInstance()
    {
        return instance;
    }
}