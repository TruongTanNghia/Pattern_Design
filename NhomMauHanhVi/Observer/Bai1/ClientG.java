package NhomMauHanhVi.Observer.Bai1;

public abstract class ClientG<T> implements StreamG.StreamListener<T>{
    StreamG stream;

    public ClientG(StreamG stream) {
        this.stream = stream;
        this.stream.listen(this);
    }

}
