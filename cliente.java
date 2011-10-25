

public class cliente {
	public static void main(String[] args){
	
	String source = "inicio";
	String destination = "fin";
	Edge edge = new Edge(source,destination);
	Edge edge3 = new Edge("hola","chao");
	Edge edge4 = new Edge("4","4");
	Edge edge5 = new Edge("5","5");
	MyList<Edge> lista = new MyList<Edge>();
	MyList<Edge> lista2 = new MyList<Edge>();
	MyHashTable<Edge> hash = new MyHashTable<Edge>(15);
	
	if (hash.add(edge3))
		System.out.println("FUNCIONO");
		else
		System.out.println("NO FUNCIONO");
		
			if (hash.add(edge))
		System.out.println("FUNCIONO");
		else
		System.out.println("NO FUNCIONO");
		
			if (hash.add(edge4))
		System.out.println("FUNCIONO");
		else
		System.out.println("NO FUNCIONO");
	
		if (hash.add(edge5))
		System.out.println("FUNCIONO");
		else
		System.out.println("NO FUNCIONO");
	//System.out.println(elemento.toString());

              Edge edge6 = hash.get(edge.toString());
              System.out.println("          PUPU            " + edge6.toString());

		if (lista.add(edge)){
			
		Edge nodo = lista.getElem(0);
		}
		else
			System.out.println("Failed");
		if (lista.add(edge3)){
			
		Edge nodo1 = lista.getElem(1);
		}
		else
			System.out.println("Failed");
					if (lista.add(edge)){
			
		Edge nodo2 = lista.getElem(2);
		}
		else
			System.out.println("Failed");
					if (lista.add(edge3)){
			
		Edge nodo3 = lista.getElem(3);
		}
		else
			System.out.println("Failed");
			
			
			
			if (lista2.add(edge)){
			
		Edge nodo = lista2.getElem(0);
		}
		else
			System.out.println("Failed");
			if (lista2.add(edge)){
			
		Edge nodo = lista2.getElem(0);
		}
		else
			System.out.println("Failed");
		if (lista2.add(edge3)){
			
		Edge nodo1 = lista2.getElem(1);
		}
		else
			System.out.println("Failed");
					if (lista2.add(edge4)){
			
		Edge nodo2 = lista2.getElem(2);
		}
		else
			System.out.println("Failed");
					if (lista2.add(edge5)){
			
		Edge nodo3 = lista2.getElem(3);
		}
		else
			System.out.println("Failed");

		if (lista.equals(lista2))
			System.out.println("Son iguales");
		else
			System.out.println("Son distintas");
		ListIterator<Edge> iterador = lista.iterator();
		while (iterador.hasNext()){
		Edge ed = iterador.next();
		System.out.println(ed.toString());
		}
		
		if (lista.remove(edge))
			System.out.println("Borre");
		else
			System.out.println("No borre");
			
		if (lista.equals(lista2))
			System.out.println("Son iguales");
		else
			System.out.println("Son distintas");
		if (edge3.equals(lista))
			System.out.println("SON IGUALES");
		else
			System.out.println("SON DISTINtas");
			if (lista.remove(edge3))
			System.out.println("Borre");
		else
			System.out.println("No borre");
			
		if (lista.contains(edge3))
			System.out.println("Contiene " + edge3.toString());
			else
			System.out.println("No contiene");
		
		ListIterator<Edge> iterador2 = lista.iterator();
		
		ListIterator<Edge> iterador3 = lista2.iterator();
		Edge nodito = iterador3.next();
		
		
		
		
		
		while (iterador2.hasNext()){
		Edge nod = iterador2.next();
		System.out.println(nod.toString());
		}
		ListIterator<Edge> iterador5 = lista2.iterator();
		while (iterador5.hasNext()){
		Edge nodss = iterador5.next();
		System.out.println("jajajaja2   " + nodss.toString());
		}
	
		//System.out.println(lista2.getElem(0).toString());
		//System.out.println(nod.toString());
		//System.out.println(lista2.getElem(1).toString());
		//System.out.println(lista2.getElem(2).toString());
		//System.out.println(lista2.getElem(3).toString());
			//System.out.println("Tamano" + lista2.getSize());
			System.out.println(lista2.getSize());
			ListIterator<Edge> iterador4 = lista2.iterator();
		while (iterador4.hasNext()){
		Edge nods = iterador4.next();
		System.out.println("nods " + nods.toString());
		iterador4.unlink();
		}
		System.out.println("Tamano "+ lista2.getSize());
		
		lista.clear();
		if (lista2.isEmpty())
			System.out.println("Lista2 vacia");
}
}