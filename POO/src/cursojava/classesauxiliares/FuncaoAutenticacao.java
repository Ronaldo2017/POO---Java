package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

/*
 * Somente recebe alguem que tem o contrato da interface
 * de PermitirAcesso e chamar o metodo autenticar()
 */
public class FuncaoAutenticacao {
	
	private PermitirAcesso permitirAcesso;

	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
	
	
}
