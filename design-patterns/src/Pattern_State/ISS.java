package Pattern_State;




/**
 * 
 * design-patterns
 * @author S�rgio Junior - sergio.storinojr@gmail.com
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
