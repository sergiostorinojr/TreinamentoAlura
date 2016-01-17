package Pattern_Observer;

import java.util.Calendar;
import java.util.List;

/**
 * 
 * design-patterns
 * @author Sérgio Junior - sergio.storinojr@gmail.com
 * 17/01/2016 - 18:41:22
 *
 * Pattern Builder
 *
 */
public class NotaFiscal {

	private String razaoSocial;
	private String cnpj;
	private Calendar dataEmisao;
	private double valorBruto;
	private double imposto;
	private List<ItemDaNota> itens;
	private String observacoes;

	public NotaFiscal(String razaoSocial, String cnpj, Calendar dataEmisao,
			double valorBruto, double imposto, List<ItemDaNota> itens,
			String observacoes) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.dataEmisao = dataEmisao;
		this.valorBruto = valorBruto;
		this.imposto = imposto;
		this.itens = itens;
		this.observacoes = observacoes;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public Calendar getDataEmisao() {
		return dataEmisao;
	}

	public double getValorBruto() {
		return valorBruto;
	}

	public double getImposto() {
		return imposto;
	}

	public List<ItemDaNota> getItens() {
		return itens;
	}

	public String getObservacoes() {
		return observacoes;
	}

}
