

public class produto {
    private String nome;
    private int estoque;
    private int numeroDeVendas;
    private double custo;
    private double preco;

    public produto(String nome, int estoque, int numeroDeVendas, double custo, double preco)
    {
        this.nome=nome;
        this.estoque=estoque;
        this.numeroDeVendas=numeroDeVendas;
        this.custo=custo;
        this.preco=preco;
    }
    public String getNomeProduto()
    {
        return this.nome;
    }
    public int getQtdVendasProd()
    {
        return this.numeroDeVendas;
    }
    public double getValorVendasProd()
    {
        return this.preco*this.numeroDeVendas;
    }
    public double getCustoProd()
    {
        return this.custo*this.estoque;
    }
    public double getLucroProd()
    {
        return this.getValorVendasProd()-this.getCustoProd();
    }
}
