package NhomMauKhoiTao.singleton;

public class MainSingleton {
    public static void main(String[] args) {
        Singleton s1 = Singleton.CreateInstance();
        Singleton s2 = Singleton.CreateInstance();
        s1.increase();
        System.out.println("s1: " + s1.getCount());
        s2.increase();
        s1.increase();
        System.out.println("s1: " + s1.getCount());
        System.out.println("s2: " + s2.getCount());

    }
}
