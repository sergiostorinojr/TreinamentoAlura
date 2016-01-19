package Pattern_Memento;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * design-patterns
 * @author Sérgio Junior - sergio.storinojr@gmail.com
 * 19/01/2016 - 20:51:55
 *
 * Pattern Memento
 *
 */
public class Historico {
	
	private List<Estado> estadosSalvos = new ArrayList<Estado>();
	
	
	public Estado pega(int index){
		return estadosSalvos.get(index);
	}
	
	public void adiciona(Estado estado){
		estadosSalvos.add(estado);
	}
	

}
