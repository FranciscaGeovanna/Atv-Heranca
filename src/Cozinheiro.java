import java.util.ArrayList;

public class Cozinheiro extends Funcionario{
	private ArrayList<Prato> pratosPreparados = new ArrayList<>();
	private boolean status;
	
	public Cozinheiro(String nome, int idade, double salario, int id, String cargo) {
		super(nome, idade, salario, id, cargo);
	}
	
	public void cozinharPrato(Prato prato){
		pratosPreparados.add(prato);
		this.status = true;
	}
	
	public void finalizarPrato(Prato prato){
		pratosPreparados.remove(prato);
		this.status = false;
	}
	
	public boolean pratoEstaSendoPreparado(Prato prato){
		if(this.status == true){
			System.out.println("O prato está sendo preparado...");
			return true;
		} else{
			System.out.println("O prato já foi finalizado");
			return false;
		}
	}
	
	public void mostrarPratos() {
		for (Prato prato : pratosPreparados) {
			if(pratosPreparados.size() > 0) {
				System.out.println("===== PRATOS PREPARADOS =====");
				System.out.println("Nome: " + prato.getNomeP());
				System.out.println("Descrição: " + prato.getDescricaoP());
				System.out.println("Preço: " + prato.getPrecoP());
			} else {
				System.out.println("Esse cozinheiro não conzinha nenhum parto");
			}
		}
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