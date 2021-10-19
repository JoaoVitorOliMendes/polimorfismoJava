package com.polimorfismo;

public class caminhao extends carro {

	public caminhao(Long id, String modelo, String placa) {
		super(id, modelo, placa);
	}
	
	//EXEMPLO 3
	
	@Override
	public Integer mudarVelocidade(Integer acelerar) {
		return super.mudarVelocidade(acelerar/2);
	}
	@Override
	public Integer mudarVelocidade(Integer acelerar, Integer frear) {
		return super.mudarVelocidade(acelerar/2, frear/2);
	}

}
