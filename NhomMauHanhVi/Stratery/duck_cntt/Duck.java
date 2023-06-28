package NhomMauHanhVi.Stratery.duck_cntt;

public abstract class Duck {
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;

    void performQuack(){
        System.out.println(quackBehavior.quack());
    }
    void performFly(){
        System.out.println(flyBehavior.fly());
    }
    void swim(){

    }
    abstract void display();
    public IFlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public IQuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
