/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HER_nobp.view;

import javax.swing.JTable;
import javax.swing.JTextField;
import HER_nobp.controller.ServiceController;

/**
 *
 * @author LENOVO
 */
public class FormService extends javax.swing.JFrame {

    /**
     * Creates new form FormService
     */
    public FormService() {
        initComponents();
        controller = new WarnetController(this);
        controller.setCboKodePelanggan();
        controller.setCboJenisPelanggan();
        controller.bersihForm();
        controller.tampilData();
    }

    public JTable getTblService() {
        return tblService;
    }

    public JTextField getTxtDiskon() {
        return txtDiskon;
    }

    public JTextField getTxtJenis_service() {
        return txtJenis_service;
    }

    public JTextField getTxtKode_trans() {
        return txtKode_trans;
    }

    public JTextField getTxtPelanggan() {
        return txtPelanggan;
    }

    public JTextField getTxtTgl_trans() {
        return txtTgl_trans;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDiskon = new javax.swing.JTextField();
        txtKode_trans = new javax.swing.JTextField();
        txtTgl_trans = new javax.swing.JTextField();
        txtPelanggan = new javax.swing.JTextField();
        txtJenis_service = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblService = new javax.swing.JTable();
        btnInsert = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Kode Transaksi");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 40, 107, 20);

        jLabel2.setText("Diskon");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 200, 90, 20);

        jLabel3.setText("Tanggal Transaksi");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 80, 129, 20);

        jLabel4.setText("Pelanggan");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 120, 140, 20);

        jLabel5.setText("Jenis Service");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 160, 140, 20);

        txtDiskon.setText("jTextField1");
        getContentPane().add(txtDiskon);
        txtDiskon.setBounds(220, 200, 330, 26);

        txtKode_trans.setText("jTextField1");
        getContentPane().add(txtKode_trans);
        txtKode_trans.setBounds(220, 40, 330, 26);

        txtTgl_trans.setText("jTextField1");
        getContentPane().add(txtTgl_trans);
        txtTgl_trans.setBounds(220, 80, 330, 26);

        txtPelanggan.setText("jTextField1");
        getContentPane().add(txtPelanggan);
        txtPelanggan.setBounds(220, 120, 330, 26);

        txtJenis_service.setText("jTextField1");
        getContentPane().add(txtJenis_service);
        txtJenis_service.setBounds(220, 160, 330, 26);

        tblService.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Kode", "Tanggal", "Pelanggan", "Jenis", "Biaya", "Diskon", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblService);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 290, 620, 280);

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert);
        btnInsert.setBounds(50, 250, 110, 29);

        btnCancel.setText("Cancel");
        getContentPane().add(btnCancel);
        btnCancel.setBounds(493, 250, 110, 29);

        btnDelete.setText("Delete");
        getContentPane().add(btnDelete);
        btnDelete.setBounds(340, 250, 110, 29);

        btnUpdate.setText("Update");
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(190, 250, 110, 29);

        setSize(new java.awt.Dimension(665, 642));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInsertActionPerformed

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
            java.util.logging.Logger.getLogger(FormService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormService().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblService;
    private javax.swing.JTextField txtDiskon;
    private javax.swing.JTextField txtJenis_service;
    private javax.swing.JTextField txtKode_trans;
    private javax.swing.JTextField txtPelanggan;
    private javax.swing.JTextField txtTgl_trans;
    // End of variables declaration//GEN-END:variables
}
