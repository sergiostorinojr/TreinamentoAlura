package Pattern_State;
/**
 * 
 * design-patterns
 * @author Sérgio Junior - sergio.storinojr@gmail.com
 * 17/01/2016 - 18:14:18
 *
 * Pattern State
 *
 */
public class Finalizado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException(
				"Orcamento Finalizado não podem receber desconto Extra");

	}

	@Override
	public void aprovado(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já finalizado");

	}

	@Override
	public void reprovado(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos já finalizado");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já finalizado");

	}

}
