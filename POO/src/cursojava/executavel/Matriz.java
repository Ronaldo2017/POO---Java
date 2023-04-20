package cursojava.executavel;

public class Matriz {

	public static void main(String[] args) {

		// matriz
		int notas[][] = new int[1][3];

		notas[0][0] = 80;
		notas[0][1] = 95;
		notas[0][2] = 90;

		// System.out.println(notas);

		// percorre as linha
		for (int posLinha = 0; posLinha < notas.length; posLinha++) {
			// percorre as colunas
			for (int posColuna = 0; posColuna < notas[posLinha].length; posColuna++) {
				System.out.println("Valore: " + notas[posLinha][posColuna]);
			}
		}

	}

}
