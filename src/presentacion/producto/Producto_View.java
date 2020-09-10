/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.producto;

import java.util.Observable;
import java.util.Observer;
import logica.Producto;
import presentacion.Producto_TableModel;

/**
 *
 * @author Daniel
 */
public class Producto_View extends javax.swing.JInternalFrame implements Observer {

    /**
     * Creates new form NewJFrame
     */
    public Producto_View() {
       initComponents();
       this.setLocation(100, 100);
       this.getContentPane().setBackground(new java.awt.Color(204, 255, 204));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloJLabel = new javax.swing.JLabel();
        Label_Detalle = new javax.swing.JLabel();
        Label_Unidad = new javax.swing.JLabel();
        Label_Codigo = new javax.swing.JLabel();
        Label_Precio = new javax.swing.JLabel();
        Button_Agregar = new javax.swing.JButton();
        Textfield_Detalle = new javax.swing.JTextField();
        Textfield_Unidad = new javax.swing.JTextField();
        Textfield_Codigo = new javax.swing.JTextField();
        Textfield_Precio = new javax.swing.JTextField();
        Label_Buscar = new javax.swing.JLabel();
        Textfield_Buscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Productos = new javax.swing.JTable();
        buscajButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 0, 204));
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        tituloJLabel.setFont(new java.awt.Font("Rockwell", 3, 36)); // NOI18N
        tituloJLabel.setText("Resgistro producto");

        Label_Detalle.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        Label_Detalle.setText("Detalle:");

        Label_Unidad.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        Label_Unidad.setText("Tipo de unidad:");

        Label_Codigo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        Label_Codigo.setText("Código:");

        Label_Precio.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        Label_Precio.setText("Precio unitario:");

        Button_Agregar.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        Button_Agregar.setText("Agregar");
        Button_Agregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_AgregarActionPerformed(evt);
            }
        });

        Textfield_Detalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Textfield_DetalleActionPerformed(evt);
            }
        });

        Label_Buscar.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        Label_Buscar.setText("Buscar por detalle:");

        Table_Productos.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        Table_Productos.setModel(new javax.swing.table.DefaultTableModel(
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
        Table_Productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_ProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table_Productos);

        buscajButton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        buscajButton.setText("Buscar");
        buscajButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buscajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscajButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_Precio)
                            .addComponent(Label_Codigo)
                            .addComponent(Label_Unidad)
                            .addComponent(Label_Detalle))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Textfield_Precio)
                            .addComponent(Textfield_Codigo)
                            .addComponent(Textfield_Unidad)
                            .addComponent(Textfield_Detalle, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(Button_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloJLabel)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Label_Buscar)
                        .addGap(18, 18, 18)
                        .addComponent(Textfield_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buscajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(214, 214, 214))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(buscajButton)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_Buscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tituloJLabel)
                                .addComponent(Textfield_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_Detalle)
                            .addComponent(Textfield_Detalle, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Textfield_Unidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_Unidad))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_Codigo)
                            .addComponent(Textfield_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_Precio)
                            .addComponent(Textfield_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(Button_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_AgregarActionPerformed
          if( Textfield_Detalle.getText().isEmpty() || Textfield_Codigo.getText().isEmpty() /*|| Textfield_Precio.getText().isEmpty()*/) return; //
       Producto producto = new Producto();
       producto.setDetalle(Textfield_Detalle.getText());
       producto.setCodigo(Textfield_Codigo.getText());
       //producto.setPrecio_unitario(Textfield_Precio.getText());                                                                            //
       control.agregar(producto);
    }//GEN-LAST:event_Button_AgregarActionPerformed

    private void Table_ProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_ProductosMouseClicked
            if(evt.getClickCount()==2){
            control.seleccionar(Table_Productos.getSelectedRow());
        }
    }//GEN-LAST:event_Table_ProductosMouseClicked

    private void buscajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscajButtonActionPerformed
       Producto filtro= new Producto();
        filtro.setDetalle(Textfield_Buscar.getText());
        control.buscar(filtro);
    }//GEN-LAST:event_buscajButtonActionPerformed

    private void Textfield_DetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Textfield_DetalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Textfield_DetalleActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Producto_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Producto_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Producto_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Producto_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Producto_View().setVisible(true);
            }
        });
    }

    Producto_Control control;
    Producto_Modelo modelo;
    
    public void setControl(Producto_Control control){
        this.control =control;
    }

    public Producto_Control getControl() {
        return control;
    }
    
    public void setModelo(Producto_Modelo modelo){
        this.modelo = modelo;
         modelo.addObserver(this);
    }

    public Producto_Modelo getModelo() {
        return modelo;
    }

    @Override
    public void update(Observable o, Object o1) {
        Producto current = modelo.getCurrent();
        Textfield_Detalle.setText(current.getDetalle());
        Textfield_Codigo.setText(current.getCodigo());
        //Textfield_Precio.setText(current.getPrecio_unitario());
        Table_Productos.setModel(new Producto_TableModel(modelo.getLista()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Agregar;
    private javax.swing.JLabel Label_Buscar;
    private javax.swing.JLabel Label_Codigo;
    private javax.swing.JLabel Label_Detalle;
    private javax.swing.JLabel Label_Precio;
    private javax.swing.JLabel Label_Unidad;
    private javax.swing.JTable Table_Productos;
    private javax.swing.JTextField Textfield_Buscar;
    private javax.swing.JTextField Textfield_Codigo;
    private javax.swing.JTextField Textfield_Detalle;
    private javax.swing.JTextField Textfield_Precio;
    private javax.swing.JTextField Textfield_Unidad;
    private javax.swing.JButton buscajButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel tituloJLabel;
    // End of variables declaration//GEN-END:variables
}
