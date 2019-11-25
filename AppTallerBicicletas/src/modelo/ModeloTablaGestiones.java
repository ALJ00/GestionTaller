/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import bicicletasegibide.entity.Gestiones;
import bicicletasegibide.entity.GestionesId;
import bicicletasegibide.entity.Piezas;
import bicicletasegibide.entity.Proveedores;
import bicicletasegibide.entity.Reparaciones;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author armas
 */
public class ModeloTablaGestiones extends AbstractTableModel {

    private List<Gestiones> listaGestiones = new ArrayList();
    private String[] columnas = {"Código","Código pieza","Código Proveedor","Código Reparación"};

    // constructors
    public ModeloTablaGestiones() {
    }

    public ModeloTablaGestiones(List<Gestiones> listaGestiones) {

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
        Gestiones p = this.listaGestiones.get(rowIndex);

      switch(columnIndex){
           case 0:
              return p.getCantidad();
          case 1:
              return p.getPiezas().getCodigopieza();
          case 2:
              return p.getProveedores().getCodigoproveedor();
          case 3:
              return p.getReparaciones().getCodigoreparacion();


       }

      return null;
    }

    public void adicionarReparacion(Gestiones gestionNueva){

        listaGestiones.add(gestionNueva);
        fireTableDataChanged();

    }

    public void eliminarGestion(int rowIndex){
        listaGestiones.remove(rowIndex);
        fireTableDataChanged();


    }

    public Gestiones obtenerGestion(int rowIndex){

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

        Gestiones g = listaGestiones.get(rowIndex);

        switch(columnIndex){

            case 0:
                g.setCantidad((Float) value);
                break;
            case 1:
                g.getPiezas().setCodigopieza(value.toString());
                break;
            case 2:
                g.getProveedores().setCodigoproveedor(value.toString());
                break;
            case 3:
                g.getReparaciones().setCodigoreparacion(value.toString());
                break;


        }

        fireTableRowsUpdated(rowIndex, columnIndex);



    }

}
