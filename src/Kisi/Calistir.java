package Kisi;

import Formlar.AnaFrame;
import Formlar.gecici;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class Calistir {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
      /*  AnaFrame ana = new AnaFrame(); 

        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
             e.printStackTrace();
        }

        ana.setExtendedState(JFrame.MAXIMIZED_BOTH);
        ana.setVisible(true); */
      
        gecici gec = new gecici();
        gec.setVisible(true);

//        DecimalFormat dFormat = new DecimalFormat("#.##");
//        AylikYardimlar aylik = new AylikYardimlar(2, 21);
//        OlayaBagliYardimlar olay = new OlayaBagliYardimlar(false, false);
//        YillikYardimlar yillik = new YillikYardimlar(false);
//        SgkKesinti sgkKesinti = new SgkKesinti(aylik, yillik, olay);
//        VergiKesinti vergiKesinti = new VergiKesinti(aylik, sgkKesinti, 15, AGILERIMIZ.EVLI_ESI_CALISAN_4_COCUKLU);
//        HesapIslem hesap = new HesapIslem(aylik, olay, yillik);
//        Sonuc sonuc = new Sonuc(sgkKesinti, vergiKesinti, hesap);
//        System.out.println("Hakediş Toplamı : " + hesap.HakedisToplami());
//        System.out.println("Tahakkuk Toplamı : " + dFormat.format(sonuc.Tahakkuk()));
//        System.out.println("Kesinti Miktarı : " + dFormat.format(sonuc.KesintiMiktari()));
//        System.out.println("Net Ödenen : " + dFormat.format(sonuc.NetOdenen()));
    }
}
