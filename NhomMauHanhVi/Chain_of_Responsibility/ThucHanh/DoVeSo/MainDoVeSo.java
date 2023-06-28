package NhomMauHanhVi.Chain_of_Responsibility.ThucHanh.DoVeSo;

public class MainDoVeSo {
    public static void main(String[] args) {
       IDoVeSo giaiDacBiet = new GiaiThuong("Giải Đặc Biệt", new String[]{"210102"});
       IDoVeSo giaiNhat = new GiaiThuong("Giải Nhất",new String[]{"210102"} );
       IDoVeSo giaiNhi = new GiaiThuong("Giải Nhì",new String[]{"210102"} );
       IDoVeSo giaiBa = new GiaiThuong("Giải Ba",new String[]{"210102"} );
       IDoVeSo giaiTu = new GiaiThuong("Giải Tư",new String[]{"210102"} );
       IDoVeSo giaiNam = new GiaiThuong("Giải Năm",new String[]{"210102"} );
       IDoVeSo giaiSau = new GiaiThuong("Giải Sáu",new String[]{"210102"} );
       IDoVeSo giaiBay = new GiaiThuong("Giải Bảy",new String[]{"210102"} );
       IDoVeSo giaiTam = new GiaiThuong("Giải Tám",new String[]{"210102"} );
        giaiDacBiet
                .giaiThuongKeTiep(giaiNhat)
                .giaiThuongKeTiep(giaiNhi)
                .giaiThuongKeTiep(giaiBa)
                .giaiThuongKeTiep(giaiTu)
                .giaiThuongKeTiep(giaiNam)
                .giaiThuongKeTiep(giaiSau)
                .giaiThuongKeTiep(giaiBay)
                .giaiThuongKeTiep(giaiTam);
        System.out.println(giaiDacBiet.doVe("210102"));
    }
}
