package NhomMauKhoiTao.singleton.Bai4;

public class User {
    public User(String id) {
        this.id = id;
    }

    String id;
    public void vote(Candidate c){
        Election e = Election.CreateInstance();
        e.vote(c, id);
    }
}
