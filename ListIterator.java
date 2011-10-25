public class ListIterator<E> implements MyListIterator<E>{
	private MyList<E> miLista;
	private MyList<E> miLista2;
	private int posicion;
		
	public ListIterator(MyList<E> lista){
	miLista = lista;
	posicion = 0;
	miLista2 = lista;
	//lista.tam = miLista2.tam;
	//lista = miLista;
		}
	
	public boolean hasNext(){
	return posicion < miLista.tam;
	}
	
	public E next(){

	E nodo = miLista.getElem(posicion);
	posicion++;
	return nodo;
	}
	
	public void unlink(){
	int j = 0;
	while(j<posicion-1){
	//miLista2 = miLista;
	miLista2 = miLista2.prox;
	j++;
	}
	//System.out.println("El elemento es" + miLista2.actual[0].toString());
	//if (miLista2.prox.prox != null)
	
		//System.out.println("juajua" + posicion);
		(miLista2.prox) = (miLista2.prox.prox);
	//if (miLista2.prox.prox == null)
		//miLista
		posicion--;
	miLista.tam--;

	}
	
	
	
	
	
	
	}
	

