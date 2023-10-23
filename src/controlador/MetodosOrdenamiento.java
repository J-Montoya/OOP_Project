package controlador;

import static controlador.ControladorProducto.arregloProductos;
import java.util.ArrayList;
import java.util.Collections;
import modelo.Producto;

public class MetodosOrdenamiento {
    public static void quicksortNombre(ArrayList<Producto> productos, int izq, int der) {
        if (izq < der) {
            int pi = quicksortNombrePartition(productos, izq, der);
            quicksortNombre(productos, izq, pi - 1);
            quicksortNombre(productos, pi + 1, der);
        }
    }

    private static int quicksortNombrePartition(ArrayList<Producto> productos, int izq, int der) {
        String pivot = productos.get(izq).getNombreP();
        int i = izq;
        int j = der;
    
        while (i < j) {
            while (productos.get(i).getNombreP().compareTo(pivot) <= 0 && i < j) {
                i++;
            }
        
            while (productos.get(j).getNombreP().compareTo(pivot) > 0) {
                j--;
            }
        
            if (i < j) {
                Collections.swap(productos, i, j);
            }
        }
    
        Collections.swap(productos, izq, j);
    
        return j;
    }

    public static void ordenacionMergeSort(ArrayList<Producto> productos) {
        if (productos.size() <= 1) {
            return;
        }

        int mitad = productos.size() / 2;
        ArrayList<Producto> izq = new ArrayList<>(productos.subList(0, mitad));
        ArrayList<Producto> der = new ArrayList<>(productos.subList(mitad, productos.size()));

        ordenacionMergeSort(izq);
        ordenacionMergeSort(der);

        merge(productos, izq, der);
    }

    private static void merge(ArrayList<Producto> productos, ArrayList<Producto> izq, ArrayList<Producto> der) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < izq.size() && j < der.size()) {
            if (izq.get(i).getPrecioventa() < der.get(j).getPrecioventa()) {
                productos.set(k, izq.get(i));
                i++;
            } else {
                productos.set(k, der.get(j));
                j++;
            }
            k++;
        }

        while (i < izq.size()) {
            productos.set(k, izq.get(i));
            i++;
            k++;
        }

        while (j < der.size()) {
            productos.set(k, der.get(j));
            j++;
            k++;
        }
    }

    public static void burbujaMarca(ArrayList<Producto> productos) {
        int n = productos.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (productos.get(j).getMarca().compareTo(productos.get(j + 1).getMarca()) > 0) {
                    // Intercambia los productos si están en el orden incorrecto
                    Collections.swap(productos, j, j + 1);
                }
            }
        }
    }
    
    public static int busquedaBinaria(int idABuscar) {
    int izq = 0;
    int der = arregloProductos.size() - 1;

    while (izq <= der) {
        int medio = izq + (der - izq) / 2;
        int idMedio = arregloProductos.get(medio).getNumeroserial();

        if (idMedio == idABuscar) {
            return medio;
        }

        if (idMedio < idABuscar) {
            izq = medio + 1;
        } else {
            der = medio - 1;
        }
    }

    return -1; // Producto no encontrado
    }
}
