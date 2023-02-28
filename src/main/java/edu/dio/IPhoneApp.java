package edu.dio;

import edu.dio.model.Contato;
import edu.dio.model.Musica;
import edu.dio.service.impl.IPhone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IPhoneApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Contato> contatos= new ArrayList<>();
        contatos.add(new Contato(1,"João","85 99999-9999"));
        contatos.add(new Contato(2,"Ana","85 88888-8888"));
        contatos.add(new Contato(3,"Pedro","85 77777-7777"));
        contatos.add(new Contato(4,"Maria","85 66666-6666"));
        List<Musica> musicas= new ArrayList<>();
        musicas.add(new Musica(1,"Eu Sei que Vou Te Amar","Vinícius de Moraes"));
        musicas.add(new Musica(2,"Aquarela do Brasil","Francisco Alves"));
        musicas.add(new Musica(3,"Asa Branca","Luiz Gonzaga"));
        musicas.add(new Musica(4,"País Tropical","Wilson Simonal"));
        musicas.add(new Musica(5,"Canta Canta, Minha Gente","Martinho da Vila"));
        IPhone iPhone = new IPhone();
        int opcao = 1;
        int opcao2 = 1;
        System.out.println("Desbloqueado");
        do {
            System.out.println("Digite 1: IPod, Digite 2: ligações, " +
                    "Digite 3: Navegar na Internet, Digite 0: Deligar");
            opcao= sc.nextInt();
            switch (opcao){
                case 1:{
                    do {
                        System.out.println("Digite 1: Selecionar Música, " +
                                            "Digite 2: Tocar Música, " +
                                            "Digite 3: Pausar Música, " +
                                            "Digite 0: Voltar");
                        opcao2 = sc.nextInt();
                        switch (opcao2){
                            case 1:{
                                musicas.stream().forEach(System.out::println);
                                System.out.println("digite id da música: ");
                                Integer id = sc.nextInt();
                                musicas.stream().filter(m->m.getId()==id).forEach(iPhone::selecionarMusica);

                                break;
                            } case 2: {
                                iPhone.tocar();
                                break;
                            } case 3:{
                                iPhone.pausar();
                                break;
                            }
                        }
                    }while (opcao2!=0);
                    break;
                }
                case 2:{
                    do {
                        System.out.println("Digite 1: Ligar para contato, " +
                                "Digite 2: Atender Ligação, Digite 3: Correio de Voz, Digite 0: Voltar");
                        opcao2 = sc.nextInt();
                        switch (opcao2){
                            case 1:{
                                contatos.stream().forEach(System.out::println);
                                System.out.println("Digite o id do Contato: ");
                                Integer id = sc.nextInt();
                                contatos.stream().filter(c->c.getId()==id).forEach(iPhone::ligar);
                                break;
                            } case 2: {
                                iPhone.atender();
                                break;
                            } case 3: {
                                iPhone.iniciarCorrerioVoz();
                                break;
                            }
                        }
                    }while (opcao2!=0);
                    break;
                }
                case 3:{
                    do {
                        System.out.println("Digite 1: Exibir Pagina, " +
                                "Digite 2: Atualizar Pagina, Digite 3: Nova Aba, Digite 0: Voltar");
                        opcao2 = sc.nextInt();
                        switch (opcao2){
                            case 1:{
                                iPhone.exibirPagina();
                                break;
                            } case 2:{
                                iPhone.atualizarPagina();
                                break;
                            } case 3: {
                                iPhone.adicionarNovaAba();
                                break;
                            }
                        }
                    }while (opcao2!=0);
                    break;
                }
            }

        }while (opcao!=0);
        System.out.println("desligando IPhone");

    }
}