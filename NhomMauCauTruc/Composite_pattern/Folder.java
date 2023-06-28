package Composite_pattern;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstracFile{

    List<AbstracFile> list = new ArrayList<>();

    public Folder(String path, String name, String ngay) {
        super(path, name, ngay);
    }

    public List<AbstracFile> getList() {
        return list;
    }

    @Override
    public String getStringTreeFolder() {

        StringBuilder builder = new StringBuilder();
        builder.append(preStr).append(name);
        for(AbstracFile f : list){
            f.preStr=this.preStr+ "..";
            builder.append("\n").append(f.getStringTreeFolder());
            f.preStr=" ";
        }
        return  builder.toString();
    }

    @Override
    public void add(AbstracFile file) {
        this.list.add(file);
        file.path= this.path + "\\" + file.path;
    }

    @Override
    public void remove(AbstracFile file) {
        this.list.remove(file);
    }
}
