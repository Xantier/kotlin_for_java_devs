public class Interop {
    public static void main(String[] args) {
        final Lunch lunch = BeautKt.getYumyum();
        System.out.println("I had "
        + lunch.getTopping()
        + " on "
        + lunch.getBread()
        + " for lunch.");
    }
}
