package Vista;
import Controlador.Controlador_Pacientes;
import Modelo.Pacientes;
import java.awt.Color;
import java.io.IOException;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Lista_Pacientes extends javax.swing.JFrame {

    Color c1 = new Color(145, 196, 207);
    Color c2 = new Color(133, 178, 189);
    Color c3 = new Color(114, 152, 161);
    Controlador_Pacientes con_pacientes = new Controlador_Pacientes();
    Pacientes p_seleccionado = new Pacientes();
    String titulo[]={"Id","Nombre","Apellido","Celular"};
    DefaultTableModel modelo= new DefaultTableModel(null,titulo);
    
    //Ordenar
    TableRowSorter<TableModel> sorter;
    
    //[1 -> Pendientes] [2 -> Vista_Citas]
    public static int enviar=0;
    
    //si la tabla fue seleccionada
    boolean bandera = false;

    public Lista_Pacientes() throws IOException {
        initComponents();
        this.setLocationRelativeTo(null);
        Iniciar();
        
        //Ordenar el ID por numero:
        sorter = new TableRowSorter<>(modelo);
            sorter.setComparator(0, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return Integer.compare(o1, o2);
                }
            });
        
        tabla.setRowSorter(sorter);
        //tabla.setAutoCreateRowSorter(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JScroll = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        pnlCancelar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        pnlAceptar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lblPaciente = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(194, 218, 220));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla.setModel(modelo);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        JScroll.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setPreferredWidth(17);
        }

        pnlCancelar.setBackground(new java.awt.Color(133, 178, 189));
        pnlCancelar.setForeground(new java.awt.Color(255, 255, 255));
        pnlCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlCancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlCancelarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlCancelarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlCancelarMouseReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CANCELAR");

        javax.swing.GroupLayout pnlCancelarLayout = new javax.swing.GroupLayout(pnlCancelar);
        pnlCancelar.setLayout(pnlCancelarLayout);
        pnlCancelarLayout.setHorizontalGroup(
            pnlCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
        );
        pnlCancelarLayout.setVerticalGroup(
            pnlCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCancelarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlAceptar.setBackground(new java.awt.Color(133, 178, 189));
        pnlAceptar.setForeground(new java.awt.Color(255, 255, 255));
        pnlAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlAceptarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlAceptarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlAceptarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlAceptarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlAceptarMouseReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ACEPTAR");

        javax.swing.GroupLayout pnlAceptarLayout = new javax.swing.GroupLayout(pnlAceptar);
        pnlAceptar.setLayout(pnlAceptarLayout);
        pnlAceptarLayout.setHorizontalGroup(
            pnlAceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
        );
        pnlAceptarLayout.setVerticalGroup(
            pnlAceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAceptarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblPaciente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPaciente.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/paciente.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                        .addGap(158, 158, 158))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(pnlCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCancelarMouseClicked
        this.setVisible(false);
        
    }//GEN-LAST:event_pnlCancelarMouseClicked

    private void pnlCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCancelarMouseEntered
        pnlCancelar.setBackground(c1);
    }//GEN-LAST:event_pnlCancelarMouseEntered

    private void pnlCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCancelarMouseExited
        pnlCancelar.setBackground(c2);
    }//GEN-LAST:event_pnlCancelarMouseExited

    private void pnlCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCancelarMousePressed
        pnlCancelar.setBackground(c3);
    }//GEN-LAST:event_pnlCancelarMousePressed

    private void pnlCancelarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCancelarMouseReleased

        pnlCancelar.setBackground(c2);
    }//GEN-LAST:event_pnlCancelarMouseReleased

    private void pnlAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAceptarMouseClicked
        
        if(bandera==true && enviar==1){
            Pendientes.p_cita = p_seleccionado;
            Pendientes.txtNombre.setText(p_seleccionado.getNombre());
            Pendientes.txtApellido.setText(p_seleccionado.getApellido());
            Pendientes.txtNumero.setText(p_seleccionado.getNumero());
            Pendientes.lblId.setText(p_seleccionado.getId()+"");
            this.setVisible(false);
        } else if(bandera==true && enviar==2) {
            Vista_Citas.id_paciente = p_seleccionado.getId();
        } else {
            lblPaciente.setForeground(Color.RED);
            lblPaciente.setText("Paciente no seleccionado");
        }
    }//GEN-LAST:event_pnlAceptarMouseClicked

    private void pnlAceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAceptarMouseEntered
          pnlAceptar.setBackground(c1);
    }//GEN-LAST:event_pnlAceptarMouseEntered

    private void pnlAceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAceptarMouseExited
         pnlAceptar.setBackground(c2);
    }//GEN-LAST:event_pnlAceptarMouseExited

    private void pnlAceptarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAceptarMousePressed
        pnlAceptar.setBackground(c3);
    }//GEN-LAST:event_pnlAceptarMousePressed

    private void pnlAceptarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAceptarMouseReleased
        pnlAceptar.setBackground(c2);
    }//GEN-LAST:event_pnlAceptarMouseReleased

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
       int fila=tabla.getSelectedRow();
        
       p_seleccionado.setId(Integer.parseInt(tabla.getValueAt(fila, 0).toString()));
       p_seleccionado.setNombre(tabla.getValueAt(fila, 1).toString());
       p_seleccionado.setApellido(tabla.getValueAt(fila, 2).toString());
       p_seleccionado.setNumero(tabla.getValueAt(fila, 3).toString());
       lblPaciente.setText("Paciente: "+p_seleccionado.getNombre()+" "+p_seleccionado.getApellido());
       lblPaciente.setForeground(Color.BLACK);
       bandera = true;
       
    }//GEN-LAST:event_tablaMouseClicked

    public void Iniciar() throws IOException{
        
        LlenarTabla();

    }
    
    public void LlenarTabla() throws IOException{
        modelo = con_pacientes.LlenatTablaLista_Pacientes(titulo);
        tabla.setModel(modelo);
        
        
    }
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
            java.util.logging.Logger.getLogger(Lista_Pacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lista_Pacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lista_Pacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lista_Pacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Lista_Pacientes().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Lista_Pacientes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JScroll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPaciente;
    private javax.swing.JPanel pnlAceptar;
    private javax.swing.JPanel pnlCancelar;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
