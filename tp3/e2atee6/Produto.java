package e2atee6;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void alterarPreco(double novoPreco) {
        this.preco = novoPreco;
    }

    public void alterarQuantidade(int novaQuantidade) {
        this.quantidadeEmEstoque = novaQuantidade;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + "\nPreço: " + preco + "\nQuantidade em estoque: " + quantidadeEmEstoque);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double novoPreco) {
        this.preco = novoPreco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int novaQuantidade) {
        this.quantidadeEmEstoque = novaQuantidade;
    }

}
