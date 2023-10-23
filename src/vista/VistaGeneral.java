package vista;

import controlador.ControladorBodegas;
import controlador.ControladorProducto;
import modelo.Bodega;
import modelo.Producto;

import java.util.Scanner;

public class VistaGeneral {

    Scanner escaner;
    VistaProductos vp = new VistaProductos();
    VistaBodegas vb = new VistaBodegas();
    ControladorProducto proControlador;
    ControladorBodegas boControlador;
    Producto productoX;
    Bodega bodegaX;

    public VistaGeneral() {
        escaner = new Scanner(System.in);
        proControlador = new ControladorProducto();
        boControlador = new ControladorBodegas();
        productoX = new Producto();
        bodegaX = new Bodega();
    }

    public void menuGeneral() {
        System.out.println("\nIntegrantes: Sebastian Murillo y Jonathan Montoya");
        System.out.println("-----------------------------------------------");
        System.out.println("                 Menu general                 ");
        System.out.println("-----------------------------------------------");
        System.out.println("Indique que tipo de usuario es usted: ");
        System.out.println("1. Administrador");
        System.out.println("2. Cliente");
        System.out.println("3. Vendedor");
        System.out.println("4. Bodeguero");

        int opcion = escaner.nextInt();
        while (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4) {
            System.out.println("Tiene que insertar una opcion de la lista  ");
            opcion = escaner.nextInt();
        }
        switch (opcion) {
            case 1:
                menuAdministrador();
                break;
            case 2:
                menuCliente();
                break;
            case 3:
                menuVendedor();
                break;
            case 4:
                menuBodeguero();
                break;
        }
    }

    private void menuAdministrador() {
        System.out.println("------------Administrador----------");
        System.out.println("A que parte necesita acceder?: ");
        System.out.println("1. Productos");
        System.out.println("2. Bodegas");
        int opt = escaner.nextInt();
        while (opt == 1 || opt == 2) {
            if (opt == 1) {
                vp.menu();
            }
            if (opt == 2) {
                vb.menuBodegas();
            }

        }
        if (opt != 1 || opt != 2) {
            System.out.println("No se encuentra la opción ingresada");
        }
    }

    private void menuCliente() {
        System.out.println("----------Cliente--------");
        System.out.println("Tiene las siguientes opciones: ");
        System.out.println("\n1. Visualizar datos de productos");
        System.out.println("2. Ordenar datos de productos");
        int opt = escaner.nextInt();
        while (opt == 1 || opt == 2) {
            if (opt == 1) {
                proControlador.consultar();
                break;
            }
            if (opt == 2) {
                proControlador.ordenar();
                break;
            } else {
                System.out.println("Opcion no valida");
                break;
            }
        }
    }

    private void menuVendedor() {
        System.out.println("----------Vendedor-------");
        System.out.println("Tiene las siguientes opciones: ");
        System.out.println("\n1. Visualizar los datos de productos");
        System.out.println("2. Visualizar los datos de bodegas");
        System.out.println("3. Cambiar precio de producto");
        int opt = escaner.nextInt();
        while (opt == 1 || opt == 2 || opt == 3) {
            if (opt == 1) {
                proControlador.consultar();
                break;
            }
            if (opt == 2) {
                boControlador.consultar();
                break;
            }
            if (opt == 3) {
                System.out.println("Inserte el nuevo precio para la venta del producto: ");
                productoX.setPrecioventa(escaner.nextFloat());
                break;
            } else {
                System.out.println("Opcion no valida");
                break;
            }
        }
    }

    private void menuBodeguero() {
        System.out.println("----------Bodeguero-------");
        System.out.println("Tiene las siguientes opciones: ");
        System.out.println("\n1. Visualizar datos de productos");
        System.out.println("2. Cambiar nombre de una bodega");
        int opt = escaner.nextInt();
        while (opt == 1 || opt == 2) {
            if (opt == 1) {
                proControlador.consultar();
                break;
            }
            if (opt == 2) {
                System.out.println("Ingrese el nuevo nombre para la bodega: ");
                bodegaX.setNombre(escaner.next());
                break;
            } else {
                System.out.println("Opcion no valida");
                break;
            }
        }
    }
}
