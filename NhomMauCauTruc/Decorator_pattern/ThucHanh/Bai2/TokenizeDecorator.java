package NhomMauCauTruc.Decorator_pattern.ThucHanh.Bai2;

import java.util.List;

public abstract class TokenizeDecorator extends Tokenize{
    Tokenize component;

    public TokenizeDecorator(Tokenize component) {
        this.component = component;
    }

    @Override
    public List<String> tokenize() {
        return component.tokenize();
    }
}
