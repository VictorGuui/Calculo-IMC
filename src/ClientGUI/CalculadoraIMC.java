/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ClientGUI;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import dao.AlunoDAO;
import models.Aluno;



/**
 *
 * @author victo
 */
public class CalculadoraIMC extends javax.swing.JInternalFrame {

    /**
     * Creates new form CalculadoraIMC
     */

    
    public CalculadoraIMC() {
        initComponents();
        listarValores();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAluno = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JTextName = new javax.swing.JTextField();
        JTextBirthDate = new javax.swing.JTextField();
        JTextCPF = new javax.swing.JTextField();
        JTextWeight = new javax.swing.JTextField();
        JTextHeight = new javax.swing.JTextField();
        ButtonCalculator = new javax.swing.JButton();
        ButtonEdit = new javax.swing.JButton();
        ButtonInsert = new javax.swing.JButton();
        ButtonDelete = new javax.swing.JButton();
        ButtonFile = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1400, 850));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tabelaAluno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabelaAluno.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        tabelaAluno.setForeground(new java.awt.Color(39, 53, 62));
        tabelaAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "CPF", "Nome", "Data de Nascimento", "Peso", "Altura"
            }
        ));
        tabelaAluno.setPreferredSize(new java.awt.Dimension(285, 336));
        tabelaAluno.setRowHeight(24);
        tabelaAluno.setSelectionBackground(new java.awt.Color(255, 186, 65));
        tabelaAluno.setSelectionForeground(new java.awt.Color(39, 53, 62));
        tabelaAluno.setShowHorizontalLines(true);
        tabelaAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaAlunoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaAluno);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(39, 53, 62), 1, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel1.setText("índice de massa corporal");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 7, -1, -1));

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel2.setText("Nome                          :");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(39, 53, 62)));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 112, 268, 37));

        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel3.setText("Data de nascimento   :");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(39, 53, 62)));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 194, -1, 37));

        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel4.setText("CPF                              :");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(39, 53, 62)));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 30, -1, 37));

        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel5.setText("Peso                            :");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(39, 53, 62)));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 276, 268, 37));

        jLabel6.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel6.setText("Altura                          :");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(39, 53, 62)));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 358, 268, 37));

        JTextName.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        JTextName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextNameActionPerformed(evt);
            }
        });
        jPanel2.add(JTextName, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 112, 298, -1));

        JTextBirthDate.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        JTextBirthDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextBirthDateActionPerformed(evt);
            }
        });
        jPanel2.add(JTextBirthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 194, 298, -1));

        JTextCPF.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        JTextCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextCPFActionPerformed(evt);
            }
        });
        jPanel2.add(JTextCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 30, 300, -1));

        JTextWeight.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        JTextWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextWeightActionPerformed(evt);
            }
        });
        jPanel2.add(JTextWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 276, 298, -1));

        JTextHeight.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        JTextHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextHeightActionPerformed(evt);
            }
        });
        jPanel2.add(JTextHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 358, 298, -1));

        ButtonCalculator.setBackground(new java.awt.Color(39, 53, 62));
        ButtonCalculator.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        ButtonCalculator.setForeground(new java.awt.Color(255, 255, 255));
        ButtonCalculator.setText("Calcular IMC");
        ButtonCalculator.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonCalculatorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonCalculatorMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButtonCalculatorMousePressed(evt);
            }
        });
        ButtonCalculator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCalculatorActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonCalculator, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 497, 219, -1));

        ButtonEdit.setBackground(new java.awt.Color(39, 53, 62));
        ButtonEdit.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        ButtonEdit.setForeground(new java.awt.Color(255, 255, 255));
        ButtonEdit.setText("Editar");
        ButtonEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonEditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonEditMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButtonEditMousePressed(evt);
            }
        });
        ButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEditActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 424, 219, -1));

        ButtonInsert.setBackground(new java.awt.Color(39, 53, 62));
        ButtonInsert.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        ButtonInsert.setForeground(new java.awt.Color(255, 255, 255));
        ButtonInsert.setText("Inserir");
        ButtonInsert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonInsertMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonInsertMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButtonInsertMousePressed(evt);
            }
        });
        ButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonInsertActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 424, 219, -1));

        ButtonDelete.setBackground(new java.awt.Color(39, 53, 62));
        ButtonDelete.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        ButtonDelete.setForeground(new java.awt.Color(255, 255, 255));
        ButtonDelete.setText("Deletar");
        ButtonDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonDeleteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButtonDeleteMousePressed(evt);
            }
        });
        ButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 497, 219, -1));

        ButtonFile.setBackground(new java.awt.Color(39, 53, 62));
        ButtonFile.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        ButtonFile.setForeground(new java.awt.Color(255, 255, 255));
        ButtonFile.setText("Gerar Arquivo");
        ButtonFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonFileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonFileMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButtonFileMousePressed(evt);
            }
        });
        ButtonFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonFileActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 553, 219, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTextCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextCPFActionPerformed

    private void JTextWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextWeightActionPerformed

    private void JTextHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextHeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextHeightActionPerformed

    private void ButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(this, "Tem certeza?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

    if (response == JOptionPane.YES_OPTION) {
        
        String cpf = JTextCPF.getText();
        String nome = JTextName.getText();
        int dataNascimento = Integer.parseInt(JTextBirthDate.getText());
        double peso = Double.parseDouble(JTextWeight.getText());
        double altura = Double.parseDouble(JTextHeight.getText());
        
        JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        JTextCPF.setText("");
        JTextName.setText("");
        JTextBirthDate.setText("");
        JTextWeight.setText("");
        JTextHeight.setText("");
        

        Aluno aluno = new Aluno(cpf, nome, dataNascimento, peso, altura);
        new AlunoDAO().atualizar(aluno);
        listarValores();
    }

    }//GEN-LAST:event_ButtonEditActionPerformed

   private void ButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {
    // TODO add your handling code here:
    if ("".equals(JTextCPF.getText())) {
        JOptionPane.showMessageDialog(null, "Adicione um CPF");
        JTextCPF.requestFocus();
        
    } else if ("".equals(JTextName.getText())) {
        JOptionPane.showMessageDialog(null, "Adicione um nome");
        JTextName.requestFocus();
        
    } else if ("".equals(JTextBirthDate.getText())) {
        JOptionPane.showMessageDialog(null, "Adicione a data de nascimento");
        JTextBirthDate.requestFocus();
        
    } else if ("".equals(JTextWeight.getText())) {
        JOptionPane.showMessageDialog(null, "Adicione o peso");
        JTextWeight.requestFocus();
        
    } else if ("".equals(JTextHeight.getText())) {
        JOptionPane.showMessageDialog(null, "Adicione a altura");
        JTextHeight.requestFocus();
        
    }else{

    int response = JOptionPane.showConfirmDialog(this, "Tem certeza?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

    if (response == JOptionPane.YES_OPTION) {
        
        String cpf = JTextCPF.getText();
        String nome = JTextName.getText();
        int dataNascimento = Integer.parseInt(JTextBirthDate.getText());
        double peso = Double.parseDouble(JTextWeight.getText());
        double altura = Double.parseDouble(JTextHeight.getText());
        
        JOptionPane.showMessageDialog(null, "Todas as informações foram inseridas!");
        JTextCPF.setText("");
        JTextName.setText("");
        JTextBirthDate.setText("");
        JTextWeight.setText("");
        JTextHeight.setText("");
        

        Aluno aluno = new Aluno(cpf, nome, dataNascimento, peso, altura);
        new AlunoDAO().adicionar(aluno);
        listarValores();
    }
} 
   }

    private void ButtonInsertMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonInsertMouseEntered
        // TODO add your handling code here:
        ButtonInsert.setBackground(new Color(255,186,65));
    }//GEN-LAST:event_ButtonInsertMouseEntered

    private void ButtonEditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonEditMouseEntered
        // TODO add your handling code here:
        ButtonEdit.setBackground(new Color(255,186,65));

    }//GEN-LAST:event_ButtonEditMouseEntered

    private void ButtonDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonDeleteMouseEntered
        // TODO add your handling code here:
        ButtonDelete.setBackground(new Color(255,186,65));

    }//GEN-LAST:event_ButtonDeleteMouseEntered

    private void ButtonCalculatorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonCalculatorMouseEntered
        // TODO add your handling code here:
        ButtonCalculator.setBackground(new Color(255,186,65));

    }//GEN-LAST:event_ButtonCalculatorMouseEntered

    private void ButtonFileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonFileMouseEntered
        // TODO add your handling code here:
        ButtonFile.setBackground(new Color(255,186,65));

    }//GEN-LAST:event_ButtonFileMouseEntered

    private void ButtonInsertMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonInsertMouseExited
        // TODO add your handling code here:
        ButtonInsert.setBackground(new Color(39,53,62));
    }//GEN-LAST:event_ButtonInsertMouseExited

    private void ButtonEditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonEditMouseExited
        // TODO add your handling code here:
                ButtonEdit.setBackground(new Color(39,53,62));

    }//GEN-LAST:event_ButtonEditMouseExited

    private void ButtonDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonDeleteMouseExited
        // TODO add your handling code here:
                ButtonDelete.setBackground(new Color(39,53,62));

    }//GEN-LAST:event_ButtonDeleteMouseExited

    private void ButtonCalculatorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonCalculatorMouseExited
        // TODO add your handling code here:
                ButtonCalculator.setBackground(new Color(39,53,62));

    }//GEN-LAST:event_ButtonCalculatorMouseExited

    private void ButtonFileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonFileMouseExited
        // TODO add your handling code here:
                ButtonFile.setBackground(new Color(39,53,62));

    }//GEN-LAST:event_ButtonFileMouseExited

    private void JTextNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextNameActionPerformed

    private void JTextBirthDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextBirthDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextBirthDateActionPerformed

    private void ButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDeleteActionPerformed
        // TODO add your handling code here:
    int response = JOptionPane.showConfirmDialog(this, "Tem certeza que quer Deletar?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

    if (response == JOptionPane.YES_OPTION) {
        
        DefaultTableModel model = (DefaultTableModel)tabelaAluno.getModel();
            int selectedRow=tabelaAluno.getSelectedRow();
    
        JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
        

      
        new AlunoDAO().deletar(Integer.parseInt(model.getValueAt(selectedRow, 0).toString()));
        listarValores();
    }
    }//GEN-LAST:event_ButtonDeleteActionPerformed

    private void ButtonCalculatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCalculatorActionPerformed
        // TODO add your handling code here:
        
        
        
        DefaultTableModel model = (DefaultTableModel)tabelaAluno.getModel();
        int selectedRow=tabelaAluno.getSelectedRow();
        
        Aluno aluno = new Aluno();
        
        aluno.setPeso(Double.parseDouble(JTextWeight.getText()));
        aluno.setAltura(Double.parseDouble(JTextHeight.getText()));
        
    
        JOptionPane.showMessageDialog(null, String.format("%.2f", aluno.getIMC()));
        
        
    
    
        
    }//GEN-LAST:event_ButtonCalculatorActionPerformed

    private void ButtonFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonFileActionPerformed
        // TODO add your handling code here:
                   
       String cpf = JTextCPF.getText();
       String nome = JTextName.getText();
        int dataNascimento = Integer.parseInt(JTextBirthDate.getText());
        double peso = Double.parseDouble(JTextWeight.getText());
        double altura = Double.parseDouble(JTextHeight.getText());

       Aluno aluno = new Aluno(nome, cpf, dataNascimento, peso, altura);
       aluno.exportarIMC();

       JOptionPane.showMessageDialog(null, "IMC calculado e exportado para o arquivo imc.txt!");
    
    }//GEN-LAST:event_ButtonFileActionPerformed

    private void tabelaAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaAlunoMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tabelaAluno.getModel();
        int selectedRow = tabelaAluno.getSelectedRow();
        JTextCPF.setText(model.getValueAt(selectedRow, 1).toString());
        JTextName.setText(model.getValueAt(selectedRow, 2).toString());
        JTextBirthDate.setText(model.getValueAt(selectedRow, 3).toString());
        JTextWeight.setText(model.getValueAt(selectedRow, 4).toString());
        JTextHeight.setText(model.getValueAt(selectedRow, 5).toString());
        
        
              
    }//GEN-LAST:event_tabelaAlunoMouseClicked

    private void ButtonCalculatorMousePressed(java.awt.event.MouseEvent evt){
    }
    private void ButtonFileMousePressed(java.awt.event.MouseEvent evt){ 
    }
    private void ButtonDeleteMousePressed(java.awt.event.MouseEvent evt){       
    }
    private void ButtonInsertMousePressed(java.awt.event.MouseEvent evt){        
    }
    private void ButtonEditMousePressed(java.awt.event.MouseEvent evt){        
    }




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCalculator;
    private javax.swing.JButton ButtonDelete;
    private javax.swing.JButton ButtonEdit;
    private javax.swing.JButton ButtonFile;
    private javax.swing.JButton ButtonInsert;
    private javax.swing.JTextField JTextBirthDate;
    private javax.swing.JTextField JTextCPF;
    private javax.swing.JTextField JTextHeight;
    private javax.swing.JTextField JTextName;
    private javax.swing.JTextField JTextWeight;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaAluno;
    // End of variables declaration//GEN-END:variables
    private void listarValores() {
        try {
            
            DefaultTableModel model = (DefaultTableModel) tabelaAluno.getModel();
            model.setNumRows(0);

            ArrayList<Aluno> lista =  new AlunoDAO().obterTodos();
            for (int i = 0; i < lista.size(); i++) {
                model.addRow(new Object []{
                    lista.get(i).getID(),
                    lista.get(i).getCpf(),
                    lista.get(i).getNome(),
                    lista.get(i).getDataDeNascimento(),
                    lista.get(i).getPeso(),
                    lista.get(i).getAltura(),
                    String.format("%.2f", lista.get(i).getIMC())
                });
            }

        } catch (Exception exception) {
            // TODO: handle exception
            throw new RuntimeException(exception);
        }
    }
}
