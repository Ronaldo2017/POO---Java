package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {

		double[] notas = { 5.6, 6.7, 8.9, 9.8 };
		double[] notasHTML = { 0.0, 9.8, 9.5, 8.5 };

		// criando o objeto e setando os valores
		Aluno aluno = new Aluno();
		aluno.setNome("Juca");
		aluno.setNomeEscola("JDev Treinamento");

		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Java");
		disciplina.setN(notas);

		// relacionando a disciplina ao aluno/ na lista
		aluno.getDisciplinas().add(disciplina);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("HTML");
		disciplina2.setN(notasHTML);

		aluno.getDisciplinas().add(disciplina2);

		/* PERCORRENDO ARRAY DE OBJETOS */

		// cria/instancia o array de aluno
		Aluno[] arrayAlunos = new Aluno[1];

		arrayAlunos[0] = aluno;// aluno vem da criação do objeto, no começo do codigo

		// percorrendo no laço for o array
		for (int pos = 0; pos < arrayAlunos.length; pos++) {

			System.out.println("Aluno: " + arrayAlunos[pos].getNome());

			// percorre as disciplinas do aluno
			for (Disciplina d : arrayAlunos[pos].getDisciplinas()) {
				System.out.println("Disciplina: " + d.getDisciplina());
				System.out.println("--------------------------------");
				// percorre as notas da disciplina
				for (int posNota = 0; posNota < d.getN().length; posNota++) {
					System.out.println("Nota: " + d.getN()[posNota]);
				}
				System.out.println("--------------------------------");
			}
		}

		/*
		 * // percorre as disciplinas do aluno System.out.println("Aluno: " +
		 * aluno.getNome() + "\nEscola: " + aluno.getNomeEscola());
		 * System.out.println("#########################");
		 * System.out.println("---------Disciplinas-----------"); // busca a disciplina
		 * for (Disciplina d : aluno.getDisciplinas()) {
		 * System.out.println("Disciplina: " + d.getDisciplina());
		 * 
		 * double maior = 0.0; double menor = 0.0; // busca as notas de cada disciplina
		 * for (int pos = 0; pos < d.getN().length; pos++) { System.out.println("Nota: "
		 * + d.getN()[pos]); if(pos == 0) { maior = d.getN()[pos]; menor =
		 * d.getN()[pos]; }else if(d.getN()[pos] > maior) { maior = d.getN()[pos]; }else
		 * if(d.getN()[pos] < menor) { menor = d.getN()[pos]; }
		 * 
		 * }
		 * 
		 * System.out.println("A maior nota é: " + maior);
		 * System.out.println("A menor nota é: " + menor); }
		 */

	}

}
