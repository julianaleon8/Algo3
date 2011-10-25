

public class cliente {
	public static void main(String[] args){
	
	String source = "inicio";
	String destination = "fin";
	Edge edge = new Edge(source,destination);
        Edge eEEE = new Edge("hola","guapo");
	Edge edge3 = new Edge("hola","chao");
	Edge edge4 = new Edge("4","4");
	Edge edge5 = new Edge("5","5");
        Edge edge45 = new Edge("6","6");
	MyList<Edge> lista = new MyList<Edge>();
	MyList<Edge> lista2 = new MyList<Edge>();
	MyHashTable<Edge> hash = new MyHashTable<Edge>(15);
        MyHashTable<Edge> hash2;
        MyHashTable<Edge> hash3 = new MyHashTable<Edge>(15);
	
	if (hash.add(edge3))
		System.out.println("FUNCIONO");
		else
		System.out.println("NO FUNCIONO");
        if (hash.add(edge45))
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
        System.out.println("TAAAAAMANO" + hash.size());
       // hash.clear();
        System.out.println("TAAAAAMANO" + hash.size());

        String stri = hash.toString();
        Edge hola = new Edge("gordo","flaco");
        hola = hash.get("(inicio, fin)");
        System.out.println("    SOY EL STRING   " + hola.toString());
        System.out.println("Hola soy el string de hash \n" + stri);

        Edge elem = hash.remove("(4, 4)");
        System.out.println("Soy el elemento eliminado" + elem.toString());
        elem = hash.remove("(6, 6)");
        System.out.println("Soy el elemento eliminado" + elem.toString());
        elem = hash.remove("(hola, chao)");
        System.out.println("Soy el elemento eliminado" + elem.toString());
        System.out.println(hash.size());
        String str2 = hash.toString();
        System.out.println("Soy de nuevo el string de hash\n" + str2);
       /* if (hash3.add(edge3))
		System.out.println("FUNCIONO");
		else
		System.out.println("NO FUNCIONO");

			if (hash3.add(edge))
		System.out.println("FUNCIONO");
		else
		System.out.println("NO FUNCIONO");

			if (hash3.add(edge4))
		System.out.println("FUNCIONO para hash 3");
		else
		System.out.println("NO FUNCIONO");
	
		if (hash3.add(edge5))
		System.out.println("FUNCIONO para hash 3");
		else
		System.out.println("NO FUNCIONO");
        if (hash3.add(edge))
		System.out.println("FUNCIONO para hash 3");
		else
		System.out.println("NO FUNCIONO");
	//System.out.println(elemento.toString());
        hash2 = (MyHashTable) hash.clone();
        hash3 = (MyHashTable) hash2.clone();*/

       /* System.out.println("tamano hash1" + hash.size());
         System.out.println("tamano hash2" + hash2.size());
          System.out.println("tamano hash3" + hash3.size());

              Edge edge6 = hash.get(edge.toString());
              Edge edge7 = hash2.get(edge.toString());
              Edge edge8 = hash.get(edge3.toString());
              Edge edge9 = hash2.get(edge3.toString());
                            Edge edge10 = hash.get(edge4.toString());
              Edge edge11 = hash2.get(edge4.toString());
                            Edge edge12 = hash.get(edge5.toString());
              Edge edge13 = hash2.get(edge5.toString());
              System.out.println("          PUPU2            " + edge7.toString());
                 System.out.println("          PUPU            " + edge6.toString());
                 System.out.println("          PUPU2            " + edge8.toString());
                 System.out.println("          PUPU            " + edge9.toString());
                    System.out.println("          PUPU2            " + edge10.toString());
                 System.out.println("          PUPU            " + edge11.toString());
                 System.out.println("          PUPU2            " + edge12.toString());
                 System.out.println("          PUPU            " + edge13.toString());

                 if (hash2.contains(eEEE)){
                     System.out.println("CONTIENE");
                 }
                 else
                     System.out.println("NO CONTIENE");

                 if (hash.contains(edge3))
                     System.out.println("Contiene");
                 else
                     System.out.println("No contiene");

                 if (hash2.equals(hash3))
                     System.out.println("   SON IGUALES     ");
                 else
                     System.out.println("   NO SON IGUALES  ");
                 if (lista.equals(null))
                     System.out.println("Somos los ositos amorosos");
                 else
                     System.out.println("No somos los ositos amorosos");*/
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