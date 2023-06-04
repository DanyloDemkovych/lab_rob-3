import java.util.Scanner;

public class Third {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int level = scanner.nextInt();
        int old = 1;
        if (old < level) {
            if (level == 2) {
                System.out.println("ви піднялися на 3 поверх");
            } else {
                System.out.println("ви піднялися на " + level + " поверх");
            }

        }
        else {
            if (level == 2) {
                System.out.println("ви спустилися на 1 поверх");
            } else {
                System.out.println("ви спустилися на " + level + " поверх");

            }
        }
    }
}
