package aparelho;

import funcionalidade.Aparelho_Telefonico;
import funcionalidade.Navegador_internet;
import funcionalidade.Reprodutor_Musical;

public class iPhone implements Reprodutor_Musical, Aparelho_Telefonico, Navegador_internet{

    private final String nome = "iPhone";

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



    @Override
    public void ligar(String numero) {
        System.out.println(nome + " está ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println(nome + " está atendendo uma ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println(nome + " iniciou o correio de voz");
    }



    @Override
    public void tocar() {
        System.out.println(nome + " está tocando música.");
    }

    @Override
    public void pausar() {
        System.out.println(nome + " pausou a música.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println(nome + " está selecionando música.");
    }
    
}
