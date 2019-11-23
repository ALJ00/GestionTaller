/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import bicicletasegibide.entity.GestionesId;
import bicicletasegibide.entity.Piezas;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author armas
 */
public class ModeloTablaGestiones extends AbstractTableModel {

    private List<GestionesId> listaGestiones = new ArrayList();
    private String[] columnas = {"Código pieza","Código Proveedor","Código Reparación"};

    // constructors
    public ModeloTablaGestiones() {
    }

    public ModeloTablaGestiones(List<GestionesId> listaGestiones) {

        this.listaGestiones = listaGestiones;
    }


    // metods
    public int getRowCount() {
        return listaGestiones.size();
    }

    public int getColumnCount() {
        return columnas.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        GestionesId p = this.listaGestiones.get(rowIndex);

      switch(columnIndex){
           case 0:
               return p.getPiezasCodigopieza();
           case 1:
               return p.getProveedoresCodigoproveedor();
           case 2:
               return p.getReparacionesCodigoreparacion();


       }

      return null;
    }

    public void adicionarReparacion(GestionesId gestionNueva){

        listaGestiones.add(gestionNueva);
        fireTableDataChanged();

    }

    public void eliminarGestion(int rowIndex){
        listaGestiones.remove(rowIndex);
        fireTableDataChanged();


    }

    public GestionesId obtenerGestion(int rowIndex){

        return this.listaGestiones.get(rowIndex);
    }

    @Override
    public String getColumnName(int columnIndex){

        return this.columnas[columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex){

        return true;
    }


    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex ){

        GestionesId g = listaGestiones.get(rowIndex);

        Piezas p = new Piezas();
        p = (Piezas)value;

        switch(columnIndex){

            case 0:
                g.setPiezasCodigopieza(value.toString());
                break;
            case 1:
                 g.setProveedoresCodigoproveedor(value.toString());
                break;
            case 2:
                 g.setReparacionesCodigoreparacion(value.toString());
                break;


        }

        fireTableRowsUpdated(rowIndex, columnIndex);



    }

}
