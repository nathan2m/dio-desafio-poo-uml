package aparelho;

import funcionalidade.Reprodutor_Musical;

public class MP3_Player implements Reprodutor_Musical{

    private final String nome = "MP3 Player";

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
