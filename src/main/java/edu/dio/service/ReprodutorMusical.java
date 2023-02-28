package edu.dio.service;

import edu.dio.model.Musica;

public interface ReprodutorMusical {
    public void tocar();
    public void pausar();
    public void selecionarMusica(Musica musica);
}
