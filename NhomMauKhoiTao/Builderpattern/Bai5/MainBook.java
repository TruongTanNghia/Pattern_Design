package NhomMauKhoiTao.Builderpattern.Bai5;


public class MainBook {
    public static void main(String[] args) {
        Book book = new Book.Builder()
                .setTitle("Tôi thấy hoa vàng trên cỏ xanh")
                .setNumberOfPages(224)
                .setAuthor("Nguyễn Nhật Ánh")
                .addChapter("Chương 1")
                .addChapter("Chương 2")
                .addChapter("Chương 3")
                .build();
        System.out.printf(book.toString());
    }
}
