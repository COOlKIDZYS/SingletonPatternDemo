public class InnerSingletonDemo {
    public static void main(String[] args) {
        InnerSingleton instance=InnerSingleton.getInstance();
        InnerSingleton instance1 = InnerSingleton.getInstance();
        System.out.println(instance==instance1);
    }
}
class InnerSingleton
{
    //采用匿名内部类的形式进行单例的创建
    private static class SingleHandle{
        private static InnerSingleton INSTANCE=new InnerSingleton();
    }
    private InnerSingleton(){}
    public static final InnerSingleton getInstance()
    {
        return SingleHandle.INSTANCE;
    }


}
