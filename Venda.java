package RegistraVenda;

public class Venda {
//    produto (Tipo definido pela classe Produto)
//    vendedor (Tipo definido pela classe Vendedor)
//    desconto (em reais R$)
//    quantidadeItens
//    valor

    private Produto produto;
    private Vendedor vendedor;
    private float desconto;
    private int quantidadeItens;
    private float valor;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }


    public float efetuarDesconto(float desconto, Produto produto){
        float valorDescontado = produto.getValorVenda() * (desconto/(float)(100));
        if(valorDescontado < produto.getValorCusto()){
            System.out.println("Desconto nao permitido.");
            valorDescontado = produto.getValorCusto();
            this.desconto = valorDescontado;
        }
        return valorDescontado;
    }
    public float calcularvalor(int quantidadeItens, Produto produto, float desconto){
        float novoValor;
        novoValor=  produto.getValorVenda() - desconto;

        this.valor = novoValor * quantidadeItens;

        return this.valor;
    }
    public float calcularComissao(Vendedor vendedor, Produto produto){
        float comissao;
        if(produto.isPromocao() == true) {
            comissao = this.valor / 2;
        } else{
            comissao = this.valor;
        }
        vendedor.setComissao(comissao);
        return comissao;
    }

    public void imprimir(Produto produto, Venda venda, Vendedor vendedor){
        System.out.println("\nCodigo do vendedor: "+ getVendedor().getCodigo());
        System.out.println("\nNome do vendedor: "+ getVendedor().getNome());
        System.out.println("\nComissao do vendedor: "+ getVendedor().getComissao());
        System.out.println("\nQuantidade de itens vendidos: "+getQuantidadeItens());
        System.out.println("\nCodigo produto: "+ getProduto().getCodigo());
        System.out.println("\nDescricao produto: "+getProduto().getDescricao());
        System.out.println("\nValor venda: "+ getProduto().getValorVenda());
        System.out.println("\nProduto em promocao: "+ getProduto().isPromocao());
        System.out.println("\nDesconto: "+desconto);
        System.out.println("\nValor da venda total: "+valor);
    }



}
