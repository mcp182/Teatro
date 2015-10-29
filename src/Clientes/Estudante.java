package Clientes;

public class Estudante {
	
	//atributos dos dias da semana
	private double segundaFeira = 0.0;
	private double tercaFeira = 0.0;
	private double quartaFeira = 0.0;
	private double quintaFeira = 0.0;
	private double sextaFeira = 0.0;
	private double sabDomFer = 0.0;
	private double carteirinhaSegSex = 0.0;
	private double carteirinhaFds = 0.0;
	
	//método que calcula os descontos
	public void desconto(double valor){
		this.segundaFeira = valor - (valor * 0.10);
		this.tercaFeira = valor - (valor * 0.05);
		this.quartaFeira = valor - (valor * 0.50);
		this.quintaFeira = valor - (valor * 0.30);
		this.sextaFeira = valor; 
		this.sabDomFer = valor;
		this.carteirinhaSegSex = valor - (valor * 0.35);
		this.carteirinhaFds = valor;
	}
	
	//metodo que exibe os valores dos descontos
	public void mostraDescontos(){
		System.out.println("Os preços para Estudante são:" + "\n" +
							"Segunda Feira - R$" + segundaFeira + "\n" +
							"Terça Feira - R$" + tercaFeira + "\n" +
							"Quarta Feira - R$" + quartaFeira + "\n" +
							"Quinta Feira - R$" + quintaFeira + "\n" +
							"Sexta Feira - R$" + sextaFeira + "\n" +
							"Sabados/Domingos/Feriados - R$" + sabDomFer + "\n" +
							"Estudantes com carteirinha de estudante pagam - R$" 
							+ getCarteirinhaSegSex() + " de seg a sex e R$" + getCarteirinhaFds() +
							" nos finais de semana ");
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

	public double getCarteirinhaSegSex() {
		return carteirinhaSegSex;
	}

	public void setCarteirinhaSegSex(double carteirinhaSegSex) {
		this.carteirinhaSegSex = carteirinhaSegSex;
	}

	public double getCarteirinhaFds() {
		return carteirinhaFds;
	}

	public void setCarteirinhaFds(double carteirinhaFds) {
		this.carteirinhaFds = carteirinhaFds;
	}

}
