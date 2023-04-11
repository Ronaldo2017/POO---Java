package cursojava.responsabilidade;

public class ContaBancaria {
	
	private String descricao;
	
	private double saldo = 8000;
	
	public void soma() {
		saldo += 100;
	}
	
	public void diminiu() {
		saldo -= 100;

	}
	
	public void sacar(double saque){
		saldo -= saque;
	}
	
	public void deposito(double deposito) {
		saldo += deposito;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "ContaBancaria [descricao=" + descricao + ", saldo=" + saldo + "]";
	}
	
	
	

}
