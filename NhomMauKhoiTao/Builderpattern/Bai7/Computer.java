package NhomMauKhoiTao.Builderpattern.Bai7;

public class Computer {
    String CPU, RAM, storage, screen;
    private Computer(Builder b){
        this.CPU = b.CPU;
        this.RAM = b.RAM;
        this.storage = b.storage;
        this.screen = b.screen;
    }

    @Override
    public String toString() {
        return "Computer:" +
                "\nCPU= " + CPU +
                "\nRAM='" + RAM +
                "\nStorage='" + storage +
                "\nScreen='" + screen;
    }

    public static class Builder{
        String CPU, RAM, storage, screen;
        public Builder buildCPU(String cpu){
            this.CPU = cpu;
            return this;
        }
        public Builder buildRAM(String ram){
            this.RAM = ram;
            return this;
        }
        public Builder buildStorage(String storage){
            this.storage = storage;
            return this;
        }
        public Builder buildScreen(String screen){
            this.screen = screen;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }
}
