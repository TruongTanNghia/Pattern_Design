package NhomMauHanhVi.Stratery.Bai1;

public class MainBtc1 {
    public static void main(String[] args) {
        Context c = new Context();
        c.setTinhToan(new Cong());
        float cong = c.tinh(75,12);
        System.out.println("75 + 12 = " + cong);
        Context c2 = new Context();
        c2.setTinhToan(new Tru());
        float tru = c2.tinh(54,78);
        System.out.println("54 - 78 = " + tru);
    }
}
