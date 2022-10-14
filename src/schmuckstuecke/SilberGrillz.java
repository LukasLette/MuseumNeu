package schmuckstuecke;

import stuff.Edelstein;
import stuff.EdelsteinTyp;
import stuff.Material;
import stuff.Schmuck;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SilberGrillz implements Schmuck {
    private ArrayList<Edelstein> edelsteine;


    public SilberGrillz() {
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
        return 187;
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

