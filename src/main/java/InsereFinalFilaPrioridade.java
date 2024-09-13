import java.util.ArrayList;

public class InsereFinalFilaPrioridade implements FilaPrioridade {

	private ArrayList<Pair> fila;

	public InsereFinalFilaPrioridade(int capacidade) {
		this.fila = new ArrayList<Pair>(capacidade);
	}
	
	// criar um Pair e adicionar no fim da fila
	public void add(String elemento, int prioridade) {
		Pair novoPair = new Pair(elemento, prioridade);
		fila.add(novoPair);
	}


	// buscar pelo elemento de maior prioridade na fila.
	public String removeNext() {
		int max = 0; 
		Pair maxElem = null;
		for(Pair elem: fila){
			if(elem.getPrioridade() > max){
				max = elem.getPrioridade();
				maxElem = elem;
			}
		}
		return maxElem.toString();
	}

}
