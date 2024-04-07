/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package practica1_.pkg2324.vista;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JButton;


/**
 *
 * @author rober
 */
public class Vista extends javax.swing.JFrame {
    private JCalendar calendar;  
    double saldo = 20;
    double precio_billete;
    
    public Vista() {
        initComponents();
        // Llama al método para inicializar EstacionOrigen
        EstacionOrigenMouseClicked(null);
    
        // Llama al método para inicializar EstacionDestino
        EstacionDestinoMouseClicked(null);
        
        //Llama al metodo para inicializar BotonIntercambiar
        BotonIntercambiarActionPerformed(null);
        
        //Se oculta el panel2 y posteriormente el panel 3 cuando se inicializa la web
        Paso2.setVisible(false);
        Paso3.setVisible(false);
        Paso4.setVisible(false);
        Etiqueta_error.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Paso1 = new javax.swing.JPanel();
        Label_Paso1 = new javax.swing.JLabel();
        EstacionOrigen = new javax.swing.JComboBox<>();
        EstacionDestino = new javax.swing.JComboBox<>();
        BotonIntercambiar = new javax.swing.JButton();
        Etiqueta_error = new javax.swing.JLabel();
        FechaEtiqueta = new javax.swing.JLabel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        Boton_Paso2 = new javax.swing.JButton();
        Paso2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Volver_Paso1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lista_Trenes = new javax.swing.JList<>();
        Boton_Mascotas = new javax.swing.JCheckBox();
        Boton_Bicicletas = new javax.swing.JCheckBox();
        Siguiente_Paso3 = new javax.swing.JButton();
        Paso3 = new javax.swing.JPanel();
        Texto_Paso3 = new javax.swing.JLabel();
        Titulo_Paso3 = new javax.swing.JLabel();
        Boton_SelTarjeta = new javax.swing.JRadioButton();
        Boton_SelBono = new javax.swing.JRadioButton();
        Logo_Master = new javax.swing.JLabel();
        Logo_Visa = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Panel_BONO = new javax.swing.JPanel();
        Texto_Saldo = new javax.swing.JTextField();
        Texto_BONO = new javax.swing.JLabel();
        Imagen_BONO = new javax.swing.JButton();
        Fondo_BONO = new javax.swing.JLabel();
        Volver_Paso3 = new javax.swing.JButton();
        Paso4 = new javax.swing.JPanel();
        Texto_Paso4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        Paso1.setPreferredSize(new java.awt.Dimension(810, 490));

        Label_Paso1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Label_Paso1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Paso1.setText("PASO 1");
        Label_Paso1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        EstacionOrigen.setSelectedItem(EstacionOrigen);
        EstacionOrigen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EstacionOrigen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EstacionOrigenMouseClicked(evt);
            }
        });

        EstacionDestino.setSelectedItem(EstacionDestino);
        EstacionDestino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EstacionDestinoMouseClicked(evt);
            }
        });
        EstacionDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstacionDestinoActionPerformed(evt);
            }
        });

        BotonIntercambiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica1_/pkg2324/vista/intercambiar.png"))); // NOI18N
        BotonIntercambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIntercambiarActionPerformed(evt);
            }
        });

        Etiqueta_error.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        Etiqueta_error.setForeground(new java.awt.Color(255, 0, 0));
        Etiqueta_error.setText("POR FAVOR SELECCIONE OTRA FECHA O ESTACION, NO HAY TRENES DISPONIBLES ");

        FechaEtiqueta.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        FechaEtiqueta.setText("Elija la Fecha de Salida");

        Boton_Paso2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Boton_Paso2.setText("Siguiente>");
        Boton_Paso2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Boton_Paso2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_Paso2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_Paso2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Paso1Layout = new javax.swing.GroupLayout(Paso1);
        Paso1.setLayout(Paso1Layout);
        Paso1Layout.setHorizontalGroup(
            Paso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Paso1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Boton_Paso2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(360, 360, 360))
            .addGroup(Paso1Layout.createSequentialGroup()
                .addGroup(Paso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Paso1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(Paso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Etiqueta_error, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Paso1Layout.createSequentialGroup()
                                .addGroup(Paso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(Paso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(Paso1Layout.createSequentialGroup()
                                            .addGap(334, 334, 334)
                                            .addComponent(BotonIntercambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(EstacionOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(EstacionDestino, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(84, 84, 84)
                                .addGroup(Paso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FechaEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(Paso1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Label_Paso1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Paso1Layout.setVerticalGroup(
            Paso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Paso1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Label_Paso1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Paso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Paso1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(Paso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Paso1Layout.createSequentialGroup()
                                .addComponent(EstacionOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EstacionDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FechaEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(Paso1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(BotonIntercambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)))
                .addComponent(Etiqueta_error, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(Boton_Paso2)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        getContentPane().add(Paso1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PASO 2");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel3.setFont(new java.awt.Font("Nachlieli CLM", 3, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Seleccione su tren");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Volver_Paso1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Volver_Paso1.setText("<Volver");
        Volver_Paso1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Volver_Paso1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Volver_Paso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volver_Paso1ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(Lista_Trenes);

        Boton_Mascotas.setText("Mascotas");

        Boton_Bicicletas.setText("Bicicletas");

        Siguiente_Paso3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Siguiente_Paso3.setText("Siguiente>");
        Siguiente_Paso3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Siguiente_Paso3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Siguiente_Paso3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Paso2Layout = new javax.swing.GroupLayout(Paso2);
        Paso2.setLayout(Paso2Layout);
        Paso2Layout.setHorizontalGroup(
            Paso2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Paso2Layout.createSequentialGroup()
                .addGroup(Paso2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Paso2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Paso2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)))
                    .addGroup(Paso2Layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addGroup(Paso2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Boton_Mascotas, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton_Bicicletas, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Paso2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Volver_Paso1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Siguiente_Paso3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        Paso2Layout.setVerticalGroup(
            Paso2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Paso2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Boton_Mascotas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Boton_Bicicletas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Paso2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Volver_Paso1)
                    .addComponent(Siguiente_Paso3))
                .addGap(28, 28, 28))
        );

        getContentPane().add(Paso2);

        Texto_Paso3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Texto_Paso3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Texto_Paso3.setText("PASO 3");
        Texto_Paso3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        Titulo_Paso3.setFont(new java.awt.Font("Nachlieli CLM", 3, 18)); // NOI18N
        Titulo_Paso3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo_Paso3.setText("Seleccione su metodo de pago");
        Titulo_Paso3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Boton_SelTarjeta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Boton_SelTarjeta.setText("Tarjeta de Crédito");
        Boton_SelTarjeta.setBorder(null);
        Boton_SelTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_SelTarjetaActionPerformed(evt);
            }
        });

        Boton_SelBono.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Boton_SelBono.setText("Tarjeta Usuario TCYL");
        Boton_SelBono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_SelBonoActionPerformed(evt);
            }
        });

        Logo_Master.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica1_/pkg2324/vista/MastercardLOgo.png"))); // NOI18N
        Logo_Master.setPreferredSize(new java.awt.Dimension(38, 23));

        Logo_Visa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica1_/pkg2324/vista/Visa_Logo.png"))); // NOI18N
        Logo_Visa.setPreferredSize(new java.awt.Dimension(38, 23));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica1_/pkg2324/vista/Escudo_de_la_Junta_de_Castilla_y_León.svg.png"))); // NOI18N

        Panel_BONO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Texto_Saldo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Panel_BONO.add(Texto_Saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 30, 250, -1));

        Texto_BONO.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Texto_BONO.setText("Mantenga su TARJETA AQUI durante 2 segundos");
        Panel_BONO.add(Texto_BONO, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        Imagen_BONO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica1_/pkg2324/vista/abono_cyl.jpg"))); // NOI18N
        Imagen_BONO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Imagen_BONOActionPerformed(evt);
            }
        });
        Panel_BONO.add(Imagen_BONO, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 240, 154));

        Fondo_BONO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica1_/pkg2324/vista/Escudo CYL_MODI.png"))); // NOI18N
        Panel_BONO.add(Fondo_BONO, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 250, 300));

        Volver_Paso3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Volver_Paso3.setText("<Volver");
        Volver_Paso3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Volver_Paso3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Volver_Paso3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volver_Paso3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Paso3Layout = new javax.swing.GroupLayout(Paso3);
        Paso3.setLayout(Paso3Layout);
        Paso3Layout.setHorizontalGroup(
            Paso3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Paso3Layout.createSequentialGroup()
                .addGroup(Paso3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Titulo_Paso3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Paso3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Texto_Paso3, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Paso3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(Paso3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Paso3Layout.createSequentialGroup()
                                .addComponent(Boton_SelBono, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Paso3Layout.createSequentialGroup()
                                .addComponent(Boton_SelTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(Logo_Master, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Logo_Visa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Volver_Paso3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(Panel_BONO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Paso3Layout.setVerticalGroup(
            Paso3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Paso3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Texto_Paso3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Titulo_Paso3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Paso3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Paso3Layout.createSequentialGroup()
                        .addGroup(Paso3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Boton_SelTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Logo_Master, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Logo_Visa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Paso3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Paso3Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(Boton_SelBono, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Paso3Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46)
                        .addComponent(Volver_Paso3))
                    .addComponent(Panel_BONO, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        getContentPane().add(Paso3);

        Texto_Paso4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Texto_Paso4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Texto_Paso4.setText("PAGO COMPLETADO");
        Texto_Paso4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton1.setText("Comprar otro billete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Paso4Layout = new javax.swing.GroupLayout(Paso4);
        Paso4.setLayout(Paso4Layout);
        Paso4Layout.setHorizontalGroup(
            Paso4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Paso4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Texto_Paso4, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(Paso4Layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Paso4Layout.setVerticalGroup(
            Paso4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Paso4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Texto_Paso4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(219, Short.MAX_VALUE))
        );

        getContentPane().add(Paso4);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void ListaRutasDisponibles() {
    DefaultListModel<String> modeloLista = new DefaultListModel<>();
    String estacionOrigenSeleccionada = EstacionOrigen.getSelectedItem().toString();
    String estacionDestinoSeleccionada = EstacionDestino.getSelectedItem().toString();
    

    try {
        BufferedReader br = new BufferedReader(new FileReader("src\\practica1_\\pkg2324\\vista/rutas.csv"));
        String linea;
        // Saltamos la primera línea que contiene los encabezados
        br.readLine();
        while ((linea = br.readLine()) != null) {
            String[] partes = linea.split(";");
            String idRuta = partes[0].trim();
            String estacionOrigen = partes[1].trim();
            String estacionDestino = partes[2].trim();
            if (estacionOrigen.equals(estacionOrigenSeleccionada) && estacionDestino.equals(estacionDestinoSeleccionada)) {
                String tiempo = partes[3].trim();
                String precio = partes[4].trim();
                String h_semana = partes[5].trim();
                String h_finde = partes[6].trim();

                Calendar calendar = jCalendar1.getCalendar();
                int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
                String horarios;
                if (dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY) {
                    horarios = h_finde;
                } else {
                    horarios = h_semana;
                }
                //Dividir los horarios y agregar cada uno como elemento separado como indica en la practica
                String [] horariosArray = horarios.split(",");
                for(String horario:horariosArray){
                    modeloLista.addElement("idRuta: " + idRuta + " - Tiempo: " + tiempo + " - Precio: " + precio + " - Horario: " + horario.trim());
                }

            }
        }
        br.close();
    } catch (IOException e) {
    }
    // Asignar el modelo de lista al JList
    Lista_Trenes.setModel(modeloLista);
}
    
    // Métodos para obtener información de la interfaz gráfica
    public String getEstacionOrigen() {
        return EstacionOrigen.getSelectedItem().toString();
    }

    public String getEstacionDestino() {
        return EstacionDestino.getSelectedItem().toString();
    }
    public JButton getBotonIntercambiar() {
        return BotonIntercambiar;
    }

    public Date getSelectedDate() {
        return calendar.getDate();
    }
    
    //Se encarga de intercambiar las estaciones ORIGEN/DESTINO
    private void BotonIntercambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIntercambiarActionPerformed
       // Obtiene los elementos seleccionados de los JComboBox
        String itemComboBox1 = (String) EstacionDestino.getSelectedItem();
        String itemComboBox2 = (String) EstacionOrigen.getSelectedItem();
        if (!itemComboBox1.equals(itemComboBox2)){
        // Intercambia los elementos entre los JComboBox
        EstacionDestino.setSelectedItem(itemComboBox2);
        EstacionOrigen.setSelectedItem(itemComboBox1);
        }
    }//GEN-LAST:event_BotonIntercambiarActionPerformed

    private void EstacionOrigenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EstacionOrigenMouseClicked
        EstacionOrigen.removeAllItems();

        FileReader filereader = null;
        try {
            String cadenaLeida = "";
            filereader = new FileReader("src\\practica1_\\pkg2324\\vista/estaciones.csv");
            BufferedReader bufferedreader = new BufferedReader(filereader);

            // Leer la primera línea (encabezado) y descartarla
            bufferedreader.readLine();

            cadenaLeida = bufferedreader.readLine(); // Lee la siguiente línea
            while (cadenaLeida != null) {
                // Dividir la cadena usando la coma como separador
                String[] estaciones = cadenaLeida.split(",");

                // Iterar sobre las estaciones y agregarlas al JComboBox
                for (String estacion : estaciones) {
                    EstacionOrigen.addItem(estacion.trim()); // trim() para eliminar espacios en blanco adicionales
                }

                // Leer la próxima línea
                cadenaLeida = bufferedreader.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                filereader.close();
            } catch (IOException ex) {
                Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_EstacionOrigenMouseClicked

    private void EstacionDestinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EstacionDestinoMouseClicked
        EstacionDestino.removeAllItems();

        FileReader filereader = null;
        try {
            String cadenaLeida = "";
            filereader = new FileReader("src\\practica1_\\pkg2324\\vista/estaciones.csv");
            BufferedReader bufferedreader = new BufferedReader(filereader);

            // Leer la primera línea (encabezado) y descartarla
            bufferedreader.readLine();

            cadenaLeida = bufferedreader.readLine(); // Lee la siguiente línea
            while (cadenaLeida != null) {
                // Dividir la cadena usando la coma como separador
                String[] estaciones = cadenaLeida.split(",");

                // Iterar sobre las estaciones y agregarlas al JComboBox
                for (String estacion : estaciones) {
                    EstacionDestino.addItem(estacion.trim()); // trim() para eliminar espacios en blanco adicionales
                }

                // Leer la próxima línea
                cadenaLeida = bufferedreader.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                filereader.close();
            } catch (IOException ex) {
                Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_EstacionDestinoMouseClicked

    private void EstacionDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstacionDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EstacionDestinoActionPerformed

    private void Boton_Paso2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_Paso2ActionPerformed
         // Verifica si las estaciones son las mismas
        boolean iguales = false;
        String estacionOrigen = EstacionOrigen.getSelectedItem().toString();
        String estacionDestino = EstacionDestino.getSelectedItem().toString();
        if (estacionOrigen.equals(estacionDestino)) {
            iguales = true;
        }
        // Si las estaciones son iguales, resetea el panel 1 y no deja avanzar al segundo paso
        // Si son distintas, pasa al paso 2.
        if (!iguales) {
            ListaRutasDisponibles();
            if (Lista_Trenes.getModel().getSize() == 0) {
                // Si el JList está vacío, muestra el mensaje en el JLabel
                
                Etiqueta_error.setVisible(true); // Hacer visible el JLabel
                return; // Detener el flujo de ejecución
            } else {
                // Si hay rutas disponibles, oculta el mensaje en el JLabel
                Etiqueta_error.setVisible(false); // Ocultar el JLabel
            }
            Paso1.setVisible(false);
            Paso2.setVisible(true);
        } else { // Reestablece los campos de las estaciones por defecto
            EstacionOrigenMouseClicked(null);
            EstacionDestinoMouseClicked(null);
        }  
    }//GEN-LAST:event_Boton_Paso2ActionPerformed

    private void Volver_Paso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volver_Paso1ActionPerformed
        Paso1.setVisible(true);
        Paso2.setVisible(false);
        Paso3.setVisible(false);
        Paso4.setVisible(false);
    }//GEN-LAST:event_Volver_Paso1ActionPerformed

    private void Siguiente_Paso3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Siguiente_Paso3ActionPerformed
        /*
        Separamos en un principio los datos del tren seleccionado
        para quedarnos con el precio del billete.
        */
        String tren_elegido = Lista_Trenes.getSelectedValue();
        String elem_separados [] = tren_elegido.split("-");
        /*
        Una vez tenemos el campo de precio, obtenemos el precio en Euros
        del billete
        */
        String precio = elem_separados[2];
        String [] coste = precio.split(":");
        precio_billete = Double.parseDouble(coste[1]); //este es el precio del billete

        Paso2.setVisible(false);
        Paso3.setVisible(true);
        //Panel_VISA.setVisible(false);
        //Panel_BONO.setVisible(false);
        Paso4.setVisible(false);
    }//GEN-LAST:event_Siguiente_Paso3ActionPerformed

    private void Boton_SelTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_SelTarjetaActionPerformed
        Panel_BONO.setVisible(false);
        //Panel_VISA.setVisible(true);
        Boton_SelBono.setSelected(false);
        Boton_SelTarjeta.setSelected(true);
        //PIN_VISA.setText("");
    }//GEN-LAST:event_Boton_SelTarjetaActionPerformed

    private void Boton_SelBonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_SelBonoActionPerformed
        Panel_BONO.setVisible(true);
        //Panel_VISA.setVisible(false);
        Boton_SelTarjeta.setSelected(false);
        Boton_SelBono.setSelected(true);
        Texto_Saldo.setText("El saldo restante es de "+saldo+" euros");
        //PIN_VISA.setText("");
    }//GEN-LAST:event_Boton_SelBonoActionPerformed

    private void Imagen_BONOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Imagen_BONOActionPerformed
        if (precio_billete <= saldo){
            saldo = saldo - precio_billete; /* asi llevamos la cuenta del saldo
            que queda en el BONO */
            Paso3.setVisible(false);
            Paso4.setVisible(true);
        }else{

        }
    }//GEN-LAST:event_Imagen_BONOActionPerformed

    private void Volver_Paso3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volver_Paso3ActionPerformed
        Paso3.setVisible(false);
        Paso2.setVisible(true);
        Paso1.setVisible(false);
        Paso4.setVisible(false);
        Boton_SelTarjeta.setSelected(false);
        Boton_SelBono.setSelected(false);
        //PIN_VISA.setText("");
    }//GEN-LAST:event_Volver_Paso3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Paso3.setVisible(false);
        Paso2.setVisible(false);
        Paso1.setVisible(true);
        Paso4.setVisible(false);
        Boton_SelTarjeta.setSelected(false);
        Boton_SelBono.setSelected(false);
        //PIN_VISA.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed
    
   
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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Vista().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonIntercambiar;
    private javax.swing.JCheckBox Boton_Bicicletas;
    private javax.swing.JCheckBox Boton_Mascotas;
    private javax.swing.JButton Boton_Paso2;
    private javax.swing.JRadioButton Boton_SelBono;
    private javax.swing.JRadioButton Boton_SelTarjeta;
    private javax.swing.JComboBox<String> EstacionDestino;
    private javax.swing.JComboBox<String> EstacionOrigen;
    private javax.swing.JLabel Etiqueta_error;
    private javax.swing.JLabel FechaEtiqueta;
    private javax.swing.JLabel Fondo_BONO;
    private javax.swing.JButton Imagen_BONO;
    private javax.swing.JLabel Label_Paso1;
    private javax.swing.JList<String> Lista_Trenes;
    private javax.swing.JLabel Logo_Master;
    private javax.swing.JLabel Logo_Visa;
    private javax.swing.JPanel Panel_BONO;
    private javax.swing.JPanel Paso1;
    private javax.swing.JPanel Paso2;
    private javax.swing.JPanel Paso3;
    private javax.swing.JPanel Paso4;
    private javax.swing.JButton Siguiente_Paso3;
    private javax.swing.JLabel Texto_BONO;
    private javax.swing.JLabel Texto_Paso3;
    private javax.swing.JLabel Texto_Paso4;
    private javax.swing.JTextField Texto_Saldo;
    private javax.swing.JLabel Titulo_Paso3;
    private javax.swing.JButton Volver_Paso1;
    private javax.swing.JButton Volver_Paso3;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    
}
