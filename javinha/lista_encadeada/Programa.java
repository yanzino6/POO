
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        int n,elem;
        List l = new List();
        Scanner sc = new Scanner(System.in);

        n=sc.nextInt();

        while (n>0) {
            elem=sc.nextInt();
            l.push_front(elem);
            n--;
        }
        l.print();
        sc.close();
    }
}
