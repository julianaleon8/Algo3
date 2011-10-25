  /**
   * HashTable es una interfaz que determina los metodos basicos que
   * debe tener una tabla de Hash independiente de su modelo de
   * representacion
   *
   * @author Les profs
   * @version 1.0
   * @since 1.6
   */

public interface HashTable <E> {

    /**
     * Agrega <i>element</i> a la tabla usando la clase
     * element.toString().
     *
     * @param Elemento de tipo E, con el que se declaro el objeto
     * @return true si el elemento fue insertado, false en caso contrario
     */

    public boolean add(E element);

    /**
     * Reinicializa la tabla de hash
     * queda como recien creada
     */

    public void clear();

    /**
     * Retorna una nueva {@code MyHashTable} con los mismos elementos que estan
     * {@code this}.
     *
     * @return una tabla de hash con los mismos elementos que esta tabla
     * @see java.lang.Cloneable
     */

    public Object clone();

    /**
     * Determina si el objeto <i>o</i> esta contenido en esta tabla.
     * {@code Object equals}
     *
     * @see Object#equals
     *
     *
     */
    public boolean contains(Object o);

    /**
     * Determina si el objeto <i>o</i> es igual a la tabla actual.
     *
     * @param la tabla con la que se desea comparar
     *
     * @return true si las dos tablas tienen el mismo tama#o y contienen
     * los mismos objetos. false en caso contrario
     *
     */

    public boolean equals(Object o);

    /**
     * Retorna el elemento que contiene la clave.
     *
     * @param e clave del objeto a buscar
     * @return el elemento que tiene clave e, si no se
     * elimino ningun elemento retorna null
     */

    public E get(String e);

    /**
     * Determina si la tabla tiene elementos.
     *
     * @return true si size() &eq; 0. falso en caso contrario
     */

    public boolean isEmpty();

    /**
     * Elimina el elemento que contiene la clave e.
     *
     * @param e clave del objeto a eliminar
     * @return el elemento eliminado, si no se elimino ningun elemento retorna
     * null
     */

    public E remove(String e);

    /**
     * Retorna el numero de elementos enla tabla
     *
     * @return el numero de elementos en la tabla
     */

    public int size();

    /**
     * Retorna un arreglo que contiene todos los elementos
     * en esta tabla {@code MyHahsTable}.
     *
     * @return an array of the elements from this {@code MyHashTable}.
     */

    public Object[] toArray();

    /**
     * Retorna la representacion en String de esta {@code tabla}
     *
     * @return la representacion en String de esta {@code tabla}
     */

    @Override
    public String toString();
}
