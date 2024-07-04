package principio.responsabilidade;

public class TesteContaBancaria {
	
	public static void main(String[] args) {
		
		ContaBancaria bancaria = new ContaBancaria();
		
		bancaria.setDescricao("Conta bancária do Arthur");
		bancaria.diminui100();
		bancaria.diminui100();
		bancaria.diminui100();
		
		System.out.println(bancaria);
		
		bancaria.soma100();
		
		System.out.println(bancaria);
	}
	
	
	
}
