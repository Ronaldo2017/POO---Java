package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

//implementa o objeto
public class ImplementacaoFilaThread extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedQueue<ObjetoFilaThread>();

	public static void add(ObjetoFilaThread filaThread) {
		pilha_fila.add(filaThread);
	}

	@Override
	public void run() {

		System.out.println("Fila rodando");

		while (true) {

			Iterator iteracao = pilha_fila.iterator();
			synchronized (iteracao) {// bloquear o acesso a esta lista por outros processos

				// enquanto tiver daos na lista ira rocessar
				while (iteracao.hasNext()) {
					ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();// paga o objeto atual

					/*
					 * Processa os dados
					 */
					System.out.println("-----------------------------");

					System.out.println(processar.getEmail());
					System.out.println(processar.getNome());

					iteracao.remove();
					try {
						Thread.sleep(1000);// dar um tempo para descarga de memoria
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}

			try {
				Thread.sleep(1000);// processou toda a lista, da um tempo para limpeza de memoria
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}
	}

}
