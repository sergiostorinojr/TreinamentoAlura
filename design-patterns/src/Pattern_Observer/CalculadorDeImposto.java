package Pattern_Observer;





/**
 * 
 * design-patterns
 * @author Sérgio Junior - sergio.storinojr@gmail.com
 * 17/01/2016 - 17:16:25
 *
 * Patterns Strategy
 *
 */
public class CalculadorDeImposto {
	

	public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
		double calculo = imposto.calcula(orcamento);
		System.out.println(calculo);
	}


}
