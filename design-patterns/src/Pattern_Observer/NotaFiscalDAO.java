package Pattern_Observer;
/**
 * 
 * design-patterns
 * @author Sérgio Junior - sergio.storinojr@gmail.com
 * 17/01/2016 - 19:07:36
 *
 * Pattern Observer
 *
 */
public class NotaFiscalDAO implements AcaoAposGerarNota {
	
	public void executa(NotaFiscal nf){
		System.out.println("Salvei no Banco");
	}

}
