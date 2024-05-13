package uy.edu.ucu.aed;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Cargar el árbol a partir del archivo
        // Invocar el método solicitado
        // Mostrar por consola el reusltado

        TArbolDeProductos arbolProductos = new TArbolDeProductos();
        String[] archivo = ManejadorArchivosGenerico.leerArchivo("productos.txt");
        String[] linea;
        Producto nuevoProducto;
        for (String string : archivo) {
            linea = string.split(",");
            nuevoProducto = new Producto(Integer.parseInt(linea[0]), linea[1]);
            arbolProductos.insertar(nuevoProducto.getIdentificador(), nuevoProducto);
        }

        String[] lineaEscrita = {
                "longitud de trayectoria interna media: " + arbolProductos.ltim(),
                "altura del arbol: " + arbolProductos.obtenerAltura(), "logitud interna: " + arbolProductos.lti() };
        ManejadorArchivosGenerico.escribirArchivo("salida.txt", lineaEscrita);

        System.out.println(arbolProductos.obtenerAltura());
        System.out.println(arbolProductos.lti());
        System.out.println(arbolProductos.ltim());
    }

}