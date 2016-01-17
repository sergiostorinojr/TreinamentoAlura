package Pattern_Builder;

/**
 * 
 * design-patterns
 * @author Sérgio Junior - sergio.storinojr@gmail.com
 * 17/01/2016 - 18:13:47
 *
 * Pattern State
 *
 */
public interface EstadoDeUmOrcamento {

	void aplicaDescontoExtra(Orcamento orcamento);

	void aprovado(Orcamento orcamento);

	void reprovado(Orcamento orcamento);

	void finaliza(Orcamento orcamento);

}
