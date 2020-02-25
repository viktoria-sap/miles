public class Main {
    public static void main(String[] args) {
        long bonus;
        long amountInKopeck = 100_000;
        if (amountInKopeck < 2000) {
            bonus = 0;
        } else {
            bonus = amountInKopeck / 2000;
        }
        System.out.println(bonus);
    }
}
