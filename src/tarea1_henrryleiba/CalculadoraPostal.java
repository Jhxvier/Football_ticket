
//AUTHOR: HENRRY JAVIER LEIBA CALERO

/* 
    Graphical interface made in Java for the creation of an application to buy feed for quail.
*/

package tarea1_henrryleiba;

import javax.swing.*;
import javax.swing.table.*;


public class CalculadoraPostal extends javax.swing.JFrame {
    
    private String seccion, postal_seleccion, respuesta_sino;
    private int contador_principal = 0, contador_estadio = 0, contador_extra = 0;
    private int contador_postales = 0, contador_museo = 0, contador_compras = 0;
    private double total_oficial = 0, monto_3000 = 0, total_sino;
    private DefaultListModel principal,estadios,stickers, postales, museos;
    private double sumar[] = new double[1000];
    
//OPCIONES DE COMPRA POR SECCION
    public void ingresos1 (){
        combo1.addItem("Página Principal");
        combo1.addItem("Estadios");
        combo1.addItem("Extra Sticker");
        combo1.addItem("Postales");
        combo1.addItem("Museo Fifa");
        boton_continuar.setEnabled(false);
        Terminar.setEnabled(false);
    }
    
    
    private void metodos_post(String seccion, int contador){
        contador_compras++;
        Postal post = new Postal(seccion);
        
        post.contador(seccion, contador);
        
        sumar[contador_compras-1] = post.getTotal();
        
        post.sumar_compras(sumar, contador_compras, seccion);
        
        if (seccion.equals("Página Principal")){
            costo_principal.setText(Double.toString(post.getTotal()));
            principal.addElement(postal_seleccion);
                
        } else if (seccion.equals("Estadios")){
                
            costo_estadios.setText(Double.toString(post.getTotal()));
            estadios.addElement(postal_seleccion);
                
        } else if (seccion.equals("Extra Sticker")){
                
            stickers_compras.setText(Integer.toString(contador_extra));
            costo_stickers.setText(Double.toString(post.getTotal()));
            stickers.addElement(postal_seleccion);
                
        } else if (seccion.equals("Postales")){
                
            postales_compras.setText(Integer.toString(contador_postales));
            costo_postales.setText(Double.toString(post.getTotal()));
            postales.addElement(postal_seleccion);
     
        } else if (seccion.equals("Museo Fifa")){
                
            museos_compras.setText(Integer.toString(contador_museo));
            costo_museos.setText(Double.toString(post.getTotal()));
            museos.addElement(postal_seleccion);
            
        }
        MontoFinal.setText(Double.toString(post.getTotal_oficial()));    
        total_pagar.setText(Double.toString(post.getTotal_oficial()));
    }
    
    public CalculadoraPostal() {
        initComponents();
        principal = new DefaultListModel();
        estadios = new DefaultListModel();
        stickers = new DefaultListModel();
        postales = new DefaultListModel();
        museos = new DefaultListModel();
        lista_principal.setModel(principal);
        lista_estadios.setModel(estadios);
        lista_stickers.setModel(stickers);
        lista_postales.setModel(postales);
        lista_museos.setModel(museos);
        ingresos1();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Factura_1 = new javax.swing.JFrame();
        Aceptar = new javax.swing.JButton();
        Terminar = new javax.swing.JButton();
        preguntadomicilio = new javax.swing.JLabel();
        SI = new javax.swing.JRadioButton();
        NO = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Domicilio = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        Volver = new javax.swing.JButton();
        lblPrincipal = new javax.swing.JLabel();
        lblEstadios = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lista_principal = new javax.swing.JList<>();
        lblcomprados = new javax.swing.JLabel();
        estadios_compras = new javax.swing.JLabel();
        principal_compras = new javax.swing.JLabel();
        stickers_compras = new javax.swing.JLabel();
        lblExtraSticker = new javax.swing.JLabel();
        lblcosto = new javax.swing.JLabel();
        costo_principal = new javax.swing.JLabel();
        costo_estadios = new javax.swing.JLabel();
        costo_stickers = new javax.swing.JLabel();
        lblpostals = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista_estadios = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        lista_stickers = new javax.swing.JList<>();
        lbltotalfinal = new javax.swing.JLabel();
        total_pagar = new javax.swing.JLabel();
        Nombre_label = new javax.swing.JLabel();
        Cedula_label = new javax.swing.JLabel();
        lblpostales = new javax.swing.JLabel();
        lblmuseo = new javax.swing.JLabel();
        postales_compras = new javax.swing.JLabel();
        museos_compras = new javax.swing.JLabel();
        costo_museos = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        lista_postales = new javax.swing.JList<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        lista_museos = new javax.swing.JList<>();
        costo_postales = new javax.swing.JLabel();
        fondo1 = new javax.swing.JTextField();
        SI_NO = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Continuar = new javax.swing.JButton();
        Salir_main = new javax.swing.JButton();
        Confirmar_sec = new javax.swing.JButton();
        lblnombre = new javax.swing.JLabel();
        lblcedula = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        cedula = new javax.swing.JTextField();
        combo1 = new javax.swing.JComboBox<>();
        boton_continuar = new javax.swing.JButton();
        secciones = new javax.swing.JTextField();
        combo2 = new javax.swing.JComboBox<>();
        cards = new javax.swing.JTextField();
        montoFinal = new javax.swing.JTextField();
        MontoFinal = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabladeprecios = new javax.swing.JTable();
        imgfondo = new javax.swing.JLabel();

        Factura_1.setResizable(false);
        Factura_1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });
        Factura_1.getContentPane().add(Aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 130, -1));

        Terminar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Terminar.setText("Terminar y Salir");
        Terminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TerminarActionPerformed(evt);
            }
        });
        Factura_1.getContentPane().add(Terminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, -1));

        preguntadomicilio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        preguntadomicilio.setText("Deseas Envío a Domicilio?");
        Factura_1.getContentPane().add(preguntadomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        SI_NO.add(SI);
        SI.setSelected(true);
        SI.setText("SI, deseo domicilio");
        Factura_1.getContentPane().add(SI, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        SI_NO.add(NO);
        NO.setText("No, deseo domicilio");
        Factura_1.getContentPane().add(NO, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        Domicilio.setColumns(20);
        Domicilio.setRows(5);
        jScrollPane2.setViewportView(Domicilio);

        Factura_1.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 390, 180));

        jLabel2.setText("Ingresa la dirección del domicilio:");
        Factura_1.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        Volver.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        Factura_1.getContentPane().add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, -1, -1));

        lblPrincipal.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblPrincipal.setText("Pagina principal");
        Factura_1.getContentPane().add(lblPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, -1));

        lblEstadios.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblEstadios.setText("Estadios");
        Factura_1.getContentPane().add(lblEstadios, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, -1, -1));

        jScrollPane3.setViewportView(lista_principal);

        Factura_1.getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 80, 130));

        lblcomprados.setText("Cantidad");
        Factura_1.getContentPane().add(lblcomprados, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, -1, -1));

        estadios_compras.setText("0");
        Factura_1.getContentPane().add(estadios_compras, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, 60, -1));

        principal_compras.setText("0");
        Factura_1.getContentPane().add(principal_compras, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 80, -1));

        stickers_compras.setText("0");
        Factura_1.getContentPane().add(stickers_compras, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 130, 70, 20));

        lblExtraSticker.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblExtraSticker.setText("Extra Stickers");
        Factura_1.getContentPane().add(lblExtraSticker, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, -1, -1));

        lblcosto.setText("Costo c/u");
        Factura_1.getContentPane().add(lblcosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, -1, -1));

        costo_principal.setText("0");
        Factura_1.getContentPane().add(costo_principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 70, -1));

        costo_estadios.setText("0");
        Factura_1.getContentPane().add(costo_estadios, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 210, 50, -1));

        costo_stickers.setText("0");
        Factura_1.getContentPane().add(costo_stickers, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 210, 60, -1));

        lblpostals.setText("Postales");
        Factura_1.getContentPane().add(lblpostals, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, -1, -1));

        jScrollPane1.setViewportView(lista_estadios);

        Factura_1.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, 80, 130));

        jScrollPane4.setViewportView(lista_stickers);

        Factura_1.getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 280, 80, 130));

        lbltotalfinal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbltotalfinal.setText("Total final a pagar: ");
        Factura_1.getContentPane().add(lbltotalfinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 490, -1, -1));

        total_pagar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        total_pagar.setText("0");
        Factura_1.getContentPane().add(total_pagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 490, 70, -1));

        Nombre_label.setText("Nombre");
        Factura_1.getContentPane().add(Nombre_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, -1, -1));

        Cedula_label.setText("Cédula");
        Factura_1.getContentPane().add(Cedula_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 440, -1, -1));

        lblpostales.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblpostales.setText("Postales");
        Factura_1.getContentPane().add(lblpostales, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 80, -1, -1));

        lblmuseo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblmuseo.setText("Museo Fifa");
        Factura_1.getContentPane().add(lblmuseo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 80, -1, -1));

        postales_compras.setText("0");
        Factura_1.getContentPane().add(postales_compras, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 130, 50, -1));

        museos_compras.setText("0");
        Factura_1.getContentPane().add(museos_compras, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 130, 50, -1));

        costo_museos.setText("0");
        Factura_1.getContentPane().add(costo_museos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 210, 60, -1));

        jScrollPane6.setViewportView(lista_postales);

        Factura_1.getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 280, 80, 130));

        jScrollPane7.setViewportView(lista_museos);

        Factura_1.getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 280, 80, 130));

        costo_postales.setText("0");
        Factura_1.getContentPane().add(costo_postales, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 210, -1, -1));

        fondo1.setBackground(new java.awt.Color(255, 153, 153));
        Factura_1.getContentPane().add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 620));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Continuar.setBackground(new java.awt.Color(0, 204, 0));
        Continuar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Continuar.setForeground(new java.awt.Color(255, 255, 255));
        Continuar.setText("Continuar");
        Continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(Continuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 590, 120, -1));

        Salir_main.setBackground(new java.awt.Color(255, 0, 0));
        Salir_main.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Salir_main.setForeground(new java.awt.Color(255, 255, 255));
        Salir_main.setText("Salir");
        Salir_main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salir_mainActionPerformed(evt);
            }
        });
        getContentPane().add(Salir_main, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 590, 120, 30));

        Confirmar_sec.setBackground(new java.awt.Color(51, 153, 255));
        Confirmar_sec.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Confirmar_sec.setForeground(new java.awt.Color(255, 255, 255));
        Confirmar_sec.setText("Confirmar Seccion");
        Confirmar_sec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Confirmar_secActionPerformed(evt);
            }
        });
        getContentPane().add(Confirmar_sec, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 220, -1));

        lblnombre.setBackground(new java.awt.Color(255, 255, 255));
        lblnombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblnombre.setForeground(new java.awt.Color(255, 255, 255));
        lblnombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblnombre.setText("Nombre Completo:");
        lblnombre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(lblnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        lblcedula.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblcedula.setForeground(new java.awt.Color(255, 255, 255));
        lblcedula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcedula.setText("Cédula:");
        getContentPane().add(lblcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, -1, -1));

        nombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nombre.setToolTipText("");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 380, -1));

        cedula.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cedula.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cedula.setToolTipText("");
        getContentPane().add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 210, -1));

        combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo1ActionPerformed(evt);
            }
        });
        getContentPane().add(combo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 160, 30));

        boton_continuar.setBackground(new java.awt.Color(0, 153, 255));
        boton_continuar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        boton_continuar.setForeground(new java.awt.Color(255, 255, 255));
        boton_continuar.setText("Comprar");
        boton_continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_continuarActionPerformed(evt);
            }
        });
        getContentPane().add(boton_continuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 450, 120, -1));

        secciones.setBackground(new java.awt.Color(255, 102, 102));
        secciones.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        secciones.setForeground(new java.awt.Color(255, 255, 255));
        secciones.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        secciones.setText("Sección:");
        getContentPane().add(secciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 90, 30));

        combo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo2ActionPerformed(evt);
            }
        });
        getContentPane().add(combo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, 110, 30));

        cards.setBackground(new java.awt.Color(255, 102, 102));
        cards.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cards.setForeground(new java.awt.Color(255, 255, 255));
        cards.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cards.setText("Postales:");
        getContentPane().add(cards, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, 100, 30));

        montoFinal.setEditable(false);
        montoFinal.setBackground(new java.awt.Color(0, 204, 153));
        montoFinal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        montoFinal.setForeground(new java.awt.Color(255, 255, 255));
        montoFinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        montoFinal.setText("Monto:");
        getContentPane().add(montoFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 140, 40));

        MontoFinal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MontoFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MontoFinalActionPerformed(evt);
            }
        });
        getContentPane().add(MontoFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 590, 130, 40));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("QATAR2022  - Compra tus postales AQUÍ");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 580, -1));

        tabladeprecios.setBackground(new java.awt.Color(255, 204, 0));
        tabladeprecios.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        tabladeprecios.setForeground(new java.awt.Color(255, 255, 255));
        tabladeprecios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Página Principal", "CRC 150"},
                {"Estadios", "CRC 100"},
                {"Extra Stickers", "CRC 150"},
                {"Postales", "CRC 200"},
                {"Museo Fifa", "CRC 150"}
            },
            new String [] {
                "Sección", "Precios"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabladeprecios.setOpaque(false);
        jScrollPane5.setViewportView(tabladeprecios);
        if (tabladeprecios.getColumnModel().getColumnCount() > 0) {
            tabladeprecios.getColumnModel().getColumn(0).setResizable(false);
            tabladeprecios.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, 120));

        imgfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/album.jpg"))); // NOI18N
        getContentPane().add(imgfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo1ActionPerformed

    private void combo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo2ActionPerformed

    private void boton_continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_continuarActionPerformed
        
    // METODOS A APLICARS SEGÚN LAS SECCIONES SELECCIONADAS
        try{
            postal_seleccion = combo2.getSelectedItem().toString();
            respuesta_sino = "No respuesta";
            seccion = combo1.getSelectedItem().toString();
            int posicion = combo2.getSelectedIndex();
            
            if (seccion.equals("Página Principal")){
                
                contador_principal++;
                
                metodos_post(seccion,contador_principal);
                
                principal_compras.setText(Integer.toString(contador_principal));
                
                combo2.removeItemAt(posicion);
                
            } else if (seccion.equals("Estadios")){
                contador_estadio++;
                
                metodos_post(seccion,contador_estadio);
                
                estadios_compras.setText(Integer.toString(contador_estadio));
                
                combo2.removeItemAt(posicion);
                
            } else if (seccion.equals("Extra Sticker")){
                
                contador_extra++;
               
                metodos_post(seccion,contador_extra);
                
                stickers_compras.setText(Integer.toString(contador_extra));
                
                combo2.removeItemAt(posicion);
                
            } else if (seccion.equals("Postales")){
                
                contador_postales++;
                
                metodos_post(seccion,contador_postales);
                
                combo2.removeItemAt(posicion);
     
            }else if (seccion.equals("Museo Fifa")){
                
                contador_museo++;
                
                metodos_post(seccion,contador_museo);
                
                museos_compras.setText(Integer.toString(contador_museo));
                
                combo2.removeItemAt(posicion);
            
            }
        }catch(Exception a){
        }
    }//GEN-LAST:event_boton_continuarActionPerformed

    private void MontoFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MontoFinalActionPerformed
        
    }//GEN-LAST:event_MontoFinalActionPerformed

    private void Confirmar_secActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Confirmar_secActionPerformed
        try{
            //LLENADO DE LOS COMBOBOX CON LOS ITEM CORESPONDIENTES DE CADA SECCIÓN
            
            seccion = combo1.getSelectedItem().toString();
            
            if (seccion.equals("Página Principal")){
                
                combo2.removeAllItems();
                
                combo2.addItem("FWC 1");
                combo2.addItem("FWC 2");
                combo2.addItem("FWC 3");
                combo2.addItem("FWC 4");
                combo2.addItem("FWC 5");
                
            } else if (seccion.equals("Estadios")){
                
                combo2.removeAllItems();
                
                combo2.addItem("FWC 6");
                combo2.addItem("FWC 7");
                combo2.addItem("FWC 8");
                combo2.addItem("FWC 9");
                combo2.addItem("FWC 10");
                
            } else if (seccion.equals("Extra Sticker")){
                
                combo2.removeAllItems();
                
                combo2.addItem("GOLD");
                combo2.addItem("SILVER");
                combo2.addItem("BRONZE");
                combo2.addItem("BASE");
                combo2.addItem("PREMIUM");
                
            }else if (seccion.equals("Postales")){
                
                combo2.removeAllItems();
                
                combo2.addItem("ARG 1");
                combo2.addItem("ARG 2");
                combo2.addItem("ARG 3");
                combo2.addItem("ARG 4");
                combo2.addItem("ARG 5");
                combo2.addItem("BRA 1");
                combo2.addItem("BRA 2");
                combo2.addItem("BRA 3");
                combo2.addItem("BRA 4");
                combo2.addItem("BRA 5");
                combo2.addItem("CR 1");
                combo2.addItem("CR 2");
                combo2.addItem("CR 3");
                combo2.addItem("CR 4");
                combo2.addItem("CR 5");
                combo2.addItem("ENG 1");
                combo2.addItem("ENG 2");
                combo2.addItem("ENG 3");
                combo2.addItem("ENG 4");
                combo2.addItem("ENG 5");
                
                
            } else if (seccion.equals("Museo Fifa")){
                
                combo2.removeAllItems();
                
                combo2.addItem("FWC 11");
                combo2.addItem("FWC 12");
                combo2.addItem("FWC 13");
                combo2.addItem("FWC 14");
                combo2.addItem("FWC 15");
                
            }
            
            boton_continuar.setEnabled(true);
            
        }catch(Exception a){
        }
    }//GEN-LAST:event_Confirmar_secActionPerformed

    private void ContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinuarActionPerformed
        
        // ABRIR VENTANA DE FACTURA DEL CLIENTE

        try{
            String nom,ced;
            nom = nombre.getText();
            ced = cedula.getText();
            if (nom.equals("") && ced.equals("")){
                JOptionPane.showMessageDialog(null,"No debes dejar espacios sin rellenar");
            } else if (!(nom.equals("") && ced.equals(""))){
                Factura_1.setVisible(true);
                Factura_1.setSize(1250, 634);
            }
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al Salir del programa");
        }
    }//GEN-LAST:event_ContinuarActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        // PARA HABILITAR LA OPCION DE AGREGAR DOMICILIO
        try{
            String nom,ced;
            nom = nombre.getText();
            ced = cedula.getText();
            Nombre_label.setText(nom);
            Cedula_label.setText(ced);
            
            if (SI.isSelected()){
                Domicilio.setEditable(true);
                seccion = "Domicilio";
                metodos_post(seccion,contador_compras);
            } else if (NO.isSelected()){
                Domicilio.setEditable(false);
                seccion = "No Domicilio";
                metodos_post(seccion,contador_compras);
            }
            Terminar.setEnabled(true);
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al Salir del programa");
        }
    }//GEN-LAST:event_AceptarActionPerformed

    private void TerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TerminarActionPerformed
        
        try{
            System.exit(0); // PARA SALIR DE MANERA SEGURA
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al Salir del programa");
        }
    }//GEN-LAST:event_TerminarActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        // ESTE HIDE SIRVE PARA OCULTAR LA VENTA FACTURA PARA QUE NO SE JUNTE CON EL MAIN
        try{
            
            Factura_1.hide();
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al Salir del programa");
        }
    }//GEN-LAST:event_VolverActionPerformed

    private void Salir_mainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salir_mainActionPerformed
       
        try{
            
            System.exit(0); // PARA SALIR DE MANERA SEGURA
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al Salir del programa");
        }
    }//GEN-LAST:event_Salir_mainActionPerformed

    
    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraPostal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JLabel Cedula_label;
    private javax.swing.JButton Confirmar_sec;
    private javax.swing.JButton Continuar;
    private javax.swing.JTextArea Domicilio;
    private javax.swing.JFrame Factura_1;
    private javax.swing.JTextField MontoFinal;
    private javax.swing.JRadioButton NO;
    private javax.swing.JLabel Nombre_label;
    private javax.swing.JRadioButton SI;
    private javax.swing.ButtonGroup SI_NO;
    private javax.swing.JButton Salir_main;
    private javax.swing.JButton Terminar;
    private javax.swing.JButton Volver;
    private javax.swing.JButton boton_continuar;
    private javax.swing.JTextField cards;
    private javax.swing.JTextField cedula;
    private javax.swing.JComboBox<String> combo1;
    private javax.swing.JComboBox<String> combo2;
    private javax.swing.JLabel costo_estadios;
    private javax.swing.JLabel costo_museos;
    private javax.swing.JLabel costo_postales;
    private javax.swing.JLabel costo_principal;
    private javax.swing.JLabel costo_stickers;
    private javax.swing.JLabel estadios_compras;
    private javax.swing.JTextField fondo1;
    private javax.swing.JLabel imgfondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblEstadios;
    private javax.swing.JLabel lblExtraSticker;
    private javax.swing.JLabel lblPrincipal;
    private javax.swing.JLabel lblcedula;
    private javax.swing.JLabel lblcomprados;
    private javax.swing.JLabel lblcosto;
    private javax.swing.JLabel lblmuseo;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblpostales;
    private javax.swing.JLabel lblpostals;
    private javax.swing.JLabel lbltotalfinal;
    private javax.swing.JList<String> lista_estadios;
    private javax.swing.JList<String> lista_museos;
    private javax.swing.JList<String> lista_postales;
    private javax.swing.JList<String> lista_principal;
    private javax.swing.JList<String> lista_stickers;
    private javax.swing.JTextField montoFinal;
    private javax.swing.JLabel museos_compras;
    private javax.swing.JTextField nombre;
    private javax.swing.JLabel postales_compras;
    private javax.swing.JLabel preguntadomicilio;
    private javax.swing.JLabel principal_compras;
    private javax.swing.JTextField secciones;
    private javax.swing.JLabel stickers_compras;
    private javax.swing.JTable tabladeprecios;
    private javax.swing.JLabel total_pagar;
    // End of variables declaration//GEN-END:variables
}
