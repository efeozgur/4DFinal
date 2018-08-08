package Formlar;

import Database.Data;
import Kesintiler.SgkKesinti;
import Kesintiler.VergiKesinti;
import Kisi.AGILERIMIZ;
import Kisi.Kisi;
import Sonuc.Baba;
import Sonuc.Sonuc;
import SosyalYardimlar.AylikYardimlar;
import SosyalYardimlar.HesapIslem;
import SosyalYardimlar.OlayaBagliYardimlar;
import SosyalYardimlar.YillikYardimlar;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

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
        btnKayitGetir1 = new javax.swing.JButton();
        btnKayitGetir2 = new javax.swing.JButton();
        btnSeciliKisiMaasGetir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txYemekyardimi = new javax.swing.JTextField();
        txYakacakYardimi = new javax.swing.JTextField();
        txCocukYardimi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txBayramYardimi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txEgitimYardimi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txEvlilikYardimi = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txAskerlikYardimi = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txGvMatrah = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txDamgaVergisiMatrah = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txGelirVergisi = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txDamgaVergisi = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txAgiMiktari = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txSgkMatrah = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txSgk20 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txSgk14 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txSgk2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txSgk1 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txTahakkuk = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txKesinti = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txNetOdenen = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        spnYemekVerilecekGun = new javax.swing.JSpinner();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        chkBayramYardimi = new javax.swing.JCheckBox();
        jLabel23 = new javax.swing.JLabel();
        tfEgitimYardimi = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        chkEvlilikYardimi = new javax.swing.JCheckBox();
        jLabel25 = new javax.swing.JLabel();
        chkAskerlikYardimi = new javax.swing.JCheckBox();
        cmbAgi = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();

        setClosable(true);
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

        btnKayitGetir.setText("Kişileri Getir");
        btnKayitGetir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKayitGetirActionPerformed(evt);
            }
        });

        btnKayitGetir1.setText("Seçili Kaydı Sil");
        btnKayitGetir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKayitGetir1ActionPerformed(evt);
            }
        });

        btnKayitGetir2.setText("Seçili Kaydı Düzenle");
        btnKayitGetir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKayitGetir2ActionPerformed(evt);
            }
        });

        btnSeciliKisiMaasGetir.setText("Seçili Kişinin Maaşını Hesapla");
        btnSeciliKisiMaasGetir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeciliKisiMaasGetirActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Kişiye Ait Maaş Hesabı"));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Sosyal Yardımlar"));

        jLabel1.setText("Yemek Yardımı");

        jLabel2.setText("Yakacak Yardımı");

        jLabel3.setText("Çocuk Yardımı");

        txYemekyardimi.setEditable(false);

        txYakacakYardimi.setEditable(false);

        txCocukYardimi.setEditable(false);

        jLabel4.setText("Bayram Yardımı");

        txBayramYardimi.setEditable(false);

        jLabel5.setText("Eğitim Yardımı");

        txEgitimYardimi.setEditable(false);

        jLabel6.setText("Evlilik Yardımı");

        txEvlilikYardimi.setEditable(false);

        jLabel7.setText("Askerlik Yardımı");

        txAskerlikYardimi.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txYemekyardimi, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txYakacakYardimi, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txCocukYardimi, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txAskerlikYardimi, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txEvlilikYardimi, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txBayramYardimi, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txEgitimYardimi, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txYemekyardimi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txBayramYardimi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txYakacakYardimi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txCocukYardimi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txEgitimYardimi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txEvlilikYardimi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txAskerlikYardimi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Kesintiler"));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Vergi"));

        jLabel13.setText("Gelir Vergisi Matrahı");

        txGvMatrah.setEditable(false);

        jLabel14.setText("Damga Vergisi Matrahı");

        txDamgaVergisiMatrah.setEditable(false);

        jLabel15.setText("Gelir Vergisi");

        txGelirVergisi.setEditable(false);

        jLabel16.setText("Damga Vergisi");

        txDamgaVergisi.setEditable(false);

        jLabel17.setText("AGI Miktarı");

        txAgiMiktari.setEditable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txAgiMiktari, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(txDamgaVergisi)
                    .addComponent(txGelirVergisi)
                    .addComponent(txDamgaVergisiMatrah)
                    .addComponent(txGvMatrah))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txGvMatrah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txDamgaVergisiMatrah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txGelirVergisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txDamgaVergisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txAgiMiktari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("SGK"));

        jLabel8.setText("SGK Matrahı");

        txSgkMatrah.setEditable(false);

        jLabel9.setText("Sgk %20.5");

        txSgk20.setEditable(false);

        jLabel10.setText("Sgk %14");

        txSgk14.setEditable(false);

        jLabel11.setText("Sgk %2");

        txSgk2.setEditable(false);

        jLabel12.setText("Sgk %1");

        txSgk1.setEditable(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txSgk1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txSgk2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txSgk14, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txSgk20, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(txSgkMatrah, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txSgkMatrah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txSgk20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txSgk14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txSgk2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txSgk1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(312, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Tahakkuk / Kesinti / Ödeme"));

        jLabel18.setText("Tah. Top.");

        txTahakkuk.setEditable(false);

        jLabel19.setText("Kesinti");

        txKesinti.setEditable(false);

        jLabel20.setText("Net Ödenen");

        txNetOdenen.setEditable(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txTahakkuk, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txKesinti, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txNetOdenen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(txNetOdenen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(txKesinti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(txTahakkuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Hesaplamaya Esas Bilgiler"));

        spnYemekVerilecekGun.setModel(new javax.swing.SpinnerNumberModel(20, 0, 25, 1));

        jLabel21.setText("Yemek Verilecek Gün Sayısı");

        jLabel22.setText("Bayram Yardımı");

        jLabel23.setText("Eğitim Yardımı");

        tfEgitimYardimi.setColumns(2);

        jLabel24.setText("Evlilik Yardımı");

        jLabel25.setText("Askerlik Yardımı");

        cmbAgi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BEKAR", "EVLI_ESI_CALISMAYAN", "EVLI_ESI_CALISMAYAN_1_COCUKLU", "EVLI_ESI_CALISMAYAN_2_COCUKLU", "EVLI_ESI_CALISMAYAN_3_COCUKLU", "EVLI_ESI_CALISMAYAN_4_COCUKLU", "EVLI_ESI_CALISMAYAN_5_COCUKLU", "EVLI_ESI_CALISAN", "EVLI_ESI_CALISAN_1_COCUKLU", "EVLI_ESI_CALISAN_2_COCUKLU", "EVLI_ESI_CALISAN_3_COCUKLU", "EVLI_ESI_CALISAN_4_COCUKLU", "EVLI_ESI_CALISAN_5_COCUKLU" }));

        jLabel26.setText("Asgari Geçim İndirimi");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26))
                .addGap(61, 61, 61)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbAgi, 0, 209, Short.MAX_VALUE)
                    .addComponent(chkBayramYardimi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfEgitimYardimi)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkEvlilikYardimi)
                            .addComponent(chkAskerlikYardimi)
                            .addComponent(spnYemekVerilecekGun, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnYemekVerilecekGun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(chkBayramYardimi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(tfEgitimYardimi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(chkEvlilikYardimi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(chkAskerlikYardimi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbAgi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnKayitGetir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSeciliKisiMaasGetir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnKayitGetir2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnKayitGetir1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKayitGetir)
                    .addComponent(btnKayitGetir1)
                    .addComponent(btnKayitGetir2)
                    .addComponent(btnSeciliKisiMaasGetir))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        if (evt.getClickCount() == 2) {

        }
    }//GEN-LAST:event_kayittabloMouseClicked

    private void btnKayitGetir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKayitGetir1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKayitGetir1ActionPerformed

    private void btnKayitGetir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKayitGetir2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKayitGetir2ActionPerformed

    private void btnSeciliKisiMaasGetirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeciliKisiMaasGetirActionPerformed
        if(kayittablo.getSelectedRow()!=-1){
            
        
        
                
        Baba kayitgetir = kayitGonder();
        try {
            DecimalFormat df = new DecimalFormat("#.##");

            // Sosyal Yardımlar
            txCocukYardimi.setText(String.valueOf(df.format(kayitgetir.getAylikYardimlar().cocukYardimi())));
            txYemekyardimi.setText(String.valueOf(df.format(kayitgetir.getAylikYardimlar().yemekYardimi())));
            txYakacakYardimi.setText(String.valueOf(df.format(kayitgetir.getAylikYardimlar().yakacakYardimi())));
            txBayramYardimi.setText(String.valueOf(df.format(kayitgetir.getYillikYardimlar().BayramYardimi())));
            txEvlilikYardimi.setText(String.valueOf(df.format(kayitgetir.getOlayaBagliYardimlar().EvlenmeYardimi())));
            txAskerlikYardimi.setText(String.valueOf(df.format(kayitgetir.getOlayaBagliYardimlar().AskerlikYardimi())));

            //Kesintiler
            txSgkMatrah.setText(String.valueOf(df.format(kayitgetir.getSgkKesinti().SgkMatrah())));
            txSgk20.setText(String.valueOf(df.format(kayitgetir.getSgkKesinti().Sgk20())));
            txSgk14.setText(String.valueOf(df.format(kayitgetir.getSgkKesinti().Sgk14())));
            txSgk2.setText(String.valueOf(df.format(kayitgetir.getSgkKesinti().Sgk2())));
            txSgk1.setText(String.valueOf(df.format(kayitgetir.getSgkKesinti().Sgk1())));

            //Vergi
            txGvMatrah.setText(String.valueOf(df.format(kayitgetir.getVergiKesinti().GelirVergisiMatrah())));
            txGelirVergisi.setText(String.valueOf(df.format(kayitgetir.getVergiKesinti().GelirVergisi())));
            txDamgaVergisiMatrah.setText(String.valueOf(df.format(kayitgetir.getHesapIslem().HakedisToplami())));
            txDamgaVergisi.setText(String.valueOf(df.format(kayitgetir.getHesapIslem().DamgaVergisi())));
            txAgiMiktari.setText(String.valueOf(AgiBul(AgiGetir())));
            

            txNetOdenen.setText(String.valueOf(df.format(kayitgetir.getSonuc().NetOdenen())));
            txKesinti.setText(String.valueOf(df.format(kayitgetir.getSonuc().KesintiMiktari())));
            txTahakkuk.setText(String.valueOf(df.format(kayitgetir.getSonuc().Tahakkuk())));
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Hata : " + ex);
        }

        } else {
            JOptionPane.showMessageDialog(this, "Kişi Seçiniz...");
        }
        //unutma agi ve gelir vergisi miktarı henüz yapılmadı

    }//GEN-LAST:event_btnSeciliKisiMaasGetirActionPerformed

    public double AgiBul(AGILERIMIZ agi) {
        return agi.getDeger();
    }

    public AGILERIMIZ AgiGetir() {
        AGILERIMIZ deger = AGILERIMIZ.valueOf((String) cmbAgi.getSelectedItem());
        return deger;
    }

    public Baba kayitGonder() {
        int seciliSatir = kayittablo.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) kayittablo.getModel();

        String adSoyad = (String) model.getValueAt(seciliSatir, 0);
        String tcNo = (String) model.getValueAt(seciliSatir, 1);
        String ibanNo = (String) model.getValueAt(seciliSatir, 2);
        String medeniDurum = (String) model.getValueAt(seciliSatir, 3);
        int cocukSayisi = Integer.parseInt((String) model.getValueAt(seciliSatir, 4));

        Kisi kisi = new Kisi(adSoyad, tcNo, ibanNo, medeniDurum, cocukSayisi);
        AylikYardimlar aylik = new AylikYardimlar(kisi.getCocukSayisi(), (Integer) spnYemekVerilecekGun.getValue());
        YillikYardimlar yillik = new YillikYardimlar(chkBayramYardimi.isSelected());
        OlayaBagliYardimlar olay = new OlayaBagliYardimlar(chkEvlilikYardimi.isSelected(), chkAskerlikYardimi.isSelected());
        SgkKesinti sgkKesinti = new SgkKesinti(aylik, yillik, olay);
        VergiKesinti vergiKesinti = new VergiKesinti(aylik, sgkKesinti, 15, (AGILERIMIZ.valueOf(cmbAgi.getSelectedItem().toString())));
        HesapIslem hesapIslem = new HesapIslem(aylik, olay, yillik);
        Sonuc sonuc = new Sonuc(sgkKesinti, vergiKesinti, hesapIslem);

        Baba baba = new Baba(aylik, olay, yillik, sgkKesinti, vergiKesinti, hesapIslem, sonuc);

        return baba;

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKayitGetir;
    private javax.swing.JButton btnKayitGetir1;
    private javax.swing.JButton btnKayitGetir2;
    private javax.swing.JButton btnSeciliKisiMaasGetir;
    private javax.swing.JCheckBox chkAskerlikYardimi;
    private javax.swing.JCheckBox chkBayramYardimi;
    private javax.swing.JCheckBox chkEvlilikYardimi;
    private javax.swing.JComboBox<String> cmbAgi;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable kayittablo;
    private javax.swing.JSpinner spnYemekVerilecekGun;
    private javax.swing.JTextField tfEgitimYardimi;
    private javax.swing.JTextField txAgiMiktari;
    private javax.swing.JTextField txAskerlikYardimi;
    private javax.swing.JTextField txBayramYardimi;
    private javax.swing.JTextField txCocukYardimi;
    private javax.swing.JTextField txDamgaVergisi;
    private javax.swing.JTextField txDamgaVergisiMatrah;
    private javax.swing.JTextField txEgitimYardimi;
    private javax.swing.JTextField txEvlilikYardimi;
    private javax.swing.JTextField txGelirVergisi;
    private javax.swing.JTextField txGvMatrah;
    private javax.swing.JTextField txKesinti;
    private javax.swing.JTextField txNetOdenen;
    private javax.swing.JTextField txSgk1;
    private javax.swing.JTextField txSgk14;
    private javax.swing.JTextField txSgk2;
    private javax.swing.JTextField txSgk20;
    private javax.swing.JTextField txSgkMatrah;
    private javax.swing.JTextField txTahakkuk;
    private javax.swing.JTextField txYakacakYardimi;
    private javax.swing.JTextField txYemekyardimi;
    // End of variables declaration//GEN-END:variables
}
