package NhomMauKhoiTao.singleton;

public class Singleton {
    private static Singleton instance;
    private int count = 0;
    public void increase(){
        count++;
    }
    public int getCount(){
        return count;
    }
    protected Singleton(){
    }
    //Hoặc
    //private Singleton(){}
    public static Singleton CreateInstance(){
        if(instance == null)
            instance = new Singleton();
        return instance;
    }
}
