/**
 * Clase que almacena la informacion de las aristas en el grafo.
 */
public class Edge {

    private String src = null;
    private String dst = null;

    private Edge() {
    }
    /**
     * Crea una arista entre los vertices src y dst.
     */
    public Edge(String src, String dst) {
	this.src = new String(src);
	this.dst = new String(dst);
    }

    /**
     * Retorna una nueva arista que es copia de this.
     */
    @Override
    protected Object clone() {
	Edge ed = new Edge();

	// se copian (clonan) todos los objetos internos, 
	// no solo asignar las referencias
	ed.src = new String(src);
	ed.dst = new String(dst);

	return ed;
    }

    /**
     * Indica si la arista de entrada es igual a this.
     */
    public boolean equals(Object o) {
        //throw new UnsupportedOperationException("Not supported yet.");
		//boolean inic = (this.src).equals(o.src);
		//boolean fin = (this.dst).equals(o.dst);
		//return (inic && fin);
		return (o instanceof Edge) && ((Edge)o).getDst().equals(this.dst)
				&& ((Edge)o).getSrc().equals(this.src);
		
    }

    /**
     * Retorna el vertice src de la arista.
     */
    public String getSrc() {
        //throw new UnsupportedOperationException("Not supported yet.");
		return this.src;
    }

    /**
     * Retorna el vertice dst de la arista.
     */
    public String getDst() {
        //throw new UnsupportedOperationException("Not supported yet.");
		return this.dst;
    }

    /**
     * Retorna la representacion en String de la arista.
     */
    @Override
    public String toString() {
	return "("+src + ", " + dst+")";
    }

}

// End Edge.java
