class Rektor extends IdariPersonel {
    private String universite;

    public Rektor(String adsoyad, String TCKN, int personelNo, String departman, String universite) {
        super(adsoyad, TCKN, personelNo, departman);
        this.universite = universite;
    }

    @Override
    public void calis() {
        System.out.println("Rektor Calisiyor");
    }
}