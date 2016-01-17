package Pattern_Builder;

/**
 * 
 * design-patterns
 * @author Sérgio Junior - sergio.storinojr@gmail.com
 * 17/01/2016 - 18:41:11
 *
 * Pattern Builder
 *
 */
public class TesteNotaFiscal {

	public static void main(String[] args) {
		
		/*List<ItemDaNota> itens = Arrays.asList(new ItemDaNota("Geladera", 100.00),
		new ItemDaNota("Televisão", 200.00),
		new ItemDaNota("Microondas", 50.00));
		
		double valorTotal= 0;
		for (ItemDaNota item : itens) {
			valorTotal += item.getValor();
		}
		double impostos = valorTotal * 0.05;
		
		
		NotaFiscalBuilder nf = new NotaFiscalBuilder("Sergio Jr", "22333", Calendar.getInstance(), valorTotal, impostos, itens, observacoes)
	*/
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		
		builder.paraEmpresa("Junior Sergio")
		.comCnpj("123433243")
		.comItem(new ItemDaNota("Geladeira", 100))
		.comItem(new ItemDaNota("TV", 200))
		.comObservacoes("Padrao Projeto")
		.naDataAtual();
		
		NotaFiscal nf = builder.constroi();
		
		System.out.println(nf.getValorBruto());
	}
}
