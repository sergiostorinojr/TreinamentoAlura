package Pattern_Observer;


/**
 * 
 * design-patterns
 * @author S�rgio Junior - sergio.storinojr@gmail.com
 * 17/01/2016 - 18:13:27
 *
 * Pattern State
 *
 */
public class EmAprovacao implements EstadoDeUmOrcamento {

	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.valor -= orcamento.valor - 0.05;

	}

	@Override
	public void aprovado(Orcamento orcamento) {
		orcamento.estadoAtual = new Aprovado();
		
	}

	@Override
	public void reprovado(Orcamento orcamento) {
		orcamento.estadoAtual = new Reprovado();
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Or�amento em aprova��o n�o podem ir direto para finalizado!");
	}

}
