package aparelho;

import funcionalidade.Aparelho_Telefonico;

public class Celular_Comum implements Aparelho_Telefonico{

    private final String nome = "Celular comum";

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
    
}
