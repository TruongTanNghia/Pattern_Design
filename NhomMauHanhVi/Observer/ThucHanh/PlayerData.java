package NhomMauHanhVi.Observer.ThucHanh;

public class PlayerData extends Level{
    I_theoDoi theoDoi;
    public void dangKy(I_theoDoi playerData){
        theoDoi = playerData;
    }

    public void huyDangky(I_theoDoi playerData){
//        if(theoDoi == playerData)
        theoDoi = null;
    }
    @Override
    public void updateLevel(int time, int soLuot, int Maxdiem) {

    }
    public static interface I_theoDoi{

    }
}
