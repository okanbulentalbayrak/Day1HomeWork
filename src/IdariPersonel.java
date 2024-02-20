import java.net.SocketOption;

public class IdariPersonel extends Personel {
    private String departman;

    public IdariPersonel(String adsoyad, String TCKN, int personelNo, String departman) {
        super(adsoyad, TCKN, personelNo);
        this.departman = departman;
    }

    @Override
    public void calis() {
        System.out.println("Idari Personel Calisiyor");
    }
}
