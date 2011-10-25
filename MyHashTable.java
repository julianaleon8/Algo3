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
        //int decimal = Integer.parseInt(hashCode(element), base);
        System.out.println("	HASH	" + pos);
        return true;
    }

    /**
     * Reinicializa la tabla de hash
     * queda como recien creada
     */
    public void clear() {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Retorna una nueva {@code MyHashTable} con los mismos elementos que estan
     * {@code this}.
     *
     * @return una tabla de hash con los mismos elementos que esta tabla
     * @see java.lang.Cloneable
     */
    public Object clone() {
        throw new UnsupportedOperationException("Not supported yet.");
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
        throw new UnsupportedOperationException("Not supported yet.");
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
        throw new UnsupportedOperationException("Not supported yet.");
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
        return classes[pos].getElem(0);
    }

    /**
     * Determina si la tabla tiene elementos.
     *
     * @return true si size() &eq; 0. falso en caso contrario
     */
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Elimina el elemento que contiene la clave e.
     *
     * @param e clave del objeto a eliminar
     * @return el elemento eliminado, si no se elimino ningun elemento retorna
     * null
     */
    public E remove(String e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Retorna el numero de elementos enla tabla
     *
     * @return el numero de elementos en la tabla
     */
    public int size() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Retorna un arreglo que contiene todos los elementos
     * en esta tabla {@code MyHahsTable}.
     *
     * @return an array of the elements from this {@code MyHashTable}.
     */
    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Retorna la representacion en String de esta {@code tabla}
     *
     * @return la representacion en String de esta {@code tabla}
     */
    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}








