/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tampilan;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Koneksi.Koneksi;
import javax.swing.*; 
import java.sql.Statement;

public class Mahasiswa extends javax.swing.JFrame {
    
    Connection conn;
    Statement stm;
   
    public Mahasiswa() {
        initComponents();
        
        //panggil koneksi
       Koneksi koneksi = new Koneksi();
       this.conn = koneksi.connect();
       tampilkanData();
       
        try {
            stm = conn.createStatement(); // sukses kalau conn tidak null
            tampilkanData(); // ← setelah statement siap
        } catch (Exception e) {
            System.out.println("Gagal membuat statement: " + e.getMessage());
        }
    }

     
public void tampilkanData() {

DefaultTableModel model = new DefaultTableModel();

model.addColumn("NIM");

model.addColumn("Nama");

model.addColumn("Prodi");

model.addColumn("No.HP");

model.addColumn("Alamat");

model.addColumn("jk");

TabelMahasiswa.setModel(model);

try {

        String sql = "SELECT * FROM mahasiswa";

        Statement stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery(sql);

while (rs.next()) {

    Object[] row = {

        rs.getString("nim"),

        rs.getString("nama"),

        rs.getString("prodi"),

        rs.getString("phone"),

        rs.getString("alamat"),

        rs.getString("jk")

        };

model.addRow(row);
}

} catch (Exception e) {

JOptionPane.showMessageDialog(null, "Gagal menampilkan data: " +
e.getMessage());

}

}
void TabelMahasiswaMouseCli1Clicked(java.awt.event.MouseEvent evt){
    int baris = TabelMahasiswa.getSelectedRow();
    if(baris != -1) {
        String nim = TabelMahasiswa.getValueAt(baris, 0).toString();
        String nama = TabelMahasiswa.getValueAt(baris, 0).toString();
        String prodi = TabelMahasiswa.getValueAt(baris, 0).toString();
        String phone = TabelMahasiswa.getValueAt(baris, 0).toString();
        String alamat = TabelMahasiswa.getValueAt(baris, 0).toString();
        String jk = TabelMahasiswa.getValueAt(baris, 0).toString();
        
        NIM.setText(nim);
        NAMA.setText(nama);
        if (jk.equals("Pria")) {
            Pria.setSelected(true);
            Wanita.setSelected(false);
        }else if(jk.equals("Perempuan")) {
            Pria.setSelected(false);
            Wanita.setSelected(true);
        }
        PHONE.setText(phone);
        ALAMAT.setText(phone);
        PRODI.setText(phone);
    }
}

  private void bersihkanTextbox() {
    // Mengatur nilai setiap JTextField menjadi kosong
    NIM.setText("");
    NAMA.setText("");
    PRODI.setText("");
    PHONE.setText("");
    ALAMAT.setText("");
    
    // Jika ada radio button untuk jenis kelamin, reset pilihan radio button
    Pria.setSelected(false); 
    Wanita.setSelected(false); 
}
                      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NIM = new javax.swing.JTextField();
        jk = new javax.swing.JLabel();
        NAMA = new javax.swing.JTextField();
        ALAMAT = new javax.swing.JTextField();
        PHONE = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Pria = new javax.swing.JRadioButton();
        Wanita = new javax.swing.JRadioButton();
        PRODI = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelMahasiswa = new javax.swing.JTable();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        jLabel1.setText("DATA MAHASISWA");

        jLabel2.setText("NIM");

        jLabel3.setText("NAMA");

        jLabel4.setText("ALAMAT");

        NIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NIMActionPerformed(evt);
            }
        });

        jk.setText("JENIS KELAMIN");

        jLabel6.setText("PRODI");

        jLabel7.setText("PHONE");

        Pria.setText("Pria");
        Pria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriaActionPerformed(evt);
            }
        });

        Wanita.setText("Wanita");
        Wanita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WanitaActionPerformed(evt);
            }
        });

        jButton1.setText("Ubah");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Hapus");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Simpan");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Bersihkan");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Keluar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Cetak");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(NIM, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jk)))
                            .addComponent(NAMA, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Pria)
                                .addGap(35, 35, 35)
                                .addComponent(Wanita)
                                .addGap(65, 65, 65))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(PRODI, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PHONE, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ALAMAT, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jk)
                        .addComponent(Pria)
                        .addComponent(Wanita)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(NAMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PHONE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ALAMAT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(PRODI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(14, 14, 14))
        );

        TabelMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NIM", "NAMA", "JURUSAN", "NO.HP", "ALAMAT", "JENIS KELAMIN"
            }
        ));
        jScrollPane1.setViewportView(TabelMahasiswa);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriaActionPerformed

    private void WanitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WanitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WanitaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // BUTTON UBAH
    String nim = NIM.getText(); String nama = NAMA.getText(); String jk = ""; // Bisa diambil dari radio button
    String phone = PHONE.getText(); String alamat = ALAMAT.getText(); String prodi = PRODI.getText();
    if (Pria.isSelected()) { jk = "PRIA"; } else if (Wanita.isSelected()) { jk = "WANITA"; }
    String sql = "UPDATE mahasiswa SET nama = ?, prodi = ?, phone = ?, alamat = ?, jk = ? WHERE nim = ?";
    try {
        // Siapkan koneksi dan prepared statement
        PreparedStatement stmt = conn.prepareStatement(sql);
        // Set parameter untuk query
        stmt.setString(1, nama);
        stmt.setString(2, prodi);
        stmt.setString(3, phone);
        stmt.setString(4, alamat);
        stmt.setString(5, jk);
        stmt.setString(6, nim);  // NIM yang akan digunakan sebagai acuan untuk data yang diubah
        // Eksekusi query
        int rowsUpdated = stmt.executeUpdate();
        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(null, "Data berhasil diubah!");
            tampilkanData();      // ⬅️ Tambah ini untuk refresh tabel
            bersihkanTextbox();   // ⬅️ Tambah ini untuk kosongkan input
        } else {
            JOptionPane.showMessageDialog(null, "NIM tidak ditemukan!");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Gagal mengubah data: " + e.getMessage());
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // BUTOON HAPUS                                      
    String nim = NIM.getText();    
    if (nim.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Masukkan NIM untuk menghapus data.");
        return;
    }
    // Query SQL untuk menghapus data berdasarkan NIM
    String sql = "DELETE FROM mahasiswa WHERE nim = ?";
    try {
            PreparedStatement stmt = conn.prepareStatement(sql);
             stmt.setString(1, nim);
        // Eksekusi query
        int rowsDeleted = stmt.executeUpdate();
        if (rowsDeleted > 0) {
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
            bersihkanTextbox(); // Bersihkan textbox setelah hapus
            tampilkanData();    // Tampilkan data terupdate di tabel
        } else {
            JOptionPane.showMessageDialog(null, "Data dengan NIM " + nim + " tidak ditemukan.");
        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Gagal menghapus data: " + ex.getMessage());
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // BUTTON SIMPAN
    String nim = NIM.getText(); String nama = NAMA.getText(); String jk = ""; 
    String phone = PHONE.getText(); String alamat = ALAMAT.getText(); String prodi = PRODI.getText();
    if (Pria.isSelected()) { jk = "PRIA"; } else if (Wanita.isSelected()) { jk = "WANITA"; }
    String sql = "INSERT INTO mahasiswa (nim, nama, prodi, phone, alamat, jk) VALUES (?, ?, ?, ?, ?, ?)";
    try {
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, nim);
        stmt.setString(2, nama);
        stmt.setString(3, prodi);
        stmt.setString(4, phone);
        stmt.setString(5, alamat);
        stmt.setString(6, jk);
        // Eksekusi query
        int rowsInserted = stmt.executeUpdate();
        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan!");
              tampilkanData();
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Gagal menambahkan data: " + e.getMessage());
    }    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // BUTTON BERSIHKAN
             bersihkanTextbox();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // BUTTON KELUAR
        int pilihan = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin keluar?", "Konfirmasi Keluar", JOptionPane.YES_NO_OPTION);
        if (pilihan == JOptionPane.YES_OPTION) {
            System.exit(0); // Menutup aplikasi jika pengguna memilih "Yes"
        } 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void NIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NIMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NIMActionPerformed

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
            java.util.logging.Logger.getLogger(Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ALAMAT;
    private javax.swing.JTextField NAMA;
    private javax.swing.JTextField NIM;
    private javax.swing.JTextField PHONE;
    private javax.swing.JTextField PRODI;
    private javax.swing.JRadioButton Pria;
    private javax.swing.JTable TabelMahasiswa;
    private javax.swing.JRadioButton Wanita;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jk;
    // End of variables declaration//GEN-END:variables
}
