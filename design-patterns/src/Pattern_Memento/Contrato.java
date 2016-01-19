package Pattern_Memento;
import java.util.Calendar;

/**
 * 
 * design-patterns
 * @author Sérgio Junior - sergio.storinojr@gmail.com
 * 19/01/2016 - 20:52:16
 *
 * Pattern Memento
 *
 */
public class Contrato {

	private Calendar data;
	private String cliente;
	private TipoContrato tipo;

	public Contrato(Calendar data, String cliente, TipoContrato tipo) {
		this.data = data;
		this.cliente = cliente;
		this.tipo = tipo;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public void setTipo(TipoContrato tipo) {
		this.tipo = tipo;
	}
	public void avanca(){
		if(tipo == TipoContrato.NOVO) tipo = TipoContrato.EM_ANDAMENTO;
		else if(tipo == TipoContrato.EM_ANDAMENTO) tipo = TipoContrato.ACERTADO;
		else if(tipo == TipoContrato.ACERTADO) tipo = TipoContrato.CONCLUIDO;
	}

	public Calendar getData() {
		return data;
	}

	public String getCliente() {
		return cliente;
	}

	public TipoContrato getTipo() {
		return tipo;
	}
	
	public Estado salvaEstado(){
		return new Estado(new Contrato(this.data, this.cliente, this.tipo));
	}

}
