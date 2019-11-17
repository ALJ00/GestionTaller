/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import bicicletasegibide.entity.Reparaciones;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author armas
 */
public class ModeloTablaReparaciones extends AbstractTableModel{

    private List<Reparaciones> listaReparaciones = new ArrayList();
    private String[] columnas = {"Código reparación","Nombre","Ciudad"};

    // constructors
    public ModeloTablaReparaciones() {
    }

    public ModeloTablaReparaciones(List<Reparaciones> listaReparaciones) {

        this.listaReparaciones = listaReparaciones;
    }


    // metods
    public int getRowCount() {
        return listaReparaciones.size();
    }

    public int getColumnCount() {
        return columnas.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Reparaciones p = this.listaReparaciones.get(rowIndex);

      switch(columnIndex){
           case 0:
               return p.getCodigoreparacion();
           case 1:
               return p.getNombre();
           case 2:
               return p.getCiudad();

       }

      return null;
    }

    public void adicionarReparacion(Reparaciones reparacionNueva){

        listaReparaciones.add(reparacionNueva);
        fireTableDataChanged();

    }

    public void eliminarReparacion(int rowIndex){
        listaReparaciones.remove(rowIndex);
        fireTableDataChanged();


    }

    public Reparaciones obtenerReparacion(int rowIndex){

        return this.listaReparaciones.get(rowIndex);
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

        Reparaciones reparacion = listaReparaciones.get(rowIndex);

        switch(columnIndex){

            case 0:
                reparacion.setCodigoreparacion(value.toString());
                break;
            case 1:
                 reparacion.setNombre(value.toString());
                break;
            case 2:
                 reparacion.setCiudad(value.toString());
                break;

        }

        fireTableRowsUpdated(rowIndex, columnIndex);



    }



}
