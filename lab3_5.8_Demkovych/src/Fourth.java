import java.util.Scanner;

public class Fourth {
    public static void main(String[] arg) {

        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        switch (n) {
            case("Так"):
            case("OK"):
            case("Yes"):
            case("Y"):
            case("+"):
            case("Ok"):
                System.out.println("Я погоджуюсь!");
                break;
            case("Ні"):
            case("NO"):
            case("N"):
            case("-"):
            case("No"):
                System.out.println("Я відмовляюсь!");
                break;
            default:
                System.out.println("вив ");
        }

    }
}
