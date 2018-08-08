package Sonuc;

import Kesintiler.SgkKesinti;
import Kesintiler.VergiKesinti;
import SosyalYardimlar.AylikYardimlar;
import SosyalYardimlar.HesapIslem;
import SosyalYardimlar.OlayaBagliYardimlar;
import SosyalYardimlar.YillikYardimlar;


public class Baba {

    private AylikYardimlar aylikYardimlar;
    private OlayaBagliYardimlar olayaBagliYardimlar; 
    private YillikYardimlar yillikYardimlar; 
    private SgkKesinti sgkKesinti; 
    private VergiKesinti vergiKesinti; 
    private HesapIslem hesapIslem; 
    private Sonuc sonuc; 

    public Baba(AylikYardimlar aylikYardimlar, OlayaBagliYardimlar olayaBagliYardimlar, YillikYardimlar yillikYardimlar, SgkKesinti sgkKesinti, VergiKesinti vergiKesinti, HesapIslem hesapIslem, Sonuc sonuc) {
        this.aylikYardimlar = aylikYardimlar;
        this.olayaBagliYardimlar = olayaBagliYardimlar;
        this.yillikYardimlar = yillikYardimlar;
        this.sgkKesinti = sgkKesinti;
        this.vergiKesinti = vergiKesinti;
        this.hesapIslem = hesapIslem;
        this.sonuc = sonuc;
    }

    /**
     * @return the aylikYardimlar
     */
    public AylikYardimlar getAylikYardimlar() {
        return aylikYardimlar;
    }

    /**
     * @return the olayaBagliYardimlar
     */
    public OlayaBagliYardimlar getOlayaBagliYardimlar() {
        return olayaBagliYardimlar;
    }

    /**
     * @return the yillikYardimlar
     */
    public YillikYardimlar getYillikYardimlar() {
        return yillikYardimlar;
    }

    /**
     * @return the sgkKesinti
     */
    public SgkKesinti getSgkKesinti() {
        return sgkKesinti;
    }

    /**
     * @return the vergiKesinti
     */
    public VergiKesinti getVergiKesinti() {
        return vergiKesinti;
    }

    /**
     * @return the hesapIslem
     */
    public HesapIslem getHesapIslem() {
        return hesapIslem;
    }

    /**
     * @return the sonuc
     */
    public Sonuc getSonuc() {
        return sonuc;
    }
    
    
}
