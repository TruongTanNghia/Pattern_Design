package NhomMauHanhVi.Stratery.duck_cntt;

public class VitBau extends Duck{
    @Override
    void display() {
        System.out.println("Vịt Bầu nè hehehe!");
        swim();
        performFly();
        performQuack();
    }
}

