import java.math.BigDecimal;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Zbozi zbozi1 =
                new Zbozi("šroubovák", BigDecimal.valueOf(150),2);
        Zbozi zbozi2 =
                new Zbozi("šroubovák", BigDecimal.valueOf(145),3);

        Objednavka objednavka = new Objednavka();
        objednavka.pridejZbozi(zbozi1);
        zbozi1.setMaSnizenouDph(true);
        objednavka.pridejZbozi(zbozi2);

        System.out.println(objednavka.getCelkovaCena());
        List<String> nazvyZbozi = objednavka.nazvyZboziSnizenaDph();
        System.out.println("Názvy zboží se sníženou DPH:");
        for (String nazev : nazvyZbozi) {
            System.out.println(nazev);
        }
    }
}