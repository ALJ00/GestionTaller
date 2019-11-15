/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VentanaPrincipal.java
 *
 * Created on 15-nov-2019, 18:11:29
 */

package vista;

import bicicletasegibide.entity.Piezas;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.ModeloTablaPiezas;

/**
 *
 * @author armas
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /** Creates new form VentanaPrincipal */
    public VentanaPrincipal() {
        initComponents();
        
        
        ArrayList arrayListPiezas = new ArrayList();

        Piezas pieza = new Piezas();

        arrayListPiezas = pieza.listarPiezas();

        this.modeloTablaPiezas = new ModeloTablaPiezas(arrayListPiezas);

        this.tablaPiezas.setModel(this.modeloTablaPiezas);



    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorPrincipal = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        contenedorPiezas = new javax.swing.JPanel();
        contenedorPiezasControl = new javax.swing.JPanel();
        nuevaButton = new javax.swing.JButton();
        eliminarButton = new javax.swing.JButton();
        actualizarButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textFieldCodigoPieza = new javax.swing.JTextField();
        textFieldNombre = new javax.swing.JTextField();
        textFieldPrecio = new javax.swing.JTextField();
        textFieldDescripcion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPiezas = new javax.swing.JTable();
        contenedorProveedores = new javax.swing.JPanel();
        contenedorGestionProveedores = new javax.swing.JPanel();
        contenedorTablaProveedores = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("App Gestión Taller Bicicletas");

        contenedorPiezas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        contenedorPiezasControl.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Control Piezas"));

        nuevaButton.setText("Nueva");
        nuevaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaButtonActionPerformed(evt);
            }
        });

        eliminarButton.setText("Eliminar");
        eliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButtonActionPerformed(evt);
            }
        });

        actualizarButton.setText("Actualizar");
        actualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Código pieza:");

        jLabel2.setText("Nombre: ");

        jLabel3.setText("Precio:");

        jLabel4.setText("Descripción:");

        javax.swing.GroupLayout contenedorPiezasControlLayout = new javax.swing.GroupLayout(contenedorPiezasControl);
        contenedorPiezasControl.setLayout(contenedorPiezasControlLayout);
        contenedorPiezasControlLayout.setHorizontalGroup(
            contenedorPiezasControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPiezasControlLayout.createSequentialGroup()
                .addComponent(nuevaButton, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(eliminarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(actualizarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
            .addGroup(contenedorPiezasControlLayout.createSequentialGroup()
                .addGroup(contenedorPiezasControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contenedorPiezasControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                    .addComponent(textFieldNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                    .addComponent(textFieldCodigoPieza, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                    .addComponent(textFieldDescripcion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)))
        );
        contenedorPiezasControlLayout.setVerticalGroup(
            contenedorPiezasControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorPiezasControlLayout.createSequentialGroup()
                .addGroup(contenedorPiezasControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldCodigoPieza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorPiezasControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorPiezasControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorPiezasControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorPiezasControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(actualizarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nuevaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        tablaPiezas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablaPiezas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaPiezas);

        javax.swing.GroupLayout contenedorPiezasLayout = new javax.swing.GroupLayout(contenedorPiezas);
        contenedorPiezas.setLayout(contenedorPiezasLayout);
        contenedorPiezasLayout.setHorizontalGroup(
            contenedorPiezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
            .addComponent(contenedorPiezasControl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contenedorPiezasLayout.setVerticalGroup(
            contenedorPiezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorPiezasLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorPiezasControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Piezas", contenedorPiezas);

        contenedorProveedores.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        contenedorGestionProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Gestión Proveedores"));

        javax.swing.GroupLayout contenedorGestionProveedoresLayout = new javax.swing.GroupLayout(contenedorGestionProveedores);
        contenedorGestionProveedores.setLayout(contenedorGestionProveedoresLayout);
        contenedorGestionProveedoresLayout.setHorizontalGroup(
            contenedorGestionProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
        );
        contenedorGestionProveedoresLayout.setVerticalGroup(
            contenedorGestionProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 97, Short.MAX_VALUE)
        );

        contenedorTablaProveedores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout contenedorTablaProveedoresLayout = new javax.swing.GroupLayout(contenedorTablaProveedores);
        contenedorTablaProveedores.setLayout(contenedorTablaProveedoresLayout);
        contenedorTablaProveedoresLayout.setHorizontalGroup(
            contenedorTablaProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
        );
        contenedorTablaProveedoresLayout.setVerticalGroup(
            contenedorTablaProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout contenedorProveedoresLayout = new javax.swing.GroupLayout(contenedorProveedores);
        contenedorProveedores.setLayout(contenedorProveedoresLayout);
        contenedorProveedoresLayout.setHorizontalGroup(
            contenedorProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorTablaProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contenedorGestionProveedores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contenedorProveedoresLayout.setVerticalGroup(
            contenedorProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorProveedoresLayout.createSequentialGroup()
                .addComponent(contenedorTablaProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorGestionProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Proveedores", contenedorProveedores);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 634, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 383, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab3", jPanel3);

        javax.swing.GroupLayout contenedorPrincipalLayout = new javax.swing.GroupLayout(contenedorPrincipal);
        contenedorPrincipal.setLayout(contenedorPrincipalLayout);
        contenedorPrincipalLayout.setHorizontalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
        );
        contenedorPrincipalLayout.setVerticalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenedorPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenedorPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed
        // TODO add your handling code here:

        //obtengo la fila seleccionada
        int rowSeleccionada = this.tablaPiezas.getSelectedRow();

        // compruebo que el usuario haya elegido alguna fila
        if (rowSeleccionada == -1) {

            JOptionPane.showMessageDialog(null, "SELECCIONE UNA FILA");

        } else {

            // obtengo los datos de la fila
            String cod = this.tablaPiezas.getModel().getValueAt(rowSeleccionada, 0).toString();
            String n = this.tablaPiezas.getModel().getValueAt(rowSeleccionada, 1).toString();
            String p = this.tablaPiezas.getModel().getValueAt(rowSeleccionada, 2).toString();
            String d = this.tablaPiezas.getModel().getValueAt(rowSeleccionada, 3).toString();

            // elimino del modelo la row
            this.modeloTablaPiezas.eliminarPieza(rowSeleccionada);

            // creo el objeto
            Piezas pieza = new Piezas(cod, n, Float.parseFloat(p), d);

            // borro de la bd la pieza
            pieza.borrarPieza(pieza);

        }


    }//GEN-LAST:event_eliminarButtonActionPerformed

    private void actualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarButtonActionPerformed
        // TODO add your handling code here:

        //obtengo la fila seleccionada
        int rowSeleccionada = this.tablaPiezas.getSelectedRow();

        // compruebo que una celda esté seleccionada
        if(rowSeleccionada>=0){

            //obtengo los valores de la fila que se está editando
            String cod = this.tablaPiezas.getValueAt(rowSeleccionada, 0).toString();
            String n = this.tablaPiezas.getValueAt(rowSeleccionada, 1).toString();
            String p = this.tablaPiezas.getValueAt(rowSeleccionada, 2).toString();
            String d = this.tablaPiezas.getValueAt(rowSeleccionada, 3).toString();

            // actualizo la lista de piezas del table model y po lo tanto la fila en el Jtable
            this.tablaPiezas.getModel().setValueAt(cod, rowSeleccionada, 0);
            this.tablaPiezas.getModel().setValueAt(n, rowSeleccionada, 1);
            this.tablaPiezas.getModel().setValueAt(p, rowSeleccionada, 2);
            this.tablaPiezas.getModel().setValueAt(d, rowSeleccionada, 3);




            float price = Float.valueOf(p);

            Piezas nuevaPieza = new Piezas(cod,n,price,d);


            //actualizo la pieza en la bd
            nuevaPieza.modificarPieza(nuevaPieza);






        }else{

            JOptionPane.showMessageDialog(null, "SELECCIONE UNA FILA ");
        }
    }//GEN-LAST:event_actualizarButtonActionPerformed

    private void nuevaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaButtonActionPerformed
        // TODO add your handling code here:


        String code = textFieldCodigoPieza.getText();
        String name = textFieldNombre.getText();
        String price = textFieldPrecio.getText();
        String description = textFieldDescripcion.getText();

        if(code.equalsIgnoreCase("")||name.equals("")
                ||price.equals("")||description.equals("") ){

            JOptionPane.showMessageDialog(null, "Introduzca todos los campos");
        }else {

            float p = Float.valueOf(price);



            Piezas nuevaPieza = new Piezas(code,name,p,description);


            // inserto la nueva pieza en la bd
            nuevaPieza.insertarPieza(nuevaPieza);

            // limpio los textfields
            limpiarTextfields();

            // inserto en la jtable
           this.modeloTablaPiezas.adicionarPieza(nuevaPieza);

        }
    }//GEN-LAST:event_nuevaButtonActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarButton;
    private javax.swing.JPanel contenedorGestionProveedores;
    private javax.swing.JPanel contenedorPiezas;
    private javax.swing.JPanel contenedorPiezasControl;
    private javax.swing.JPanel contenedorPrincipal;
    private javax.swing.JPanel contenedorProveedores;
    private javax.swing.JPanel contenedorTablaProveedores;
    private javax.swing.JButton eliminarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton nuevaButton;
    private javax.swing.JTable tablaPiezas;
    private javax.swing.JTextField textFieldCodigoPieza;
    private javax.swing.JTextField textFieldDescripcion;
    private javax.swing.JTextField textFieldNombre;
    private javax.swing.JTextField textFieldPrecio;
    // End of variables declaration//GEN-END:variables

    private ModeloTablaPiezas modeloTablaPiezas;



    // metodos personales
     // metod to clean textFields
    public void limpiarTextfields(){

         textFieldCodigoPieza.setText("");
         textFieldNombre.setText("");
         textFieldPrecio.setText("");
         textFieldDescripcion.setText("");


    }

    
}
