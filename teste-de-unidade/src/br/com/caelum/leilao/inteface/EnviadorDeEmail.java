package br.com.caelum.leilao.inteface;

import br.com.caelum.leilao.dominio.Leilao;

public interface EnviadorDeEmail {
    void envia(Leilao leilao);
}