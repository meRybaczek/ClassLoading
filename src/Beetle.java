public class Beetle extends Insect {
    private int k = printInit("Beetle.k zainicjowana");

    Beetle() {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }

    private static int x2 = printInit("static Beetle.x2 zainicjowana");

    public static void main(String[] args) {
        System.out.println("Konstruktor klasy Beetle:");
        Beetle b = new Beetle();
    }
}
