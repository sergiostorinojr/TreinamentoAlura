package Pattern_Flyweight;
import java.util.List;

import org.jfugue.player.Player;

/**
 * 
 * design-patterns
 * @author Sérgio Junior - sergio.storinojr@gmail.com
 * 19/01/2016 - 20:28:32
 *
 * Pattern Flyweight
 *
 */
public class Piano {
	
	public void toca(List<Nota> musica){
		Player player = new Player();
		
		StringBuilder musicaEmNotas = new StringBuilder();
		for (Nota nota : musica) {
			musicaEmNotas.append(nota.simbolo() + " ");
			
		}
		System.err.println(musicaEmNotas);
		player.play(musicaEmNotas.toString());
	}

}
