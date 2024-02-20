abstract class Personel {
    private String adsoyad;
    private String TCKN;
    private int personelNo;

    public Personel(String adsoyad, String TCKN, int personelNo) {
        this.adsoyad = adsoyad;
        this.TCKN = TCKN;
        this.personelNo = personelNo;
    }

    public abstract void calis();
}
