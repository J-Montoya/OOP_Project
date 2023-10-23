/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Jonathan y Sebastian
 */
    import java.util.ArrayList;
    import java.util.Collections;

    import modelo.Bodega;
    import modelo.Producto;

    public class ControladorBodegas implements ICRUD{
        public static ArrayList<Bodega> arregloBodegas = new ArrayList<Bodega>();


        public boolean insertar() {
            return false;
        }


        @Override
        public boolean insertar(Object bodega) {
            boolean insertado = true;
            Bodega bod1 = new Bodega();
            bodega = (Bodega) bod1;

            if(arregloBodegas.isEmpty())
            {
                arregloBodegas.add(bod1);
                insertado = true;
                return insertado;
            }
            else
            {
                for(Bodega bb: arregloBodegas)
                {
                    bb.equals(bod1);
                    insertado = false;

                }
            }
            if(!insertado)
            {
                arregloBodegas.add(bod1);
                return insertado;
            }
            return insertado;

        }

        @Override
        public Object consultar(Object objecto) {
            return null;
        }

        public void consultar() {
            for(int i=0; i< arregloBodegas.size(); i++)
            {
            System.out.println(arregloBodegas.get(i).toString());
            }
        }

        @Override
        public Object actualizar(Object objecto) {
            return null;
        }

        @Override
        public boolean borrar(Object objecto) {
            return false;
        }
        public boolean borrar(){
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public Object actualizar(Bodega bodega) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
        public Object actualizar() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }


        public boolean borrar(Bodega bodega) {
            arregloBodegas.remove(bodega);
            return false;
        }


        public void ordenar() {

        }
}
