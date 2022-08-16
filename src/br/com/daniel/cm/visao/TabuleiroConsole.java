package br.com.daniel.cm.visao;

import java.util.Scanner;

import br.com.daniel.cm.excecao.ExplosaoException;
import br.com.daniel.cm.excecao.SairException;
import br.com.daniel.cm.modelo.Tabuleiro;

public class TabuleiroConsole {
	private Tabuleiro tabuleiro;
	private Scanner entrada = new Scanner(System.in);

	public TabuleiroConsole(Tabuleiro tabuleiro) {
		executarJogo();
	}

	private void executarJogo() {
		try {
			boolean continuar = true;
			while (continuar) {
				cicloDoJogo();
				
				System.out.println("Outra partida? (S/n)");
				String resposta = entrada.nextLine();
				if ("n".equalsIgnoreCase(resposta)) {
					continuar = false;
				} else {
					tabuleiro.reiniciar();
				}
			}
		} catch (SairException e) {
			System.out.println("Tchau!!!");
		} finally {
			entrada.close();
		}

	}

	private void cicloDoJogo() {
		try {
			System.out.println("Você GANHOUUU!!!!");
		}catch (ExplosaoException e){
			System.out.println("Você perdeu!!!!");
			
		}
		
	}

}
