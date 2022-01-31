package OrientacaoObjetosEx1;

public class TestaCliente {

	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		
		c1.nome="Zineide";
		c1.idade=53;
		c1.endereco="Rua Galvão Bueno - 3000";
		c1.cpf=66655566656L;
				
		System.out.println("Nome: "+c1.nome);
		System.out.println("Idade: "+c1.idade);
		System.out.println("Endereço: "+c1.endereco);
		System.out.println("CPF: "+c1.cpf);

	}

}
