public class InsereOrdenadoFilaPrioridade implements FilaPrioridade {

	private Pair[] fila;
	private int head;
	private int last;

	public InsereOrdenadoFilaPrioridade(int capacidade) {
		this.fila = new Pair[capacidade];
		this.last = -1;
		this.head = -1;
	}
	
	// criar um Pair e inserir de forma ordenada decrescente no array.
	public void add(String elemento, int prioridade) {
		if(this.head != -1 && (this.head == this.last))
	}

	private void resize(){
		Pair[] novafila = new Pair[this.fila.length * 2];
		for(int i = this.head; i < this.last % fila.length; i ++){

		}
	}


	// remover e retornar o primeiro elemento do array, que é o de maior prioridade. lembrar manipular head e tail
	// para ser uma fila circular. assim a remoção fica O(1)
	public String removeNext() {
		return "";
	}

}
