
package Vista;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Opcion extends javax.swing.JFrame {

    int xMouse,yMouse;
    
    Color c1 = new Color(0, 120, 174);
    Color c2 = new Color(45, 131, 14);
    Color cv1 = new Color(194,218,220);
    Color cv2 = new Color(209,236,239);
    Color cv3 = new Color(168,191,191);
    public Opcion() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlHeader = new javax.swing.JPanel();
        pnlExit = new javax.swing.JPanel();
        lblCerrar = new javax.swing.JLabel();
        pnlAtras = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnHecho = new javax.swing.JButton();
        btnPendiente = new javax.swing.JButton();
        btnPacientes = new javax.swing.JButton();
        btnCopia = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(194, 218, 220));

        pnlHeader.setBackground(new java.awt.Color(194, 218, 220));
        pnlHeader.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlHeaderMouseDragged(evt);
            }
        });
        pnlHeader.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlHeaderMousePressed(evt);
            }
        });

        pnlExit.setBackground(new java.awt.Color(194, 218, 220));

        lblCerrar.setBackground(new java.awt.Color(255, 255, 255));
        lblCerrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCerrar.setForeground(new java.awt.Color(0, 0, 0));
        lblCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCerrar.setText("X");
        lblCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCerrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlExitLayout = new javax.swing.GroupLayout(pnlExit);
        pnlExit.setLayout(pnlExitLayout);
        pnlExitLayout.setHorizontalGroup(
            pnlExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );
        pnlExitLayout.setVerticalGroup(
            pnlExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlAtras.setBackground(new java.awt.Color(194, 218, 220));
        pnlAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlAtrasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlAtrasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlAtrasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlAtrasMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlAtrasMouseReleased(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Back.png"))); // NOI18N

        javax.swing.GroupLayout pnlAtrasLayout = new javax.swing.GroupLayout(pnlAtras);
        pnlAtras.setLayout(pnlAtrasLayout);
        pnlAtrasLayout.setHorizontalGroup(
            pnlAtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );
        pnlAtrasLayout.setVerticalGroup(
            pnlAtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAtrasLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeaderLayout.createSequentialGroup()
                .addComponent(pnlAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnHecho.setBackground(new java.awt.Color(212, 212, 148));
        btnHecho.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHecho.setForeground(new java.awt.Color(0, 0, 0));
        btnHecho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pendientes.png"))); // NOI18N
        btnHecho.setText("Citas Realizadas");
        btnHecho.setBorder(null);
        btnHecho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHecho.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHecho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHechoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHechoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHechoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnHechoMouseReleased(evt);
            }
        });
        btnHecho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHechoActionPerformed(evt);
            }
        });

        btnPendiente.setBackground(new java.awt.Color(212, 212, 148));
        btnPendiente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPendiente.setForeground(new java.awt.Color(0, 0, 0));
        btnPendiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pendiente.png"))); // NOI18N
        btnPendiente.setText("Citas Pendientes");
        btnPendiente.setBorder(null);
        btnPendiente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPendiente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pendiente.png"))); // NOI18N
        btnPendiente.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pendiente.png"))); // NOI18N
        btnPendiente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPendiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPendienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPendienteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPendienteMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnPendienteMouseReleased(evt);
            }
        });
        btnPendiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPendienteActionPerformed(evt);
            }
        });

        btnPacientes.setBackground(new java.awt.Color(212, 212, 148));
        btnPacientes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPacientes.setForeground(new java.awt.Color(0, 0, 0));
        btnPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/paciente.png"))); // NOI18N
        btnPacientes.setText("Pacientes");
        btnPacientes.setBorder(null);
        btnPacientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPacientes.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/paciente.png"))); // NOI18N
        btnPacientes.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/paciente.png"))); // NOI18N
        btnPacientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPacientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPacientesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPacientesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnPacientesMouseReleased(evt);
            }
        });
        btnPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacientesActionPerformed(evt);
            }
        });

        btnCopia.setBackground(new java.awt.Color(212, 212, 148));
        btnCopia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCopia.setForeground(new java.awt.Color(0, 0, 0));
        btnCopia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Copia.png"))); // NOI18N
        btnCopia.setText("Copia");
        btnCopia.setBorder(null);
        btnCopia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCopia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCopia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCopiaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCopiaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCopiaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCopiaMouseReleased(evt);
            }
        });
        btnCopia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiaActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ubicacion.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/informacion.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHecho, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPendiente, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCopia, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnHecho, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPendiente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCopia, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))
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

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void lblCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseEntered
        pnlExit.setBackground(Color.RED);
    }//GEN-LAST:event_lblCerrarMouseEntered

    private void lblCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseExited
        Color c = new Color(194,218,220);
        pnlExit.setBackground(c);
    }//GEN-LAST:event_lblCerrarMouseExited

    private void pnlHeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_pnlHeaderMouseDragged

    private void pnlHeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHeaderMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_pnlHeaderMousePressed

    private void btnHechoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHechoActionPerformed
        try {
            Vista_Citas ci = new Vista_Citas();
            ci.setVisible(true);
            this.setVisible(false);
        } catch (IOException ex) {
            System.err.println("Error: "+ex);
            JOptionPane.showMessageDialog(null,"Error: "+ex);
        }
    }//GEN-LAST:event_btnHechoActionPerformed

    private void btnHechoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHechoMousePressed
        
       // btnHecho.setForeground(c2);
    }//GEN-LAST:event_btnHechoMousePressed

    private void btnHechoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHechoMouseExited
        //btnHecho.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnHechoMouseExited

    private void btnHechoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHechoMouseReleased

        //btnHecho.setForeground(c1);
    }//GEN-LAST:event_btnHechoMouseReleased

    private void btnHechoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHechoMouseEntered
        
       // btnHecho.setForeground(c1);
    }//GEN-LAST:event_btnHechoMouseEntered

    private void btnPendienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPendienteMouseEntered

        //btnPendiente.setForeground(c1);
    }//GEN-LAST:event_btnPendienteMouseEntered

    private void btnPendienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPendienteMouseExited
        //btnPendiente.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnPendienteMouseExited

    private void btnPendienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPendienteMousePressed

        //btnPendiente.setForeground(c2);
    }//GEN-LAST:event_btnPendienteMousePressed

    private void btnPendienteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPendienteMouseReleased

        //btnPendiente.setForeground(c1);
    }//GEN-LAST:event_btnPendienteMouseReleased

    private void btnPendienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPendienteActionPerformed
        try {
            Pendientes ven = new Pendientes();
            ven.setVisible(true);
            this.setVisible(false);
        } catch (IOException ex) {
            System.err.println("Error: "+ex);
        }
    }//GEN-LAST:event_btnPendienteActionPerformed

    private void btnPacientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPacientesMouseEntered
        //btnPendiente.setForeground(c1);
    }//GEN-LAST:event_btnPacientesMouseEntered

    private void btnPacientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPacientesMouseExited
       // btnPendiente.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnPacientesMouseExited

    private void btnPacientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPacientesMousePressed
       // btnPendiente.setForeground(c2);
    }//GEN-LAST:event_btnPacientesMousePressed

    private void btnPacientesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPacientesMouseReleased
        //btnPendiente.setForeground(c1);
    }//GEN-LAST:event_btnPacientesMouseReleased

    private void btnPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacientesActionPerformed
        try {
            Vista_Paciente pa = new Vista_Paciente();
            pa.setVisible(true);
            this.setVisible(false);
        } catch (IOException ex) {
            System.err.println("Error: "+ex);
            JOptionPane.showMessageDialog(null,"Error: "+ex);
        }
    }//GEN-LAST:event_btnPacientesActionPerformed

    private void pnlAtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAtrasMouseEntered
        pnlAtras.setBackground(cv2);
    }//GEN-LAST:event_pnlAtrasMouseEntered

    private void pnlAtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAtrasMouseExited
         pnlAtras.setBackground(cv1);
    }//GEN-LAST:event_pnlAtrasMouseExited

    private void pnlAtrasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAtrasMousePressed
        pnlAtras.setBackground(cv3);
    }//GEN-LAST:event_pnlAtrasMousePressed

    private void pnlAtrasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAtrasMouseReleased
        pnlAtras.setBackground(cv2);
    }//GEN-LAST:event_pnlAtrasMouseReleased

    private void pnlAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAtrasMouseClicked
        Inicio ven = new Inicio();
        ven.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_pnlAtrasMouseClicked

    private void btnCopiaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCopiaMouseEntered

    }//GEN-LAST:event_btnCopiaMouseEntered

    private void btnCopiaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCopiaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCopiaMouseExited

    private void btnCopiaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCopiaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCopiaMousePressed

    private void btnCopiaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCopiaMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCopiaMouseReleased

    private void btnCopiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiaActionPerformed
        String userHome = System.getProperty("user.home");
        String desktopPath = userHome + File.separator + "Desktop";
        
        File archivoPacientes = new File("pacientes.txt");
        File archivoCitas = new File("citas.txt");
        
        
        File destinoPacientes = new File(desktopPath + File.separator + archivoPacientes.getName());
        File destinoCitas = new File(desktopPath + File.separator + archivoCitas.getName());

        try {
            // Copiar archivos
            copiarArchivo(archivoPacientes, destinoPacientes);
            copiarArchivo(archivoCitas, destinoCitas);
            JOptionPane.showMessageDialog(null,"Archivos copiados a su escritorio");
        } catch (IOException ex) {
            System.err.println("Error: "+ex);
            JOptionPane.showMessageDialog(null,"Error: "+ex);
        }
        
    }//GEN-LAST:event_btnCopiaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(null,"--------------------------------------------------------------------------------INFORMACION--------------------------------------------------------------------------------\n"
                                                       + "1) Si quiere cambiar su usuario o contrasñe,a debe modificar el archivo llamado 'usuario.txt'.\n"
                                                       + "2) Si quiere acceder a la ubicacion del archivo, presione el boton ubicado en la esquina inferior izquierda.\n"
                                                       + "3) Si quiere modificar el archivo de texto de los pacientes o citas, porfavor hacer una copia de respaldo primero.\n"
                                                       + "4) Si el programa no funciona despues de modificar los archivos de texto, solo reemplazelos con su copia de reespaldo.\n"
                                                        + "\n\nCreado por: POCZ");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // Obtener el directorio actual donde se está ejecutando el programa
            String rutaDirectorio = new File(".").getCanonicalPath();

            File directorio = new File(rutaDirectorio);

            // Verificar si el directorio existe
            if (directorio.exists() && directorio.isDirectory()) {
                // Abrir el explorador de archivos en la ubicación del ejecutable
                Desktop.getDesktop().open(directorio);
                System.out.println("Abriendo la ubicación del ejecutable: " + rutaDirectorio);
            } else {
                System.out.println("El directorio especificado no existe.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void copiarArchivo(File origen, File destino) throws IOException {
        if (origen.exists()) {
            Files.copy(origen.toPath(), destino.toPath(), StandardCopyOption.REPLACE_EXISTING);
            
        } else {
            
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(Opcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Opcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Opcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Opcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Opcion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCopia;
    private javax.swing.JButton btnHecho;
    private javax.swing.JButton btnPacientes;
    private javax.swing.JButton btnPendiente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JPanel pnlAtras;
    private javax.swing.JPanel pnlExit;
    private javax.swing.JPanel pnlHeader;
    // End of variables declaration//GEN-END:variables
}
