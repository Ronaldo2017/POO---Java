package cursojava.execao;

public class ExecaoProcessarNota extends Exception{

	public ExecaoProcessarNota(String erro) {

		super("Erro ao processar as notas." + erro);
	}
}
