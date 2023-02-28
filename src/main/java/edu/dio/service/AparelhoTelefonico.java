package edu.dio.service;

import edu.dio.model.Contato;

public interface AparelhoTelefonico {
    public void ligar(Contato contato);
    public void atender();
    public void iniciarCorrerioVoz();
}
