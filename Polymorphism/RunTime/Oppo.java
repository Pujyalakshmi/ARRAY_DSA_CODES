package Polymorphism.RunTime;

class Mobile {
    void msg() {
        System.out.println("Mobile class.");
    }
}

public class Oppo extends Mobile {
    @Override
    void msg() {
        System.out.println("Oppo class.");
    }

    public static void main(String[] args) {
        Oppo obj = new Oppo();
        obj.msg();
    }
}
