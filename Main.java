public class Main {
    public static void main (String[] args) {
        for (int number1 = 1; number1 <= 9; number1++) {
            for (int number2 = 1; number2 <= 9; number2++) {
                System.out.print("" + number1 + "x" + number2 + "=" + (number1 * number2) + " ");
            }
            System.out.println("");
        }
    }
}