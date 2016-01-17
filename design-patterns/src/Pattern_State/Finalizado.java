package Pattern_State;
/**
 * 
 * design-patterns
 * @author S�rgio Junior - sergio.storinojr@gmail.com
 * 17/01/2016 - 18:14:18
 *
 * Pattern State
 *
 */
public class Finalizado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException(
				"Orcamento Finalizado n�o podem receber desconto Extra");

	}

	@Override
	public void aprovado(Orcamento orcamento) {
		throw new RuntimeException("Or�amento j� finalizado");

	}

	@Override
	public void reprovado(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos j� finalizado");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Or�amento j� finalizado");

	}

}
