package Pattern_Observer;

/**
 * 
 * design-patterns
 * @author Sérgio Junior - sergio.storinojr@gmail.com
 * 17/01/2016 - 18:42:09
 *
 * Pattern Builder
 *
 */
public class ItemDaNota {

	private String nome;
	private double valor;

	public ItemDaNota(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
