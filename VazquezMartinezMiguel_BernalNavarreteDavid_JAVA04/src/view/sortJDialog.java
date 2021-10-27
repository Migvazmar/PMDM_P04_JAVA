package view;
/**
 *
 * @author Miguel Maria Vazquez Martinez
 */

import javax.swing.*;

public class sortJDialog extends JDialog {

    /**
     * Creates new form warningJDialog
     * This class create a window to inform the user about an error in the program execution.
     */
    // CONSTRUCTOR /////////////////////////////////////////////////////////////
    public sortJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        warningJPanel = new javax.swing.JPanel();
        listLabelSortDialog = new javax.swing.JLabel();
        message1 = new javax.swing.JLabel();
        message2 = new javax.swing.JLabel();
        message3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ERROR");

        warningJPanel.setBackground(new java.awt.Color(255, 255, 255));

        listLabelSortDialog.setBackground(new java.awt.Color(255, 255, 255));
        listLabelSortDialog.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        listLabelSortDialog.setForeground(new java.awt.Color(0, 0, 0));
        listLabelSortDialog.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        listLabelSortDialog.setText("Tiempo de filtrado List:");

        message1.setBackground(new java.awt.Color(255, 255, 255));
        message1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        message1.setForeground(new java.awt.Color(0, 0, 0));
        message1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        message1.setText("MESSAGE");

        message2.setBackground(new java.awt.Color(255, 255, 255));
        message2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        message2.setForeground(new java.awt.Color(0, 0, 0));
        message2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        message2.setText("Tiempo de filtrado de ArrayList:");

        message3.setBackground(new java.awt.Color(255, 255, 255));
        message3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        message3.setForeground(new java.awt.Color(0, 0, 0));
        message3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        message3.setText("MESSAGE");

        javax.swing.GroupLayout warningJPanelLayout = new javax.swing.GroupLayout(warningJPanel);
        warningJPanel.setLayout(warningJPanelLayout);
        warningJPanelLayout.setHorizontalGroup(
            warningJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(warningJPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(warningJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(message3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(message2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(message1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listLabelSortDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        warningJPanelLayout.setVerticalGroup(
            warningJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(warningJPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(listLabelSortDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(message1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(message2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(message3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(warningJPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 302, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(warningJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void setMessage(String message){
        this.listLabelSortDialog.setText(message);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel listLabelSortDialog;
    private javax.swing.JLabel message1;
    private javax.swing.JLabel message2;
    private javax.swing.JLabel message3;
    private javax.swing.JPanel warningJPanel;
    // End of variables declaration//GEN-END:variables
}
