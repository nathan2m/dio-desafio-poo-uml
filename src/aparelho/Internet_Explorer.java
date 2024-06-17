package aparelho;

import funcionalidade.Navegador_internet;

public class Internet_Explorer implements Navegador_internet{

    private final String nome = "Internet Explorer";

    @Override
    public void exibirPagina(String url) {
        System.out.println(nome + " está exibindo a página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println(nome + " adicionou uma nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println(nome + " atualizou a página");
    }
    
}
