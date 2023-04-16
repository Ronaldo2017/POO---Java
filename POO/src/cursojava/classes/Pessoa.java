package cursojava.classes;

/*Utilizando herança
 * 
 * abstract = não deixa o objeto ser instanciado
 * 
 * metodo abstrato = é obrigatorio reescrever nas classes filhas
 * 
 * */
public abstract class Pessoa {

	protected String nome;
	protected int idade;
	protected String dataNasc;
	protected String rg;
	protected String cpf;
	protected String nomeMae;
	protected String nomePai;
	
	//metodo abstrato é que fica na classe pai
	//é obrigatorio para as classe filhas implementarem
	public abstract double salario();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	
	public boolean maiorIdade() {
		return idade >= 18;
	}
}
