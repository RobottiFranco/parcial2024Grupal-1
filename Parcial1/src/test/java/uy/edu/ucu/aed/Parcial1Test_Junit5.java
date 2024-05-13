package uy.edu.ucu.aed;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for implemented methods.
 */
public class Parcial1Test_Junit5 {
    String instanceVariable;

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
        // Release any resources or clean up after the tests
        instanceVariable = null;
    }

    @Test
    public void ltimArbolVacio() {
        TArbolDeProductos arbol = new TArbolDeProductos();

        assertEquals(-1, arbol.ltim());
    }

    public void ltimArbol1Elemento() {
        TArbolDeProductos arbol = new TArbolDeProductos();
        Producto nuevoProducto = new Producto(1, "instanceVariable");
        arbol.insertar(nuevoProducto.getIdentificador(), nuevoProducto);

        assertEquals(0, arbol.ltim());
    }

    @Test
    public void ltimArbol2Elemento() {
        TArbolDeProductos arbol = new TArbolDeProductos();
        Producto nuevoProducto = new Producto(1, "instanceVariable");
        arbol.insertar(nuevoProducto.getIdentificador(), nuevoProducto);

        nuevoProducto = new Producto(2, "instanceVariable");
        arbol.insertar(nuevoProducto.getIdentificador(), nuevoProducto);

        assertEquals(0.5, arbol.ltim());
    }

    @Test
    public void ltimArbol3lemento() {
        TArbolDeProductos arbol = new TArbolDeProductos();
        Producto nuevoProducto = new Producto(1, "instanceVariable");
        arbol.insertar(nuevoProducto.getIdentificador(), nuevoProducto);

        nuevoProducto = new Producto(2, "instanceVariable");
        arbol.insertar(nuevoProducto.getIdentificador(), nuevoProducto);

        arbol.insertar(4, new Producto(4, null));

        assertEquals(1, arbol.ltim());
    }

    @Test
    public void ltimArbol4Elemento() {
        TArbolDeProductos arbol = new TArbolDeProductos();
        Producto nuevoProducto = new Producto(1, "instanceVariable");
        arbol.insertar(nuevoProducto.getIdentificador(), nuevoProducto);

        nuevoProducto = new Producto(2, "instanceVariable");
        arbol.insertar(nuevoProducto.getIdentificador(), nuevoProducto);

        arbol.insertar(4, new Producto(4, null));
        arbol.insertar(8, new Producto(8, null));

        assertEquals(1.5, arbol.ltim());
    }

    @Test
    public void testLongitudTrayectoriaInternaMediaArbolConocido() {
        TArbolDeProductos arbol = new TArbolDeProductos();

        arbol.insertar(2, new Producto(2, null));
        arbol.insertar(5, new Producto(5, null));
        arbol.insertar(3, new Producto(3, null));
        arbol.insertar(1, new Producto(1, null));
        arbol.insertar(9, new Producto(9, null));
        arbol.insertar(4, new Producto(4, null));
        arbol.insertar(8, new Producto(8, null));
        arbol.insertar(6, new Producto(6, null));
        arbol.insertar(7, new Producto(7, null));
        assertEquals(21D / 9D, arbol.ltim());
    }
}
