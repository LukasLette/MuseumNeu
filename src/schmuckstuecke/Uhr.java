package schmuckstuecke;

import stuff.Edelstein;
import stuff.EdelsteinTyp;
import stuff.Material;
import stuff.Schmuck;

import java.util.ArrayList;
import java.util.Collection;

public class Uhr implements Schmuck {

    private ArrayList<Edelstein> edelsteine;

    public Uhr() {
        EdelsteinImpl rubin = new EdelsteinImpl(120, EdelsteinTyp.RUBIN);
        edelsteine = new ArrayList();
        edelsteine.add(rubin);
    }

    @Override
    public String getBezeichnung() {
        return "Eine elegante Uhr mit Rubinen versehrt.";
    }

    @Override
    public Material getMaterial() {
        return Material.PLATIN;
    }

    @Override
    public int getMaterialGewicht() {
        return 55;
    }

    @Override
    public int getKatalognummer() {
        return 785;
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
