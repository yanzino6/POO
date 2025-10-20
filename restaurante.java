

public class restaurante 
{
    private String nome;
    private produto p1;
    private produto p2;
    private produto p3;

    public restaurante(String nome, produto p1, produto p2, produto p3)
    {
        this.nome=nome;
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
    }

    public String getNomeRestaurante()
    {
        return this.nome;
    }

    public double getValorVendasRestaurante()
    {
        return p1.getValorVendasProd()+p2.getValorVendasProd()+p3.getValorVendasProd();
    }

    public double getCustoRestaurante()
    {
        return p2.getCustoProd()+p1.getCustoProd()+p3.getCustoProd();
    }

    public double getLucroRestaurante()
    {
        return p1.getLucroProd()+p2.getLucroProd()+p3.getLucroProd();
    }

    public produto getProdMaisVendido()
    {
        if (p1.getQtdVendasProd()>p2.getQtdVendasProd()&&p1.getQtdVendasProd()>p3.getQtdVendasProd()) {
            return p1;
        }
        else if (p2.getQtdVendasProd()>p3.getQtdVendasProd()) {
            return p2;
        }
        return p3;
    }
}

