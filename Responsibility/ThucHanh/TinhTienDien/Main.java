package Responsibility.ThucHanh.TinhTienDien;

public class Main {
    public static void main(String[] args) {
        ITienDien bac1 = new TinhTien((float) 1.678, 0, 50);
        ITienDien bac2 = new TinhTien((float) 1.734, 50,100);
        ITienDien bac3 = new TinhTien((float) 2.014,100,200);
        ITienDien bac4 = new TinhTien((float) 2.536, 200,300);
        ITienDien bac5 = new TinhTien((float) 2.834, 300,400);
        ITienDien bac6 = new TinhTien((float) 2.927,400,Integer.MAX_VALUE);
        bac1.thangbac(bac2)
                .thangbac(bac3)
                .thangbac(bac4)
                .thangbac(bac5)
                .thangbac(bac6);
        System.out.println("Số tiền định đã sử dụng là " + bac1.tinhtien(300) + " đồng");
    }
}
