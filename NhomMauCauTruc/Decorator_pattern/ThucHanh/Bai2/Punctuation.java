package NhomMauCauTruc.Decorator_pattern.ThucHanh.Bai2;

import java.util.Arrays;
import java.util.List;

public class Punctuation extends TokenizeDecorator{
    List<String> punctuation = Arrays.asList(",",".",";","?","!");

    public Punctuation(Tokenize component) {
        super(component);
    }

    @Override
    public List<String> tokenize() {
        List<String> list = component.tokenize();
        list.replaceAll(s -> s.replaceAll(punctuation.toString(), " "));
        return list;

    }
}
