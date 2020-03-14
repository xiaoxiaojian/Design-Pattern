package Builder;

class Test {
    public static void main(String[] args) {
        Computer c =  new Computer.Builder("huawei").cpu("xxcpu").price("xxprice").ram("xxram").build();
        System.out.println(c.toString());
    }
}