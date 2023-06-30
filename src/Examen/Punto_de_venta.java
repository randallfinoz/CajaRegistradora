package Examen;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import com.itextpdf.text.Document;



public class Punto_de_venta extends javax.swing.JFrame {

 
    
    
    //SE CARGAN LAS VARIBLE DE LOS ARTICULOS
    String var_articulos[]={"Doritos", "Coca Cola", "Magnum", "Cafe", "Maruchan", "Galletas", "Chicle", "Boing", "Snnikers", "Monster"};
    //SE CARGAN LOS PRECIOS DE LOS ARTICULOS
    double var_precios[]={16, 12.5, 35, 20, 25, 16.5, 3, 12.5, 14, 45};
    //SE INICIALIZA LAS VARIABLES DE PRECIO Y CANTIDAD
    double var_precio=0;
    int var_cantidad=0;
    //SE AGREGA LA VARIABLE TOTAL
    double total = 0;
    //SE MODIFICA EL MODELO DE LA TABLA
    DefaultTableModel modelo=new DefaultTableModel();
    //EL ARREGLO DINAMICO GUARDARA LAS VENTAS HECHAS CON LOS ATRIBUTOS DE LA CLASE Variables_venta
    ArrayList<Variables_venta> listaVentas=new ArrayList<Variables_venta>();
    
    public Punto_de_venta() {
        initComponents();
        //SE COLOCA EL ENCABEZADO
        this.setTitle("Punto de venta");
        //TAMAÑO DEL FORMULARIO
        this.setSize(650, 600);
        //CENTRADO DEL FORMULARIO
        this.setLocationRelativeTo(null);
        
        //SE CREA EL MODELO DE ARTICULOS QUE VA A LLEVAR EL COMBOBOX
        DefaultComboBoxModel comboModel=new DefaultComboBoxModel(var_articulos);
        //SE TRASLADA EL MODELO CREADO PARA VER LOS ARTICULOS EN EL COMBOBOX
        cmbArticulo.setModel(comboModel);
        //SE AGREGA EL NOMBRE DE LAS COLUMNAS
        modelo.addColumn("Articulo");
        modelo.addColumn("Precio Unitario");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Importe");
        //SE AGREGA EL METODO ACTUALIZARTABLA
        actualizarTabla();
        
        //SE INICIALIZA EL PRECIO
        fun_calcular();
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cmbArticulo = new javax.swing.JComboBox<>();
        lblCliente = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        numCantidad = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cmdAgregar = new javax.swing.JButton();
        lblPrecio = new javax.swing.JLabel();
        lblImporte = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dgvArticulos = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        cmdDescargar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblPago = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        numCambio = new javax.swing.JSpinner();

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cliente (No.):");

        cmbArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbArticuloActionPerformed(evt);
            }
        });

        lblCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCliente.setText("0000");

        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("VENTAS PUBLICO EN GENERAL");

        jLabel4.setText("Almacén:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Almacén general");

        jLabel6.setText("Cajero:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("RANDALL FLORES FRANCISCO");

        jLabel8.setText("Nombre del articulo");

        jLabel9.setText("Unidades");

        numCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 20, 1));
        numCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                numCantidadStateChanged(evt);
            }
        });

        jLabel10.setText("Precio");

        jLabel11.setText("Importe");

        cmdAgregar.setText("Agregar");
        cmdAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAgregarActionPerformed(evt);
            }
        });

        lblPrecio.setText("$ 00.00 MXN");

        lblImporte.setText("$ 00.00 MXN");

        dgvArticulos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(dgvArticulos);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setText("Total");

        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTotal.setText("$ 00.00 MXN");

        cmdDescargar.setText("imprimir");
        cmdDescargar.setEnabled(false);
        cmdDescargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDescargarActionPerformed(evt);
            }
        });

        jLabel12.setText("Metodo de pago:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setText("Cambio:");

        lblPago.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lblPago.setText("$ 00.00 MXN");

        jLabel16.setText("Importe:");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setText("Efectivo");

        numCambio.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));
        numCambio.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                numCambioStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmdAgregar))
                                    .addComponent(lblImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(105, 105, 105)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmdDescargar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(numCambio, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPago, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblCliente)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(cmdAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecio)
                    .addComponent(lblImporte))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(lblTotal)
                    .addComponent(jLabel12)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel13)
                    .addComponent(numCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPago)
                    .addComponent(cmdDescargar))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbArticuloActionPerformed
        //SE CALCULA EL PRECIO DEL ARTICULO
        fun_calcular();
    }//GEN-LAST:event_cmbArticuloActionPerformed

    private void numCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_numCantidadStateChanged
        //SE CALCULA EL PRECIO DEL ARTICULO
        fun_calcular();
    }//GEN-LAST:event_numCantidadStateChanged

    private void cmdAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAgregarActionPerformed
        //SE AGREGAN LAS VENTAS A LA TABLA
        Variables_venta venta=new Variables_venta();
        //EL ID SACARA EL PRODUCTO DEL COMBOBOX PARA PONERLO EN LA TABLA
        venta.setId(cmbArticulo.getSelectedIndex());
        //SE SELECCIONA EL ELEMENTO QUE ESTA EN EL COMBOBOX
        venta.setDescripcion(cmbArticulo.getSelectedItem().toString());
        //SE OBTIENE EL PRECIO DEL PRODUCTO SEÑALADO EN EL COMBOBOX A TRAVEZ DE LA VARIABLE GLOBAL
        venta.setPrecio(var_precio);
        //SE AGREGA EL PRECIO DE LOS PRODUCTOS DEPENDIENDO LA CANTIDAD DE PRODUCTODS
        venta.setCantidad(var_cantidad);
        //SE HACE LA CONVERSION DEL PRECIO POR LA CANTIDAD DE PRODUCTOS
        venta.setImporte(var_precio*var_cantidad);
        //METODO PARA EVITAR VENTAS REPETIDAS
        if (!buscarVenta(venta)) {
            listaVentas.add(venta);
        }
        //ACTUALIZA LA TABLA CON EL PRODUCTO Y EL PRECIO
        actualizarTabla();
        //BORRA EL HISTORIAL DE LA VENTA PREVIA PARA HACER OTRA VENTA
        borrar();
    }//GEN-LAST:event_cmdAgregarActionPerformed

    private void cmdDescargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDescargarActionPerformed
        Document documento = new Document();
        try{
            //GUARDAMOS LA RUTA EN CUALQUIER DISPOSITIVO
            PdfWriter.getInstance(documento, new FileOutputStream( "C:\\Users\\randa\\OneDrive\\Documentos\\NetBeansProjects\\CajaRegistradora\\src\\Examen\\documentos\\Ticket.pdf"));
            
            //ESCRIBIMOS EL DOCUMENTO
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("TICKET DE VENTA\n\nNombre del cliente:\nVENTAS PUBLICO EN GENERAL\nCajero:\nRANDALL FLORES FRANCISO\n\n\n");
            parrafo.setFont(FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.DARK_GRAY));
            
            
            //SE ABRE EL DOCUMENTO
            documento.open();
            //SE AGREGA EL PARRAFO QUE SE ENCUENTRA ARRIBA
            documento.add(parrafo);
            //SE CREA LA TABLA PARA INGRESARLA AL PDF
            PdfPTable tabla = new PdfPTable(4);
            //SE CREAN LOS ENCABEZADOS
            PdfPCell var_Articulo = new PdfPCell(new Phrase("Articulo"));
            PdfPCell var_unid = new PdfPCell(new Phrase("Unidades"));
            PdfPCell var_prec = new PdfPCell(new Phrase("Precio"));
            PdfPCell var_importe = new PdfPCell(new Phrase("Importe"));
            //SE AGREGA EL NOMBRE DE LA CABECERAS
            tabla.addCell(var_Articulo);
            tabla.addCell(var_unid);
            tabla.addCell(var_prec);
            tabla.addCell(var_importe);            
            //SE EXTRAE DEL ARREGLO DE LAS VARIABLES Y DE DONDE SE ALMACENA LA INFORMACION
            for(Variables_venta venta: this.listaVentas){
                //SE VA DIBUJANDO LA TABLA
                tabla.addCell(venta.getDescripcion());                
                tabla.addCell(venta.getCantidad()+"");
                tabla.addCell(venta.getPrecio()+"");
                tabla.addCell(venta.getImporte()+"");                
            }
            //SE AGREGA LA TABLA AL DOCUMENTO
            documento.add(tabla);          

            
            
            Paragraph parrafo3 = new Paragraph();
            parrafo3.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo3.add("\n\n\n\nTotal a pagar: "+ lblTotal.getText() +"\nPAGO EN EFECTIVO\nIMPORTE: $ "+ numCambio.getValue() + "MXN" +" \nCambio: "+ lblPago.getText() +"\n\n\nGACIAS POR SU COMPRA!!!\n");
            parrafo3.setFont(FontFactory.getFont("Arial", 16, Font.BOLD, BaseColor.DARK_GRAY));
            documento.add(parrafo3);
            
            //SE CIERRA EL DOCUMENTO
            documento.close();
            JOptionPane.showMessageDialog(null, "ticket creado correctamente.");
        }catch (DocumentException | IOException e) {
            //EN CASO DE NO ABRIR O NO ENCONTRAR LA RUTA MANDARA UNA VENTANA CON UN MENSAJE
            System.err.println("Error en PDF o ruta de imagen" + e);
            JOptionPane.showMessageDialog(null, "Error al generar PDF");
        }
        
        
    }//GEN-LAST:event_cmdDescargarActionPerformed

    private void numCambioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_numCambioStateChanged
        // SE GENERA LA RESTA PARA EL CAMBIO
        double var_cambio = 0;
        //SE CALCULA EL CAMBIO
        var_cambio = Double.parseDouble(numCambio.getValue().toString()) - total;
        //SE VISUALIZA EL CAMBIO EN LA ETIQUETA DE CAMBIO
        lblPago.setText(Formato_moneda(var_cambio));
        if(var_cambio >= 0) {
            cmdDescargar.setEnabled(true); 
        } else{
            cmdDescargar.setEnabled(false);
        }
    }//GEN-LAST:event_numCambioStateChanged

 
    //SE CREA EL METODO BUSCAR VENTA
    public boolean buscarVenta(Variables_venta nueva) {
        for (Variables_venta v : listaVentas) {
            if (v.getId() == nueva.getId()) {
                int nuevaCantidad=v.getCantidad()+nueva.getCantidad();
                v.setCantidad(nuevaCantidad);
                v.setImporte(v.getPrecio()*nuevaCantidad);
                return true;
            }
        }
        return false;
    }
    
    //SE AGREGA EL METODO BORRAR
    public void borrar() {
        //AL MOMENTO DE AGREGAR LA VENTA SE BORRA LA YA AGREGADA DEL HISTORIAL
        var_precio=0;
        var_cantidad=1;
        cmbArticulo.setSelectedIndex(0);
        numCantidad.setValue(1);
        fun_calcular();
        
    }
    
    //SE GENERA EL METODO CALCULAR
    public void fun_calcular() {
        //SE CARGAN LOS PRECIOS DEL ARREGLO DE LOS PRECIOS
        var_precio=var_precios[cmbArticulo.getSelectedIndex()];
        //SE OBTIENE LA CADENA DE CANTIDAD PARA SU FORMATO
        var_cantidad=Integer.parseInt(numCantidad.getValue().toString());
        //SE LE ASIGNA EL PRECIO A LAS ETEQUETAS
        lblPrecio.setText(Formato_moneda(var_precio));
        lblImporte.setText(Formato_moneda(var_precio*var_cantidad));
    }
    //SE AGREGA EL METODO aMoneda PARA VISCUALIZAR LA CANTIDAD EN FORMATO MONEDA
    public String Formato_moneda(double precio) {
        return "$ "+Math.round(precio*100.0)/100.0+"MXN";
    }
    //SE AGREGA EL METODO actualizarTabla PARA ACTUALIZAR LA TABLA CON LOS PRODUCTOS
    public void actualizarTabla(){
        //SE VERIFICA SI EL MODELO ESTA VACIO
        while(modelo.getRowCount()>0){
            modelo.removeRow(0);
        }
        
        //SE RECORRE LA LISTA DE PRODUCTOS
        for (Variables_venta v : listaVentas){
            Object x[]=new Object[4];
            x[0]=v.getDescripcion();
            x[1]=Formato_moneda(v.getPrecio());
            x[2]=v.getCantidad();
            x[3]=Formato_moneda(v.getImporte());
            total+=v.getImporte();
            modelo.addRow(x);
        }
        //SE IMPRIME EL TOTAL EN SU ETIQUETA
        lblTotal.setText(Formato_moneda(total));
        //MUESTRA LOS ENCABEZADOS DE LA TABLA
        dgvArticulos.setModel(modelo);
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
            java.util.logging.Logger.getLogger(Punto_de_venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Punto_de_venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Punto_de_venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Punto_de_venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Punto_de_venta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbArticulo;
    private javax.swing.JButton cmdAgregar;
    private javax.swing.JButton cmdDescargar;
    private javax.swing.JTable dgvArticulos;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblImporte;
    private javax.swing.JLabel lblPago;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JSpinner numCambio;
    private javax.swing.JSpinner numCantidad;
    // End of variables declaration//GEN-END:variables

    private float[] element(JTable dgvArticulos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
