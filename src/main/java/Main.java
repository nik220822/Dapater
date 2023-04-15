public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.mult(3, 5));
        System.out.println(intsCalc.sum(2, 2));
        System.out.println(intsCalc.sum((intsCalc.pow(2, 11)), -25));
    }
}
