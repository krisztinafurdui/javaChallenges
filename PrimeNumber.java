import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Irj be egy számot és kiírom hogy prímszám-e.");
        int number = myObj.nextInt();
        if (isPrime(number))
            System.out.println("Prímszám");
        else
            System.out.println("Nem prímszám.");

    }
    public static boolean isPrime(int number) {
        for (int i=2; i <= number / 2; i++) {
            if (number % i == 0)
                return false;
        }
        return true;

    }
}
