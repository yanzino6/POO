public class rede {
    private String nome;
    private restaurante r1;
    private restaurante r2;

    public rede(String nome, restaurante r1, restaurante r2)
    {
        this.nome=nome;
        this.r1=r1;
        this.r2=r2;
    }

    public String getNomeRede()
    {
        return this.nome;
    }

    public double getValorVendasRede()
    {
        return r1.getValorVendasRestaurante()+r2.getValorVendasRestaurante();
    }

    public double getCustoRede()
    {
        return r1.getCustoRestaurante()+r2.getCustoRestaurante();
    }

    public double getLucroRede()
    {
        return r1.getLucroRestaurante()+r2.getLucroRestaurante();
    }

    public produto getMaisVendidoRede()
    {
        if (r1.getProdMaisVendido().getQtdVendasProd()>r2.getProdMaisVendido().getQtdVendasProd()) {
            return r1.getProdMaisVendido();
        }
        return r2.getProdMaisVendido();
    }

    public restaurante getMaisLucrativoRede()
    {
        if (r1.getLucroRestaurante()>r2.getLucroRestaurante()) {
            return r1;
        }
        return r2;
    }

}
