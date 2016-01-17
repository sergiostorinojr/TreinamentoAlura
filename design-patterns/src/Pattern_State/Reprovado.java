package Pattern_State;
/**
 * 
 * design-patterns
 * @author S�rgio Junior - sergio.storinojr@gmail.com
 * 17/01/2016 - 18:13:57
 *
 * Pattern State
 *
 */
public class Reprovado implements EstadoDeUmOrcamento{

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orcamento reprovados n�o podem receber desconto Extra");
		
	}

	@Override
	public void aprovado(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos reprovados n�o podem ser Aprovado");
	}

	@Override
	public void reprovado(Orcamento orcamento) {
		throw new RuntimeException("Or�amento j� se encontra Reprovado");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
		
	}

}
