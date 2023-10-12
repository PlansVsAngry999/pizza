package pizza;
/**
 * Programa con interfaz que calcula el precio de una pizza pedida por el usuario, contiene:
	    -JPanel: con el titulo 'Ingredientes'.
	        +Cuatro checkBoxes (Beacon $20, anchoas 15$, cebolla 10$, pimiento $14).
	    -JPanel: con el titulo 'Tamaño'.
	        +Contiene tres radioButton (Chica $100, $150 mediana, $200 grande).
	    -Botton: llamado 'Total'.
	    -Label: donde se muestra el precio de la pizza.
    Que no hace el programa:
	    -El usuario no puede elegir mas de un tamaño de pizza.
 * @author Ricardo Daniel Hernández Sosa (PlansVsAngry999).
 */
import java.awt.Color;
public class J_Pizza extends javax.swing.JFrame {
    public J_Pizza() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblTotal = new javax.swing.JLabel();
        pnlTamaño = new javax.swing.JPanel();
        lblTamaño = new javax.swing.JLabel();
        rbtPequena = new javax.swing.JRadioButton();
        rbtMediana = new javax.swing.JRadioButton();
        rbtGrande = new javax.swing.JRadioButton();
        pnlIngredientes = new javax.swing.JPanel();
        lblIngredientes = new javax.swing.JLabel();
        chkBeacon = new javax.swing.JCheckBox();
        chkAnchoas = new javax.swing.JCheckBox();
        chkCebolla = new javax.swing.JCheckBox();
        chkPimiento = new javax.swing.JCheckBox();
        btnTotal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(112, 80, 49));

        lblTotal.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblTotal.setText("Total:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTotal)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblTotal)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pnlTamaño.setBackground(new java.awt.Color(114, 74, 74));
        pnlTamaño.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlTamaño.setForeground(new java.awt.Color(255, 229, 229));

        lblTamaño.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        lblTamaño.setForeground(new java.awt.Color(255, 255, 255));
        lblTamaño.setText("TAMAÑO");

        rbtPequena.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        rbtPequena.setForeground(new java.awt.Color(255, 229, 229));
        rbtPequena.setText("Pequeña $100");
        rbtPequena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtPequenaMouseClicked(evt);
            }
        });

        rbtMediana.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        rbtMediana.setForeground(new java.awt.Color(255, 229, 229));
        rbtMediana.setText("Mediana $150");
        rbtMediana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtMedianaMouseClicked(evt);
            }
        });

        rbtGrande.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        rbtGrande.setForeground(new java.awt.Color(255, 229, 229));
        rbtGrande.setText("Grande $200");
        rbtGrande.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtGrandeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlTamañoLayout = new javax.swing.GroupLayout(pnlTamaño);
        pnlTamaño.setLayout(pnlTamañoLayout);
        pnlTamañoLayout.setHorizontalGroup(
            pnlTamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTamañoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlTamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlTamañoLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(rbtPequena))
                        .addComponent(lblTamaño))
                    .addGroup(pnlTamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(rbtGrande)
                        .addComponent(rbtMediana)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTamañoLayout.setVerticalGroup(
            pnlTamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTamañoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTamaño)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtPequena)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtMediana)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtGrande)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pnlIngredientes.setBackground(new java.awt.Color(114, 74, 94));
        pnlIngredientes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblIngredientes.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        lblIngredientes.setForeground(new java.awt.Color(255, 255, 255));
        lblIngredientes.setText("INGREDIENTES");

        chkBeacon.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        chkBeacon.setForeground(new java.awt.Color(255, 229, 229));
        chkBeacon.setText("Beacon $20");

        chkAnchoas.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        chkAnchoas.setForeground(new java.awt.Color(255, 229, 229));
        chkAnchoas.setText("Anchoas $15");

        chkCebolla.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        chkCebolla.setForeground(new java.awt.Color(255, 229, 229));
        chkCebolla.setText("Cebolla $10");

        chkPimiento.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        chkPimiento.setForeground(new java.awt.Color(255, 229, 229));
        chkPimiento.setText("Pimiento $14");

        javax.swing.GroupLayout pnlIngredientesLayout = new javax.swing.GroupLayout(pnlIngredientes);
        pnlIngredientes.setLayout(pnlIngredientesLayout);
        pnlIngredientesLayout.setHorizontalGroup(
            pnlIngredientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIngredientesLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlIngredientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIngredientes)
                    .addComponent(chkBeacon)
                    .addComponent(chkAnchoas)
                    .addComponent(chkCebolla)
                    .addComponent(chkPimiento))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        pnlIngredientesLayout.setVerticalGroup(
            pnlIngredientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlIngredientesLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(lblIngredientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkBeacon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkAnchoas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkCebolla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkPimiento)
                .addContainerGap())
        );

        btnTotal.setBackground(new java.awt.Color(167, 215, 155));
        btnTotal.setFont(new java.awt.Font("Impact", 0, 12)); // NOI18N
        btnTotal.setText("TOTAL");
        btnTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTotalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTotalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTotalMouseExited(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/pixelPizza.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(pnlIngredientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTotal)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlIngredientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTotal)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTotalMouseClicked
        double precio=0, total=0;
        //CheckBoxes...
        if(chkBeacon.isSelected()){
            total+=20;}
        if(chkAnchoas.isSelected()){
            total+=15;}
        if(chkCebolla.isSelected()){
            total+=10;}
        if(chkPimiento.isSelected()){
            total+=14;}
        //RadioButton...
        if(rbtPequena.isSelected()){
            total+=100;}
        if(rbtMediana.isSelected()){
            total+=150;}
        if(rbtGrande.isSelected()){
            total+=200;}
        //Mostrar el total.
        lblTotal.setText("Total:  "+ total);
    }//GEN-LAST:event_btnTotalMouseClicked

    private void rbtPequenaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtPequenaMouseClicked
        rbtMediana.setSelected(false);
        rbtGrande.setSelected(false);
    }//GEN-LAST:event_rbtPequenaMouseClicked

    private void rbtMedianaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtMedianaMouseClicked
        rbtPequena.setSelected(false);
        rbtGrande.setSelected(false);
    }//GEN-LAST:event_rbtMedianaMouseClicked

    private void rbtGrandeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtGrandeMouseClicked
        rbtPequena.setSelected(false);
        rbtMediana.setSelected(false);
    }//GEN-LAST:event_rbtGrandeMouseClicked

    private void btnTotalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTotalMouseEntered
         btnTotal.setBackground(Color.getHSBColor(1f,1f,1f));
    }//GEN-LAST:event_btnTotalMouseEntered

    private void btnTotalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTotalMouseExited
        btnTotal.setBackground(Color.getHSBColor(0.477777f,0.35f,0.45f));
    }//GEN-LAST:event_btnTotalMouseExited

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
            java.util.logging.Logger.getLogger(J_Pizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(J_Pizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(J_Pizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(J_Pizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new J_Pizza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTotal;
    private javax.swing.JCheckBox chkAnchoas;
    private javax.swing.JCheckBox chkBeacon;
    private javax.swing.JCheckBox chkCebolla;
    private javax.swing.JCheckBox chkPimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblIngredientes;
    private javax.swing.JLabel lblTamaño;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel pnlIngredientes;
    private javax.swing.JPanel pnlTamaño;
    private javax.swing.JRadioButton rbtGrande;
    private javax.swing.JRadioButton rbtMediana;
    private javax.swing.JRadioButton rbtPequena;
    // End of variables declaration//GEN-END:variables
}
