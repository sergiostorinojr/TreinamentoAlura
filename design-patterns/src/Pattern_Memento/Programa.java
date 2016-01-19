package Pattern_Memento;
import java.util.Calendar;


/**
 * 
 * design-patterns
 * @author Sérgio Junior - sergio.storinojr@gmail.com
 * 19/01/2016 - 20:51:12
 *
 * Pattern Memento
 *
 */
public class Programa {
	
	public static void main(String[] args) {
		Historico historico = new Historico();
		Contrato c1 = new Contrato(Calendar.getInstance(), "Sergio", TipoContrato.NOVO);
		historico.adiciona(c1.salvaEstado());
		System.out.println(c1.getTipo());
		c1.avanca();
		historico.adiciona(c1.salvaEstado());
		
		c1.avanca();
		historico.adiciona(c1.salvaEstado());
		System.out.println(c1.getTipo());
		
		Estado pega = historico.pega(1);
		System.err.println(pega.getContrato().getTipo());
	}

}
