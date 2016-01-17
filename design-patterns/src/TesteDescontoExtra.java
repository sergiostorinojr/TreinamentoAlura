/**
 * 
 * design-patterns
 * @author Sérgio Junior - sergio.storinojr@gmail.com
 * 17/01/2016 - 18:12:16
 *
 * Pattern State
 *
 */

public class TesteDescontoExtra {

	public static void main(String[] args) {
		Orcamento reforma = new Orcamento(800);
		reforma.aplicaDescontoExtra();

		System.err.println(reforma.getValor());

		reforma.aprova();

		reforma.aplicaDescontoExtra();
		
		System.out.println(reforma.getValor());
	}

}
