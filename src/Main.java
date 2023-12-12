
public class Main {

	public static void main(String[] args) {
		Restaurante r = new Restaurante("Menu Mágico", "Cedro-CE");
		Funcionario f1 = new Funcionario("Poppy", 30, 2500, 4, "garçom");
		Funcionario f2 = new Funcionario("Xaden", 23, 5000, 5, "gerente");
		Gerente gr1 = new Gerente("Maria", 20, 5000, 1, "gerente");
		Garcom g1 = new Garcom(0, "Guto", 19, 2500, 2, "garçom");
		Cozinheiro c1 = new Cozinheiro("Remy", 26, 4000, 3, "cozinheiro");
		Prato p1 = new Prato("Estrogonofe", "frango ou carne bovina, arroz e batata palha", 12.00);
		Prato p2 = new Prato("Steak frites", "bife suculento servido com batatas fritas crocantes e temperadas", 20.00);
		
		c1.cozinharPrato(p1);
		c1.cozinharPrato(p2);
		c1.mostrarPratos();
		c1.pratoEstaSendoPreparado(p2);
		c1.finalizarPrato(p1);
		c1.pratoEstaSendoPreparado(p1);
		c1.pagamento(true);
		
		gr1.contratarFunc(f1);
		gr1.contratarFunc(f2);
		gr1.demitirFunc(f1);
		gr1.pagamento(false);
		gr1.mostrarFuncSupervisao();
		
		g1.atenderMesa();
		g1.receberPedido();
		g1.pagamento(true);
		
		r.addPrato(p1);
		r.addPrato(p2);
		r.mostrarCardapio();
		r.removerPrato(p1);
		r.mostrarCardapio();
		r.contratarFuncR(gr1);
		r.mostrarFuncionarios();
		r.pagarFuncBonificacao(f2);
	}
}
