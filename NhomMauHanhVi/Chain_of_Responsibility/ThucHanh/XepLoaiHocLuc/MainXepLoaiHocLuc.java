package NhomMauHanhVi.Chain_of_Responsibility.ThucHanh.XepLoaiHocLuc;

public class MainXepLoaiHocLuc {
    public static void main(String[] args) {
        IXepLoaiHocLuc kem = new XepLoaiHocLuc(3, "kém");
        IXepLoaiHocLuc yeu = new XepLoaiHocLuc(5, "yếu");
        IXepLoaiHocLuc trungBinh = new XepLoaiHocLuc(7, "trung bình");
        IXepLoaiHocLuc kha = new XepLoaiHocLuc(8, "khá");
        kem.hocLucCaoHon(yeu)
                .hocLucCaoHon(trungBinh)
                .hocLucCaoHon(kha);
       System.out.println(kha.xepLoai(1));
    }
}
