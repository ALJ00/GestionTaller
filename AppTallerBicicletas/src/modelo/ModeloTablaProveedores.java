/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import bicicletasegibide.entity.Proveedores;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author armas
 */
public class ModeloTablaProveedores extends AbstractTableModel{

    private List<Proveedores> lista = new ArrayList();
    private String[] columnas = {"Código proveedor","Nombre","Apellidos","Dirección"};

    // constructors
    public ModeloTablaProveedores() {
    }

    public ModeloTablaProveedores(List<Proveedores> listaPiezas) {

        this.lista = listaPiezas;
    }


    // metods
    public int getRowCount() {
        return lista.size();
    }

    public int getColumnCount() {
        return columnas.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Proveedores p = this.lista.get(rowIndex);

      switch(columnIndex){
           case 0:
               return p.getCodigoproveedor();
           case 1:
               return p.getNombre();
           case 2:
               return p.getApellidos();
           case 3:
               return p.getDireccion();

       }

      return null;
    }

    public void adicionarProveedor(Proveedores proveedor){

        lista.add(proveedor);
        fireTableDataChanged();

    }

    public void eliminarProveedor(int rowIndex){
        lista.remove(rowIndex);
        fireTableDataChanged();


    }

    public Proveedores obtenerProveedor(int rowIndex){

        return this.lista.get(rowIndex);
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

        Proveedores pieza = lista.get(rowIndex);

        switch(columnIndex){

            case 0:
                pieza.setCodigoproveedor(value.toString());
                break;
            case 1:
                 pieza.setNombre(value.toString());
                break;
            case 2:
                 pieza.setApellidos(value.toString());
                break;

            case 3:
                 pieza.setDireccion(value.toString());
                break;


        }

        fireTableRowsUpdated(rowIndex, columnIndex);



    }

}
