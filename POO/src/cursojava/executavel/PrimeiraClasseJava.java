package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		// criando o objeto na memoria
		// new Aluno(); = é uma instancia
		// aluno1 é uma referencia para o objeto Aluno
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno");
		String rg = JOptionPane.showInputDialog("Qual o RG do aluno");
		String cpf = JOptionPane.showInputDialog("Qual o CPF do aluno");
		String mae = JOptionPane.showInputDialog("Qual Nome da Mãe do aluno");
		String pai = JOptionPane.showInputDialog("Qual nome do Pai do aluno");
		String matricula = JOptionPane.showInputDialog("Qual data da matrícula do aluno");
		String nascimento = JOptionPane.showInputDialog("Qual Data de nascimento do aluno");
		String serie = JOptionPane.showInputDialog("Qual a serie matriculado do aluno");
		String disciplina1 = JOptionPane.showInputDialog("Disciplina 1");
		String n1 = JOptionPane.showInputDialog("Qual a 1 nota do aluno");
		String disciplina2 = JOptionPane.showInputDialog("Disciplina 2");
		String n2 = JOptionPane.showInputDialog("Qual a 2 nota do aluno");
		String disciplina3 = JOptionPane.showInputDialog("Disciplina 3");
		String n3 = JOptionPane.showInputDialog("Qual a 3 nota do aluno");
		String disciplina4 = JOptionPane.showInputDialog("Disciplina 4");
		String n4 = JOptionPane.showInputDialog("Qual a 4 nota do aluno");
		//instanciando o objeto
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNasc(nascimento);
		aluno1.setDataMatricula(matricula);
		aluno1.setRg(rg);
		aluno1.setCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setSerieMatriculado(serie);
		aluno1.getDisciplina().setN1(Double.parseDouble(n1));
		aluno1.getDisciplina().setN2(Double.parseDouble(n2));
		aluno1.getDisciplina().setN3(Double.parseDouble(n3));
		aluno1.getDisciplina().setN4(Double.parseDouble(n4));
		aluno1.getDisciplina().setDisciplina1(disciplina1);
		aluno1.getDisciplina().setDisciplina2(disciplina2);
		aluno1.getDisciplina().setDisciplina3(disciplina3);
		aluno1.getDisciplina().setDisciplina4(disciplina4);
		

//		System.out.println(aluno1.getNome());
//		System.out.println(aluno1.getIdade());
//		System.out.println(aluno1.getDataMatricula());
//		System.out.println(aluno1.getCpf());
//		System.out.println(aluno1.getMediaNota());
//		System.out.println("Resultado:" + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		
		//Aluno aluno = new Aluno();
		System.out.println(aluno1.toString());//descrição do objeto na memoria
		System.out.println("Media: " + aluno1.getMediaNota());
		System.out.println("Resultado: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));


		//Equals e hashcode = deferenciar e comparar objeto
//		Aluno aluno1= new Aluno();
//		aluno1.setNome("Pedro");
//		aluno1.setCpf("54687645");
//		
//		Aluno aluno2 = new Aluno();
//		aluno2.setNome("Pedro");
//		aluno2.setCpf("54687645");
//		
//		if(aluno1.equals(aluno2)) {
//			System.out.println("São iguais");
//		}else {
//			System.out.println("Não são iguais");
//		}
		
	}

}
