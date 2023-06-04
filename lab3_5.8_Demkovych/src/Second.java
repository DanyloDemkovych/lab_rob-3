public class Second {
    public static void main(String[] arg) {
        int  n = 164;
        int n0 = n/100, n1 = n/10%10, n2 = n%10;
        if (n0 > n1 && n0 > n2) {
            System.out.println(n0);
        } else if (n1 > n0 && n1 > n2){
            System.out.println(n1);
        } else if (n2 > n0 && n2 > n1) {
            System.out.println(n2);
        }
    }
}
