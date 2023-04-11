package cursojava.responsabilidade;

public class TesteConta {

	public static void main(String[] args) {


		ContaBancaria bancaria = new ContaBancaria();
		bancaria.setDescricao("Conta do Ronaldo");
		
		bancaria.deposito(500);
		bancaria.diminiu();
		bancaria.sacar(250);
		
		System.out.println(bancaria);
	}

}
