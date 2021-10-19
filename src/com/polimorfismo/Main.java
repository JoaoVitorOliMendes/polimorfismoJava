package com.polimorfismo;

public class Main {

	public static void main(String[] args) {
		/**
		 * 
		 * O Polimorfismo tem como defini��o a multiplicidade e mutabilidade de m�todos e objetos.
		 * � uma �tima pr�tica de programa��o, pois com a versatilidade e variedade de op��es em muitos casos pode
		 * resumir v�rias linhas de c�digo em apenas 1, al�m de tornar cada classe filho �nica com seus pr�prios m�todos.
		 * 
		 * Pode-se dividir o polimorfismo em 2:
		 * 
		 * Polimorfismo Est�tico ou Sobrecarga;
		 * Polimorfismo Din�mico ou Sobreposi��o;
		 * 
		 * O Polimorfismo Est�tico se d� quando temos a mesma opera��o implementada v�rias vezes na mesma classe.
		 * Como { @EXEMPLO 1 } na classe { @carro }, em que o mesmo m�todo { @mudarVelocidade } � reescrito como uma nova fun��o que extende a fun��o original.
		 * Essa sobrescri��o � feita com a adi��o de um novo parametro { @frear }, pode-se obter o mesmo efeito, em Java, com a mudan�a
		 * do tipo de parametro ou a mudan�a do tipo de retorno
		 * 
		 * J� o Polimorfismo Din�mico se d� quando � criada uma segunda classe filha que extende as propriedades da classe pai.
		 * Pode-se observar esse tipo de Polimorfismo no { @EXEMPLO 2 } e { @EXEMPLO 3 } nas classes { @carroDeCorrida } e { @caminhao } respectivamente.
		 * Nesses casos os m�todos foram mudados para atender as requisi��es de cada classe.
		 * No carro de corrida os valores velocidade e a freeagem s�o dobrados, j� no caminhao os mesmos perdem metade do valor
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
