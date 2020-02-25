public class Main {
    public static void main(String[] args) {
        long bonus;
        long amount = 1000;
        if (amount < 20) {
            bonus = 0;
        } else {
            bonus = amount / 20;
        }
        System.out.println(bonus);
    }
}
