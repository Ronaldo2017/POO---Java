package cursojava.classes;

import java.util.ArrayList;
import java.util.List;

import cursojava.constantes.StatusAluno;

public class Aluno extends Pessoa {

	// atributos da classe

	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;

	// lista de disciplinas
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	/*
	 * get � para resagater ou obter o valor do atributo
	 * 
	 * set � para adicionar ou receber dados para os atributos
	 */

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public Aluno() {
		// cria os dados na memoria = Padrao
	}

	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}

	/* recebe dados */
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public double getMediaNota() {
		double somaNota = 0.0;
		// instancia a classe essa � a lista
		for (Disciplina disciplina : disciplinas) {
			somaNota += disciplina.getMediaNotas();
		}
		return somaNota / disciplinas.size();
	}

	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if (media >= 70) {
			return true;
		} else {
			return false;
		}
	}

	public String getAlunoAprovado2() {
		double media = this.getMediaNota();
		if (media >= 50) {
			if (media >= 70) {
				return StatusAluno.APROVADO;
			} else {
				return StatusAluno.RECUPERACAO;
			}
		} else {
			return StatusAluno.REPROVADO;
		}
	}

	/* representa os dados do objeto toString */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNasc=" + dataNasc + ", rg=" + rg + ", cpf=" + cpf
				+ ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + ", dataMatricula=" + dataMatricula + ", nomeEscola="
				+ nomeEscola + ", serieMatriculado=" + serieMatriculado + ", disciplinas=" + disciplinas + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	/*
		@Override =  sobreescrita do metodo = maiorIdade
		que esta na classe pai(Pessoa)
	*/
	@Override
	public boolean maiorIdade() {
		return idade >= 20;
	}

	public String msgMaiorIdade() {
		return this.maiorIdade() ? "J� � maior de idade" : "N�o � maior de idade";
	}

	@Override
	public double salario() {
		
		return 1.599;
	}

}
