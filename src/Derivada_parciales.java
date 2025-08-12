
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Derivada_parciales extends javax.swing.JFrame {
 
    public Derivada_parciales() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/images/fondo_1.jpg")).getImage());
        this.setLocationRelativeTo(this);
        JP_Ecuacion.setVisible(true);
        TXT_Numero1.requestFocus();
        BTN_Paso2.setEnabled(false);
        BTN_Paso3.setEnabled(false);
        BTN_Limpiar.setEnabled(false);
    }

    @Override
    public void setLocationRelativeTo(Component c) {
        super.setLocationRelativeTo(c); //To change body of generated methods, choose Tools | Templates.
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JP_Ecuacion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TXT_Numero1 = new javax.swing.JTextField();
        BTN_Paso1 = new javax.swing.JButton();
        TXT_R1 = new javax.swing.JTextField();
        TXT_ExpoVariable1 = new javax.swing.JTextField();
        TXT_RVariable1 = new javax.swing.JTextField();
        TXT_R_Elevado1 = new javax.swing.JTextField();
        LB_Variable1 = new javax.swing.JLabel();
        LB_Variable2 = new javax.swing.JLabel();
        TXT_RVariable2 = new javax.swing.JTextField();
        LBL_SignoMas = new javax.swing.JLabel();
        TXT_SignoMas1 = new javax.swing.JTextField();
        TXT_ExpoVariable2 = new javax.swing.JTextField();
        TXT_R_Elevado2 = new javax.swing.JTextField();
        TXT_Numero2 = new javax.swing.JTextField();
        LB_Variable3 = new javax.swing.JLabel();
        LB_Variable4 = new javax.swing.JLabel();
        TXT_ExpoVariable3 = new javax.swing.JTextField();
        TXT_ExpoVariable4 = new javax.swing.JTextField();
        TXT_RVariable3 = new javax.swing.JTextField();
        TXT_R_Elevado3 = new javax.swing.JTextField();
        TXT_R3 = new javax.swing.JTextField();
        TXT_R2 = new javax.swing.JTextField();
        TXT_RVariable4 = new javax.swing.JTextField();
        TXT_R_Elevado4 = new javax.swing.JTextField();
        Ƌf = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Ƌx = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Ƌ2f = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Ƌx2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        TXT_R4 = new javax.swing.JTextField();
        TXT_RVariable5 = new javax.swing.JTextField();
        TXT_R_Elevado5 = new javax.swing.JTextField();
        TXT_R5 = new javax.swing.JTextField();
        TXT_RVariable6 = new javax.swing.JTextField();
        TXT_R_Elevado6 = new javax.swing.JTextField();
        TXT_SignoMas2 = new javax.swing.JTextField();
        TXT_RVariable7 = new javax.swing.JTextField();
        TXT_R_Elevado7 = new javax.swing.JTextField();
        TXT_R6 = new javax.swing.JTextField();
        TXT_RVariable8 = new javax.swing.JTextField();
        TXT_R_Elevado8 = new javax.swing.JTextField();
        X_TXT_R1 = new javax.swing.JTextField();
        BTN_Paso2 = new javax.swing.JButton();
        X_TXT_RVariable1 = new javax.swing.JTextField();
        X_TXT_R_Elevado1 = new javax.swing.JTextField();
        X_TXT_RVariable2 = new javax.swing.JTextField();
        X_TXT_SignoMas1 = new javax.swing.JTextField();
        X_TXT_R_Elevado2 = new javax.swing.JTextField();
        X_TXT_R2 = new javax.swing.JTextField();
        X_TXT_RVariable3 = new javax.swing.JTextField();
        x_TXT_R_Elevado3 = new javax.swing.JTextField();
        X_TXT_R3 = new javax.swing.JTextField();
        X_TXT_RVariable4 = new javax.swing.JTextField();
        X_TXT_R_Elevado4 = new javax.swing.JTextField();
        X_TXT_R4 = new javax.swing.JTextField();
        X_TXT_RVariable5 = new javax.swing.JTextField();
        X_TXT_R_Elevado5 = new javax.swing.JTextField();
        X_TXT_R5 = new javax.swing.JTextField();
        X_TXT_RVariable6 = new javax.swing.JTextField();
        X_TXT_R_Elevado6 = new javax.swing.JTextField();
        X_TXT_SignoMas2 = new javax.swing.JTextField();
        X_TXT_R6 = new javax.swing.JTextField();
        X_TXT_RVariable7 = new javax.swing.JTextField();
        X_TXT_R_Elevado7 = new javax.swing.JTextField();
        X_TXT_R7 = new javax.swing.JTextField();
        X_TXT_RVariable8 = new javax.swing.JTextField();
        X_TXT_R_Elevado8 = new javax.swing.JTextField();
        BTN_Paso3 = new javax.swing.JButton();
        Y_TXT_R1 = new javax.swing.JTextField();
        Y_TXT_RVariable1 = new javax.swing.JTextField();
        Y_TXT_R_Elevado1 = new javax.swing.JTextField();
        Y_TXT_R2 = new javax.swing.JTextField();
        Y_TXT_RVariable2 = new javax.swing.JTextField();
        Y_TXT_R_Elevado2 = new javax.swing.JTextField();
        Y_TXT_SignoMas1 = new javax.swing.JTextField();
        Y_TXT_R3 = new javax.swing.JTextField();
        Y_TXT_RVariable3 = new javax.swing.JTextField();
        Y_TXT_R_Elevado3 = new javax.swing.JTextField();
        Y_TXT_R4 = new javax.swing.JTextField();
        Y_TXT_RVariable4 = new javax.swing.JTextField();
        Y_TXT_R_Elevado4 = new javax.swing.JTextField();
        Y_TXT_R5 = new javax.swing.JTextField();
        Y_TXT_RVariable5 = new javax.swing.JTextField();
        Y_TXT_R_Elevado5 = new javax.swing.JTextField();
        Y_TXT_R6 = new javax.swing.JTextField();
        Y_TXT_RVariable6 = new javax.swing.JTextField();
        Y_TXT_R_Elevado6 = new javax.swing.JTextField();
        Y_TXT_SignoMas2 = new javax.swing.JTextField();
        Y_TXT_RVariable7 = new javax.swing.JTextField();
        Y_TXT_R_Elevado7 = new javax.swing.JTextField();
        Y_TXT_R7 = new javax.swing.JTextField();
        Y_TXT_RVariable8 = new javax.swing.JTextField();
        Y_TXT_R_Elevado8 = new javax.swing.JTextField();
        BTN_Limpiar = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Derivadas Praciales de Orden Superior");
        setMinimumSize(new java.awt.Dimension(790, 530));
        setName("Derivadas_Parciales"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JP_Ecuacion.setBackground(new java.awt.Color(153, 153, 255));
        JP_Ecuacion.setMaximumSize(new java.awt.Dimension(790, 530));
        JP_Ecuacion.setMinimumSize(new java.awt.Dimension(790, 530));
        JP_Ecuacion.setPreferredSize(new java.awt.Dimension(790, 530));
        JP_Ecuacion.setVerifyInputWhenFocusTarget(false);
        JP_Ecuacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Derivadas Parciales de Orden Superior");
        JP_Ecuacion.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 11, 780, 30));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ingresar los valores :");
        JP_Ecuacion.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 370, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("f(x,y)=");
        JP_Ecuacion.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 60, -1));

        TXT_Numero1.setBackground(new java.awt.Color(204, 204, 255));
        TXT_Numero1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TXT_Numero1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_Numero1.setNextFocusableComponent(TXT_ExpoVariable1);
        JP_Ecuacion.add(TXT_Numero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 30, 40));

        BTN_Paso1.setBackground(new java.awt.Color(0, 153, 153));
        BTN_Paso1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        BTN_Paso1.setText("Paso #1");
        BTN_Paso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Paso1ActionPerformed(evt);
            }
        });
        JP_Ecuacion.add(BTN_Paso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, -1));

        TXT_R1.setEditable(false);
        TXT_R1.setBackground(new java.awt.Color(153, 255, 204));
        TXT_R1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(TXT_R1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 30, 40));

        TXT_ExpoVariable1.setBackground(new java.awt.Color(204, 204, 255));
        TXT_ExpoVariable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TXT_ExpoVariable1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_ExpoVariable1.setNextFocusableComponent(TXT_ExpoVariable2);
        TXT_ExpoVariable1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_ExpoVariable1ActionPerformed(evt);
            }
        });
        JP_Ecuacion.add(TXT_ExpoVariable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 20, -1));

        TXT_RVariable1.setEditable(false);
        TXT_RVariable1.setBackground(new java.awt.Color(153, 255, 204));
        TXT_RVariable1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_RVariable1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXT_RVariable1FocusLost(evt);
            }
        });
        JP_Ecuacion.add(TXT_RVariable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 20, -1));

        TXT_R_Elevado1.setEditable(false);
        TXT_R_Elevado1.setBackground(new java.awt.Color(153, 255, 204));
        TXT_R_Elevado1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(TXT_R_Elevado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 20, -1));

        LB_Variable1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LB_Variable1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LB_Variable1.setText("X");
        JP_Ecuacion.add(LB_Variable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 20, 20));

        LB_Variable2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LB_Variable2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LB_Variable2.setText("Y");
        JP_Ecuacion.add(LB_Variable2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 20, 20));

        TXT_RVariable2.setEditable(false);
        TXT_RVariable2.setBackground(new java.awt.Color(153, 255, 204));
        TXT_RVariable2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(TXT_RVariable2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 20, -1));

        LBL_SignoMas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LBL_SignoMas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_SignoMas.setText("+");
        JP_Ecuacion.add(LBL_SignoMas, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 20, 20));

        TXT_SignoMas1.setEditable(false);
        TXT_SignoMas1.setBackground(new java.awt.Color(153, 255, 204));
        TXT_SignoMas1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(TXT_SignoMas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 20, -1));

        TXT_ExpoVariable2.setBackground(new java.awt.Color(204, 204, 255));
        TXT_ExpoVariable2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TXT_ExpoVariable2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_ExpoVariable2.setNextFocusableComponent(TXT_ExpoVariable3);
        JP_Ecuacion.add(TXT_ExpoVariable2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 20, -1));

        TXT_R_Elevado2.setEditable(false);
        TXT_R_Elevado2.setBackground(new java.awt.Color(153, 255, 204));
        TXT_R_Elevado2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(TXT_R_Elevado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 20, -1));

        TXT_Numero2.setBackground(new java.awt.Color(204, 204, 255));
        TXT_Numero2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TXT_Numero2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_Numero2.setNextFocusableComponent(TXT_ExpoVariable4);
        TXT_Numero2.setOpaque(false);
        JP_Ecuacion.add(TXT_Numero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 30, 40));

        LB_Variable3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LB_Variable3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LB_Variable3.setText("X");
        JP_Ecuacion.add(LB_Variable3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 20, 20));

        LB_Variable4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LB_Variable4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LB_Variable4.setText("Y");
        JP_Ecuacion.add(LB_Variable4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 20, 20));

        TXT_ExpoVariable3.setBackground(new java.awt.Color(204, 204, 255));
        TXT_ExpoVariable3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TXT_ExpoVariable3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_ExpoVariable3.setNextFocusableComponent(TXT_Numero2);
        JP_Ecuacion.add(TXT_ExpoVariable3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 20, -1));

        TXT_ExpoVariable4.setBackground(new java.awt.Color(204, 204, 255));
        TXT_ExpoVariable4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TXT_ExpoVariable4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_ExpoVariable4.setNextFocusableComponent(BTN_Paso1);
        JP_Ecuacion.add(TXT_ExpoVariable4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 20, -1));

        TXT_RVariable3.setEditable(false);
        TXT_RVariable3.setBackground(new java.awt.Color(153, 255, 204));
        TXT_RVariable3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(TXT_RVariable3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 20, -1));

        TXT_R_Elevado3.setEditable(false);
        TXT_R_Elevado3.setBackground(new java.awt.Color(153, 255, 204));
        TXT_R_Elevado3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(TXT_R_Elevado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 20, -1));

        TXT_R3.setEditable(false);
        TXT_R3.setBackground(new java.awt.Color(153, 255, 204));
        TXT_R3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(TXT_R3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 30, 40));

        TXT_R2.setEditable(false);
        TXT_R2.setBackground(new java.awt.Color(153, 255, 204));
        TXT_R2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(TXT_R2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 30, 40));

        TXT_RVariable4.setEditable(false);
        TXT_RVariable4.setBackground(new java.awt.Color(153, 255, 204));
        TXT_RVariable4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(TXT_RVariable4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 20, -1));

        TXT_R_Elevado4.setEditable(false);
        TXT_R_Elevado4.setBackground(new java.awt.Color(153, 255, 204));
        TXT_R_Elevado4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(TXT_R_Elevado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 20, -1));

        Ƌf.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Ƌf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ƌf.setText("Ƌ f");
        JP_Ecuacion.add(Ƌf, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 195, 30, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JP_Ecuacion.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 30, 10));

        Ƌx.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Ƌx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ƌx.setText("Ƌ x");
        JP_Ecuacion.add(Ƌx, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 30, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("= ");
        JP_Ecuacion.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 200, -1, 24));

        Ƌ2f.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Ƌ2f.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ƌ2f.setText("Ƌ² f");
        Ƌ2f.setName("Ƌ² f"); // NOI18N
        JP_Ecuacion.add(Ƌ2f, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 305, 30, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        JP_Ecuacion.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 30, 10));

        Ƌx2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Ƌx2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ƌx2.setText("Ƌ x² ");
        JP_Ecuacion.add(Ƌx2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 30, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Ƌ f");
        JP_Ecuacion.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 185, 30, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        JP_Ecuacion.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 30, 10));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Ƌ y");
        JP_Ecuacion.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 203, 30, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Ƌ² f");
        JP_Ecuacion.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 423, 30, -1));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JP_Ecuacion.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 438, 28, 15));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Ƌx Ƌy");
        JP_Ecuacion.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 50, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Ƌ² f");
        JP_Ecuacion.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 415, 30, -1));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JP_Ecuacion.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 30, 15));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Ƌy²");
        JP_Ecuacion.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 433, 35, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Ƌ² f");
        JP_Ecuacion.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 305, 30, -1));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        JP_Ecuacion.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 30, 12));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Ƌy Ƌx ");
        JP_Ecuacion.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 323, 40, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("= ");
        JP_Ecuacion.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 414, -1, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("= ");
        JP_Ecuacion.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 300, -1, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("= ");
        JP_Ecuacion.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 419, -1, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("= ");
        JP_Ecuacion.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 180, -1, 40));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("= ");
        JP_Ecuacion.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 300, -1, 40));

        TXT_R4.setEditable(false);
        TXT_R4.setBackground(new java.awt.Color(102, 204, 255));
        TXT_R4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(TXT_R4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 30, 40));

        TXT_RVariable5.setEditable(false);
        TXT_RVariable5.setBackground(new java.awt.Color(102, 204, 255));
        TXT_RVariable5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(TXT_RVariable5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 20, -1));

        TXT_R_Elevado5.setEditable(false);
        TXT_R_Elevado5.setBackground(new java.awt.Color(102, 204, 255));
        TXT_R_Elevado5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(TXT_R_Elevado5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 20, -1));

        TXT_R5.setEditable(false);
        TXT_R5.setBackground(new java.awt.Color(102, 204, 255));
        TXT_R5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(TXT_R5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 30, 40));

        TXT_RVariable6.setEditable(false);
        TXT_RVariable6.setBackground(new java.awt.Color(102, 204, 255));
        TXT_RVariable6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(TXT_RVariable6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 20, -1));

        TXT_R_Elevado6.setEditable(false);
        TXT_R_Elevado6.setBackground(new java.awt.Color(102, 204, 255));
        TXT_R_Elevado6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(TXT_R_Elevado6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 20, -1));

        TXT_SignoMas2.setEditable(false);
        TXT_SignoMas2.setBackground(new java.awt.Color(102, 204, 255));
        TXT_SignoMas2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(TXT_SignoMas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 20, -1));

        TXT_RVariable7.setEditable(false);
        TXT_RVariable7.setBackground(new java.awt.Color(102, 204, 255));
        TXT_RVariable7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(TXT_RVariable7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 20, -1));

        TXT_R_Elevado7.setEditable(false);
        TXT_R_Elevado7.setBackground(new java.awt.Color(102, 204, 255));
        TXT_R_Elevado7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(TXT_R_Elevado7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 20, -1));

        TXT_R6.setEditable(false);
        TXT_R6.setBackground(new java.awt.Color(102, 204, 255));
        TXT_R6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(TXT_R6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 30, 40));

        TXT_RVariable8.setEditable(false);
        TXT_RVariable8.setBackground(new java.awt.Color(102, 204, 255));
        TXT_RVariable8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(TXT_RVariable8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 20, -1));

        TXT_R_Elevado8.setEditable(false);
        TXT_R_Elevado8.setBackground(new java.awt.Color(102, 204, 255));
        TXT_R_Elevado8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(TXT_R_Elevado8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, 20, -1));

        X_TXT_R1.setEditable(false);
        X_TXT_R1.setBackground(new java.awt.Color(153, 255, 204));
        X_TXT_R1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(X_TXT_R1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 30, 40));

        BTN_Paso2.setBackground(new java.awt.Color(0, 153, 153));
        BTN_Paso2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        BTN_Paso2.setText("Paso #2");
        BTN_Paso2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Paso2ActionPerformed(evt);
            }
        });
        JP_Ecuacion.add(BTN_Paso2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, -1, -1));

        X_TXT_RVariable1.setEditable(false);
        X_TXT_RVariable1.setBackground(new java.awt.Color(153, 255, 204));
        X_TXT_RVariable1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(X_TXT_RVariable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 20, -1));

        X_TXT_R_Elevado1.setEditable(false);
        X_TXT_R_Elevado1.setBackground(new java.awt.Color(153, 255, 204));
        X_TXT_R_Elevado1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(X_TXT_R_Elevado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 20, -1));

        X_TXT_RVariable2.setEditable(false);
        X_TXT_RVariable2.setBackground(new java.awt.Color(153, 255, 204));
        X_TXT_RVariable2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(X_TXT_RVariable2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 20, -1));

        X_TXT_SignoMas1.setEditable(false);
        X_TXT_SignoMas1.setBackground(new java.awt.Color(153, 255, 204));
        X_TXT_SignoMas1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(X_TXT_SignoMas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 20, -1));

        X_TXT_R_Elevado2.setEditable(false);
        X_TXT_R_Elevado2.setBackground(new java.awt.Color(153, 255, 204));
        X_TXT_R_Elevado2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(X_TXT_R_Elevado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 20, -1));

        X_TXT_R2.setEditable(false);
        X_TXT_R2.setBackground(new java.awt.Color(153, 255, 204));
        X_TXT_R2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(X_TXT_R2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 30, 40));

        X_TXT_RVariable3.setEditable(false);
        X_TXT_RVariable3.setBackground(new java.awt.Color(153, 255, 204));
        JP_Ecuacion.add(X_TXT_RVariable3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 20, -1));

        x_TXT_R_Elevado3.setEditable(false);
        x_TXT_R_Elevado3.setBackground(new java.awt.Color(153, 255, 204));
        JP_Ecuacion.add(x_TXT_R_Elevado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 20, -1));

        X_TXT_R3.setEditable(false);
        X_TXT_R3.setBackground(new java.awt.Color(153, 255, 204));
        X_TXT_R3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(X_TXT_R3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 30, 40));

        X_TXT_RVariable4.setEditable(false);
        X_TXT_RVariable4.setBackground(new java.awt.Color(153, 255, 204));
        X_TXT_RVariable4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(X_TXT_RVariable4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 20, -1));

        X_TXT_R_Elevado4.setEditable(false);
        X_TXT_R_Elevado4.setBackground(new java.awt.Color(153, 255, 204));
        X_TXT_R_Elevado4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(X_TXT_R_Elevado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 20, -1));

        X_TXT_R4.setEditable(false);
        X_TXT_R4.setBackground(new java.awt.Color(153, 255, 204));
        X_TXT_R4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(X_TXT_R4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 30, 40));

        X_TXT_RVariable5.setEditable(false);
        X_TXT_RVariable5.setBackground(new java.awt.Color(153, 255, 204));
        X_TXT_RVariable5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(X_TXT_RVariable5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 20, -1));

        X_TXT_R_Elevado5.setEditable(false);
        X_TXT_R_Elevado5.setBackground(new java.awt.Color(153, 255, 204));
        X_TXT_R_Elevado5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(X_TXT_R_Elevado5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 20, -1));

        X_TXT_R5.setEditable(false);
        X_TXT_R5.setBackground(new java.awt.Color(153, 255, 204));
        X_TXT_R5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(X_TXT_R5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 30, 40));

        X_TXT_RVariable6.setEditable(false);
        X_TXT_RVariable6.setBackground(new java.awt.Color(153, 255, 204));
        X_TXT_RVariable6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(X_TXT_RVariable6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 20, -1));

        X_TXT_R_Elevado6.setEditable(false);
        X_TXT_R_Elevado6.setBackground(new java.awt.Color(153, 255, 204));
        X_TXT_R_Elevado6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(X_TXT_R_Elevado6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 20, -1));

        X_TXT_SignoMas2.setEditable(false);
        X_TXT_SignoMas2.setBackground(new java.awt.Color(153, 255, 204));
        X_TXT_SignoMas2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(X_TXT_SignoMas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 20, -1));

        X_TXT_R6.setEditable(false);
        X_TXT_R6.setBackground(new java.awt.Color(153, 255, 204));
        X_TXT_R6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(X_TXT_R6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 30, 40));

        X_TXT_RVariable7.setEditable(false);
        X_TXT_RVariable7.setBackground(new java.awt.Color(153, 255, 204));
        X_TXT_RVariable7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(X_TXT_RVariable7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, 20, -1));

        X_TXT_R_Elevado7.setEditable(false);
        X_TXT_R_Elevado7.setBackground(new java.awt.Color(153, 255, 204));
        X_TXT_R_Elevado7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(X_TXT_R_Elevado7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 20, -1));

        X_TXT_R7.setEditable(false);
        X_TXT_R7.setBackground(new java.awt.Color(153, 255, 204));
        X_TXT_R7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(X_TXT_R7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, 30, 40));

        X_TXT_RVariable8.setEditable(false);
        X_TXT_RVariable8.setBackground(new java.awt.Color(153, 255, 204));
        X_TXT_RVariable8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(X_TXT_RVariable8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 310, 20, -1));

        X_TXT_R_Elevado8.setEditable(false);
        X_TXT_R_Elevado8.setBackground(new java.awt.Color(153, 255, 204));
        X_TXT_R_Elevado8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(X_TXT_R_Elevado8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, 20, -1));

        BTN_Paso3.setBackground(new java.awt.Color(0, 153, 153));
        BTN_Paso3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        BTN_Paso3.setText("Paso #3");
        BTN_Paso3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Paso3ActionPerformed(evt);
            }
        });
        JP_Ecuacion.add(BTN_Paso3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, -1, -1));

        Y_TXT_R1.setEditable(false);
        Y_TXT_R1.setBackground(new java.awt.Color(102, 204, 255));
        Y_TXT_R1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(Y_TXT_R1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 30, 40));

        Y_TXT_RVariable1.setEditable(false);
        Y_TXT_RVariable1.setBackground(new java.awt.Color(102, 204, 255));
        Y_TXT_RVariable1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(Y_TXT_RVariable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 20, -1));

        Y_TXT_R_Elevado1.setEditable(false);
        Y_TXT_R_Elevado1.setBackground(new java.awt.Color(102, 204, 255));
        Y_TXT_R_Elevado1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(Y_TXT_R_Elevado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 20, -1));

        Y_TXT_R2.setEditable(false);
        Y_TXT_R2.setBackground(new java.awt.Color(102, 204, 255));
        Y_TXT_R2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(Y_TXT_R2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 30, 40));

        Y_TXT_RVariable2.setEditable(false);
        Y_TXT_RVariable2.setBackground(new java.awt.Color(102, 204, 255));
        Y_TXT_RVariable2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(Y_TXT_RVariable2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 20, -1));

        Y_TXT_R_Elevado2.setEditable(false);
        Y_TXT_R_Elevado2.setBackground(new java.awt.Color(102, 204, 255));
        Y_TXT_R_Elevado2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(Y_TXT_R_Elevado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 20, -1));

        Y_TXT_SignoMas1.setEditable(false);
        Y_TXT_SignoMas1.setBackground(new java.awt.Color(102, 204, 255));
        Y_TXT_SignoMas1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(Y_TXT_SignoMas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 20, -1));

        Y_TXT_R3.setEditable(false);
        Y_TXT_R3.setBackground(new java.awt.Color(102, 204, 255));
        Y_TXT_R3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(Y_TXT_R3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 30, 40));

        Y_TXT_RVariable3.setEditable(false);
        Y_TXT_RVariable3.setBackground(new java.awt.Color(102, 204, 255));
        Y_TXT_RVariable3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(Y_TXT_RVariable3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 20, -1));

        Y_TXT_R_Elevado3.setEditable(false);
        Y_TXT_R_Elevado3.setBackground(new java.awt.Color(102, 204, 255));
        Y_TXT_R_Elevado3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(Y_TXT_R_Elevado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 20, -1));

        Y_TXT_R4.setEditable(false);
        Y_TXT_R4.setBackground(new java.awt.Color(102, 204, 255));
        Y_TXT_R4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(Y_TXT_R4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 30, 40));

        Y_TXT_RVariable4.setEditable(false);
        Y_TXT_RVariable4.setBackground(new java.awt.Color(102, 204, 255));
        Y_TXT_RVariable4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(Y_TXT_RVariable4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 20, -1));

        Y_TXT_R_Elevado4.setEditable(false);
        Y_TXT_R_Elevado4.setBackground(new java.awt.Color(102, 204, 255));
        Y_TXT_R_Elevado4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(Y_TXT_R_Elevado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, 20, -1));

        Y_TXT_R5.setEditable(false);
        Y_TXT_R5.setBackground(new java.awt.Color(102, 204, 255));
        Y_TXT_R5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(Y_TXT_R5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 30, 40));

        Y_TXT_RVariable5.setEditable(false);
        Y_TXT_RVariable5.setBackground(new java.awt.Color(102, 204, 255));
        Y_TXT_RVariable5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(Y_TXT_RVariable5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 20, -1));

        Y_TXT_R_Elevado5.setEditable(false);
        Y_TXT_R_Elevado5.setBackground(new java.awt.Color(102, 204, 255));
        Y_TXT_R_Elevado5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(Y_TXT_R_Elevado5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 20, -1));

        Y_TXT_R6.setEditable(false);
        Y_TXT_R6.setBackground(new java.awt.Color(102, 204, 255));
        Y_TXT_R6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(Y_TXT_R6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, 30, 40));

        Y_TXT_RVariable6.setEditable(false);
        Y_TXT_RVariable6.setBackground(new java.awt.Color(102, 204, 255));
        Y_TXT_RVariable6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(Y_TXT_RVariable6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, 20, -1));

        Y_TXT_R_Elevado6.setEditable(false);
        Y_TXT_R_Elevado6.setBackground(new java.awt.Color(102, 204, 255));
        Y_TXT_R_Elevado6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(Y_TXT_R_Elevado6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 20, -1));

        Y_TXT_SignoMas2.setEditable(false);
        Y_TXT_SignoMas2.setBackground(new java.awt.Color(102, 204, 255));
        Y_TXT_SignoMas2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(Y_TXT_SignoMas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, 20, -1));

        Y_TXT_RVariable7.setEditable(false);
        Y_TXT_RVariable7.setBackground(new java.awt.Color(102, 204, 255));
        Y_TXT_RVariable7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(Y_TXT_RVariable7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, 20, -1));

        Y_TXT_R_Elevado7.setEditable(false);
        Y_TXT_R_Elevado7.setBackground(new java.awt.Color(102, 204, 255));
        Y_TXT_R_Elevado7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(Y_TXT_R_Elevado7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 410, 20, -1));

        Y_TXT_R7.setEditable(false);
        Y_TXT_R7.setBackground(new java.awt.Color(102, 204, 255));
        Y_TXT_R7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(Y_TXT_R7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, 30, 40));

        Y_TXT_RVariable8.setEditable(false);
        Y_TXT_RVariable8.setBackground(new java.awt.Color(102, 204, 255));
        Y_TXT_RVariable8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(Y_TXT_RVariable8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 430, 20, -1));

        Y_TXT_R_Elevado8.setEditable(false);
        Y_TXT_R_Elevado8.setBackground(new java.awt.Color(102, 204, 255));
        Y_TXT_R_Elevado8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JP_Ecuacion.add(Y_TXT_R_Elevado8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 20, -1));

        BTN_Limpiar.setBackground(new java.awt.Color(0, 153, 153));
        BTN_Limpiar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        BTN_Limpiar.setText("LIMPIAR");
        BTN_Limpiar.setToolTipText("Deja las casillas en ceros para operarlas de nuevo");
        BTN_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_LimpiarActionPerformed(evt);
            }
        });
        JP_Ecuacion.add(BTN_Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, -1, -1));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo_1.jpg"))); // NOI18N
        jLabel18.setEnabled(false);
        jLabel18.setOpaque(true);
        JP_Ecuacion.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 530));

        getContentPane().add(JP_Ecuacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_Paso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Paso1ActionPerformed
          
        if(TXT_Numero1.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor Digite un valor en la calilla 1");
            TXT_Numero1.requestFocus();
        }else if(TXT_ExpoVariable1.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor Digite un valor en la calilla 2");
            TXT_ExpoVariable1.requestFocus();
        }else if(TXT_ExpoVariable2.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor Digite un valor en la calilla 3");
            TXT_ExpoVariable2.requestFocus();
        }else if(TXT_ExpoVariable3.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor Digite un valor en la calilla 4");
            TXT_ExpoVariable3.requestFocus();
        }else if (TXT_Numero2.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor Digite un valor en la calilla 5");
            TXT_Numero2.requestFocus();
        }else if(TXT_ExpoVariable4.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor Digite un valor en la calilla 6");
            TXT_ExpoVariable4.requestFocus();
        }else {
        int A,C,H,K,F,L,R1,R2,R3,R4,R5,R6,R7,R8;
        String B,D,E,G;
        A = Integer.parseInt(TXT_Numero1.getText()); //aca se recoge el numero 1
        B = LB_Variable1.getText();                 //aca se recoge la variable 1
        C = Integer.parseInt(TXT_ExpoVariable1.getText());  //aca se recoge el exponente variable 1
        D = LB_Variable2.getText();
        E = LBL_SignoMas.getText();
        F = Integer.parseInt(TXT_ExpoVariable2.getText());
        G = LB_Variable3.getText();
        H = Integer.parseInt(TXT_ExpoVariable3.getText());
        K = Integer.parseInt(TXT_Numero2.getText());
        L = Integer.parseInt(TXT_ExpoVariable4.getText());
        
         R1 = A*C;
         R2 = C-1;
         R3 = 1*H;
         R4 = H-1;
         R5 = 1*F;
         R6 = F-1;
         R7 = K*L;
         R8 = L-1;
         
        TXT_R1.setText(""+R1);
        TXT_RVariable1.setText(""+B);
        TXT_R_Elevado1.setText(""+R2);
        TXT_RVariable2.setText(""+D);
        TXT_SignoMas1.setText(""+E);
        TXT_R_Elevado2.setText(""+F);
        TXT_RVariable3.setText(""+G);
        TXT_R2.setText(""+R3);
        TXT_R_Elevado3.setText(""+R4);
        TXT_R3.setText(""+K);
        TXT_RVariable4.setText(LB_Variable4.getText());
        TXT_R_Elevado4.setText(""+L);
        TXT_R4.setText(TXT_Numero1.getText());
        TXT_RVariable5.setText(LB_Variable1.getText());
        TXT_R_Elevado5.setText(TXT_ExpoVariable1.getText());
        TXT_R5.setText(""+R5);
        TXT_RVariable6.setText(LB_Variable2.getText());
        TXT_R_Elevado6.setText(""+R6);
        TXT_SignoMas2.setText(LBL_SignoMas.getText());
        TXT_RVariable7.setText(LB_Variable3.getText());
        TXT_R_Elevado7.setText(TXT_ExpoVariable3.getText());
        TXT_R6.setText(""+R7);
        TXT_RVariable8.setText(LB_Variable4.getText());
        TXT_R_Elevado8.setText(""+R8);
        
        BTN_Paso2.setEnabled(true);
        
        }
    }//GEN-LAST:event_BTN_Paso1ActionPerformed

    private void TXT_ExpoVariable1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_ExpoVariable1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_ExpoVariable1ActionPerformed

    private void TXT_RVariable1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXT_RVariable1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_RVariable1FocusLost

    private void BTN_Paso2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Paso2ActionPerformed
        
        int A,B,C,D,E,F,G,H,I,J,K,R1,R2,R3,R4,R5,R6,R7,R8;
        
        A = Integer.parseInt(TXT_R1.getText());
        B = Integer.parseInt(TXT_R_Elevado1.getText());
        C = Integer.parseInt(TXT_R_Elevado1.getText());
        D = Integer.parseInt(TXT_R2.getText());
        E = Integer.parseInt(TXT_R_Elevado3.getText());
        F = Integer.parseInt(TXT_R_Elevado3.getText());
        G = Integer.parseInt(TXT_R_Elevado2.getText());
        H = Integer.parseInt(TXT_R_Elevado2.getText());
        I = Integer.parseInt(TXT_R3.getText());
        J = Integer.parseInt(TXT_R_Elevado4.getText());
        K = Integer.parseInt(TXT_R_Elevado4.getText());        
        
        R1 = A*B;
        R2 = C-1;
        R3 = D*E;
        R4 = F-1;
        R5 = 1*G;
        R6 = H-1;
        R7 = I*J;
        R8 = K-1;
        
        X_TXT_R1.setText(""+R1);
        X_TXT_RVariable1.setText(TXT_RVariable1.getText());
        X_TXT_R_Elevado1.setText(""+R2);
        X_TXT_RVariable2.setText(TXT_RVariable2.getText());
        X_TXT_R_Elevado2.setText(TXT_R_Elevado2.getText());
        X_TXT_SignoMas1.setText(TXT_SignoMas1.getText());
        X_TXT_R2.setText(""+R3);
        X_TXT_RVariable3.setText(TXT_RVariable3.getText());
        x_TXT_R_Elevado3.setText(""+R4);
        X_TXT_R3.setText(TXT_R3.getText());
        X_TXT_RVariable4.setText(TXT_RVariable4.getText());
        X_TXT_R_Elevado4.setText(TXT_R_Elevado4.getText());
        X_TXT_R4.setText(TXT_R1.getText());
        X_TXT_RVariable5.setText(TXT_RVariable1.getText());
        X_TXT_R_Elevado5.setText(TXT_R_Elevado1.getText());
        X_TXT_R5.setText(""+R5);
        X_TXT_RVariable6.setText(TXT_RVariable2.getText());
        X_TXT_R_Elevado6.setText(""+R6);
        X_TXT_SignoMas2.setText(TXT_SignoMas1.getText());
        X_TXT_R6.setText(TXT_R2.getText());
        X_TXT_RVariable7.setText(TXT_RVariable3.getText());
        X_TXT_R_Elevado7.setText(TXT_R_Elevado3.getText());
        X_TXT_R7.setText(""+R7);
        X_TXT_RVariable8.setText(TXT_RVariable4.getText());
        X_TXT_R_Elevado8.setText(""+R8);
        
        BTN_Paso3.setEnabled(true);
        
    }//GEN-LAST:event_BTN_Paso2ActionPerformed

    private void BTN_Paso3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Paso3ActionPerformed
        
        int A,B,C,D,E,F,G,H,I,J,K,R1,R2,R3,R4,R5,R6,R7,R8;
        
        A = Integer.parseInt(TXT_R4.getText());
        B = Integer.parseInt(TXT_R_Elevado5.getText());
        C = Integer.parseInt(TXT_R_Elevado5.getText());
        D = Integer.parseInt(TXT_R_Elevado7.getText());
        E = Integer.parseInt(TXT_R_Elevado7.getText());
        F = Integer.parseInt(TXT_R5.getText());
        G = Integer.parseInt(TXT_R_Elevado6.getText());
        H = Integer.parseInt(TXT_R_Elevado6.getText());
        I = Integer.parseInt(TXT_R6.getText());
        J = Integer.parseInt(TXT_R_Elevado8.getText());
        K = Integer.parseInt(TXT_R_Elevado8.getText());
        
        R1 = A*B;
        R2 = C-1;
        R3 = 1*D;
        R4 = E-1;
        R5 = F*G;
        R6 = H-1;
        R7 = I*J;
        R8 = K-1;
        
        Y_TXT_R1.setText(""+R1);
        Y_TXT_RVariable1.setText(TXT_RVariable5.getText());
        Y_TXT_R_Elevado1.setText(""+R2);
        Y_TXT_R2.setText(TXT_R5.getText());
        Y_TXT_RVariable2.setText(TXT_RVariable6.getText());
        Y_TXT_R_Elevado2.setText(TXT_R_Elevado6.getText());
        Y_TXT_SignoMas1.setText(TXT_SignoMas2.getText());
        Y_TXT_R3.setText(""+R3);
        Y_TXT_RVariable3.setText(TXT_RVariable7.getText());
        Y_TXT_R_Elevado3.setText(""+R4);
        Y_TXT_R4.setText(TXT_R6.getText());
        Y_TXT_RVariable4.setText(TXT_RVariable8.getText());
        Y_TXT_R_Elevado4.setText(X_TXT_R_Elevado8.getText());
        Y_TXT_R5.setText(TXT_R4.getText());
        Y_TXT_RVariable5.setText(TXT_RVariable5.getText());
        Y_TXT_R_Elevado5.setText(TXT_R_Elevado5.getText());
        Y_TXT_R6.setText(""+R5);
        Y_TXT_RVariable6.setText(TXT_RVariable6.getText());
        Y_TXT_R_Elevado6.setText(""+R6);
        Y_TXT_SignoMas2.setText(TXT_SignoMas2.getText());
        Y_TXT_RVariable7.setText(TXT_RVariable7.getText());
        Y_TXT_R_Elevado7.setText(TXT_R_Elevado7.getText());
        Y_TXT_R7.setText(""+R7);
        Y_TXT_RVariable8.setText(TXT_RVariable8.getText());
        Y_TXT_R_Elevado8.setText(""+R8);
        
        BTN_Limpiar.setEnabled(true);
    }//GEN-LAST:event_BTN_Paso3ActionPerformed

    private void BTN_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_LimpiarActionPerformed
        
        //Con esta orden el boton limpia la primera linea del frame
        TXT_Numero1.setText(""); TXT_ExpoVariable1.setText(""); TXT_ExpoVariable2.setText("");
        TXT_ExpoVariable3.setText(""); TXT_Numero2.setText(""); TXT_ExpoVariable4.setText("");
        
        //con esta orden el boton limpia la segunda linea de frame
        TXT_R1.setText("");  TXT_RVariable1.setText("");  TXT_R_Elevado1.setText("");
        TXT_RVariable2.setText(""); TXT_R_Elevado2.setText(""); TXT_SignoMas1.setText("");
        TXT_R2.setText(""); TXT_RVariable3.setText(""); TXT_R_Elevado3.setText("");
        TXT_R3.setText(""); TXT_RVariable4.setText(""); TXT_R_Elevado4.setText("");
        TXT_R4.setText(""); TXT_RVariable5.setText(""); TXT_R_Elevado5.setText("");
        TXT_R5.setText(""); TXT_RVariable6.setText(""); TXT_R_Elevado6.setText("");
        TXT_SignoMas2.setText(""); TXT_RVariable7.setText(""); TXT_R_Elevado7.setText("");
        TXT_R6.setText(""); TXT_RVariable8.setText(""); TXT_R_Elevado8.setText("");
        
        //Con esta orden el boton limpiala tercera linea del frame
        X_TXT_R1.setText(""); X_TXT_RVariable1.setText(""); X_TXT_R_Elevado1.setText("");
        X_TXT_RVariable2.setText(""); X_TXT_R_Elevado2.setText(""); X_TXT_SignoMas1.setText("");
        X_TXT_R2.setText(""); X_TXT_RVariable3.setText(""); x_TXT_R_Elevado3.setText("");
        X_TXT_R3.setText(""); X_TXT_RVariable4.setText(""); X_TXT_R_Elevado4.setText("");
        X_TXT_R4.setText(""); X_TXT_RVariable5.setText(""); X_TXT_R_Elevado5.setText("");
        X_TXT_R5.setText(""); X_TXT_RVariable6.setText(""); X_TXT_R_Elevado6.setText("");
        X_TXT_SignoMas2.setText(""); X_TXT_R6.setText(""); X_TXT_RVariable7.setText("");
        X_TXT_R_Elevado7.setText(""); X_TXT_R7.setText(""); X_TXT_RVariable8.setText("");
        X_TXT_R_Elevado8.setText("");
        
        //Con esta orden el boton limpia la cuarta linea del frame
        Y_TXT_R1.setText(""); Y_TXT_RVariable1.setText(""); Y_TXT_R_Elevado1.setText("");
        Y_TXT_R2.setText(""); Y_TXT_RVariable2.setText(""); Y_TXT_R_Elevado2.setText("");
        Y_TXT_SignoMas1.setText(""); Y_TXT_R3.setText(""); Y_TXT_RVariable3.setText(""); 
        Y_TXT_R_Elevado3.setText(""); Y_TXT_R4.setText(""); Y_TXT_RVariable4.setText("");
        Y_TXT_R_Elevado4.setText(""); Y_TXT_R5.setText(""); Y_TXT_RVariable5.setText("");
        Y_TXT_R_Elevado5.setText(""); Y_TXT_R6.setText(""); Y_TXT_RVariable6.setText("");
        Y_TXT_R_Elevado6.setText(""); Y_TXT_SignoMas2.setText(""); Y_TXT_RVariable7.setText("");
        Y_TXT_R_Elevado7.setText(""); Y_TXT_R7.setText(""); Y_TXT_RVariable8.setText("");
        Y_TXT_R_Elevado8.setText("");
        
        // con esta orden el boton pone el request focus en la casilla 1
        TXT_Numero1.requestFocus();
        
        
    }//GEN-LAST:event_BTN_LimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Derivada_parciales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Derivada_parciales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Derivada_parciales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Derivada_parciales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Derivada_parciales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Limpiar;
    private javax.swing.JButton BTN_Paso1;
    private javax.swing.JButton BTN_Paso2;
    private javax.swing.JButton BTN_Paso3;
    private javax.swing.JPanel JP_Ecuacion;
    private javax.swing.JLabel LBL_SignoMas;
    private javax.swing.JLabel LB_Variable1;
    private javax.swing.JLabel LB_Variable2;
    private javax.swing.JLabel LB_Variable3;
    private javax.swing.JLabel LB_Variable4;
    private javax.swing.JTextField TXT_ExpoVariable1;
    private javax.swing.JTextField TXT_ExpoVariable2;
    private javax.swing.JTextField TXT_ExpoVariable3;
    private javax.swing.JTextField TXT_ExpoVariable4;
    private javax.swing.JTextField TXT_Numero1;
    private javax.swing.JTextField TXT_Numero2;
    private javax.swing.JTextField TXT_R1;
    private javax.swing.JTextField TXT_R2;
    private javax.swing.JTextField TXT_R3;
    private javax.swing.JTextField TXT_R4;
    private javax.swing.JTextField TXT_R5;
    private javax.swing.JTextField TXT_R6;
    private javax.swing.JTextField TXT_RVariable1;
    private javax.swing.JTextField TXT_RVariable2;
    private javax.swing.JTextField TXT_RVariable3;
    private javax.swing.JTextField TXT_RVariable4;
    private javax.swing.JTextField TXT_RVariable5;
    private javax.swing.JTextField TXT_RVariable6;
    private javax.swing.JTextField TXT_RVariable7;
    private javax.swing.JTextField TXT_RVariable8;
    private javax.swing.JTextField TXT_R_Elevado1;
    private javax.swing.JTextField TXT_R_Elevado2;
    private javax.swing.JTextField TXT_R_Elevado3;
    private javax.swing.JTextField TXT_R_Elevado4;
    private javax.swing.JTextField TXT_R_Elevado5;
    private javax.swing.JTextField TXT_R_Elevado6;
    private javax.swing.JTextField TXT_R_Elevado7;
    private javax.swing.JTextField TXT_R_Elevado8;
    private javax.swing.JTextField TXT_SignoMas1;
    private javax.swing.JTextField TXT_SignoMas2;
    private javax.swing.JTextField X_TXT_R1;
    private javax.swing.JTextField X_TXT_R2;
    private javax.swing.JTextField X_TXT_R3;
    private javax.swing.JTextField X_TXT_R4;
    private javax.swing.JTextField X_TXT_R5;
    private javax.swing.JTextField X_TXT_R6;
    private javax.swing.JTextField X_TXT_R7;
    private javax.swing.JTextField X_TXT_RVariable1;
    private javax.swing.JTextField X_TXT_RVariable2;
    private javax.swing.JTextField X_TXT_RVariable3;
    private javax.swing.JTextField X_TXT_RVariable4;
    private javax.swing.JTextField X_TXT_RVariable5;
    private javax.swing.JTextField X_TXT_RVariable6;
    private javax.swing.JTextField X_TXT_RVariable7;
    private javax.swing.JTextField X_TXT_RVariable8;
    private javax.swing.JTextField X_TXT_R_Elevado1;
    private javax.swing.JTextField X_TXT_R_Elevado2;
    private javax.swing.JTextField X_TXT_R_Elevado4;
    private javax.swing.JTextField X_TXT_R_Elevado5;
    private javax.swing.JTextField X_TXT_R_Elevado6;
    private javax.swing.JTextField X_TXT_R_Elevado7;
    private javax.swing.JTextField X_TXT_R_Elevado8;
    private javax.swing.JTextField X_TXT_SignoMas1;
    private javax.swing.JTextField X_TXT_SignoMas2;
    private javax.swing.JTextField Y_TXT_R1;
    private javax.swing.JTextField Y_TXT_R2;
    private javax.swing.JTextField Y_TXT_R3;
    private javax.swing.JTextField Y_TXT_R4;
    private javax.swing.JTextField Y_TXT_R5;
    private javax.swing.JTextField Y_TXT_R6;
    private javax.swing.JTextField Y_TXT_R7;
    private javax.swing.JTextField Y_TXT_RVariable1;
    private javax.swing.JTextField Y_TXT_RVariable2;
    private javax.swing.JTextField Y_TXT_RVariable3;
    private javax.swing.JTextField Y_TXT_RVariable4;
    private javax.swing.JTextField Y_TXT_RVariable5;
    private javax.swing.JTextField Y_TXT_RVariable6;
    private javax.swing.JTextField Y_TXT_RVariable7;
    private javax.swing.JTextField Y_TXT_RVariable8;
    private javax.swing.JTextField Y_TXT_R_Elevado1;
    private javax.swing.JTextField Y_TXT_R_Elevado2;
    private javax.swing.JTextField Y_TXT_R_Elevado3;
    private javax.swing.JTextField Y_TXT_R_Elevado4;
    private javax.swing.JTextField Y_TXT_R_Elevado5;
    private javax.swing.JTextField Y_TXT_R_Elevado6;
    private javax.swing.JTextField Y_TXT_R_Elevado7;
    private javax.swing.JTextField Y_TXT_R_Elevado8;
    private javax.swing.JTextField Y_TXT_SignoMas1;
    private javax.swing.JTextField Y_TXT_SignoMas2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField x_TXT_R_Elevado3;
    private javax.swing.JLabel Ƌ2f;
    private javax.swing.JLabel Ƌf;
    private javax.swing.JLabel Ƌx;
    private javax.swing.JLabel Ƌx2;
    // End of variables declaration//GEN-END:variables
}
