
public class Funcionario {
	private String nome;
	private int idade;
	private double salario;
	private int id;
	private String cargo;
	
	public Funcionario(String nome, int idade, double salario, int id, String cargo){
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		this.id = id;
		this.cargo = cargo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public double pagamento(boolean temBonificacao) {
        if (temBonificacao == true) {
            if (cargo.equals("gerente")) {
                salario = 5000 + 500;
                System.out.print("Pagamento realizado de R$" + salario);
            } else if (cargo.equals("cozinheiro")) {
                salario = 4000 + 500;
                System.out.print("Pagamento realizado de R$" + salario);
            } else if (cargo.equals("garçom")) {
                salario = 2500 + 500;
                System.out.print("Pagamento realizado de R$" + salario);
            }
        }else{
        	System.out.print("Pagamento realizado de R$");
        }
        return salario;
    }
	
	@Override
	public String toString() {
	    return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nSalário: " + getSalario();
	}

}