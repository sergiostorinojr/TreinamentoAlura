package Pattern_Observer;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * 
 * design-patterns
 * @author Sérgio Junior - sergio.storinojr@gmail.com
 * 17/01/2016 - 18:40:48
 *
 * Pattern Builder
 *
 */
public class NotaFiscalBuilder {
	
	private String razaoSocial;
	private String cnpj;
	private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
	private double valorBruto;
	private double impostos;
	private String observacoes;
	private Calendar data;
	private List<AcaoAposGerarNota> todasAcaoASeremExecutadas;
	
	/**
	 * Pattern Observer
	 */
	public NotaFiscalBuilder() {
		this.todasAcaoASeremExecutadas = new ArrayList<AcaoAposGerarNota>();
	}
	
	public void adicionaAcao(AcaoAposGerarNota acao){
		this.todasAcaoASeremExecutadas.add(acao);
	}

	public NotaFiscalBuilder paraEmpresa(String razaoSocial){
		this.razaoSocial = razaoSocial;
		return this;
	}
	public NotaFiscalBuilder comCnpj(String cnpj){
		this.cnpj = cnpj;
		return this;
	}
	public NotaFiscalBuilder comItem(ItemDaNota item){
		
		todosItens.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * 0.05;
		return this;
	}
	public NotaFiscalBuilder comObservacoes(String observacoes){
		this.observacoes = observacoes;
		return this;
	}
	public NotaFiscalBuilder naDataAtual() {
		this.data = Calendar.getInstance();
		return this;
		
	}
	/**
	 * Pattern Observer
	 * @return
	 */
	public NotaFiscal constroi(){
		NotaFiscal nf = new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, todosItens, observacoes);
		
		for(AcaoAposGerarNota acao : todasAcaoASeremExecutadas){
			acao.executa(nf);
		}
		
		
		return nf;
		
	}

}
