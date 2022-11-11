package schmuckstuecke;

import stuff.*;

import java.util.ArrayList;
import java.util.Collection;


@Fake
public class SilberGrillzFAKE implements Schmuck {
    private ArrayList<Edelstein> edelsteine;


    public SilberGrillzFAKE() {
        EdelsteinImpl diamant = new EdelsteinImpl(20, EdelsteinTyp.DIAMANT);
        edelsteine = new ArrayList();
        edelsteine.add(diamant);

    }

    @Override
    public String getBezeichnung() {
        return "Silberne Zähne mit 20 kleinen Diamanten bestückt";
    }

    @Override
    public Material getMaterial() {
        return Material.SILBER;
    }

    @Override
    public int getMaterialGewicht() {
        return 100;
    }

    @Override
    public int getKatalognummer() {
        return 555;
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

