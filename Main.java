import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Milyen hosszú legyen a vonal?");
        int length = myObj.nextInt();
        System.out.print("+");
        for (int i=0; i<length; i++) {
            System.out.print("-");
        }
        System.out.print("+");
    }
}