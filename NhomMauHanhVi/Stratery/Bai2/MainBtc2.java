package NhomMauHanhVi.Stratery.Bai2;
import java.util.Date;
public class MainBtc2 {
    public static void main(String[] args) {
        QLSV qlsv = new QLSV();
        SinhVien sv1 = new SinhVien("A", new Date(2000, 1, 1), 8);
        SinhVien sv2 = new SinhVien("B", new Date(1999, 2, 2), 7);
        SinhVien sv3 = new SinhVien("C", new Date(2001, 3, 3), 9);

        // Sắp xếp và in danh sách sinh viên theo tên
        qlsv.themSinhVien(sv1);
        qlsv.themSinhVien(sv2);
        qlsv.themSinhVien(sv3);
        qlsv.setSoSanh(new SoSanhTheoTen());
        qlsv.sapXep();
        System.out.println("Danh sách được sắp xếp theo tên là: ");
        qlsv.inDS();

        // Sắp xếp và in danh sách sinh viên theo điểm
        qlsv.setSoSanh(new SoSanhTheoDiem());
        qlsv.sapXep();
        System.out.println("Danh sách được sắp xếp theo điểm là: ");
        qlsv.inDS();
    }
}
