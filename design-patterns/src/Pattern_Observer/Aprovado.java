package Pattern_Observer;


/**
 * 
 * design-patterns
 * @author S�rgio Junior - sergio.storinojr@gmail.com
 * 17/01/2016 - 18:13:37
 *
 * Pattern State
 *
 */
public class Aprovado implements EstadoDeUmOrcamento {

	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.valor -= orcamento.valor * 0.02;
	}

	@Override
	public void aprovado(Orcamento orcamento) {
		throw new RuntimeException("Or�amento j� AProvado");

	}

	@Override
	public void reprovado(Orcamento orcamento) {
		throw new RuntimeException(
				"Or�amento uma vez Aprovado n�o pode Ser Reprovado");

	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}

}
