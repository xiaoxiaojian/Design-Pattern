package Builder;
/**
 * Builder模式，对象的创建和表示分离
 * 当构造对象时需要多个参数时，适用
 */
class Computer {
    private String name;
    private String cpu;
    private String price;
    private String color;
    private int size;
    private String ram;
    static class Builder{
        private String name;
        private String cpu;
        private String price;
        private String color;
        private int size;
        private String ram; 
        public Builder(String name){
            this.name = name;
        }
        public Builder cpu(String cpu){
            this.cpu = cpu;
            return this;
        }
        public Builder price(String price){
            this.price = price;
            return this;
        }
        public Builder color(String color){
            this.color = color;
            return this;
        }
        public Builder size(int size){
            this.size = size;
            return this;
        }
        public Builder ram(String ram){
            this.ram = ram;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }
    private Computer(Builder buidler){
        this.name = buidler.name;
        this.cpu = buidler.cpu;
        this.price = buidler.price;
        this.color = buidler.color;
        this.size = buidler.size;
        this.ram = buidler.ram;
    }

    @Override
    public String toString() {
        return "Computer [color=" + color + ", cpu=" + cpu + ", name=" + name + ", price=" + price + ", ram=" + ram
                + ", size=" + size + "]";
    }
    
}