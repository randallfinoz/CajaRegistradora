
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
 
public class prueba extends javax.swing.JFrame {

    private static Connection con;
    // Declaramos los datos de conexion a la bd
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String pass="";
    private static final String url="jdbc:mysql://localhost:3306/punto_de_venta";
    PreparedStatement ps;
    ResultSet rs;
    
    // Funcion que va conectarse a mi bd de mysql
    public static Connection getConnection() {
        // Reseteamos a null la conexion a la bd
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            // Nos conectamos a la bd
            con= (Connection) DriverManager.getConnection(url, user, pass);
            JOptionPane.showMessageDialog(null, "conexion exitosa");
        }
        // Si la conexion NO fue exitosa mostramos un mensaje de error
        catch (HeadlessException | ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
        return con;
    }
    private void limpiar() {
        txtANombre.setText(null);
        txtAApellido.setText(null);
        txtATelefono.setText(null);
        txtACorreo.setText(null);
        txtADireccion.setText(null);
        cmbAPlan.setSelectedIndex(0);
        cmbAEstado.setSelectedIndex(0);
    }

    private String dato;
    public prueba() {
        initComponents();
        txtAID.setVisible(false);
        txtAIID.setVisible(false);
        //coloca la ventana en la partde del centro de la pantalla
        setLocationRelativeTo(null); 
    }
    
    public void setDato (String dato) {
        this.dato = dato;
        txtAIID.setText(dato);
            if (txtAIID.getText().equals("U")) {
            btnALimpiar.setVisible(false);
            btnAEliminar.setVisible(false);
        }else {
            btnALimpiar.setVisible(true);
            btnAEliminar.setVisible(true);   
        }
}
    
    public void validar() {
        if (txtANombre.getText().isEmpty()) {
            //coloca el texto en el label del campo obligatorio
            lblAANombre.setText("*campo requerido (se recomienda usar mayusculas)");
        }else{
            //deja de mostrar el mensaje
            lblAANombre.setText("");
        } 
        if (txtAApellido.getText().isEmpty()) {
            //coloca el texto en el label del campo obligatorio
            lblAAApellido.setText("*campo requerido (se recomienda usar mayusculas)");
        }else{
            //deja de mostrar el mensaje
            lblAAApellido.setText("");
        } 
        if (txtATelefono.getText().isEmpty()) {
            //coloca el texto en el label del campo obligatorio
            lblAATelefono.setText("*campo requerido (se recomienda usar numeros)");
        }else{
            //deja de mostrar el mensaje
            lblAATelefono.setText("");
        } 
        if (txtACorreo.getText().isEmpty()) {
            //coloca el texto en el label del campo obligatorio
            lblAACorreo.setText("*campo requerido (se recomienda usar el formato de correo electronico)");
        }else if(!txtACorreo.getText().contains("@") || !txtACorreo.getText().contains(".")){
            //coloca el texto en el label del campo obligatorio
            lblAACorreo.setText("*correo invalido(se recomienda usar el formato de correo electronico)");
        } else{
            //deja de mostrar el mensaje
            lblAACorreo.setText("");
        } 
        if (txtADireccion.getText().isEmpty()) {
            //coloca el texto en el label del campo obligatorio
            lblAADireccion.setText("*campo requerido (se recomienda usar el formato de direccion)");
        }else{
            //deja de mostrar el mensaje
            lblAADireccion.setText("");
        } 
        if (txtANombre.getText().isEmpty() || txtAApellido.getText().isEmpty() || 
                txtATelefono.getText().isEmpty() || txtACorreo.getText().isEmpty() || 
                txtADireccion.getText().isEmpty() || lblAACorreo.getText().equals("*correo invalido(se recomienda usar el formato de correo electronico)") ) {
            //inhabilita el boton si no se cumple ninguno de los requisitos
            btnAValidar.setEnabled(false);
            
            
        }else {
            //habilita el boton
            btnAValidar.setEnabled(true);
            btnAModificar.setEnabled(true);
            btnAEliminar.setEnabled(true);
        }
        if (txtANombre.getText().isEmpty() || txtAApellido.getText().isEmpty()){
            btnABuscar.setEnabled(false);
        }else {
            btnABuscar.setEnabled(true);
            
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblANombre = new javax.swing.JLabel();
        lblAApellido = new javax.swing.JLabel();
        lblATelefono = new javax.swing.JLabel();
        lblACorreo = new javax.swing.JLabel();
        lblADireccion = new javax.swing.JLabel();
        lblAADireccion = new javax.swing.JLabel();
        lblAANombre = new javax.swing.JLabel();
        lblAAApellido = new javax.swing.JLabel();
        lblAATelefono = new javax.swing.JLabel();
        lblAACorreo = new javax.swing.JLabel();
        txtANombre = new javax.swing.JTextField();
        txtAApellido = new javax.swing.JTextField();
        txtATelefono = new javax.swing.JTextField();
        txtACorreo = new javax.swing.JTextField();
        txtADireccion = new javax.swing.JTextField();
        btnAValidar = new javax.swing.JButton();
        lblAPlan = new javax.swing.JLabel();
        cmbAPlan = new javax.swing.JComboBox<>();
        btnAModificar = new javax.swing.JButton();
        btnALimpiar = new javax.swing.JButton();
        btnAEliminar = new javax.swing.JButton();
        btnABuscar = new javax.swing.JButton();
        lblAEstado = new javax.swing.JLabel();
        cmbAEstado = new javax.swing.JComboBox<>();
        txtAID = new javax.swing.JTextField();
        btnACSesion = new javax.swing.JButton();
        txtAIID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblANombre.setText("Nombre:");

        lblAApellido.setText("Apellidos:");

        lblATelefono.setText("Telefono:");

        lblACorreo.setText("Correo electronico:");

        lblADireccion.setText("Direccion:");

        lblAADireccion.setForeground(new java.awt.Color(255, 51, 51));
        lblAADireccion.setText(" ");

        lblAANombre.setForeground(new java.awt.Color(255, 51, 51));
        lblAANombre.setText(" ");

        lblAAApellido.setForeground(new java.awt.Color(255, 51, 51));
        lblAAApellido.setText(" ");

        lblAATelefono.setForeground(new java.awt.Color(255, 51, 51));
        lblAATelefono.setText(" ");

        lblAACorreo.setForeground(new java.awt.Color(255, 51, 51));
        lblAACorreo.setText(" ");

        txtANombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtANombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtANombreKeyTyped(evt);
            }
        });

        txtAApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAApellidoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAApellidoKeyTyped(evt);
            }
        });

        txtATelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtATelefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtATelefonoKeyTyped(evt);
            }
        });

        txtACorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtACorreoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtACorreoKeyTyped(evt);
            }
        });

        txtADireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtADireccionActionPerformed(evt);
            }
        });
        txtADireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtADireccionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtADireccionKeyTyped(evt);
            }
        });

        btnAValidar.setText("Aceptar");
        btnAValidar.setEnabled(false);
        btnAValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAValidarActionPerformed(evt);
            }
        });

        lblAPlan.setText("Plan:");

        cmbAPlan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccciona", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13" }));

        btnAModificar.setText("Modificar");
        btnAModificar.setEnabled(false);
        btnAModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAModificarActionPerformed(evt);
            }
        });

        btnALimpiar.setText("Imprimir");
        btnALimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnALimpiarActionPerformed(evt);
            }
        });

        btnAEliminar.setText("Eliminar");
        btnAEliminar.setEnabled(false);
        btnAEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAEliminarActionPerformed(evt);
            }
        });

        btnABuscar.setText("Buscar");
        btnABuscar.setEnabled(false);
        btnABuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnABuscarActionPerformed(evt);
            }
        });

        lblAEstado.setText("Estado:");

        cmbAEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "selecciona", "a", "b", "s" }));

        btnACSesion.setText("cerrar sesion");
        btnACSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnACSesionActionPerformed(evt);
            }
        });

        txtAIID.setEnabled(false);
        txtAIID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAIIDActionPerformed(evt);
            }
        });
        txtAIID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAIIDKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAIIDKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAACorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblACorreo)
                                    .addComponent(lblADireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblANombre)
                                        .addComponent(lblAApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblATelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAANombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblAAApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblAATelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtANombre, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(cmbAPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lblAEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(cmbAEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(txtADireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtACorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtATelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(28, 28, 28)
                                                .addComponent(txtAID, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 19, Short.MAX_VALUE))))
                            .addComponent(lblAPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnABuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAValidar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnALimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(btnACSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(txtAIID, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblAADireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblANombre)
                    .addComponent(txtANombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(lblAANombre)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAApellido)
                    .addComponent(txtAApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(lblAAApellido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblATelefono)
                    .addComponent(txtATelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAATelefono)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblACorreo)
                    .addComponent(txtACorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(lblAACorreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblADireccion)
                    .addComponent(txtADireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAADireccion)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbAPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAPlan)
                    .addComponent(lblAEstado)
                    .addComponent(cmbAEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAValidar)
                    .addComponent(btnAModificar)
                    .addComponent(btnAEliminar)
                    .addComponent(btnALimpiar)
                    .addComponent(btnABuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnACSesion)
                    .addComponent(txtAIID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtADireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtADireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtADireccionActionPerformed

    private void txtANombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtANombreKeyTyped
        //introduce la restriccion ASCII para las cajas de texto
        int key = evt.getKeyChar();
        //usa el codigo ASCII para dar restriccion a la caja de texto
        boolean mayusculas = key >= 65 && key <= 90;
        boolean espacio = key == 32;
        //no admite los demas caracteres de ASCII que no esten en los rangos
        if (!(mayusculas || espacio)){
            evt.consume();
        }
        //restringe el rango de caracteres permitidos
        if (txtANombre.getText().length() >=32) {
            evt.consume();
        }
    }//GEN-LAST:event_txtANombreKeyTyped

    private void txtAApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAApellidoKeyTyped
        //introduce la restriccion ASCII para las cajas de texto
        int key = evt.getKeyChar();
        //usa el codigo ASCII para dar restriccion a la caja de texto
        boolean mayusculas = key >= 65 && key <= 90;
        boolean espacio = key == 32;
        //no admite los demas caracteres de ASCII que no esten en los rangos
        if (!(mayusculas || espacio)){
            evt.consume();
        }
        //restringe el rango de caracteres permitidos
        if (txtAApellido.getText().length() >=32) {
            evt.consume();
        }
    }//GEN-LAST:event_txtAApellidoKeyTyped

    private void txtATelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtATelefonoKeyTyped
        //introduce la restriccion ASCII para las cajas de texto
        int key = evt.getKeyChar();
        //usa el codigo ASCII para dar restriccion a la caja de texto
        boolean numeros= key >= 48 && key <= 57;
        //no admite los demas caracteres de ASCII que no esten en el rango
        if (!numeros){
            evt.consume();
        }
        //restringe el rango de caracteres permitidos
        if (txtATelefono.getText().length() >=10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtATelefonoKeyTyped

    private void txtACorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtACorreoKeyTyped
        //introduce la restriccion ASCII para las cajas de texto
        int key = evt.getKeyChar();
        //usa el codigo ASCII para dar restriccion a la caja de texto
        boolean minusculas = key >= 91 && key <= 255;
        boolean simbolos = key >= 33 && key <= 64;
        //no admite los demas caracteres de ASCII que no esten en los rangos
        if (!(minusculas || simbolos)){
            evt.consume();
        }
        //restringe el rango de caracteres permitidos
        if (txtACorreo.getText().length() >=256) {
            evt.consume();
        }
    }//GEN-LAST:event_txtACorreoKeyTyped

    private void txtADireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtADireccionKeyTyped
        //restringe el rango de caracteres permitidos
        if (txtADireccion.getText().length() >=256) {
            evt.consume();
        }
    }//GEN-LAST:event_txtADireccionKeyTyped

    private void txtANombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtANombreKeyReleased
        //valida las acciones que se programaron en la clase validar
        validar();
    }//GEN-LAST:event_txtANombreKeyReleased

    private void txtAApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAApellidoKeyReleased
        //valida las acciones que se programaron en la clase validar
        validar();
    }//GEN-LAST:event_txtAApellidoKeyReleased

    private void txtATelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtATelefonoKeyReleased
        //valida las acciones que se programaron en la clase validar
        validar();
    }//GEN-LAST:event_txtATelefonoKeyReleased

    private void txtACorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtACorreoKeyReleased
        //valida las acciones que se programaron en la clase validar
        validar();
    }//GEN-LAST:event_txtACorreoKeyReleased

    private void txtADireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtADireccionKeyReleased
        //valida las acciones que se programaron en la clase validar
        validar();
    }//GEN-LAST:event_txtADireccionKeyReleased

    private void btnAValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAValidarActionPerformed
        Connection con = null;
        try{
            con = getConnection();
            ps = (PreparedStatement) con.prepareStatement("INSERT INTO clientes(nombre, apellidos, direccion, telefono, plan_id, correo_electronico,status) VALUES(?,?,?,?,?,?,?)");
            ps.setString(1, txtANombre.getText());
            ps.setString(2, txtAApellido.getText());
            ps.setString(3, txtADireccion.getText());
            ps.setInt(4, Integer.parseInt(txtATelefono.getText()));
            ps.setString(5, cmbAPlan.getSelectedItem().toString() );
            ps.setString(6, txtACorreo.getText());
            ps.setString(7, cmbAEstado.getSelectedItem().toString() );
            
            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "guardado exitosamente");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "error al guardar");
            }
            con.close();
        } catch(HeadlessException | NumberFormatException | SQLException e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnAValidarActionPerformed

    private void btnABuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnABuscarActionPerformed
        Connection con = null;
        try {
            con = getConnection();
            ps = (PreparedStatement) con.prepareStatement("SELECT * FROM clientes WHERE nombre = ? and apellidos = ?");
            ps.setString(1, txtANombre.getText());
            ps.setString(2, txtAApellido.getText());
            
            rs = ps.executeQuery();
            
            if (rs.next()){
                txtAID.setText(rs.getString("cliente_id"));
                txtANombre.setText(rs.getString("nombre"));
                txtAApellido.setText(rs.getString("apellidos"));
                txtADireccion.setText(rs.getString("direccion"));
                txtATelefono.setText(rs.getString("telefono"));
                cmbAPlan.setSelectedItem(rs.getString("plan_id"));
                txtACorreo.setText(rs.getString("correo_electronico"));
                cmbAEstado.setSelectedItem(rs.getString("status"));
            } else {
                JOptionPane.showMessageDialog(null, "persona no identificada");
            }
        } catch(HeadlessException | SQLException e){
            System.err.println(e);
        }  
    }//GEN-LAST:event_btnABuscarActionPerformed

    private void btnAModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAModificarActionPerformed
        Connection con = null;
        try{
            con = getConnection();
            ps = (PreparedStatement) con.prepareStatement("UPDATE clientes SET nombre = ?, apellidos = ?, direccion = ?, telefono = ?, plan_id = ?, correo_electronico = ?, status = ? WHERE cliente_id = ?");
            ps.setString(1, txtANombre.getText());
            ps.setString(2, txtAApellido.getText());
            ps.setString(3, txtADireccion.getText());
            ps.setInt(4, Integer.parseInt(txtATelefono.getText()));
            ps.setString(5, cmbAPlan.getSelectedItem().toString());
            ps.setString(6, txtACorreo.getText());
            ps.setString(7, cmbAEstado.getSelectedItem().toString());
            ps.setString(8, txtAID.getText());
            
            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "actualizado exitosamente");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "error al guardar la modificacion");
            }
            con.close();
            
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_btnAModificarActionPerformed

    private void btnAEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAEliminarActionPerformed
        Connection con = null;
        try {
            con = getConnection();
            ps = (PreparedStatement) con.prepareStatement("DELETE FROM clientes WHERE cliente_id = ?");
            ps.setInt(1, Integer.parseInt(txtAID.getText()));
            
            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "eliminado exitosamente");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "error al eliminar");
            }
            con.close();
        }catch (HeadlessException | NumberFormatException | SQLException e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_btnAEliminarActionPerformed

    private void btnALimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnALimpiarActionPerformed
        Document documento = new Document();
       
        try {
            //GUARDAMOS LA RUTA EN CUALQUIER DISPOSITIVO
            PdfWriter.getInstance(documento, new FileOutputStream( "C:\\Users\\randa\\OneDrive\\Documentos\\NetBeansProjects\\CajaRegistradora\\test\\documentos\\reporte.pdf"));
            
            documento.open();
            
            PdfPTable tabla = new PdfPTable(5);
            tabla.addCell("nombre");
            tabla.addCell("apellidos");
            tabla.addCell("direccion");
            tabla.addCell("telefono");
            tabla.addCell("correo electronico");
            
            try {
                Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/punto_de_venta", "root", "");
                PreparedStatement pst = (PreparedStatement) con.prepareStatement("select nombre, apellidos, direccion, telefono, correo_electronico from clientes");
                
                ResultSet rs = pst.executeQuery();
                
                if(rs.next()){
                                       
                    do {                        
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                    } while (rs.next());
                    documento.add(tabla);                    
                }
                
            } catch (DocumentException | SQLException e) {
            }
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte creado.");
        } catch (DocumentException | HeadlessException | FileNotFoundException e){
            
        }
    }//GEN-LAST:event_btnALimpiarActionPerformed

    private void btnACSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnACSesionActionPerformed
        inicio ventana3 = new inicio();
        ventana3.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnACSesionActionPerformed

    private void txtAIIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAIIDKeyTyped
        
    }//GEN-LAST:event_txtAIIDKeyTyped
        
    private void txtAIIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAIIDKeyReleased
        validar();
    }//GEN-LAST:event_txtAIIDKeyReleased

    private void txtAIIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAIIDActionPerformed
        
    }//GEN-LAST:event_txtAIIDActionPerformed
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

          /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new prueba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnABuscar;
    private javax.swing.JButton btnACSesion;
    private javax.swing.JButton btnAEliminar;
    private javax.swing.JButton btnALimpiar;
    private javax.swing.JButton btnAModificar;
    private javax.swing.JButton btnAValidar;
    private javax.swing.JComboBox<String> cmbAEstado;
    private javax.swing.JComboBox<String> cmbAPlan;
    private javax.swing.JLabel lblAAApellido;
    private javax.swing.JLabel lblAACorreo;
    private javax.swing.JLabel lblAADireccion;
    private javax.swing.JLabel lblAANombre;
    private javax.swing.JLabel lblAATelefono;
    private javax.swing.JLabel lblAApellido;
    private javax.swing.JLabel lblACorreo;
    private javax.swing.JLabel lblADireccion;
    private javax.swing.JLabel lblAEstado;
    private javax.swing.JLabel lblANombre;
    private javax.swing.JLabel lblAPlan;
    private javax.swing.JLabel lblATelefono;
    private javax.swing.JTextField txtAApellido;
    private javax.swing.JTextField txtACorreo;
    private javax.swing.JTextField txtADireccion;
    private javax.swing.JTextField txtAID;
    private javax.swing.JTextField txtAIID;
    private javax.swing.JTextField txtANombre;
    private javax.swing.JTextField txtATelefono;
    // End of variables declaration//GEN-END:variables
}
