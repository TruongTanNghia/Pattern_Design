package NhomMauKhoiTao.singleton.Bai4;

public class MainBt4 {
    public static void main(String[] args) {
        Election election = new Election();
        User ha = new User("ha");
        User hamin = new User("hamin");
        User phuongha = new User("phuongha");
        User hacute = new User("hacute");
        hamin.vote(Candidate.DonaldTrump);
        phuongha.vote(Candidate.JoeBiden);
        hacute.vote(Candidate.DonaldTrump);
        ha.vote(Candidate.DonaldTrump);
        ha.vote(Candidate.DonaldTrump);
        System.out.println("Donald Trump: " + Election.CreateInstance().getCountDonaldTrump());
        System.out.println("Joe Biden: " + Election.CreateInstance().getCountJoeBiden());
    }

}
