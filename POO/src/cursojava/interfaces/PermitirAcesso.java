package cursojava.interfaces;

//essa interface sera o nosso contrato de autenticacao
public interface PermitirAcesso {
	
	
	//apenas declaracao do metodo
	public boolean autenticar(String login, String senha);
	
	public boolean autenticar();
}
