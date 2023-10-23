package vista;

import controlador.ControladorBodegas;
import modelo.Bodega;

import java.util.ArrayList;
import java.util.Scanner;

    public class VistaBodegas {
        boolean acceso = true;
        Scanner escaner;
        ControladorBodegas boControlador ;
        ArrayList<Bodega> arregloBodegas = new ArrayList<>();



        public VistaBodegas() {
            escaner = new Scanner(System.in);
            boControlador = new ControladorBodegas();
            insertarDatosDefault();
        }

        private void insertarDatosDefault() {
            Bodega bodega = new Bodega("Bodega 1", 1);
            boControlador.insertar(bodega);
            bodega = new Bodega("Bodega 2", 2);
            boControlador.insertar(bodega);
        }

        private void insertarBodegas(){

                Bodega bodega1 = new Bodega();
                System.out.println("Nombre de la bodega = ");
                bodega1.setNombre(escaner.next());
                System.out.println("Id de la bodega = ");
                bodega1.setId(escaner.nextInt());
                arregloBodegas.add(bodega1);
            }

            public void menuBodegas(){
                System.out.println("\nMenu Bodegas");
                System.out.println("1. Insertar nueva bodega");
                System.out.println("2. Mostrar todos las bodegas");
                System.out.println("3. Actualizar bodegas");
                System.out.println("4. Borrar bodega");
                System.out.println("5. Ordenar bodegas");
                System.out.println("6. Salir del menu");
                int opcion = escaner.nextInt();

                switch (opcion) {
                    case 1:
                        insertarBodegas();
                        break;
                    case 2:
                        boControlador.consultar();
                        break;
                    case 3:
                        boControlador.actualizar();
                        break;
                    case 4:
                        boControlador.borrar();
                        break;
                    case 5:
                        boControlador.ordenar();
                        break;
                    case 6:
                        acceso = false;
                        System.out.println("Ha salido del menu");
                        throw new AssertionError();
                    default:
                        throw new AssertionError();
                }
            }
        }

