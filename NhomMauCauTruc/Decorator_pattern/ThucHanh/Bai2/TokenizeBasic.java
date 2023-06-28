package NhomMauCauTruc.Decorator_pattern.ThucHanh.Bai2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TokenizeBasic extends Tokenize{
    String s;

    public TokenizeBasic(String s) {
        this.s = s;
    }

    @Override
    public List<String> tokenize() {
        String[] r = s.split(" ");
        return new ArrayList<>(Arrays.asList(r));
    }
}
