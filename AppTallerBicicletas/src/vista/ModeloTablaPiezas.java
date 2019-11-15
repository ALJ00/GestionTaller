/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vista;

import bicicletasegibide.entity.Piezas;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author armas
 */
public class ModeloTablaPiezas extends AbstractTableModel{

    private List<Piezas> listaPiezas = new ArrayList();
    private String[] columnas = {"Código pieza","Nombre","Precio","Descripción"};

    // constructors
    public ModeloTablaPiezas() {
    }

    public ModeloTablaPiezas(List<Piezas> listaPiezas) {

        this.listaPiezas = listaPiezas;
    }


    // metods
    public int getRowCount() {
        return listaPiezas.size();
    }

    public int getColumnCount() {
        return columnas.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Piezas p = this.listaPiezas.get(rowIndex);

      switch(columnIndex){
           case 0:
               return p.getCodigopieza();
           case 1:
               return p.getNombre();
           case 2:
               return p.getPrecio();
           case 3:
               return p.getDescripcion();

       }

      return null;
    }

    public void adicionarPieza(Piezas piezaNueva){

        listaPiezas.add(piezaNueva);
        fireTableDataChanged();

    }

    public void eliminarPieza(int rowIndex){
        listaPiezas.remove(rowIndex);
        fireTableDataChanged();


    }

    public Piezas obtenerPieza(int rowIndex){

        return this.listaPiezas.get(rowIndex);
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

        Piezas pieza = listaPiezas.get(rowIndex);

        switch(columnIndex){

            case 0:
                pieza.setCodigopieza(value.toString());
                break;
            case 1:
                 pieza.setNombre(value.toString());
                break;
            case 2:
                 pieza.setPrecio(Float.parseFloat(value.toString()));
                break;

            case 3:
                 pieza.setDescripcion(value.toString());
                break;


        }

        fireTableRowsUpdated(rowIndex, columnIndex);



    }



}
