package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Juca");
		aluno.setIdade(17);
		
		Diretor diretor = new Diretor();
		diretor.setNome("João");
		diretor.setIdade(56);
		
		Secretario secretario = new Secretario();
		secretario.setCpf("87596586908");
		secretario.setIdade(45);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.maiorIdade() + " " + aluno.msgMaiorIdade());
		System.out.println(diretor.maiorIdade());
		System.out.println(secretario.maiorIdade());

	}

}
