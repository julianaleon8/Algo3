/*
 * Implementacion de HashTable que hereda MyHashTable
 *
 */

/**
 * Implementacion de una tabla de hash
 *
 * @author Les profs
 * @version 1.0
 * @since 1.6
 */
public class MyHashTable<E> implements HashTable<E> {

    /*
     * Modelo de representacion para una tabla de hash cerrada con
     * manejo de colisiones
     *
     * http://es.wikipedia.org/wiki/Colisión_(hash)
     */
    private List<E>[] classes;
    private int tam;

    /**
     * Crea una tabla de hash
     */
    public MyHashTable(int numClases) {
        //throw new UnsupportedOperationException("Not supported yet.");
        tam = numClases;
        classes = new List[tam];
    }

    private int hashCode(String e) {
        int n = e.length();
        int j = 0;
        for (int i = 0; i < n; i++) {
            j = 31 * j + e.charAt(i);
        }
        return j;
    }

    /**
     * Agrega <i>element</i> a la tabla usando la clase
     * element.toString().
     *
     * @param Elemento de tipo E, con el que se declaro el objeto
     * @return true si el elemento fue insertado, false en caso contrario
     */
    public boolean add(E element) {
        //throw new UnsupportedOperationException("Not supported yet.");
        String str = element.toString();

        int pos = 0;
        pos = hashCode(str);
        pos = pos & 0x7fffffff % tam;
        System.out.println("POSICION" + pos);
        if (classes[pos] == null) {
            classes[pos] = new MyList<E>();
        }

        classes[pos].add(element);
        System.out.println("Agregue en la pos" + pos);
        //int decimal = Integer.parseInt(hashCode(element), base);
        return true;
    }

    /**
     * Reinicializa la tabla de hash
     * queda como recien creada
     */
    public void clear() {
        //throw new UnsupportedOperationException("Not supported yet.");
        classes = new List[tam];
    }

    /**
     * Retorna una nueva {@code MyHashTable} con los mismos elementos que estan
     * {@code this}.
     *
     * @return una tabla de hash con los mismos elementos que esta tabla
     * @see java.lang.Cloneable
     */
    public Object clone() {
        // throw new UnsupportedOperationException("Not supported yet.");
        MyHashTable<E> tablaHash = new MyHashTable<E>(tam);
        for (int i = 0; i < tam; i++) {
            if (this.classes[i] != null) {
                tablaHash.classes[i] = new MyList<E>();
                ListIterator<E> iterador = this.classes[i].iterator();
                int j = 0;
                while (iterador.hasNext()) {
                    tablaHash.classes[i].add(iterador.next());

                    //System.out.println("Elemento de la lista " + j + this.classes[i].getElem(j).toString());
                    j++;
                }
            }
        }
        return tablaHash;
    }

    /**
     * Determina si el objeto <i>o</i> esta contenido en esta tabla.
     * usando o.toString() como clave
     * {@code Object equals}
     *
     * @see Object#equals
     *
     *
     */
    public boolean contains(Object o) {
        //throw new UnsupportedOperationException("Not supported yet.");
        int i = 0;
        boolean esta = false;
        while (i < tam && !esta) {
            if (this.classes[i] != null && this.classes[i].contains(o)) {
                esta = true;
            } else {
                i++;
            }
        }
        return esta;

    }

    /**
     * Determina si el objeto <i>o</i> es igual a la tabla actual.
     *
     * @param la tabla con la que se desea comparar
     *
     * @return true si las dos tablas tienen el mismo tama#o y contienen
     * los mismos objetos. false en caso contrario
     *
     */
    public boolean equals(Object o) {
        //throw new UnsupportedOperationException("Not supported yet.");
        boolean igual = true;
        MyHashTable<E> tabla = (MyHashTable) o;
        if (!(o instanceof MyHashTable)) {
            return false;
        } else {
            if (this.tam != tabla.tam) {
                return false;
            } else {

                int i = 0;
                while (i < this.tam && igual) {
                    if (this.classes[i] == null && tabla.classes[i] == null) {
                        i++;
                    } else if (this.classes[i] == null && tabla.classes[i] != null) {
                        igual = false;
                    } else if (this.classes[i] != null && tabla.classes[i] == null) {
                        igual = false;
                    } else if (!this.classes[i].equals(tabla.classes[i])) {
                        igual = false;
                    } else {
                        i++;
                    }
                }

            }

        }
        return igual;


    }

    /**
     * Retorna el elemento que contiene la clave.
     *
     * @param e clave del objeto a buscar
     * @return el elemento que tiene clave e, si no se
     * elimino ningun elemento retorna null
     */
    public E get(String e) {
        //throw new UnsupportedOperationException("Not supported yet.");
        int pos = hashCode(e);
        pos = pos & 0x7fffffff % tam;
        int i = 0;
        boolean found = false;
        while (i < classes[pos].getSize() & !found) {
            if (classes[pos].getElem(i).toString().equals(e)) {
                found = true;
            } else {
                i++;
            }
        }
        if (found) {
            return classes[pos].getElem(i);
        } else {
            return null;
        }
        //return classes[pos].getElem(0);
    }

    /**
     * Determina si la tabla tiene elementos.
     *
     * @return true si size() &eq; 0. falso en caso contrario
     */
    public boolean isEmpty() {
        //throw new UnsupportedOperationException("Not supported yet.");
        return size() == 0;
    }

    /**
     * Elimina el elemento que contiene la clave e.
     *
     * @param e clave del objeto a eliminar
     * @return el elemento eliminado, si no se elimino ningun elemento retorna
     * null
     */
    public E remove(String e) {
        //throw new UnsupportedOperationException("Not supported yet.");
        int pos = hashCode(e);
        pos = pos & 0x7fffffff % tam;
        E element = this.get(e);
        ListIterator<E> iterador = this.classes[pos].iterator();
        boolean found = false;
        while (iterador.hasNext() && !found) {
            if (iterador.next().equals(element)) {
                found = true;
                iterador.unlink();
            }

        }
         if (found)
           return element;
       else
           return null;
    }

    /**
     * Retorna el numero de elementos enla tabla
     *
     * @return el numero de elementos en la tabla
     */
    public int size() {
        //throw new UnsupportedOperationException("Not supported yet.");
        int tamano = 0;
        for (int i = 0; i < tam; i++) {
            if (this.classes[i] != null) {
                tamano = tamano + this.classes[i].getSize();
            }

        }

        return tamano;
    }

    /**
     * Retorna un arreglo que contiene todos los elementos
     * en esta tabla {@code MyHahsTable}.
     *
     * @return an array of the elements from this {@code MyHashTable}.
     */
    public Object[] toArray() {
        //throw new UnsupportedOperationException("Not supported yet.");
        Object arreglo[] = new Object[this.size()];
        int j = 0;
        for (int i = 0; i < this.tam; i++){
            if (this.classes[i] != null){
                for (int h = 0; h < this.classes[i].getSize(); h++){
                    arreglo[j] = this.classes[i].getElem(h);
                    j++;
                }
            }
        }
        return arreglo;
       }

    /**
     * Retorna la representacion en String de esta {@code tabla}
     *
     * @return la representacion en String de esta {@code tabla}
     */
    @Override
    public String toString() {
        //throw new UnsupportedOperationException("Not supported yet.");
        String str = "";
        for (int i = 0; i < this.tam; i++) {
            if (this.classes[i] != null) {
                ListIterator<E> iterador = this.classes[i].iterator();
                int j = 0;

                while (iterador.hasNext()) {
                    str = str.concat(iterador.next().toString());
                    str = str.concat("\n");
                    j++;
                }
                //str = str.concat("\n");
            }
        }
        return str;
    }
}








