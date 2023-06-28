package NhomMauCauTruc.Decorator_pattern.ThucHanh.Bai2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StopWord extends TokenizeDecorator{
    List<String> stopword = Arrays.asList("và", "hoặc", "thì", "là", "mà");
    public StopWord(Tokenize component) {
        super(component);
    }

    @Override
    public List<String> tokenize() {
        List<String> list = component.tokenize();
        list.removeAll(stopword);
        return list;
    }
}
