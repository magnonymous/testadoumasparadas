package RegistraVenda;

public class Produto {
//    Código, descricao, valorVenda, valorCusto , promocao (sim ou não)

    private int codigo;
    private String descricao;
    private float valorVenda;
    private float valorCusto;
    private boolean promocao;

//    Construtor
//    Recebendo o codigo, a descricao, o valorVenda, valorCusto e promocao.
    public Produto(int codigo, String descricao, float valorVenda, float valorCusto, boolean promocao) {
        super();
        this.codigo = codigo;
        this.descricao = descricao;
        this.valorVenda = valorVenda;
        this.valorCusto = valorCusto;
        this.promocao = promocao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public float getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(float valorCusto) {
        this.valorCusto = valorCusto;
    }

    public boolean isPromocao() {
        return promocao;
    }

    public void setPromocao(boolean promocao) {
        this.promocao = promocao;
    }
}
