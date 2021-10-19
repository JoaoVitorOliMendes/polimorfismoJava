package com.polimorfismo;

public class carroDeCorrida extends carro {

	public carroDeCorrida(Long id, String modelo, String placa) {
		super(id, modelo, placa);
	}
	
	//EXEMPLO 2
	
	@Override
	public Integer mudarVelocidade(Integer acelerar) {
		return super.mudarVelocidade(acelerar*2);
	}
	@Override
	public Integer mudarVelocidade(Integer acelerar, Integer frear) {
		return super.mudarVelocidade(acelerar*2, frear*2);
	}

}
