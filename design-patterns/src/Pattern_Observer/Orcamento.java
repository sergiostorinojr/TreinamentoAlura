package Pattern_Observer;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 
 * design-patterns
 * 
 * @author Sérgio Junior - sergio.storinojr@gmail.com 17/01/2016 - 17:16:47
 *
 *         Patterns Strategy
 *         Pattern State
 *
 */
public class Orcamento {

	protected double valor;
	private final List<Item> itens;

	protected EstadoDeUmOrcamento estadoAtual;

	public Orcamento(double valor) {

		this.valor = valor;
		this.itens = new ArrayList<Item>();
		this.estadoAtual = new EmAprovacao();
	}

	public double getValor() {
		return valor;
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	/**
	 * Pattern State
	 */

	public void aplicaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);

	}

	public void aprova() {
		estadoAtual.aprovado(this);
	}

	public void reprova() {
		estadoAtual.reprovado(this);
	}

	public void finaliza() {
		estadoAtual.finaliza(this);
	}

}
