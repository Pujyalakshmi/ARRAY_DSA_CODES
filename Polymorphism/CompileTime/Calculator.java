package Polymorphism.CompileTime;

public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.sum(5,9));
        System.out.println(c.sum(85.8,41.2));
    }
}
