package br.com.daniel.cm;

import br.com.daniel.cm.modelo.Tabuleiro;
import br.com.daniel.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {

		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		new TabuleiroConsole(tabuleiro);
	}
}
