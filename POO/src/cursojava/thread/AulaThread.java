package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {

		new Thread() {
			@Override
			public void run() {
				// rotina que vai processar em paralelo
				for (int pos = 0; pos < 10; pos++) {

					// executa o envio com o tempo de parada/determinado
					System.out.println("Executando uma rotina ex.: envio por e-mail");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();// liga a thread para execução

		System.out.println("Fim do teste do thread");
		JOptionPane.showMessageDialog(null, "Thread rodando no em segundo plano!");

	}

}
