package schmuckstuecke;

import stuff.Edelstein;
import stuff.EdelsteinTyp;
import stuff.Material;
import stuff.Schmuck;

import java.util.ArrayList;
import java.util.Collection;

public class ArmbandFAKE implements Schmuck {
    private ArrayList<Edelstein> edelsteine;

    public ArmbandFAKE() {
        EdelsteinImpl amethyst = new EdelsteinImpl(25, EdelsteinTyp.AMETHYST);
        edelsteine = new ArrayList();
        edelsteine.add(amethyst);
    }

    @Override
    public String getBezeichnung() {
        return "Schönes Armband";
    }

    @Override
    public Material getMaterial() {
        return Material.PLATIN;
    }

    @Override
    public int getMaterialGewicht() {
        return 10;
    }

    @Override
    public int getKatalognummer() {
        return 696;
    }

    @Override
    public Collection<Edelstein> getVerbauteEdelsteine() {
        return edelsteine;
    }

    @Override
    public int getGesamtwertInEuro() {
        return 10;
    }
}
