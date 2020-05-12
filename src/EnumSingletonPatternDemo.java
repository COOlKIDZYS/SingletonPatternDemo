public class EnumSingletonPatternDemo {
    public static void main(String[] args) {
        EnumSingleton instance=EnumSingleton.INSTANCE;
        EnumSingleton instance1 = EnumSingleton.INSTANCE;
        System.out.println(instance==instance1);

    }
}
enum EnumSingleton
{
    INSTANCE;
    public void method()
    {
    }
}
