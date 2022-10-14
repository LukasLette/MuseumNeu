package schmuckstuecke;

import stuff.Edelstein;
import stuff.EdelsteinTyp;
import stuff.Material;
import stuff.Schmuck;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Ring implements Schmuck {


    public Ring() {

    }

    @Override
    public String getBezeichnung() {
        return "Goldener Ring.";
    }

    @Override
    public Material getMaterial() {
        return Material.KATZENGOLD;
    }

    @Override
    public int getMaterialGewicht() {
        return 6;
    }

    @Override
    public int getKatalognummer() {
        return 921;
    }

    @Override
    public Collection<Edelstein> getVerbauteEdelsteine() {
        return new ArrayList<>();
    }

    @Override
    public int getGesamtwertInEuro() {
        return Material.KATZENGOLD.getPreisProGramm() * 6 + 69;
    }
}
