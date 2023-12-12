import java.util.ArrayList;

public class Gerente extends Funcionario{
	private ArrayList<Funcionario> funcSobSupervisao = new ArrayList<>();
	
	public Gerente(String nome, int idade, double salario, int id, String cargo) {
		super(nome, idade, salario, id, cargo);
		//this.setFuncSobSupervisao(funcSobSupervisao);
	}

	public ArrayList<Funcionario> getFuncSobSupervisao() {
		return funcSobSupervisao;
	}
	public void setFuncSobSupervisao(ArrayList<Funcionario> funcSobSupervisao) {
		this.funcSobSupervisao = funcSobSupervisao;
	}
	
	public void contratarFunc(Funcionario funcionario){
		funcSobSupervisao.add(funcionario);
	}
	
	public void demitirFunc(Funcionario func){
		for (Funcionario funcionario: funcSobSupervisao) {
			if(funcionario.equals(func)){
				funcSobSupervisao.remove(funcionario);
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
	
	public void mostrarFuncSupervisao() {
		if(funcSobSupervisao.size() > 0) {
			for (Funcionario funcionario : funcSobSupervisao) {
				System.out.println("===== Funcionario Supervisionado por " + getNome() + " =====");
				System.out.println(funcionario);
			}
		}else{
			System.out.println("Esse gerente não supervisiona nenhum funcionário");
		}
	}
}