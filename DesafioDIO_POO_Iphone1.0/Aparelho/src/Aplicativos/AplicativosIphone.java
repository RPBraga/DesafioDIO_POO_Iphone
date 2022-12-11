package Aplicativos;

import Utilidades.InternetBrowser;
import Utilidades.PlayerMusic;
import Utilidades.Telefone;

public class AplicativosIphone implements Telefone, InternetBrowser, PlayerMusic {
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Página");
    }

    @Override
    public void adicionarPagina() {
        System.out.println("Adicionando Página");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Página");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecioando Música");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando Música");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música Pausada!");
    }

    @Override
    public void ligar() {
        System.out.println("Discando para ...");
    }

    @Override
    public void atender() {
        System.out.println("Atende!!!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz:");
    }
}