package Clientes;

public class Crianca {
	
	//atributos dos dias da semana
	private double segundaFeira = 0.0;
	private double tercaFeira = 0.0;
	private double quartaFeira = 0.0;
	private double quintaFeira = 0.0;
	private double sextaFeira = 0.0;
	private double sabDomFer = 0.0;
	
	//método que calcula os descontos
	public void desconto(double valor){
		this.segundaFeira = valor - (valor * 0.10);
		this.tercaFeira = valor - (valor * 0.15);
		this.quartaFeira = valor - (valor * 0.30);
		this.quintaFeira = valor;
		this.sextaFeira = valor - (valor * 0.11);
		this.sabDomFer = valor;
	}
	
	//metodo que exibe os valores dos descontos
	public void mostraDescontos(){
		System.out.println("Os preços para Criança são:" + "\n" +
							"Segunda Feira - R$" + segundaFeira + "\n" +
							"Terça Feira - R$" + tercaFeira + "\n" +
							"Quarta Feira - R$" + quartaFeira + "\n" +
							"Quinta Feira - R$" + quintaFeira + "\n" +
							"Sexta Feira - R$" + sextaFeira + "\n" +
							"Sabados/Domingos/Feriados - R$" + sabDomFer);
	}

	//Getters e Setters
	
	public double getSegundaFeira() {
		return segundaFeira;
	}

	public void setSegundaFeira(float segundaFeira) {
		this.segundaFeira = segundaFeira;
	}

	public double getTercaFeira() {
		return tercaFeira;
	}

	public void setTercaFeira(float tercaFeira) {
		this.tercaFeira = tercaFeira;
	}

	public double getQuartaFeira() {
		return quartaFeira;
	}

	public void setQuartaFeira(float quartaFeira) {
		this.quartaFeira = quartaFeira;
	}

	public double getQuintaFeira() {
		return quintaFeira;
	}

	public void setQuintaFeira(float quintaFeira) {
		this.quintaFeira = quintaFeira;
	}

	public double getSextaFeira() {
		return sextaFeira;
	}

	public void setSextaFeira(float sextaFeira) {
		this.sextaFeira = sextaFeira;
	}

	public double getSabDomFer() {
		return sabDomFer;
	}

	public void setSabDomFer(float sabDomFer) {
		this.sabDomFer = sabDomFer;
	}
	
}
