
package Formlar;

import Database.Data;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class MaasHesaplaFrm extends javax.swing.JInternalFrame {

    /**
     * Creates new form MaasHesaplaFrm
     */
    public MaasHesaplaFrm() {
        initComponents();
    }
    Data data;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        kayittablo = new javax.swing.JTable();
        btnKayitGetir = new javax.swing.JButton();

        setTitle("Maaş Hesaplama Modülü");

        kayittablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Adı Soyadı", "T.C. Kimlik No", "IBAN Numarası", "Medeni Durumu", "Çocuk Sayısı", "Asgari Geçim İndirimi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        kayittablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kayittabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(kayittablo);

        btnKayitGetir.setBackground(new java.awt.Color(240, 167, 109));
        btnKayitGetir.setText(">>>");
        btnKayitGetir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKayitGetirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKayitGetir)
                .addContainerGap(484, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKayitGetir))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKayitGetirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKayitGetirActionPerformed
        try {
            
            data = new Data();            
            DefaultTableModel model = (DefaultTableModel) kayittablo.getModel();
            ResultSet WorkerList = data.WorkerList();
            model.setRowCount(0);
            while (WorkerList.next()) {                
                Object[] datalar = {WorkerList.getString("adsoyad"), WorkerList.getString("tcno"), WorkerList.getString("ibanno"), WorkerList.getString("medenidurum"), WorkerList.getString("cocuksayisi"), WorkerList.getString("agi")};
                model.addRow(datalar);
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MaasHesaplaFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }//GEN-LAST:event_btnKayitGetirActionPerformed

    private void kayittabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kayittabloMouseClicked
        if (evt.getClickCount()==2) {
            
        }
    }//GEN-LAST:event_kayittabloMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKayitGetir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable kayittablo;
    // End of variables declaration//GEN-END:variables
}
