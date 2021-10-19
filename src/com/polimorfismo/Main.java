package com.polimorfismo;

public class Main {

	public static void main(String[] args) {
		/**
		 * 
		 * O Polimorfismo tem como definição a multiplicidade e mutabilidade de métodos e objetos.
		 * É uma ótima prática de programação, pois com a versatilidade e variedade de opções em muitos casos pode
		 * resumir várias linhas de código em apenas 1, além de tornar cada classe filho única com seus próprios métodos.
		 * 
		 * Pode-se dividir o polimorfismo em 2:
		 * 
		 * Polimorfismo Estático ou Sobrecarga;
		 * Polimorfismo Dinâmico ou Sobreposição;
		 * 
		 * O Polimorfismo Estático se dá quando temos a mesma operação implementada várias vezes na mesma classe.
		 * Como { @EXEMPLO 1 } na classe { @carro }, em que o mesmo método { @mudarVelocidade } é reescrito como uma nova função que extende a função original.
		 * Essa sobrescrição é feita com a adição de um novo parametro { @frear }, pode-se obter o mesmo efeito, em Java, com a mudança
		 * do tipo de parametro ou a mudança do tipo de retorno
		 * 
		 * Já o Polimorfismo Dinâmico se dá quando é criada uma segunda classe filha que extende as propriedades da classe pai.
		 * Pode-se observar esse tipo de Polimorfismo no { @EXEMPLO 2 } e { @EXEMPLO 3 } nas classes { @carroDeCorrida } e { @caminhao } respectivamente.
		 * Nesses casos os métodos foram mudados para atender as requisições de cada classe.
		 * No carro de corrida os valores velocidade e a freeagem são dobrados, já no caminhao os mesmos perdem metade do valor
		 * 
		 * */
		
		carro palio = new carro(1L, "Palio 1.0", "xxx-1111");
		
		carroDeCorrida ferrari = new carroDeCorrida(2L, "Ferrari 3.8", "yyy-9999");
		
		caminhao caminhao = new caminhao(3L, "Mercedes 1.0", "zzz-0000");
		
		System.out.println(palio.mudarVelocidade(10).toString());
		//Velocidade = 10
		System.out.println(palio.mudarVelocidade(20,5).toString());
		//Velocidade = 10 + 20 - 5   =   25
		
		System.out.println(ferrari.mudarVelocidade(10).toString());
		//Velocidade = 10 * 2   =   20
		System.out.println(ferrari.mudarVelocidade(20,5).toString());
		//Velocidade = 20 + 20 * 2 - 5 * 2   =   50

		System.out.println(caminhao.mudarVelocidade(10).toString());
		//Velocidade = 10 / 2 = 5
		System.out.println(caminhao.mudarVelocidade(20,5).toString());
		//Velocidade = 5 + 20 / 2 - 5 / 2 = 13
	}

}
