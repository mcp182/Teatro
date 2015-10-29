package Validacao;

import Clientes.Crianca;
import Clientes.Estudante;
import Clientes.Idoso;

public class Teste {

	public static void main(String[] args) {
		
		//Criação dos objetos de cada classe
		Crianca crianca = new Crianca();
		Idoso idoso = new Idoso();
		Estudante estudante = new Estudante();
		
		//Chamada do método "desconto" atribuindo o preço do ingresso de cada um 
		crianca.desconto(5.5);
		idoso.desconto(6.0);
		estudante.desconto(8.0);
		
		//chamada do método "mostraDescontos"
		crianca.mostraDescontos();
		idoso.mostraDescontos();
		estudante.mostraDescontos();
	}

}
