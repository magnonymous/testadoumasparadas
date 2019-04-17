package RegistraVenda;

public class Vendedor {

    private String nome;
    private int codigo;
    private float comissao;
    private String endereco;

    //Construtor
    //Recebendo o nome, o endereco e o codigo.
    public Vendedor(String nome, int codigo, String endereco) {
        super();
        this.nome = nome;
        this.codigo = codigo;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
