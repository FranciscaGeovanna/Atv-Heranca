
public class Garcom extends Funcionario{
	private int numMesas;
	
	public Garcom(int numMesas, String nome, int idade, double salario, int id, String cargo) {
		super(nome, idade, salario, id, cargo);
		this.numMesas = numMesas;
	}
	
	public int getNumMesas() {
		return numMesas;
	}
	public void setNumMesas(int numMesas) {
		this.numMesas = numMesas;
	}
	
	public void atenderMesa(){
		System.out.println("Garçom atendendo mesa!");
	}
	
	public void receberPedido(){
		System.out.println("Garçom recebendo pedido!");
	}
	
	@Override
	public double pagamento(boolean temBonificacao) {
		if(temBonificacao == true) {
			double salarioTotal = getSalario() + 500;
			System.out.println("Salário pago de R$" + salarioTotal);
			return salarioTotal;
		}
		System.out.println("Salário pago de R$" + getSalario());
		return getSalario();
    }
}