package iphone;

public class user {

	public static void main(String[] args) {
        Iphone iphone = new Iphone();

        ReprodutorMusical rM = iphone;
        AparelhoTelefonico aT = iphone;
        NavegadorInternet nI = iphone;

        // Reprodutor de música
        rM.tocar();
        rM.pausar();
        rM.selecionarMusica("oppa gangnam style");

        // Aparelho telefonico
        aT.ligar("(99)99999-9999");
        aT.atender();
        aT.iniciarCorreioVoz();

        // Navegador de internet
        nI.exibirPagina("www.urlExemplo.com");
        nI.adicionarNovaAba();
        nI.atualizarPagina();
    }
}
