package uy.edu.ucu.aed;

public class TArbolDeProductos extends TArbolBB<Producto> {
    public int lti() {
        if (!esVacio()) {
            int[] array = new int[] { 0, 0 };
            this.getRaiz().ltim(array, 0);
            return (array[1]);
        }
        return -1;

    }

    public double ltim() {
        if (!esVacio()) {
            int[] array = new int[] { 0, 0 };
            this.getRaiz().ltim(array, 0);
            return (array[1] * 1D) / (array[0] * 1D);
        }
        return -1;
    }

}
