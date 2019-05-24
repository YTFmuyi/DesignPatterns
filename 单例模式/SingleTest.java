package 单例模式;

public class SingleTest {
    public static void main(String[] args){
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        s1.sayHello();
        s2.sayHello();
        s1.sayHello();
        s2.sayHello();
    }
}
