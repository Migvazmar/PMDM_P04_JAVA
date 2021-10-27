package view;

import controller.List;
import javax.swing.JOptionPane;
import model.*;

/**
 *
 * @author migva
 */
public class AddPanel extends javax.swing.JPanel {

    /**
     * Creates new form MenuPanel
     */
    public AddPanel() {
        initComponents();
    }
    
    public void optionSelectedAnalyst(){
        optionSelected = false;
        header.setText("ANALISTA");
        plusExtraLabelAdd.setText("Plus salarial:"); 
        projectExtraHLabelAdd.setText("Proyecto:");
    }
    
    public void optionSelectedProgrammer(){
        optionSelected = true;
        header.setText("PROGRAMADOR");
        plusExtraLabelAdd.setText("Salario extra:");
        projectExtraHLabelAdd.setText("Horas extra:");
    }    
    
    private void addOptionSelected(){
        if(optionSelected){
            //Programmer option.
            newList();
            
            Programmer pgm = new Programmer(
                    idFieldAdd.getText(), 
                    nameFieldAdd.getText(), 
                    salaryFieldAdd.getText(), 
                    maxSalaryFieldAdd.getText(), 
                    entryDateFieldAdd.getText(), 
                    plusExtraFieldAdd.getText(), 
                    projectExtraHFieldAdd.getText());
            
            myList.addNode(pgm, pgm.getIdEmployee());
            
        }else{
            //Analyst option.
            newList();
            Analyst alt = new Analyst(
                    idFieldAdd.getText(), 
                    nameFieldAdd.getText(), 
                    salaryFieldAdd.getText(), 
                    maxSalaryFieldAdd.getText(), 
                    entryDateFieldAdd.getText(), 
                    plusExtraFieldAdd.getText(), 
                    projectExtraHFieldAdd.getText());
            
            myList.addNode(alt, alt.getIdEmployee());
        }
        
        cleanFields();
        
    }
   
    private boolean checkFields(){
        if(                    
            !idFieldAdd.getText().equals("") ||
            !nameFieldAdd.getText().equals("") || 
            !salaryFieldAdd.getText().equals("") || 
            !maxSalaryFieldAdd.getText().equals("") || 
            !entryDateFieldAdd.getText().equals("") ||
            !plusExtraFieldAdd.getText().equals("") ||
            !projectExtraHFieldAdd.getText().equals(""))
        {
            return true;
        }else{
            return false;
        }
    }
    
    private void cleanFields(){
        idFieldAdd.setText("");
        nameFieldAdd.setText("");
        salaryFieldAdd.setText("");
        maxSalaryFieldAdd.setText("");
        entryDateFieldAdd.setText("");
        plusExtraFieldAdd.setText("");
        projectExtraHFieldAdd.setText("");   
    }
    
    private void newList(){
        if(myList == null){
            myList = new List();
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

        header = new javax.swing.JLabel();
        idLabelAdd = new javax.swing.JLabel();
        idFieldAdd = new javax.swing.JTextField();
        nameLabelAdd = new javax.swing.JLabel();
        nameFieldAdd = new javax.swing.JTextField();
        salaryLabelAdd = new javax.swing.JLabel();
        salaryFieldAdd = new javax.swing.JTextField();
        maxSalaryLabelAdd = new javax.swing.JLabel();
        maxSalaryFieldAdd = new javax.swing.JTextField();
        entryDateLabelAdd = new javax.swing.JLabel();
        entryDateFieldAdd = new javax.swing.JTextField();
        plusExtraLabelAdd = new javax.swing.JLabel();
        plusExtraFieldAdd = new javax.swing.JTextField();
        projectExtraHLabelAdd = new javax.swing.JLabel();
        projectExtraHFieldAdd = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        AddButton = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));

        header.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        header.setForeground(new java.awt.Color(0, 0, 0));
        header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header.setText("Cabecera");

        idLabelAdd.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        idLabelAdd.setForeground(new java.awt.Color(0, 0, 0));
        idLabelAdd.setText("Número:");

        idFieldAdd.setBackground(new java.awt.Color(255, 255, 255));
        idFieldAdd.setForeground(new java.awt.Color(0, 0, 0));
        idFieldAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldAddActionPerformed(evt);
            }
        });

        nameLabelAdd.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        nameLabelAdd.setForeground(new java.awt.Color(0, 0, 0));
        nameLabelAdd.setText("Nombre:");

        nameFieldAdd.setBackground(new java.awt.Color(255, 255, 255));
        nameFieldAdd.setForeground(new java.awt.Color(0, 0, 0));
        nameFieldAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldAddActionPerformed(evt);
            }
        });

        salaryLabelAdd.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        salaryLabelAdd.setForeground(new java.awt.Color(0, 0, 0));
        salaryLabelAdd.setText("Sueldo:");

        salaryFieldAdd.setBackground(new java.awt.Color(255, 255, 255));
        salaryFieldAdd.setForeground(new java.awt.Color(0, 0, 0));
        salaryFieldAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaryFieldAddActionPerformed(evt);
            }
        });

        maxSalaryLabelAdd.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        maxSalaryLabelAdd.setForeground(new java.awt.Color(0, 0, 0));
        maxSalaryLabelAdd.setText("Sueldo máximo:");

        maxSalaryFieldAdd.setBackground(new java.awt.Color(255, 255, 255));
        maxSalaryFieldAdd.setForeground(new java.awt.Color(0, 0, 0));
        maxSalaryFieldAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxSalaryFieldAddActionPerformed(evt);
            }
        });

        entryDateLabelAdd.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        entryDateLabelAdd.setForeground(new java.awt.Color(0, 0, 0));
        entryDateLabelAdd.setText("Fecha Alta:");

        entryDateFieldAdd.setBackground(new java.awt.Color(255, 255, 255));
        entryDateFieldAdd.setForeground(new java.awt.Color(0, 0, 0));

        plusExtraLabelAdd.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        plusExtraLabelAdd.setForeground(new java.awt.Color(0, 0, 0));
        plusExtraLabelAdd.setText("Plus/Extra:");

        plusExtraFieldAdd.setBackground(new java.awt.Color(255, 255, 255));
        plusExtraFieldAdd.setForeground(new java.awt.Color(0, 0, 0));

        projectExtraHLabelAdd.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        projectExtraHLabelAdd.setForeground(new java.awt.Color(0, 0, 0));
        projectExtraHLabelAdd.setText("Other:");

        projectExtraHFieldAdd.setBackground(new java.awt.Color(255, 255, 255));
        projectExtraHFieldAdd.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setPreferredSize(new java.awt.Dimension(200, 10));

        AddButton.setBackground(new java.awt.Color(204, 204, 204));
        AddButton.setForeground(new java.awt.Color(0, 0, 0));
        AddButton.setText("Añadir");
        AddButton.setBorder(null);
        AddButton.setBorderPainted(false);
        AddButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AddButton.setMargin(new java.awt.Insets(20, 20, 20, 20));
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(maxSalaryLabelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idLabelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salaryLabelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(entryDateLabelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(plusExtraLabelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(projectExtraHLabelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(projectExtraHFieldAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(plusExtraFieldAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(entryDateFieldAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salaryFieldAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idFieldAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maxSalaryFieldAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameFieldAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idFieldAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameFieldAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salaryLabelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salaryFieldAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maxSalaryLabelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maxSalaryFieldAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entryDateLabelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entryDateFieldAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plusExtraLabelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plusExtraFieldAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(projectExtraHLabelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projectExtraHFieldAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void idFieldAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFieldAddActionPerformed

    private void nameFieldAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldAddActionPerformed
        //UNUSED ELEMENT
    }//GEN-LAST:event_nameFieldAddActionPerformed

    private void salaryFieldAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaryFieldAddActionPerformed
        //UNUSED ELEMENT
    }//GEN-LAST:event_salaryFieldAddActionPerformed

    private void maxSalaryFieldAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxSalaryFieldAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maxSalaryFieldAddActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        if(checkFields()){
            addOptionSelected();
        }else{
            JOptionPane.showMessageDialog(auxFrame, "Falta información por añadir.");
        }
    }//GEN-LAST:event_AddButtonActionPerformed
    
    private boolean optionSelected; //Determine the label text. False for Analyst and True for Programmer.
    private List myList = FrameMain.getMainList();
    private static FrameMain auxFrame;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JTextField entryDateFieldAdd;
    private javax.swing.JLabel entryDateLabelAdd;
    private javax.swing.JLabel header;
    private javax.swing.JTextField idFieldAdd;
    private javax.swing.JLabel idLabelAdd;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField maxSalaryFieldAdd;
    private javax.swing.JLabel maxSalaryLabelAdd;
    private javax.swing.JTextField nameFieldAdd;
    private javax.swing.JLabel nameLabelAdd;
    private javax.swing.JTextField plusExtraFieldAdd;
    private javax.swing.JLabel plusExtraLabelAdd;
    private javax.swing.JTextField projectExtraHFieldAdd;
    private javax.swing.JLabel projectExtraHLabelAdd;
    private javax.swing.JTextField salaryFieldAdd;
    private javax.swing.JLabel salaryLabelAdd;
    // End of variables declaration//GEN-END:variables
}
