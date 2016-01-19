package Pattern_Flyweight;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * design-patterns
 * @author Sérgio Junior - sergio.storinojr@gmail.com
 * 19/01/2016 - 20:27:04
 *
 * Pattern Flyweight
 *
 */
public class Programa {

	public static void main(String[] args) {

		NotasMusicais notas = new NotasMusicais();

		List<Nota> musica = Arrays.asList(notas.pega("do"), 
										  notas.pega("re"),
										  notas.pega("mi"), 
										  notas.pega("fa"), 
										  notas.pega("fa"),
										  notas.pega("fa"));
		
		Piano piano = new Piano();
		piano.toca(musica);
	}

}
