package schmuckstuecke;

import stuff.*;

import java.util.ArrayList;
import java.util.Collection;

@Fake
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
