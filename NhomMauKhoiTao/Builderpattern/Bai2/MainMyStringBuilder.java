package NhomMauKhoiTao.Builderpattern.Bai2;

public class MainMyStringBuilder {
    public static void main(String[] args) {
        MyStringBuilder myStringBuilder = new MyStringBuilder()
                .addString("Xin chào ")
                .addFloat(100.0f)
                .addBool(true);
        System.out.println(myStringBuilder.toString());
    }

}
