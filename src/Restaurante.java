import java.util.ArrayList;

public class Restaurante {
	private String nomeRestaurante;
	private String endereco;
	private ArrayList<Funcionario> funcionarios = new ArrayList<>();
	private ArrayList<Prato> cardapio = new ArrayList<>();
	
	public Restaurante(String nome, String end){
		this.setNomeRestaurante(nome);
		this.endereco = end;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public ArrayList<Prato> getCardapio() {
		return cardapio;
	}
	
	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void contratarFuncR(Gerente g){
		g.contratarFunc(g);
		funcionarios.add(g);
	}
	
	public void demitirFuncR(Gerente g, Funcionario f){
		g.demitirFunc(f);
		funcionarios.remove(f);
	}
	
	public void addPrato(Prato p){
		cardapio.add(p);
	}
	
	public void removerPrato(Prato p){
		cardapio.remove(p);
	}

	public String getNomeRestaurante() {
		return nomeRestaurante;
	}
	public void setNomeRestaurante(String nomeRestaurante) {
		this.nomeRestaurante = nomeRestaurante;
	}
	
	public void pagarFuncionarios(Funcionario f) {
		f.pagamento(false);
	}
	
	public void pagarFuncBonificacao(Funcionario f) {
		f.pagamento(true);
	}
	
	public void mostrarCardapio() {
	    System.out.println("===== Cardápio =====");
	    for (Prato prato : getCardapio()) {
	        System.out.println("\nNome: " + prato.getNomeP() + "\nDescrição: " + prato.getDescricaoP() + "\nPreço: R$" + prato.getPrecoP());
	    }
	}
	
	public void mostrarFuncionarios() {
	    System.out.println("===== Funcionários =====");
	    for (Funcionario funcionario : getFuncionarios()) {
	        System.out.println("Nome: " + funcionario.getNome() + "\nIdade: " + funcionario.getIdade() + "\nSalário: R$" + funcionario.getSalario());
	        System.out.println("ID: " + funcionario.getId() + "\nCargo: " + funcionario.getCargo());
	    }
	}
}