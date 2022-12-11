package Iphone;

import Aplicativos.AplicativosIphone;

public class Iphone {
    public static void main(String[] args) {
        AplicativosIphone appIphone = new AplicativosIphone();

        System.out.println("======================");
        System.out.println("Aplicativo de Internet");
        System.out.println("======================");

        appIphone.exibirPagina();
        appIphone.adicionarPagina();
        appIphone.atualizarPagina();

        System.out.println("======================");
        System.out.println("Aplicativo    Telefone");
        System.out.println("======================");

        appIphone.ligar();
        appIphone.atender();
        appIphone.iniciarCorreioVoz();

        System.out.println("======================");
        System.out.println("Aplicativo MusicPlayer");
        System.out.println("======================");

        appIphone.selecionarMusica();
        appIphone.tocarMusica();
        appIphone.pausarMusica();
    }
}
