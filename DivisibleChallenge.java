import java.util.Scanner;

public class DivisibleChallenge {
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Irj be egy egész számot, és megmondom osztható-e 2-vel.");
    int number = myObj.nextInt();
    if (number % 2 == 0)
        System.out.println(number + " osztható 2-vel");
    else
        System.out.println(number + " nem osztható 2-vel");
    }
}
