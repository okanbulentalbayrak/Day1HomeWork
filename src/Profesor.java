class Profesor extends OgretimUyesi {
    private String uzmanlikAlani;

    public Profesor(String adsoyad, String TCKN, int personelNo, String unvan, String uzmanlikAlani) {
        super(adsoyad, TCKN, personelNo, unvan);
        this.uzmanlikAlani = uzmanlikAlani;
    }

    @Override
    public void calis() {
        System.out.println("Profesör Calisiyor");
    }
}