package principio.responsabilidade;

public class ContaBancaria {
	
	public String descricao;
	public double saldo = 10000;
	
	
	public void soma100() {
		saldo += 100;
	}
	
	public void diminui100() {
		saldo -= 100;
	}
	
	public void sacarDinheiro(double saque) {
		saldo -= saque;
	}
	
	public void depositarDinheiro (double deposito) {
		saldo += deposito;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "ContaBancaria [descricao=" + descricao + ", saldo=" + saldo + "]";
	}
	
	
	
}
