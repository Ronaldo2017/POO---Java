package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Juca");
		
		Diretor diretor = new Diretor();
		diretor.setNome("Jo�o");
		
		Secretario secretario = new Secretario();
		secretario.setCpf("87596586908");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);

	}

}
