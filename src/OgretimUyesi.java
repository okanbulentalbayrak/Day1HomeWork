public class OgretimUyesi extends Personel {
    private String unvan;

    public OgretimUyesi(String adsoyad, String TCKN, int personelNo, String unvan) {
        super(adsoyad, TCKN, personelNo);
        this.unvan = unvan;
    }

    @Override
    public void calis() {
        System.out.println("Ogretim Uyesi Calisiyor");
    }
}