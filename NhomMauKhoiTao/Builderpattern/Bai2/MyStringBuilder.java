package NhomMauKhoiTao.Builderpattern.Bai2;

public class MyStringBuilder {
    private String st = "";
    public MyStringBuilder addString(String s){
        st += s;
        return this;
    }
    public MyStringBuilder addFloat(float f){
        st += f;
        return this;
    }
    public MyStringBuilder addBool(boolean b){
        st += b;
        return this;
    }



    @Override
    public String toString() {
        return st;
    }
//    private String str;
//
//    private MyStringBuilder(Buider b) {
//        this.str = b.str;
//    }
//
//    @Override
//    public String toString() {
//        return str;
//    }
//
//    public static class Buider {
//        String str = "";
//        public Buider addString(String s) {
//            this.str += s;
//            return this;
//        }
//
//        public Buider addFloat(float f) {
//            this.str += String.valueOf(f);
//            return this;
//        }
//
//        public Buider addBool(boolean b) {
//            this.str += String.valueOf(b);
//            return this;
//        }
//        public MyStringBuilder build() {
//            return new MyStringBuilder(this);
//        }
//    }
}

