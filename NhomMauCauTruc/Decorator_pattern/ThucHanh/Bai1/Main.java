package NhomMauCauTruc.Decorator_pattern.ThucHanh.Bai1;

public class Main {
    public static void main(String[] args) {
        BieuThuc b2 = new BieuThucDonGian(2);
        b2 = new Cong(b2, 2);
        b2 = new Tru(b2, 10);
        b2 = new GTTD(b2);
        System.out.println(b2.bieuThuc() + "=" + b2.giaTri());

    }
}
