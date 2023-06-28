package NhomMauHanhVi.Observer.ThucHanh.A4;

public class MainTopic {
    public static void main(String[] args) {
        Topic t = new Topic();
        TinTuc tinTuc1 = new TinTuc(1,"Bạn đã trúng 1 chiếc SamSum S22");
        TinTuc tinTuc2 = new TinTuc(2,"Bạn đã trúng 1 chiếc xe Mec");
        TinTuc tinTuc3 = new TinTuc(3,"Bạn đã trúng thưởng 10 tỷ VNĐ");
        TinTuc tinTuc4 = new TinTuc(4,"Sữa chua TH True Milk sale shock 100%");
        ThanhVienA thanhVienA = new ThanhVienA(t);
        ThanhVienB thanhVienB = new ThanhVienB(t);
        System.out.println("Lần thêm tin thứ nhất:");
        t.taoMoi(tinTuc1);
        System.out.println("Lần thêm tin thứ hai:");
        t.taoMoi(tinTuc2);
        System.out.println("Lần thêm tin thứ ba:");
        t.taoMoi(tinTuc3);
        System.out.println("Cập nhật tin");
        thanhVienA.huyDangKy();
        t.capNhat(tinTuc1);

    }
}
