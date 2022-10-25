package entities;

public class Dados {
	private double heigth;
	private char sexo;
	
	public Dados(double heigth, char sexo) {
		this.heigth = heigth;
		this.sexo = sexo;
	}

	public double getHeigth() {
		return heigth;
	}

	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	
	public static double minor (Dados [] dados) {
		double minor = 10.0;
		for (int i=0;i<dados.length;i++) {
			if (dados[i].heigth < minor) {
				minor = dados[i].heigth;
			}
		}
		return minor;
	}
	
	public static double bigger(Dados[] dados) {
		double bigger = 0;
		for (int i=0;i<dados.length;i++) {
			if (dados[i].heigth > bigger) {
				bigger = dados[i].heigth;
			}
		}
		return bigger;
	}
	
	public static double mediaWomans(Dados [] dados) {
		double soma = 0.0;
		int womans = 0;
		for (int i=0;i<dados.length;i++) {
			if (dados[i].sexo == 'F') {
				soma += dados[i].heigth;
				womans ++;
			}
		}
		return soma/womans;
	}
	
	public static int man(Dados [] dados) {
		int man = 0;
		for (int i=0;i<dados.length;i++) {
			if (dados[i].sexo == 'M') {
				man ++;
			}
		}
		return man;
	}
	
	
	
}
