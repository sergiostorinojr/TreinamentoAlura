package Pattern_Observer;

/**
 * 
 * design-patterns
 * @author Sérgio Junior - sergio.storinojr@gmail.com
 * 17/01/2016 - 19:07:27
 *
 * Pattern Observer
 *
 */
public class EnviadorEmail implements AcaoAposGerarNota {
	
	public void executa(NotaFiscal nf){
		System.out.println("Enviei por email");
	}

}
