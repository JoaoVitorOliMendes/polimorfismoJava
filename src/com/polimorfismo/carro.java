package com.polimorfismo;

public class carro {

	private Long id;
	private String modelo;
	private String placa;
	private Integer velocidade = 0;
	
	
	public Integer mudarVelocidade(Integer acelerar) {
		this.velocidade += acelerar;
		return this.velocidade;
	}
	
	//EXEMPLO 1
	public Integer mudarVelocidade(Integer acelerar,Integer frear) {
		this.velocidade += acelerar;
		this.velocidade -= frear;
		return this.velocidade;
	}
	
	
	public carro(Long id, String modelo, String placa) {
		super();
		this.id = id;
		this.modelo = modelo;
		this.placa = placa;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	
	
}
