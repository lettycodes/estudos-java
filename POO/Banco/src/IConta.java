
public interface IConta {

	// não faz sentido uma interface ter um método que não seja público, até porque todo método ->
	// que está na interface já é público, então se eu colocar "public void" é uma redundância
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, Conta contaDestino);
	
	void imprimirExtrato();
}


// a interface nada mais é do que uma classe abstrata com todos os métodos abstratos.
// uma classe abstrata é uma classe que tem por característica solicitar alguma implementação ->
// que ela sozinha não consegue resolver