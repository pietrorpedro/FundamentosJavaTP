package e2atee6;

public class Main {
    public static void main(String[] args) {

        Produto produto = new Produto("Sucrilhos", 6.32, 12);
        // info originais do contrutor (ex 6)
        produto.exibirInformacoes();

        // alterando infos com os metodos (ex 4)
        produto.alterarPreco(6.10);
        produto.alterarQuantidade(11);
        produto.exibirInformacoes();

        // utilizando getter e setter (ex 5)
        produto.setPreco(6.84);
        produto.setNome("Sucrilhos de Chocolate");
        System.out.println(produto.getNome());
    }
}
