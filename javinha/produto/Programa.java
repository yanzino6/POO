package javinha.produto;


import java.util.Scanner;

public class Programa {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int estoque =sc.nextInt();
        double val = sc.nextDouble();
        double discount = sc.nextDouble();
        produto p = new produto(name, estoque, val, discount);

        int ops = sc.nextInt();

        String operador;
        int nMOVS;

        for(int i =0; i<ops; i++)
        {
            operador=sc.next();
            if (operador.equals("V")) {
                nMOVS=sc.nextInt();
                p.vende(nMOVS);
            }
            if (operador.equals("C")) {
                nMOVS=sc.nextInt();
                p.compra(nMOVS);
            }
        }

        System.out.printf( "%s\n",p.nome);
        System.out.printf("%d\n", p.estoque);
        System.out.printf("%.2f\n",p.val);
        System.out.printf("%.2f\n",p.discount);
        System.out.printf("%.2f\n",p.returnPreco());
        System.out.printf("%.2f\n",p.retornaValorVendas());

        sc.close();
    }
}
