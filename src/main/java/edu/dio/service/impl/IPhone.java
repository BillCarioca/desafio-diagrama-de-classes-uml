package edu.dio.service.impl;

import edu.dio.model.Contato;
import edu.dio.model.Musica;
import edu.dio.service.AparelhoTelefonico;
import edu.dio.service.NavegadorInternet;
import edu.dio.service.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private Musica musica;
    private Contato contato;
    @Override
    public void tocar() {
        if (musica==null) System.out.println("Selecione a música pra tocar!");
        else System.out.println("Tocando "+musica.getTitulo()+" Autor "+musica.getAutor());
    }

    @Override
    public void pausar() {
        if (musica==null) System.out.println("nenhuma musica tocando!");
        else System.out.println("Pausando "+musica.getTitulo());
    }

    @Override
    public void selecionarMusica(Musica musica) {
    this.musica=musica;
        System.out.println(musica.getTitulo() + " Selecionada");
    }

    @Override
    public void ligar(Contato contato) {
        System.out.println("lingando "+contato.getNome()+" "+contato.getTelefone());
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada!");
    }

    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("Iniciando Correio de Voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("exibindo Pagina Web");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova Aba Adicionada!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina Atualizada!");
    }
}
