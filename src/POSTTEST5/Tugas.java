/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POSTTETS5;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author User
 */
public class Tugas extends javax.swing.JFrame {
    private DefaultTableModel model;

    /**
     * Creates new form Tugas
     */
    public Tugas() {
        initComponents();
    }
    public void InitTable(){
    model = new DefaultTableModel();
    model.addColumn("Nama");
    model.addColumn("No Telepon");
    model.addColumn("Kota Asal");
    model.addColumn(model);
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbkotaasal = new javax.swing.JComboBox();
        tambah = new javax.swing.JButton();
        simpan = new javax.swing.JButton();
        update = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable1 = new javax.swing.JTable();
        wnama = new javax.swing.JTextField();
        wtelpon = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentShown(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Table Pelanggan");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 102, 102));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Nama");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("No.Telepon");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Kota Asal");

        cmbkotaasal.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cmbkotaasal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Samarinda", "Bontang", "Sangatta" }));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, JTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement}"), cmbkotaasal, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        tambah.setText("Tambah");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });
        tambah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tambahKeyReleased(evt);
            }
        });

        simpan.setText("Simpan");
        simpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                simpanMouseClicked(evt);
            }
        });
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        simpan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                simpanKeyReleased(evt);
            }
        });

        update.setText("Update");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        update.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                updateKeyReleased(evt);
            }
        });

        hapus.setText("Hapus");
        hapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hapusMouseClicked(evt);
            }
        });
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        hapus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                hapusKeyReleased(evt);
            }
        });

        JTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nama", "No.Telepon", "Kota Asal"
            }
        ));
        JTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTable1);

        wnama.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                wnamaCaretUpdate(evt);
            }
        });

        wtelpon.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                wtelponCaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(tambah)
                                .addGap(34, 34, 34)
                                .addComponent(simpan)
                                .addGap(36, 36, 36)
                                .addComponent(update)
                                .addGap(40, 40, 40)
                                .addComponent(hapus))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbkotaasal, 0, 180, Short.MAX_VALUE)
                                    .addComponent(wnama)
                                    .addComponent(wtelpon)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(wnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(wtelpon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbkotaasal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambah)
                    .addComponent(simpan)
                    .addComponent(update)
                    .addComponent(hapus))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_simpanMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_simpanMouseClicked

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_updateMouseClicked

    private void hapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hapusMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_hapusMouseClicked

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        Object[] data = new Object[3];
        data[0] = wnama.getText();
        data[1] = wtelpon.getText();
        data[2] = cmbkotaasal.getSelectedItem().toString();
        
        model.addRow(data);
        
    }//GEN-LAST:event_tambahActionPerformed

    private void JTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTable1MouseClicked
        // TODO add your handling code here:
        int baris = JTable1.getSelectedRow();
        String nama_edit = JTable1.getValueAt(baris, 0).toString();
        String tlpn_edit = JTable1.getValueAt(baris, 1).toString();
        String kota_edit = JTable1.getValueAt(baris, 2).toString();
        
        wnama.setText(nama_edit);
        wtelpon.setText(tlpn_edit);
        cmbkotaasal.setSelectedItem(kota_edit);
    }//GEN-LAST:event_JTable1MouseClicked

    private void jPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentShown
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jPanel1ComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        InitTable();

    }//GEN-LAST:event_formComponentShown

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        int baris = JTable1.getSelectedRow();
        JTable1.setValueAt(wnama.getText(), baris, 0);
        JTable1.setValueAt(wtelpon.getText(), baris, 1);
        JTable1.setValueAt(cmbkotaasal.getSelectedItem(), baris, 2);
    }//GEN-LAST:event_updateActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        int baris = JTable1.getSelectedRow();
        JOptionPane.showConfirmDialog(null," yakin mau hapus ");
        model.removeRow(baris);
    }//GEN-LAST:event_hapusActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        tambah.setEnabled(false);
        
        
    }//GEN-LAST:event_formWindowActivated

    private void tambahKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tambahKeyReleased
        // TODO add your handling code here:
        if(wnama.getText().equals("")||wtelpon.getText().equals("")){
            tambah.setEnabled(false);
        }else{
            tambah.setEnabled(true);
        }
    }//GEN-LAST:event_tambahKeyReleased

    private void updateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_updateKeyReleased
        // TODO add your handling code here:
        if(wnama.getText().equals("")||wtelpon.getText().equals("")){
            update.setEnabled(false);
        }else{
            update.setEnabled(true);
        }
    }//GEN-LAST:event_updateKeyReleased

    private void hapusKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hapusKeyReleased
        // TODO add your handling code here:
        if(wnama.getText().equals("")||wtelpon.getText().equals("")){
            hapus.setEnabled(false);
        }else{
            hapus.setEnabled(true);
        }
    }//GEN-LAST:event_hapusKeyReleased

    private void simpanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_simpanKeyReleased
        // TODO add your handling code here:
        if(wnama.getText().equals("")||wtelpon.getText().equals("")){
            simpan.setEnabled(false);
        }else{
            simpan.setEnabled(true);
        }
    }//GEN-LAST:event_simpanKeyReleased

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
        Object[] data = new Object[3];
        data[0] = wnama.getText();
        data[1] = wtelpon.getText();
        data[2] = cmbkotaasal.getSelectedItem().toString();
        
        model.addRow(data);
        
    }//GEN-LAST:event_simpanActionPerformed

    private void wtelponCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_wtelponCaretUpdate
        // TODO add your handling code here:
         if(wnama.getText().equals("")||wtelpon.getText().equals("")){
            tambah.setEnabled(false);
            update.setEnabled(false);
            simpan.setEnabled(false);
            hapus.setEnabled(false);
        }else{
          tambah.setEnabled(true);
          update.setEnabled(true);
          simpan.setEnabled(true);
          hapus.setEnabled(true);  
        }
        
    }//GEN-LAST:event_wtelponCaretUpdate

    private void wnamaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_wnamaCaretUpdate
        // TODO add your handling code here:
        if(wnama.getText().equals("")||wtelpon.getText().equals("")){
            tambah.setEnabled(false);
            update.setEnabled(false);
            simpan.setEnabled(false);
            hapus.setEnabled(false);
        }else{
          tambah.setEnabled(true);
          update.setEnabled(true);
          simpan.setEnabled(true);
          hapus.setEnabled(true);  
        }
    }//GEN-LAST:event_wnamaCaretUpdate

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
            java.util.logging.Logger.getLogger(Tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tugas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTable1;
    private javax.swing.JComboBox cmbkotaasal;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton simpan;
    private javax.swing.JButton tambah;
    private javax.swing.JButton update;
    private javax.swing.JTextField wnama;
    private javax.swing.JTextField wtelpon;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
