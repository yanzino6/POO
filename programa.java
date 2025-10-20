

import java.util.Scanner;

public class programa
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        String nomeRede = sc.next();
        String nomeRes = sc.next();
        String nomeProd = sc.next();
        int estoqueProd = sc.nextInt();
        int numeroVendasProd = sc.nextInt();
        double custoProd = sc.nextDouble();
        double precoProd = sc.nextDouble();

        produto p1 = new produto(nomeProd,estoqueProd,numeroVendasProd,custoProd,precoProd);

        nomeProd = sc.next();
        estoqueProd = sc.nextInt();
        numeroVendasProd = sc.nextInt();
        custoProd = sc.nextDouble();
        precoProd = sc.nextDouble();

        produto p2 = new produto(nomeProd,estoqueProd,numeroVendasProd,custoProd,precoProd);

        nomeProd = sc.next();
        estoqueProd = sc.nextInt();
        numeroVendasProd = sc.nextInt();
        custoProd = sc.nextDouble();
        precoProd = sc.nextDouble();

        produto p3 = new produto(nomeProd,estoqueProd,numeroVendasProd,custoProd,precoProd);

        restaurante r1 = new restaurante(nomeRes, p1, p2, p3);


        nomeRes=sc.next();

        nomeProd = sc.next();
        estoqueProd = sc.nextInt();
        numeroVendasProd = sc.nextInt();
        custoProd = sc.nextDouble();
        precoProd = sc.nextDouble();

        produto p4 = new produto(nomeProd,estoqueProd,numeroVendasProd,custoProd,precoProd);

        nomeProd = sc.next();
        estoqueProd = sc.nextInt();
        numeroVendasProd = sc.nextInt();
        custoProd = sc.nextDouble();
        precoProd = sc.nextDouble();

        produto p5 = new produto(nomeProd,estoqueProd,numeroVendasProd,custoProd,precoProd);

        nomeProd = sc.next();
        estoqueProd = sc.nextInt();
        numeroVendasProd = sc.nextInt();
        custoProd = sc.nextDouble();
        precoProd = sc.nextDouble();

        produto p6 = new produto(nomeProd,estoqueProd,numeroVendasProd,custoProd,precoProd);

        restaurante r2 = new restaurante(nomeRes, p4, p5, p6);

        rede rede = new rede(nomeRede, r1, r2);


        sc.close();

        System.out.printf("%s %d\n", rede.getMaisVendidoRede().getNomeProduto(),rede.getMaisVendidoRede().getQtdVendasProd());
        System.out.printf("%s %.2f\n",rede.getMaisLucrativoRede().getNomeRestaurante(),rede.getMaisLucrativoRede().getLucroRestaurante());
        System.out.printf("%.2f\n",rede.getValorVendasRede());
        System.out.printf("%.2f\n",rede.getCustoRede());
        System.out.printf("%.2f\n",rede.getLucroRede());
    }
}
