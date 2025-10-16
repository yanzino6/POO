package javinha.produto;


public class produto {
    public String nome;
    public int estoque;
    public double val;
    public double discount;
    public int totalVendas;

    public produto(String nome, int estoque, double val, double discount)
    {
        if (estoque<0) {
            this.estoque=0;
            System.out.println("VALOR INVALIDO");
        }
        else{
            this.estoque=estoque;
        }

        if (val<0) {
            this.val=0;
            System.out.println("VALOR INVALIDO");
        }
        else{
            this.val = val;
        }

        if (discount<0||discount>=1) {
            this.discount=0;
            System.out.println("VALOR INVALIDO");
        }
        else
        {
            this.discount=discount;
        }
        this.nome=nome;
    }
    public void compra(int val)
    {
        if (val<0) {
            System.out.println("VALOR INVALIDO");
            return;
        }
        else{
            this.estoque+=val;
        }
    }
    public void vende(int val)
    {
        if (val<0) {
            System.out.println("VALOR INVALIDO");
            return;
        }
        else{
            this.estoque-=val;
            this.totalVendas+=val;
        }
    }
    public double returnPreco()
    {
        return this.val*(1-this.discount);
    }
    public double retornaValorVendas()
    {
        return this.returnPreco()*this.totalVendas;
    }
}
