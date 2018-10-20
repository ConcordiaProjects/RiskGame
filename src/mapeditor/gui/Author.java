package mapeditor.gui;

/**
 * This class is responsible to create the Author Editor Interface.
 *
 * @author Rodolfo Miranda
 *
 */
public class Author extends javax.swing.JFrame {

    /**
     * Creates new form Author
     */
    public Author() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jAuthorLabel = new javax.swing.JLabel();
        jConfirmButton = new javax.swing.JButton();
        jAuthorField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jAuthorLabel.setText("Author");

        jConfirmButton.setText("Confirm");
        jConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConfirmButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jAuthorLabel)
                .addGap(18, 18, 18)
                .addComponent(jAuthorField, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jConfirmButton)
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAuthorLabel)
                    .addComponent(jConfirmButton)
                    .addComponent(jAuthorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * This method to perform the action of the button click.
     *
     * @param java.awt.event.ActionEvent evt (The event).
     */
    private void jConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConfirmButtonActionPerformed
        // TODO add your handling code here:
        CreateMapMenu.setAuthor(jAuthorField.getText());
    }//GEN-LAST:event_jConfirmButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jAuthorField;
    private javax.swing.JLabel jAuthorLabel;
    private javax.swing.JButton jConfirmButton;
    // End of variables declaration//GEN-END:variables
}
