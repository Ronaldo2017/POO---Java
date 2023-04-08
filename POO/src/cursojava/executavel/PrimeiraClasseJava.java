package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		// criando o objeto na memoria
		// new Aluno(); = é uma instancia
		// aluno1 é uma referencia para o objeto Aluno

		// lista de aluno
		List<Aluno> alunos = new ArrayList<Aluno>();

		for (int qtd = 1; qtd <= 2; qtd++) {

			String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd);
//			String idade = JOptionPane.showInputDialog("Qual a idade do aluno");
//		String rg = JOptionPane.showInputDialog("Qual o RG do aluno");
//		String cpf = JOptionPane.showInputDialog("Qual o CPF do aluno");
//		String mae = JOptionPane.showInputDialog("Qual Nome da Mãe do aluno");
//		String pai = JOptionPane.showInputDialog("Qual nome do Pai do aluno");
//		String matricula = JOptionPane.showInputDialog("Qual data da matrícula do aluno");
//		String nascimento = JOptionPane.showInputDialog("Qual Data de nascimento do aluno");
//		String serie = JOptionPane.showInputDialog("Qual a serie matriculado do aluno");

			// instanciando o objeto
			Aluno aluno1 = new Aluno();

			aluno1.setNome(nome);
//			aluno1.setIdade(Integer.valueOf(idade));
//		aluno1.setDataNasc(nascimento);
//		aluno1.setDataMatricula(matricula);
//		aluno1.setRg(rg);
//		aluno1.setCpf(cpf);
//		aluno1.setNomeMae(mae);
//		aluno1.setNomePai(pai);
//		aluno1.setSerieMatriculado(serie);

			// dinamica das diciplinas
			for (int pos = 1; pos <= 2; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " + pos);
				String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina " + pos);

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setN(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);
			}

			// removendo disciplina
			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
			if (escolha == 0) {// opcao sim = 0
				int continuarRemover = 0;
				int posicao = 1;
				while (continuarRemover == 0) {
					String removerDisciplina = JOptionPane.showInputDialog("Qual disciplina 1, 2, 3 ou 4 ?");
					aluno1.getDisciplinas().remove(Integer.valueOf(removerDisciplina).intValue() - posicao);
					posicao++;

					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover ?");
				}

			}

			// adiciona o aluno na lista
			alunos.add(aluno1);
		}

		// percorrendo a lista de aluno pela posicao
		for (int pos = 0; pos < alunos.size(); pos++) {
			Aluno aluno = alunos.get(pos);
			
			if(aluno.getNome().equalsIgnoreCase("juca")) {
				Aluno trocar = new Aluno();
				trocar.setNome("Pedro");
				
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina("Jquery");
				disciplina.setN(88);
				
				//adiciona o objeto trocado na lista
				trocar.getDisciplinas().add(disciplina);
				
				alunos.set(pos, trocar);
				aluno = alunos.get(pos);
				
			}
			
			System.out.println("Aluno: " + aluno.getNome());
			System.out.println("Média: " + aluno.getMediaNota());
			System.out.println("Resultado: " + aluno.getAlunoAprovado2());
			System.out.println("------------------------------------------");

			// percorrendo a lista de disciplina pela posicao
			for (int posd = 0; posd < aluno.getDisciplinas().size(); posd++) {
				Disciplina disc = aluno.getDisciplinas().get(posd);
				System.out.println("Materia: " + disc.getDisciplina() + " Nota: " + disc.getN());
				System.out.println("------------------------------------------");
			}

		}

	}

}
