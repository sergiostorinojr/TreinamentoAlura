package Pattern_Observer;






/**
 * 
 * design-patterns
 * @author Sérgio Junior - sergio.storinojr@gmail.com
 * 17/01/2016 - 17:17:32
 *
 * Patterns Strategy
 *
 */
public class TesteImpostos {

	public static void main(String[] args) {
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		
		Orcamento orcamento = new Orcamento(1000.00);
		
		CalculadorDeImposto calculador = new CalculadorDeImposto();
		
		calculador.realizaCalculo(orcamento, iss);
		calculador.realizaCalculo(orcamento, icms);
	}
}
