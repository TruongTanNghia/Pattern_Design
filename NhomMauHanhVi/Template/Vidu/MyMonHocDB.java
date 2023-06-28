package NhomMauHanhVi.Template.Vidu;

public class MyMonHocDB extends ObjectDB<MyMonHoc>{

    @Override
    public int getID(MyMonHoc myMonHoc) {
        return myMonHoc.getMaMH();
    }
}
