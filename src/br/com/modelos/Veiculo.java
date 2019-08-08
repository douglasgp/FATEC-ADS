package br.com.modelos;

public class Veiculo {

	public String modelo;
	public String marca;
	public String placa;
	
	public Veiculo(String vModelo, String vMarca, String vPlaca){
		this.modelo = vModelo;
		this.marca = vMarca;
		this.placa = vPlaca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

}
