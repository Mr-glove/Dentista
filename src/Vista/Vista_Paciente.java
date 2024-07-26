package Vista;
import Controlador.Controlador_Pacientes;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import Modelo.Pacientes;
import static Vista.Pendientes.modelo;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
public class Vista_Paciente extends javax.swing.JFrame {

    int xMouse,yMouse;
    Controlador_Pacientes con_pacientes = new Controlador_Pacientes();
    Color c1 = new Color(145, 196, 207);
    Color c2 = new Color(133, 178, 189);
    Color c3 = new Color(114, 152, 161);
    Color cv1 = new Color(194,218,220);
    Color cv2 = new Color(209,236,239);
    Color cv3 = new Color(168,191,191);
    static String titulo[]={"Id","Nombre","Apellido","Celular"};
    public static DefaultTableModel modelo= new DefaultTableModel(null,titulo);
    
    //Ordenar
    TableRowSorter<TableModel> sorter;
    
    
    public Vista_Paciente() throws IOException {
        initComponents();
        this.setLocationRelativeTo(null);
        Iniciar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        pnlHeader = new javax.swing.JPanel();
        pnlExit = new javax.swing.JPanel();
        lblCerrar = new javax.swing.JLabel();
        pnlAtras = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblUsuario1 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lblUsuario2 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        pnlNuevoPaciente = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        pnlEditarPaciente = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pnlEliminarPaciente = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

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
            .addComponent(lblCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );
        pnlExitLayout.setVerticalGroup(
            pnlExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
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

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Back.png"))); // NOI18N

        javax.swing.GroupLayout pnlAtrasLayout = new javax.swing.GroupLayout(pnlAtras);
        pnlAtras.setLayout(pnlAtrasLayout);
        pnlAtrasLayout.setHorizontalGroup(
            pnlAtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );
        pnlAtrasLayout.setVerticalGroup(
            pnlAtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(pnlAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cita.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jPanel2.setBackground(new java.awt.Color(194, 218, 220));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblUsuario.setBackground(new java.awt.Color(255, 255, 255));
        lblUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario.setText("Nombre");

        txtNombre.setBackground(new java.awt.Color(194, 218, 220));
        txtNombre.setForeground(new java.awt.Color(51, 51, 51));
        txtNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblUsuario1.setBackground(new java.awt.Color(255, 255, 255));
        lblUsuario1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblUsuario1.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario1.setText("Apellido");

        txtApellido.setBackground(new java.awt.Color(194, 218, 220));
        txtApellido.setForeground(new java.awt.Color(51, 51, 51));
        txtApellido.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblUsuario2.setBackground(new java.awt.Color(255, 255, 255));
        lblUsuario2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblUsuario2.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario2.setText("Numero");

        txtNumero.setBackground(new java.awt.Color(194, 218, 220));
        txtNumero.setForeground(new java.awt.Color(51, 51, 51));
        txtNumero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("ID:");

        lblId.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(txtApellido)
                    .addComponent(txtNumero)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuario)
                            .addComponent(lblUsuario1)
                            .addComponent(lblUsuario2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuario1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuario2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Datos del paciente");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

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
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        pnlNuevoPaciente.setBackground(new java.awt.Color(133, 178, 189));
        pnlNuevoPaciente.setForeground(new java.awt.Color(255, 255, 255));
        pnlNuevoPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlNuevoPacienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlNuevoPacienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlNuevoPacienteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlNuevoPacienteMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlNuevoPacienteMouseReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("NUEVO PACIENTE");

        javax.swing.GroupLayout pnlNuevoPacienteLayout = new javax.swing.GroupLayout(pnlNuevoPaciente);
        pnlNuevoPaciente.setLayout(pnlNuevoPacienteLayout);
        pnlNuevoPacienteLayout.setHorizontalGroup(
            pnlNuevoPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlNuevoPacienteLayout.setVerticalGroup(
            pnlNuevoPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNuevoPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlEditarPaciente.setBackground(new java.awt.Color(133, 178, 189));
        pnlEditarPaciente.setForeground(new java.awt.Color(255, 255, 255));
        pnlEditarPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlEditarPacienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlEditarPacienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlEditarPacienteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlEditarPacienteMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlEditarPacienteMouseReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("EDITAR PACIENTE");

        javax.swing.GroupLayout pnlEditarPacienteLayout = new javax.swing.GroupLayout(pnlEditarPaciente);
        pnlEditarPaciente.setLayout(pnlEditarPacienteLayout);
        pnlEditarPacienteLayout.setHorizontalGroup(
            pnlEditarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlEditarPacienteLayout.setVerticalGroup(
            pnlEditarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEditarPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlEliminarPaciente.setBackground(new java.awt.Color(133, 178, 189));
        pnlEliminarPaciente.setForeground(new java.awt.Color(255, 255, 255));
        pnlEliminarPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlEliminarPacienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlEliminarPacienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlEliminarPacienteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlEliminarPacienteMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlEliminarPacienteMouseReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("ELIMINAR PACIENTE");

        javax.swing.GroupLayout pnlEliminarPacienteLayout = new javax.swing.GroupLayout(pnlEliminarPaciente);
        pnlEliminarPaciente.setLayout(pnlEliminarPacienteLayout);
        pnlEliminarPacienteLayout.setHorizontalGroup(
            pnlEliminarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlEliminarPacienteLayout.setVerticalGroup(
            pnlEliminarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEliminarPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblError.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlEditarPaciente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlNuevoPaciente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlEliminarPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblError, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(246, 246, 246)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(207, 207, 207)
                                .addComponent(jLabel2)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlNuevoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlEditarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlEliminarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void pnlNuevoPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNuevoPacienteMouseClicked
        lblError.setText("");
        if(txtNombre.getText().equals("") || txtApellido.getText().equals("") || txtNumero.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Tiene datos faltantes, en caso de que no tenga rellenelo con un espacio");
        } else {
            try {
            List<Pacientes> pacientes = con_pacientes.leerPacientes();
            if(pacientes.isEmpty()){
                Pacientes p = new Pacientes(txtNombre.getText(),txtApellido.getText(),txtNumero.getText(),1);
                con_pacientes.crearPaciente(p);
            }
            else{
                int id = pacientes.get(pacientes.size()-1).getId()+1;
                Pacientes p = new Pacientes(txtNombre.getText(),txtApellido.getText(),txtNumero.getText(),id);
                con_pacientes.crearPaciente(p);
            }
            LlenarTabla();
            } catch (IOException ex) {
                System.out.println("Error: "+ex);
            }
        }
        Limpiar();
    }//GEN-LAST:event_pnlNuevoPacienteMouseClicked

    private void pnlNuevoPacienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNuevoPacienteMouseEntered
        pnlNuevoPaciente.setBackground(c1);
    }//GEN-LAST:event_pnlNuevoPacienteMouseEntered

    private void pnlNuevoPacienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNuevoPacienteMouseExited
        pnlNuevoPaciente.setBackground(c2);
    }//GEN-LAST:event_pnlNuevoPacienteMouseExited

    private void pnlNuevoPacienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNuevoPacienteMousePressed
        pnlNuevoPaciente.setBackground(c3);
    }//GEN-LAST:event_pnlNuevoPacienteMousePressed

    private void pnlNuevoPacienteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNuevoPacienteMouseReleased

        pnlNuevoPaciente.setBackground(c2);
    }//GEN-LAST:event_pnlNuevoPacienteMouseReleased

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int fila=tabla.getSelectedRow();
        txtNombre.setText(tabla.getValueAt(fila,1).toString());
        txtApellido.setText(tabla.getValueAt(fila, 2).toString());
        txtNumero.setText(tabla.getValueAt(fila,3).toString());
        lblId.setText(tabla.getValueAt(fila,0).toString());
    }//GEN-LAST:event_tablaMouseClicked

    private void pnlEditarPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlEditarPacienteMouseClicked
        Pacientes p = new Pacientes();
        if(lblId.getText().equals("")){
            lblError.setText("No selecciono un paciente");
        } else {
            p.setId(Integer.parseInt(lblId.getText()));
            p.setNombre(txtNombre.getText());
            p.setApellido(txtApellido.getText());
            p.setNumero(txtNumero.getText());
            lblError.setText("");
            try {
                con_pacientes.actualizarPaciente(p);
                LlenarTabla();
            } catch (IOException ex) {
                System.err.println("Error: "+ex);;
            }
        }
        Limpiar();
    }//GEN-LAST:event_pnlEditarPacienteMouseClicked

    private void pnlEditarPacienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlEditarPacienteMouseEntered
        pnlEditarPaciente.setBackground(c1);
    }//GEN-LAST:event_pnlEditarPacienteMouseEntered

    private void pnlEditarPacienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlEditarPacienteMouseExited
        pnlEditarPaciente.setBackground(c2);
    }//GEN-LAST:event_pnlEditarPacienteMouseExited

    private void pnlEditarPacienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlEditarPacienteMousePressed
        pnlEditarPaciente.setBackground(c3);
    }//GEN-LAST:event_pnlEditarPacienteMousePressed

    private void pnlEditarPacienteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlEditarPacienteMouseReleased
        pnlEditarPaciente.setBackground(c2);
    }//GEN-LAST:event_pnlEditarPacienteMouseReleased

    private void pnlEliminarPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlEliminarPacienteMouseClicked

        
        if(lblId.getText().equals("")){
            lblError.setText("No selecciono un paciente");
        } else {
            lblError.setText("");
            try {
                con_pacientes.borrarPaciente(Integer.parseInt(lblId.getText()));
                System.out.println("id: "+lblError.getText());
                LlenarTabla();
            } catch (IOException ex) {
                System.err.println("Error: "+ex);
            }
        }
        Limpiar();
    }//GEN-LAST:event_pnlEliminarPacienteMouseClicked

    private void pnlEliminarPacienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlEliminarPacienteMouseEntered
        pnlEliminarPaciente.setBackground(c1);
    }//GEN-LAST:event_pnlEliminarPacienteMouseEntered

    private void pnlEliminarPacienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlEliminarPacienteMouseExited
        pnlEliminarPaciente.setBackground(c2);
    }//GEN-LAST:event_pnlEliminarPacienteMouseExited

    private void pnlEliminarPacienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlEliminarPacienteMousePressed
        pnlEliminarPaciente.setBackground(c3);
    }//GEN-LAST:event_pnlEliminarPacienteMousePressed

    private void pnlEliminarPacienteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlEliminarPacienteMouseReleased

            pnlEliminarPaciente.setBackground(c2);
    }//GEN-LAST:event_pnlEliminarPacienteMouseReleased

    private void pnlAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAtrasMouseClicked
        Opcion ven = new Opcion();
        ven.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_pnlAtrasMouseClicked

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

    private void Iniciar() throws IOException{
        LlenarTabla();
        
        //Ordenar el ID por numero:
        sorter = new TableRowSorter<>(modelo);
            sorter.setComparator(0, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return Integer.compare(o1, o2);
                }
            });
            
        tabla.setRowSorter(sorter);
        
    }
    public void Limpiar(){
        txtNombre.setText("");
        txtApellido.setText("");
        txtNumero.setText("");
        lblId.setText("");
    }
    
    private void LlenarTabla() throws IOException{
        if(modelo == null){
            
        } else {
            modelo = con_pacientes.LlenatTablaLista_Pacientes(titulo);
        
            tabla.setModel(modelo);
            TableColumnModel columnModel = tabla.getColumnModel();
            TableColumn column = columnModel.getColumn(0);
            column.setPreferredWidth(30);
        }
        
                
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
            java.util.logging.Logger.getLogger(Vista_Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Vista_Paciente().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Vista_Paciente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblUsuario1;
    private javax.swing.JLabel lblUsuario2;
    private javax.swing.JPanel pnlAtras;
    private javax.swing.JPanel pnlEditarPaciente;
    private javax.swing.JPanel pnlEliminarPaciente;
    private javax.swing.JPanel pnlExit;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlNuevoPaciente;
    public javax.swing.JTable tabla;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
