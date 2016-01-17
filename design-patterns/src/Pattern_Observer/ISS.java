package Pattern_Observer;






/**
 * 
 * design-patterns
 * @author Sérgio Junior - sergio.storinojr@gmail.com
 * 17/01/2016 - 17:17:13
 *
 * Patterns Strategy
 *
 */
public class ISS implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}
}
