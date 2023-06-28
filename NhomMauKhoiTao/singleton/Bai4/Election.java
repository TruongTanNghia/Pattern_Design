package NhomMauKhoiTao.singleton.Bai4;

import java.util.ArrayList;
import java.util.List;

public class Election {
    private static Election instance;
    private int countDonaldTrump = 0;
    private int countJoeBiden = 0;
    List<String> voteds = new ArrayList<>();
    protected Election(){
    };

    public static Election CreateInstance(){
        if(instance == null)
            instance = new Election();
        return instance;
    }

    protected void vote(Candidate candidate, String id){
        for(String v: voteds){
            if(v.equals(id))
                return;
        }
        if (candidate == Candidate.DonaldTrump) {
            countDonaldTrump++;
        } else if (candidate == Candidate.JoeBiden) {
            countJoeBiden++;
        }
        voteds.add(id);
    }

    public int getCountDonaldTrump() {
        return countDonaldTrump;
    }

    public int getCountJoeBiden() {
        return countJoeBiden;
    }
}
