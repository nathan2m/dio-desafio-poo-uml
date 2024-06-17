import aparelho.Celular_Comum;
import aparelho.Internet_Explorer;
import aparelho.MP3_Player;
import aparelho.iPhone;
import aparelho.iPod;

public class Main {
    public static void main(String[] args) throws Exception {
        final MP3_Player mp3 = new MP3_Player();
        mp3.tocar();
        mp3.pausar();
        mp3.selecionarMusica();

        final iPod ipod = new iPod();
        ipod.tocar();
        ipod.pausar();
        ipod.selecionarMusica();

        final Celular_Comum cel = new Celular_Comum();
        cel.ligar("1234567890");
        cel.atender();
        cel.iniciarCorreioVoz();

        final Internet_Explorer ie = new Internet_Explorer();
        ie.exibirPagina("www.google.com");
        ie.adicionarNovaAba();
        ie.atualizarPagina();

        final iPhone iphone = new iPhone();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
        iphone.ligar("1234567890");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina("www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
