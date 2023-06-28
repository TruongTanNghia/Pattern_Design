package NhomMauCauTruc.Decorator_pattern.ThucHanh.Bai2;

public class MainTokenize {
    public static void main(String[] args) {
        Tokenize str = new TokenizeBasic("Lầu; Bòa; Bà. Triệu! và Soup Cua siêu ngon nhưng mà mắc quá!");
        System.out.println("===== Tách từ =====");
        //System.out.println(str.tokenize());
        for(String list : str.tokenize()){
            System.out.println(list);
        }
        System.out.println("===== Sau khi loại bỏ từ dừng =====");
        str = new StopWord(str);
        //System.out.println(str.tokenize());
        for(String list : str.tokenize()){
            System.out.println(list);
        }
        System.out.println("===== Sau khi loại bỏ dấu câu =====");
        str = new Punctuation(str);
        //System.out.println(str.tokenize());
        for(String list : str.tokenize()){
            System.out.println(list);
        }
    }
}
