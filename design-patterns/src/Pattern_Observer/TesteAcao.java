package Pattern_Observer;
/**
 * 
 * design-patterns
 * @author Sérgio Junior - sergio.storinojr@gmail.com
 * 17/01/2016 - 19:06:49
 *
 * Pattern Observer
 *
 */
public class TesteAcao {
	
	public static void main(String[] args) {
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.adicionaAcao(new EnviadorEmail());
		builder.adicionaAcao(new EnviadorSMS());
		builder.adicionaAcao(new NotaFiscalDAO());
		builder.adicionaAcao(new Impressora());
		
		NotaFiscal nf = builder.paraEmpresa("Junuioer").comCnpj("212121").comItem(new ItemDaNota("TV Sansung", 1600)
		).comObservacoes("Teste").naDataAtual().constroi();
		
		System.err.println(nf);
				
	}

}
