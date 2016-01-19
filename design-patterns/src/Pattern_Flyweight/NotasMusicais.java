package Pattern_Flyweight;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * design-patterns
 * @author Sérgio Junior - sergio.storinojr@gmail.com
 * 19/01/2016 - 20:28:22
 *
 * Pattern Flyweight
 *
 */
public class NotasMusicais {

	private static Map<String, Nota> notas = new HashMap<String, Nota>();

	static {
		notas.put("do", new Do());
		notas.put("re", new Re());
		notas.put("mi", new Mi());
		notas.put("fa", new Fa());
		notas.put("sol", new Sol());
		notas.put("la", new La());
		notas.put("si", new Si());
	}

	public Nota pega(String nome) {
		return notas.get(nome);
	}

}
