package Pattern_Observer;

/**
 * 
 * design-patterns
 * @author Sérgio Junior - sergio.storinojr@gmail.com
 * 17/01/2016 - 19:07:44
 *
 * Pattern Observer
 *
 */
public class EnviadorSMS implements AcaoAposGerarNota{
	
	public void executa(NotaFiscal nf){
		System.out.println("Enviei por SMS");
	}

}
