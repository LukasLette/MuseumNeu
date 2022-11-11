package schmuckstuecke;

import stuff.*;

import java.util.ArrayList;
import java.util.Collection;

@Wertvoll
public class Brosche implements Schmuck {

    private ArrayList<Edelstein> edelsteine;

    public Brosche() {
        EdelsteinImpl saphir = new EdelsteinImpl(75, EdelsteinTyp.SAPHIR);
        edelsteine = new ArrayList();
        edelsteine.add(saphir);
    }

    @Override
    public String getBezeichnung() {
        return "Eine exquisite Brosche. Mit einem hochwertigen Saphir in Grün besetzt";
    }

    @Override
    public Material getMaterial() {
        return Material.SILBER;
    }

    @Override
    public int getMaterialGewicht() {
        return 16;
    }

    @Override
    public int getKatalognummer() {
        return 696;
    }

    @Override
    public Collection<Edelstein> getVerbauteEdelsteine() {

        return this.edelsteine;
    }

    @Override
    public int getGesamtwertInEuro() {
        int preis = 0;
        int steinPreis = 0;
        for (Edelstein edelstein : edelsteine) {
            steinPreis +=  edelstein.getWert();
        }
        preis += getMaterialGewicht() * getMaterial().getPreisProGramm() + steinPreis;

        return preis;
    }
}
