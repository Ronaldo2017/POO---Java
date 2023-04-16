package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		// criando o objeto na memoria
		// new Aluno(); = é uma instancia
		// aluno1 é uma referencia para o objeto Aluno

		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe a senha");

		/*
		 * Trava o contrato para autorizar somente quem realmente pode ter acesso ao
		 * sistema
		 */
		if (new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()){

			// lista de aluno de adicionados
			List<Aluno> alunos = new ArrayList<Aluno>();

			// HashMarp =
			// é uma forma de carregar dados e recuperar atraves de um valor
			/*
			 * é uma lista que dentro dela temos uma chave qeu identifica uma sequencia de
			 * valores também
			 */
			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

			for (int qtd = 1; qtd <= 3; qtd++) {

				String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd);

				// instanciando o objeto
				Aluno aluno1 = new Aluno();

				aluno1.setNome(nome);

				// dinamica das diciplinas
				for (int pos = 1; pos <= 1; pos++) {
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

			// inicializa os valores no hashmap
			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

			// percorre a lista de aluno e separa em lista, aprovado, recupracao, reprovado
			for (Aluno aluno : alunos) {
				if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
					maps.get(StatusAluno.APROVADO).add(aluno);
				} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);
				} else {
					maps.get(StatusAluno.REPROVADO).add(aluno);
				}
			}

			System.out.println("-----------------LISTA DOS RECUPERAÇÃO ---------------");
			for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
				System.out.println("O aluno: " + aluno.getNome() + " " + aluno.getAlunoAprovado2() + " com média de: "
						+ aluno.getMediaNota());
			}

			System.out.println("---------------LISTA DOS REPROVADOS ---------------");
			for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
				System.out.println("O aluno: " + aluno.getNome() + " " + aluno.getAlunoAprovado2() + " com média de: "
						+ aluno.getMediaNota());
			}

			System.out.println("----------------LISTA DOS APROVADOS ---------------");
			for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
				System.out.println("O aluno: " + aluno.getNome() + " " + aluno.getAlunoAprovado2() + " com média de: "
						+ aluno.getMediaNota());
			}
		} else {
			JOptionPane.showMessageDialog(null, "Erro: acesso não permitido.");
		}

	}

}
