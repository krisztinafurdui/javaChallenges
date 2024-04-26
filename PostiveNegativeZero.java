import java.util.Scanner;

public class PostiveNegativeZero {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Irj be egy számot és kiírom hogy pozitív vagy negatív szám.");
        int number = myObj.nextInt();
        if (number > 0)
            System.out.println(number + "-> pozitív szám");
        else if (number < 0 )
            System.out.println(number + "-> negatív szám");
        else
            System.out.println(number + " ez sem nem pozitív, sem nem negatív, hanem NULLA.");
    }
}
