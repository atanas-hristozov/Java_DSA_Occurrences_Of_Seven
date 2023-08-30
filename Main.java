import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(occurrencesOfSeven(n));
    }

    private static int occurrencesOfSeven(int number) {
        if (number  == 0) {
        return 0;
        } else if (number%10 == 7){
            return 1 + occurrencesOfSeven(number/10);
        } else {
            return occurrencesOfSeven(number/10);
        }
    }
}