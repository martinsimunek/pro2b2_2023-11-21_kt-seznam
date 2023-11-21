import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Objednavka {

    private List<Zbozi> seznamZbozi;

    public Objednavka() {
        this.seznamZbozi = new ArrayList<>();
    }

    public void pridejZbozi(Zbozi zbozi) {
        seznamZbozi.add(zbozi);
    }
    public void odeberZbozi(Zbozi zbozi) {
        seznamZbozi.remove(zbozi);
    }

    public BigDecimal getCelkovaCena() {
        BigDecimal vysledek = BigDecimal.ZERO;
        // BigDecimal vysledek = BigDecimal.valueOf(0);

        for (Zbozi zbozi : seznamZbozi) {
            vysledek = vysledek.add(zbozi.getCena());
        }

        return vysledek;
    }

    public List<String> nazvyZboziSnizenaDph() {
        List<String> vysledek = new ArrayList<>();
        for (Zbozi zbozi : seznamZbozi) {
            if (zbozi.isMaSnizenouDph()) {
                vysledek.add(zbozi.getPopis());
            }
        }
        return vysledek;
    }


}
