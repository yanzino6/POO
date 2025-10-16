package javinha.dobro;

import java.util.Scanner;

public class dobro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        System.out.print(valor*2);
        sc.close();
    }
}
