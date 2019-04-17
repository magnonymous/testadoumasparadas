package RegistraVenda;

public class desafioVenda {
    public static void main(String[] args) {
        Produto produto1 = new Produto(100, "Biscoito Treloso", 1.50f, 1.0f, false);
        Vendedor vendedor1 =  new Vendedor("Claudio", 1, "Manaira");
        Venda venda1 = new Venda();

        venda1.setProduto(produto1);
        venda1.setVendedor(vendedor1);
        venda1.setQuantidadeItens(2);

        System.out.println("\nVenda é referente a dois itens");

        float valorVenda1 = venda1.calcularvalor(2, produto1, 0f);
        float valorComissao1 =  venda1.calcularComissao(vendedor1, produto1);

        System.out.println("\nValor da venda: "+valorVenda1);
        System.out.println("\nValor comissao: "+valorComissao1);


        Produto produto2 = new Produto(101, "Miojo", 100, 80, true);
        Vendedor vendedor2 = new Vendedor("Carlos",2 , "Bessa");
        Venda venda2 = new Venda();

        venda2.setVendedor(vendedor2);
        venda2.setProduto(produto2);
        venda2.setQuantidadeItens(3);

        System.out.println("\nVenda é referente a tres itens");

        venda2.efetuarDesconto(0.10f, produto2);

        float valorVenda2 = venda2.calcularvalor(3, produto2, 0.10f);
        float valorComissao2 = venda2.calcularComissao(vendedor2, produto2);

        System.out.println("\nValor da venda: "+valorVenda2);
        System.out.println("\nValor comissao: "+valorComissao2);

        Venda venda3 = new Venda();

        venda3.setVendedor(vendedor2);
        venda3.setProduto(produto2);
        venda3.setQuantidadeItens(2);

        System.out.println("\nVenda e referente a dois itens. ");

        venda3.efetuarDesconto(0.30f, produto2);

        float valorVenda3 = venda3.calcularvalor(2, produto2, 0.30f);
        float valorComissao3 = venda3.calcularComissao(vendedor2, produto2);

        System.out.println("\nValor da venda: "+valorVenda3);
        System.out.println("\nValor comissao: "+valorComissao3);










    }
}
