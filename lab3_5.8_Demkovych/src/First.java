import java.util.Scanner;

public class First {

    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n >= 50 && n <= 100) {
            System.out.println("Число " + n + " міститься в проміжку (50; 100)");
        } else {
            System.out.println("Число " + n + "не міститься в проміжку (50; 100)");

        }
    }
}
