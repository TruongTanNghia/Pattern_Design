package Composite_pattern;

public class File extends AbstracFile{

    public File(String path, String name, String ngay) {
        super(path, name, ngay);
    }


    @Override
    public void add(AbstracFile file) {
    }

    @Override
    public void remove(AbstracFile file) {
    }

    @Override
    public String getStringTreeFolder() {
        return preStr + name;
    }
}
