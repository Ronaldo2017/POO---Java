package cursojava.classes;

import javax.swing.JOptionPane;

public class CodigosNaoUtilizados {

//	for (Aluno aluno : alunos) {
//
//		if (aluno.getNome().equalsIgnoreCase("juca")) {
//			alunos.remove(aluno);
//			break;
//		} else {
//			System.out.println(aluno.toString());// descrição do objeto na memoria
//			System.out.println("Media: " + aluno.getMediaNota());
//			System.out.println("Resultado: " + (aluno.getAlunoAprovado2()));
//			System.out.println("------------------------------------------");
//		}
//	}
	


//	List<Aluno> alunosAprovados = new ArrayList<Aluno>();
//	List<Aluno> alunosReprovados = new ArrayList<Aluno>();
//	List<Aluno> alunosRecupracao = new ArrayList<Aluno>();
	
//	String idade = JOptionPane.showInputDialog("Qual a idade do aluno");
//String rg = JOptionPane.showInputDialog("Qual o RG do aluno");
//String cpf = JOptionPane.showInputDialog("Qual o CPF do aluno");
//String mae = JOptionPane.showInputDialog("Qual Nome da Mãe do aluno");
//String pai = JOptionPane.showInputDialog("Qual nome do Pai do aluno");
//String matricula = JOptionPane.showInputDialog("Qual data da matrícula do aluno");
//String nascimento = JOptionPane.showInputDialog("Qual Data de nascimento do aluno");
//String serie = JOptionPane.showInputDialog("Qual a serie matriculado do aluno");

//	aluno1.setIdade(Integer.valueOf(idade));
//aluno1.setDataNasc(nascimento);
//aluno1.setDataMatricula(matricula);
//aluno1.setRg(rg);
//aluno1.setCpf(cpf);
//aluno1.setNomeMae(mae);
//aluno1.setNomePai(pai);
//aluno1.setSerieMatriculado(serie);
//	
//	//percorre e mostra as disciplinas do aluno na lista
//	for (Aluno aluno : alunos) {
//		System.out.println("Aluno que sobraram na lista");
//		System.out.println(aluno.getNome());
//		System.out.println("Suas materias são: ");
//		//percorre as disciplinas que o aluno tem
//		for (Disciplina disciplina : aluno.getDisciplinas()) {
//			System.out.println(disciplina.getDisciplina());
//		}
//	}
	
	// percorrendo a lista de aluno pela posicao
//			for (int pos = 0; pos < alunos.size(); pos++) {
//				//pega o aluno na lista
//				Aluno aluno = alunos.get(pos);
//				
//				//busca determinado aluno
//				if(aluno.getNome().equalsIgnoreCase("juca")) {
//					Aluno trocar = new Aluno();//novo objeto
//					trocar.setNome("Pedro");//troca do aluno
//					
//					Disciplina disciplina = new Disciplina();//novo objeto
//					disciplina.setDisciplina("Jquery");
//					disciplina.setN(88);
//					Disciplina disciplina2 = new Disciplina();
//					disciplina2.setDisciplina("JavaScript");
//					disciplina2.setN(99);
//					
//					//adiciona o objeto trocado na lista
//					trocar.getDisciplinas().add(disciplina);
//					trocar.getDisciplinas().add(disciplina2);
//					
//					alunos.set(pos, trocar);//troca o objeto pelo novo
//					alunos.set(pos, trocar);
//					aluno = alunos.get(pos);//insere o novo aluno no lugar do outro
//					
//				}
//				
//				System.out.println("Aluno: " + aluno.getNome());
//				System.out.println("Média: " + aluno.getMediaNota());
//				System.out.println("Resultado: " + aluno.getAlunoAprovado2());
//				System.out.println("------------------------------------------");
//
//				// percorrendo a lista de disciplina pela posicao
//				for (int posd = 0; posd < aluno.getDisciplinas().size(); posd++) {
//					Disciplina disc = aluno.getDisciplinas().get(posd);
//					System.out.println("Materia: " + disc.getDisciplina() + " Nota: " + disc.getN());
//				}
//				System.out.println("------------------------------------------");
//
//			}
	
	/*   ARRAY ################################################
	 * 
	 * 
	 * String posicoes = JOptionPane.showInputDialog("Quantas posições tem o array?");

		// array sempre deve ter a quantidade definida
		double[] notas = new double[Integer.parseInt(posicoes)];

		for (int pos = 0; pos < notas.length; pos++) {
			String valor = JOptionPane.showInputDialog("Qual o valor da posição: " + (pos + 1));
			notas[pos] = Double.valueOf(valor);
		}

		// percorre o array
		for (int pos = 0; pos < notas.length; pos++) {
			System.out.println("Nota: " + (pos + 1) + " é " + notas[pos]);
		}*/
}
