/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VISTA;

import MODELO.Conexion;
import VISTA.MenuPrincipal;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

/**
 * Esta clase crea la ventana de inventario que permitira ingresar articulos al kardex
 * @author Gilson Efren Cruz Yagual
 * 02/11/2023
 */
public class Inventario extends javax.swing.JFrame {

   private ImageIcon imagen;
   private Icon icono;
   private ImageIcon imagenLupa;
   private Icon iconoLupa;
    
    /**
     *Constructor de form inventario
     */
    public Inventario() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.ajustarImagen(lblLogoEcuaStock,"src/imagenes/logoEcuastock.png");
        this.ajustarImagenBtn(btnBuscarActualizar, "src/imagenes/lupa.png");
        
       
    }
    public void llenarLblNombreUsuario(){
        
        
        
    }
     /**
    * Esta pequeña funcion ajusta nuestro logo al tamaño de la etiqueta
    * @param lbl Etiqueta donde se ajustara la imagen
    * @param ruta ruta recieb ala ruta de la cual se obtendra el logo en png
    */
   public void ajustarImagen(JLabel lbl,String ruta )
    {
        this.imagen= new ImageIcon(ruta);
        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(
                lbl.getWidth(),
                lbl.getHeight(),
                Image.SCALE_DEFAULT)
        );
        lbl.setIcon(this.icono);
        this.repaint();
    }
   
   private void ajustarImagenBtn(JButton btn,String ruta )
    {
        this.imagenLupa= new ImageIcon(ruta);
        this.iconoLupa = new ImageIcon(this.imagenLupa.getImage().getScaledInstance(
                btn.getWidth(),
                btn.getHeight(),
                Image.SCALE_DEFAULT)
        );
        btn.setIcon(this.iconoLupa);
        this.repaint();
    }
   
   private void ajustarAnchoColumna(JTable table) {
    //Se obtiene el modelo de la columna
    TableColumnModel columnModel = table.getColumnModel();
    //Se obtiene el total de las columnas
    for (int column = 0; column < table.getColumnCount(); column++) {
        //Establecemos un valor minimo para el ancho de la columna
        int width = 95; //Min Width
        //Obtenemos el numero de filas de la tabla
        for (int row = 0; row < table.getRowCount(); row++) {
            //Obtenemos el renderizador de la tabla
            TableCellRenderer renderer = table.getCellRenderer(row, column);
            //Creamos un objeto para preparar el renderer
            Component comp = table.prepareRenderer(renderer, row, column);
            //Establecemos el width segun el valor maximo del ancho de la columna
            width = Math.max(comp.getPreferredSize().width + 1, width);

        }
        //Se establece una condicion para no sobrepasar el valor de 300
        //Esto es Opcional
        if (width > 300) {
            width = 300;
            }
        //Se establece el ancho de la columna
        columnModel.getColumn(column).setPreferredWidth(width);
        }
   }
  
    public static DefaultTableModel modeloTablaConsulta(ResultSet rs)throws SQLException
               
        {
             DefaultTableModel model = new DefaultTableModel();

                // Agregar las columnas al modelo.
                model.addColumn("FECHA INGRESO");
                model.addColumn("FECHA SALIDA");   
                model.addColumn("EAN");
                model.addColumn("CODIGO");
                model.addColumn("DESCRIPCION");   
                model.addColumn("VALOR");
                model.addColumn("CANTIDAD");
                model.addColumn("DISPONIBLE");   
                
                    // Agregar las filas al modelo.
                        while (rs.next  ()) {
                        Object[] row = new Object[8];
                        row[0] = rs.getString("FECHA_INGRESO");
                        row[1] = rs.getString("FECHA_SALIDA");
                        row[2] = rs.getString("EAN");
                        row[3] = rs.getString("ID_JUGUETES");
                        row[4] = rs.getString("NOMBRE");
                        row[5] = rs.getString("VALOR");
                        row[6] = rs.getString("CANTIDAD");
                        row[7] = rs.getString("DISPONIBLE");
                        
                        model.addRow(row);
                }
            return model;
        }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bckModuloInv = new javax.swing.JPanel();
        lblLogoEcuaStock = new javax.swing.JLabel();
        pnlBotones = new javax.swing.JPanel();
        btnConsultar = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        pnlDatos = new javax.swing.JPanel();
        lblNombreSucursal = new javax.swing.JLabel();
        jtpInventario = new javax.swing.JTabbedPane();
        pnlConsultar = new javax.swing.JPanel();
        btnOkConsultar = new javax.swing.JButton();
        btnCancelarConsultar = new javax.swing.JButton();
        lblCodigoConsultar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtConsultar = new javax.swing.JTable();
        txtCodigoConsulta = new javax.swing.JTextField();
        lblEanConsultar = new javax.swing.JLabel();
        txtEanConsulta = new javax.swing.JTextField();
        lblFechaInicioConsultar = new javax.swing.JLabel();
        lblFechaFinConsultar = new javax.swing.JLabel();
        lblModuloConsultar = new javax.swing.JLabel();
        jdtFechaInicioConsultar = new com.toedter.calendar.JDateChooser();
        jdtFechaFinConsultar = new com.toedter.calendar.JDateChooser();
        pnlRegistros = new javax.swing.JPanel();
        lblCodigoRegistros = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtRegistros = new javax.swing.JTable();
        lblFechaIngresoRegistros = new javax.swing.JLabel();
        lblEanRegistros = new javax.swing.JLabel();
        lblCantidadRegistros = new javax.swing.JLabel();
        btnOkRegistros = new javax.swing.JButton();
        btnCancelarRegistros = new javax.swing.JButton();
        lblDescripcionRegistros = new javax.swing.JLabel();
        lblCategoriaRegistros = new javax.swing.JLabel();
        txtCategoriaRegistros = new javax.swing.JTextField();
        txtCodigoRegistros = new javax.swing.JTextField();
        txtCantidadRegistros = new javax.swing.JTextField();
        txtDescripcionRegistros = new javax.swing.JTextField();
        txtEanRegistros = new javax.swing.JTextField();
        lblModuloRegistros = new javax.swing.JLabel();
        pnlActualizar = new javax.swing.JPanel();
        lblCodigoActualizar = new javax.swing.JLabel();
        lblDescripcionActualizar = new javax.swing.JLabel();
        lblEanActualizar = new javax.swing.JLabel();
        lblCantidadActualActualizar = new javax.swing.JLabel();
        lblCantidadReconteoActualizar = new javax.swing.JLabel();
        btnGuardarActualizar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtActualizar = new javax.swing.JTable();
        btnBuscarActualizar = new javax.swing.JButton();
        btnModificarActualizar = new javax.swing.JButton();
        btnCancelarActualizar = new javax.swing.JButton();
        txtEanActualizar = new javax.swing.JTextField();
        txtCodigoActualizar2 = new javax.swing.JTextField();
        txtDescripcionActualizar = new javax.swing.JTextField();
        txtCodigoActualizar4 = new javax.swing.JTextField();
        txtCodigoActualizar5 = new javax.swing.JTextField();
        lblModuloRegistros1 = new javax.swing.JLabel();
        lblModuloRegistros2 = new javax.swing.JLabel();
        lblModuloActualizar = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        bckModuloInv.setBackground(new java.awt.Color(255, 255, 255));
        bckModuloInv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        bckModuloInv.add(lblLogoEcuaStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 510, 120, 80));

        pnlBotones.setBackground(new java.awt.Color(0, 153, 255));

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnIngresar.setText("Registros");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBotonesLayout = new javax.swing.GroupLayout(pnlBotones);
        pnlBotones.setLayout(pnlBotonesLayout);
        pnlBotonesLayout.setHorizontalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnConsultar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
            .addComponent(btnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlBotonesLayout.setVerticalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnConsultar)
                .addGap(54, 54, 54)
                .addComponent(btnIngresar)
                .addGap(46, 46, 46)
                .addComponent(btnActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 278, Short.MAX_VALUE)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        bckModuloInv.add(pnlBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 590));

        pnlDatos.setBackground(new java.awt.Color(51, 51, 255));

        lblNombreSucursal.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        lblNombreSucursal.setForeground(new java.awt.Color(204, 204, 204));
        lblNombreSucursal.setText("SUCURSAL NORTE");

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosLayout.createSequentialGroup()
                .addContainerGap(266, Short.MAX_VALUE)
                .addComponent(lblNombreSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(237, 237, 237))
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblNombreSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bckModuloInv.add(pnlDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 820, 90));

        btnOkConsultar.setText("OK");
        btnOkConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkConsultarActionPerformed(evt);
            }
        });

        btnCancelarConsultar.setText("Cancelar");
        btnCancelarConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarConsultarActionPerformed(evt);
            }
        });

        lblCodigoConsultar.setText("Codigo");

        jtConsultar.setForeground(new java.awt.Color(0, 0, 0));
        jtConsultar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "FECHA INGRESO", "FECHA SALIDA", "EAN", "CODIGO", "DESCRIPCION", "VALOR ", "CANTIDAD", "DISPONIBLE"
            }
        ));
        jScrollPane1.setViewportView(jtConsultar);
        if (jtConsultar.getColumnModel().getColumnCount() > 0) {
            jtConsultar.getColumnModel().getColumn(0).setPreferredWidth(10);
            jtConsultar.getColumnModel().getColumn(1).setPreferredWidth(10);
            jtConsultar.getColumnModel().getColumn(2).setPreferredWidth(40);
            jtConsultar.getColumnModel().getColumn(3).setPreferredWidth(60);
            jtConsultar.getColumnModel().getColumn(4).setPreferredWidth(200);
        }

        txtCodigoConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoConsultaKeyPressed(evt);
            }
        });

        lblEanConsultar.setText("Ean");

        txtEanConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEanConsultaKeyPressed(evt);
            }
        });

        lblFechaInicioConsultar.setText("Fecha Inicio");

        lblFechaFinConsultar.setText("Fecha Fin");

        lblModuloConsultar.setText("MODULO CONSULTAR");

        jdtFechaInicioConsultar.setBackground(new java.awt.Color(51, 153, 255));

        jdtFechaFinConsultar.setBackground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout pnlConsultarLayout = new javax.swing.GroupLayout(pnlConsultar);
        pnlConsultar.setLayout(pnlConsultarLayout);
        pnlConsultarLayout.setHorizontalGroup(
            pnlConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultarLayout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(pnlConsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConsultarLayout.createSequentialGroup()
                        .addComponent(lblModuloConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlConsultarLayout.createSequentialGroup()
                        .addGroup(pnlConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlConsultarLayout.createSequentialGroup()
                                .addComponent(lblCodigoConsultar)
                                .addGap(8, 8, 8)
                                .addComponent(txtCodigoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlConsultarLayout.createSequentialGroup()
                                .addComponent(lblEanConsultar)
                                .addGap(18, 18, 18)
                                .addComponent(txtEanConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(102, 102, 102)
                        .addGroup(pnlConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFechaInicioConsultar)
                            .addComponent(lblFechaFinConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(pnlConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jdtFechaFinConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jdtFechaInicioConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                        .addGroup(pnlConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConsultarLayout.createSequentialGroup()
                                .addComponent(btnOkConsultar)
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConsultarLayout.createSequentialGroup()
                                .addComponent(btnCancelarConsultar)
                                .addContainerGap())))))
        );
        pnlConsultarLayout.setVerticalGroup(
            pnlConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultarLayout.createSequentialGroup()
                .addGroup(pnlConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConsultarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblCodigoConsultar)
                                .addComponent(txtCodigoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnOkConsultar)
                                .addComponent(lblFechaInicioConsultar))
                            .addComponent(jdtFechaInicioConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdtFechaFinConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaFinConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlConsultarLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(pnlConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCancelarConsultar)
                            .addGroup(pnlConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtEanConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblEanConsultar)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblModuloConsultar)
                .addGap(21, 21, 21))
        );

        jtpInventario.addTab("tab1", pnlConsultar);

        lblCodigoRegistros.setText("Codigo");

        jtRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "EAN", "CODIGO", "DESCRIPCION", "CATEGORIA", "FECHA DE INGRESO", "CANTIDAD"
            }
        ));
        jScrollPane3.setViewportView(jtRegistros);
        if (jtRegistros.getColumnModel().getColumnCount() > 0) {
            jtRegistros.getColumnModel().getColumn(0).setPreferredWidth(40);
            jtRegistros.getColumnModel().getColumn(1).setPreferredWidth(40);
            jtRegistros.getColumnModel().getColumn(2).setPreferredWidth(200);
            jtRegistros.getColumnModel().getColumn(3).setPreferredWidth(40);
            jtRegistros.getColumnModel().getColumn(4).setPreferredWidth(30);
            jtRegistros.getColumnModel().getColumn(5).setPreferredWidth(10);
        }

        lblFechaIngresoRegistros.setText("Fecha de Ingreso");

        lblEanRegistros.setText("EAN");

        lblCantidadRegistros.setText("Cantidad");

        btnOkRegistros.setText("OK");
        btnOkRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkRegistrosActionPerformed(evt);
            }
        });

        btnCancelarRegistros.setText("Cancelar");

        lblDescripcionRegistros.setText("Descripcion");

        lblCategoriaRegistros.setText("Categoria");

        txtCategoriaRegistros.setEditable(false);

        txtDescripcionRegistros.setEditable(false);
        txtDescripcionRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionRegistrosActionPerformed(evt);
            }
        });

        txtEanRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEanRegistrosActionPerformed(evt);
            }
        });

        lblModuloRegistros.setText("MODULO REGISTROS");

        javax.swing.GroupLayout pnlRegistrosLayout = new javax.swing.GroupLayout(pnlRegistros);
        pnlRegistros.setLayout(pnlRegistrosLayout);
        pnlRegistrosLayout.setHorizontalGroup(
            pnlRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegistrosLayout.createSequentialGroup()
                        .addGroup(pnlRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodigoRegistros)
                            .addComponent(lblEanRegistros))
                        .addGap(18, 18, 18)
                        .addGroup(pnlRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigoRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEanRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlRegistrosLayout.createSequentialGroup()
                                .addComponent(lblDescripcionRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDescripcionRegistros, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addGroup(pnlRegistrosLayout.createSequentialGroup()
                                .addComponent(lblFechaIngresoRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlRegistrosLayout.createSequentialGroup()
                                .addComponent(lblCantidadRegistros)
                                .addGap(18, 18, 18)
                                .addComponent(txtCantidadRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlRegistrosLayout.createSequentialGroup()
                                .addComponent(lblCategoriaRegistros)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCategoriaRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49)
                        .addGroup(pnlRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegistrosLayout.createSequentialGroup()
                                .addComponent(btnOkRegistros)
                                .addGap(20, 20, 20))
                            .addComponent(btnCancelarRegistros, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(pnlRegistrosLayout.createSequentialGroup()
                        .addComponent(lblModuloRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(pnlRegistrosLayout.createSequentialGroup()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        pnlRegistrosLayout.setVerticalGroup(
            pnlRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrosLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegistrosLayout.createSequentialGroup()
                        .addComponent(btnOkRegistros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelarRegistros)
                            .addComponent(txtCantidadRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlRegistrosLayout.createSequentialGroup()
                        .addGroup(pnlRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigoRegistros)
                            .addComponent(lblDescripcionRegistros)
                            .addComponent(lblCategoriaRegistros)
                            .addComponent(txtCategoriaRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescripcionRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigoRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblEanRegistros)
                                .addComponent(txtEanRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblCantidadRegistros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFechaIngresoRegistros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblModuloRegistros)
                .addGap(11, 11, 11))
        );

        jtpInventario.addTab("tab2", pnlRegistros);

        lblCodigoActualizar.setText("Codigo");

        lblDescripcionActualizar.setText("Descripcion");

        lblEanActualizar.setText("Ean");

        lblCantidadActualActualizar.setText("Cantidad Actual");

        lblCantidadReconteoActualizar.setText("Cantidad Reconteo");

        btnGuardarActualizar.setText("Guardar");
        btnGuardarActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActualizarActionPerformed(evt);
            }
        });

        jtActualizar.setForeground(new java.awt.Color(0, 204, 204));
        jtActualizar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "EAN", "CODIGO", "DESCRIPCION", "FECHA ", "CANTIDAD ACTUAL", "RECONTEO"
            }
        ));
        jScrollPane2.setViewportView(jtActualizar);
        if (jtActualizar.getColumnModel().getColumnCount() > 0) {
            jtActualizar.getColumnModel().getColumn(0).setPreferredWidth(30);
            jtActualizar.getColumnModel().getColumn(1).setPreferredWidth(30);
            jtActualizar.getColumnModel().getColumn(2).setPreferredWidth(150);
            jtActualizar.getColumnModel().getColumn(3).setPreferredWidth(30);
            jtActualizar.getColumnModel().getColumn(4).setPreferredWidth(30);
            jtActualizar.getColumnModel().getColumn(5).setPreferredWidth(40);
        }

        btnBuscarActualizar.setBorder(null);
        btnBuscarActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActualizarActionPerformed(evt);
            }
        });

        btnModificarActualizar.setText("Modificar");
        btnModificarActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActualizarActionPerformed(evt);
            }
        });

        btnCancelarActualizar.setText("Cancelar");
        btnCancelarActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActualizarActionPerformed(evt);
            }
        });

        txtEanActualizar.setEditable(false);

        txtCodigoActualizar2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoActualizar2KeyPressed(evt);
            }
        });

        txtDescripcionActualizar.setEditable(false);

        txtCodigoActualizar5.setEditable(false);

        lblModuloRegistros1.setText("Modulo Registros");

        lblModuloRegistros2.setText("Modulo Registros");

        lblModuloActualizar.setText("MODULO ACTUALIZAR");

        javax.swing.GroupLayout pnlActualizarLayout = new javax.swing.GroupLayout(pnlActualizar);
        pnlActualizar.setLayout(pnlActualizarLayout);
        pnlActualizarLayout.setHorizontalGroup(
            pnlActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlActualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlActualizarLayout.createSequentialGroup()
                        .addGroup(pnlActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlActualizarLayout.createSequentialGroup()
                                .addComponent(lblCodigoActualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigoActualizar2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 20, Short.MAX_VALUE)
                                .addComponent(lblDescripcionActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE))
                            .addGroup(pnlActualizarLayout.createSequentialGroup()
                                .addComponent(lblEanActualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEanActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(pnlActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlActualizarLayout.createSequentialGroup()
                                .addComponent(txtDescripcionActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, Short.MAX_VALUE)
                                .addComponent(btnBuscarActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificarActualizar)
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlActualizarLayout.createSequentialGroup()
                                .addComponent(lblCantidadActualActualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigoActualizar5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblCantidadReconteoActualizar)
                                .addGap(18, 18, 18)
                                .addComponent(txtCodigoActualizar4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(btnGuardarActualizar)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelarActualizar)
                                .addGap(10, 10, 10))))
                    .addGroup(pnlActualizarLayout.createSequentialGroup()
                        .addComponent(lblModuloActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(pnlActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlActualizarLayout.createSequentialGroup()
                    .addGap(338, 338, 338)
                    .addComponent(lblModuloRegistros1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(339, Short.MAX_VALUE)))
            .addGroup(pnlActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlActualizarLayout.createSequentialGroup()
                    .addContainerGap(348, Short.MAX_VALUE)
                    .addComponent(lblModuloRegistros2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(329, 329, 329)))
        );
        pnlActualizarLayout.setVerticalGroup(
            pnlActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlActualizarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCodigoActualizar)
                        .addComponent(lblDescripcionActualizar)
                        .addComponent(btnModificarActualizar)
                        .addComponent(txtCodigoActualizar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDescripcionActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEanActualizar)
                    .addComponent(lblCantidadActualActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCantidadReconteoActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardarActualizar)
                    .addComponent(btnCancelarActualizar)
                    .addComponent(txtEanActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoActualizar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoActualizar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblModuloActualizar)
                .addGap(50, 50, 50))
            .addGroup(pnlActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlActualizarLayout.createSequentialGroup()
                    .addGap(215, 215, 215)
                    .addComponent(lblModuloRegistros1)
                    .addContainerGap(215, Short.MAX_VALUE)))
            .addGroup(pnlActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlActualizarLayout.createSequentialGroup()
                    .addContainerGap(225, Short.MAX_VALUE)
                    .addComponent(lblModuloRegistros2)
                    .addGap(205, 205, 205)))
        );

        jtpInventario.addTab("tab3", pnlActualizar);

        bckModuloInv.add(jtpInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 820, 440));

        lblNombreUsuario.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        lblNombreUsuario.setForeground(new java.awt.Color(0, 51, 255));
        lblNombreUsuario.setText("BIENVENIDO USUARIO JCPALMER");
        bckModuloInv.add(lblNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 540, 430, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bckModuloInv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bckModuloInv, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        jtpInventario.setSelectedIndex(2);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnOkConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkConsultarActionPerformed
        if (!txtCodigoConsulta.getText().isEmpty()) { //verdadero si esta lleno
           //ejecutar sp codigo
           
                  try{
                 Connection con = Conexion.getConexion();
                 CallableStatement sp = con.prepareCall("{call CONSULTAR_STOCK_CODIGO(?)}");
                 sp.setString(1,txtCodigoConsulta.getText());
                    ResultSet rsCodigo = sp.executeQuery();
                    jtConsultar.setModel(modeloTablaConsulta(rsCodigo));
                    ajustarAnchoColumna (jtConsultar);
                    jtConsultar.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                 sp.close(); 
                 con.close();
                    } catch (SQLException e){
                     JOptionPane.showMessageDialog(null,"error de consulta"+e.toString());
                        }
                  
        } else if (!txtEanConsulta.getText().isEmpty()) {//verdadero si esta lleno
            
            //ejecutar sp ean
            
                  try{
                 Connection con = Conexion.getConexion();
                 CallableStatement sp = con.prepareCall("{call CONSULTAR_STOCK_EAN(?)}");
                 sp.setString(1,txtEanConsulta.getText());
                    ResultSet rsEan = sp.executeQuery();
                    jtConsultar.setModel(modeloTablaConsulta(rsEan));
                    ajustarAnchoColumna (jtConsultar);
                    jtConsultar.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                 sp.close(); 
                 con.close();
                    } catch (SQLException e){
                     JOptionPane.showMessageDialog(null,"error de consulta"+e.toString());
                        }
                  
                
        } else if (jdtFechaInicioConsultar.getDate() != null) {
            //EJECUTA CONSULTAR_STOCK_FECHA
                java.util.Date fechaInicioUtil = jdtFechaInicioConsultar.getDate();
                Date n_FECHA_INGRESO = new java.sql.Date(fechaInicioUtil.getTime());
                java.util.Date fechaFinUtil = jdtFechaFinConsultar.getDate();
                Date n_FECHA_SALIDA = new java.sql.Date(fechaFinUtil.getTime());  
            try{
                 Connection con = Conexion.getConexion();
                 CallableStatement sp = con.prepareCall("{call CONSULTAR_STOCK_FECHA( ?,?)}");
                 sp.setDate(1,n_FECHA_INGRESO);
                 sp.setDate(2,n_FECHA_SALIDA);
                    ResultSet rs = sp.executeQuery();
                    jtConsultar.setModel(modeloTablaConsulta(rs));
                    ajustarAnchoColumna (jtConsultar);
                    jtConsultar.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                 sp.close(); 
                 con.close();
            } catch (SQLException e){
                JOptionPane.showMessageDialog(null,"error de consulta"+e.toString());
            }   
        } else {
            JOptionPane.showMessageDialog(null,"LOS CAMPOS ESTAN VACIOS \n POR FAVOR INDIQUE CRITERIO DE BUSQUEDA");
        }
           
    }//GEN-LAST:event_btnOkConsultarActionPerformed

    private void btnOkRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkRegistrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOkRegistrosActionPerformed

    private void txtEanRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEanRegistrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEanRegistrosActionPerformed

    private void txtDescripcionRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionRegistrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionRegistrosActionPerformed

    private void btnGuardarActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActualizarActionPerformed

    private void btnBuscarActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActualizarActionPerformed

    private void btnModificarActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActualizarActionPerformed

    private void btnCancelarActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActualizarActionPerformed
    /**
     * Este evento nos permite navegar entre pestañas del JTabbedPane del modulo Inventario
     * @param evt recibe el evento al dar click
     * setSelectedIndex seleeciona el numero de pestaña
     */
    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
     
        jtpInventario.setSelectedIndex(0);
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        jtpInventario.setSelectedIndex(1);
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
        MenuPrincipal mp = new MenuPrincipal ();
        mp.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnCancelarConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarConsultarActionPerformed
    jdtFechaInicioConsultar.setDate(null);
    jdtFechaFinConsultar.setDate(null);
    txtCodigoConsulta.setText("");
    txtEanConsulta.setText("");
    
    }//GEN-LAST:event_btnCancelarConsultarActionPerformed

    private void txtCodigoConsultaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoConsultaKeyPressed
        if (evt.getExtendedKeyCode()== KeyEvent.VK_ENTER){
            btnOkConsultar.doClick();
        }
    }//GEN-LAST:event_txtCodigoConsultaKeyPressed

    private void txtEanConsultaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEanConsultaKeyPressed
        if (evt.getExtendedKeyCode()== KeyEvent.VK_ENTER){
            btnOkConsultar.doClick();
        }
    }//GEN-LAST:event_txtEanConsultaKeyPressed

    private void txtCodigoActualizar2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoActualizar2KeyPressed
         if (evt.getExtendedKeyCode()== KeyEvent.VK_ENTER){
                    
                 if (!txtCodigoActualizar2.getText().isEmpty()) { //verdadero si esta lleno
           //ejecutar sp codigo
           
                  try{
                 Connection con = Conexion.getConexion();
                 CallableStatement sp = con.prepareCall("{call CONSULTAR_STOCK_CODIGO(?)}");
                 sp.setString(1,txtCodigoActualizar2.getText());
                    ResultSet rsCodigo = sp.executeQuery();
                    jtActualizar.setModel(modeloTablaConsulta(rsCodigo));
//                    txtCodigoActualizar2.setText(rsCodigo.getString(0));
//                    txtDescripcionActualizar.setText(rsCodigo.getString(1));
                    ajustarAnchoColumna (jtActualizar);
                    jtActualizar.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                 sp.close(); 
                 con.close();
                    } catch (SQLException e){
                     JOptionPane.showMessageDialog(null,"error de consulta"+e.toString());
                        }
                  
        } else if (!txtEanConsulta.getText().isEmpty()) {//verdadero si esta lleno
            
            JOptionPane.showMessageDialog(null,"INGRESE CODIGO CORRECTO");
            
            } 
        }
    }//GEN-LAST:event_txtCodigoActualizar2KeyPressed
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bckModuloInv;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscarActualizar;
    private javax.swing.JButton btnCancelarActualizar;
    private javax.swing.JButton btnCancelarConsultar;
    private javax.swing.JButton btnCancelarRegistros;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnGuardarActualizar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnModificarActualizar;
    private javax.swing.JButton btnOkConsultar;
    private javax.swing.JButton btnOkRegistros;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private com.toedter.calendar.JDateChooser jdtFechaFinConsultar;
    private com.toedter.calendar.JDateChooser jdtFechaInicioConsultar;
    private javax.swing.JTable jtActualizar;
    private javax.swing.JTable jtConsultar;
    private javax.swing.JTable jtRegistros;
    private javax.swing.JTabbedPane jtpInventario;
    private javax.swing.JLabel lblCantidadActualActualizar;
    private javax.swing.JLabel lblCantidadReconteoActualizar;
    private javax.swing.JLabel lblCantidadRegistros;
    private javax.swing.JLabel lblCategoriaRegistros;
    private javax.swing.JLabel lblCodigoActualizar;
    private javax.swing.JLabel lblCodigoConsultar;
    private javax.swing.JLabel lblCodigoRegistros;
    private javax.swing.JLabel lblDescripcionActualizar;
    private javax.swing.JLabel lblDescripcionRegistros;
    private javax.swing.JLabel lblEanActualizar;
    private javax.swing.JLabel lblEanConsultar;
    private javax.swing.JLabel lblEanRegistros;
    private javax.swing.JLabel lblFechaFinConsultar;
    private javax.swing.JLabel lblFechaIngresoRegistros;
    private javax.swing.JLabel lblFechaInicioConsultar;
    private javax.swing.JLabel lblLogoEcuaStock;
    private javax.swing.JLabel lblModuloActualizar;
    private javax.swing.JLabel lblModuloConsultar;
    private javax.swing.JLabel lblModuloRegistros;
    private javax.swing.JLabel lblModuloRegistros1;
    private javax.swing.JLabel lblModuloRegistros2;
    private javax.swing.JLabel lblNombreSucursal;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JPanel pnlActualizar;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlConsultar;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlRegistros;
    private javax.swing.JTextField txtCantidadRegistros;
    private javax.swing.JTextField txtCategoriaRegistros;
    private javax.swing.JTextField txtCodigoActualizar2;
    private javax.swing.JTextField txtCodigoActualizar4;
    private javax.swing.JTextField txtCodigoActualizar5;
    private javax.swing.JTextField txtCodigoConsulta;
    private javax.swing.JTextField txtCodigoRegistros;
    private javax.swing.JTextField txtDescripcionActualizar;
    private javax.swing.JTextField txtDescripcionRegistros;
    private javax.swing.JTextField txtEanActualizar;
    private javax.swing.JTextField txtEanConsulta;
    private javax.swing.JTextField txtEanRegistros;
    // End of variables declaration//GEN-END:variables
}
